import com.jogamp.newt.event.KeyEvent
import com.jogamp.newt.event.KeyListener
import com.jogamp.newt.opengl.GLWindow
import com.jogamp.opengl.*
import com.jogamp.opengl.GL4.*
import com.jogamp.opengl.math.FloatUtil
import com.jogamp.opengl.util.Animator
import com.jogamp.opengl.util.GLBuffers
import com.jogamp.opengl.util.glsl.ShaderCode
import com.jogamp.opengl.util.glsl.ShaderProgram
import glutil.BufferUtils
import glutil.GlDebugOutput
import java.nio.ByteBuffer

/**
 * Created bY elect on 04/10/16.
 */


fun main(args: Array<String>) {
    Hello()
}

const val SHADERS_ROOT = "src/shaders"
const val SHADERS_SRC = "hello-triangle"

val Float.Companion.BYTES: Int get() = 4
val Short.Companion.BYTES: Int get() = 2

class Hello : GLEventListener, KeyListener {

    private val window = GLWindow.create(GLCapabilities(GLProfile.get(GLProfile.GL4)))
    private val animator = Animator(window)

    init {
        with(window) {
            setSize(1024, 768); setPosition(100, 50)
            isUndecorated = false; isAlwaysOnTop = false; isFullscreen = false; isPointerVisible = true
            confinePointer(false); title = "hello"; contextCreationFlags = GLContext.CTX_OPTION_DEBUG; isVisible = true
            addGLEventListener(this@Hello)
            addKeyListener(this@Hello)
        }
        animator.start()
    }

    object Buffer {
        val VERTEX = 0
        val ELEMENT = 1
        val TRANSFORM = 2
        val MAX = 3
    }

    private var bufferName = GLBuffers.newDirectIntBuffer(Buffer.MAX)
    private var vertexArrayName = GLBuffers.newDirectIntBuffer(1)

    private var clearColor = GLBuffers.newDirectFloatBuffer(floatArrayOf(1f, .5f, 0f, 1f))
    private var clearDepth = GLBuffers.newDirectFloatBuffer(floatArrayOf(1f))

    private lateinit var transformPointer: ByteBuffer

    private val bug1287 = true

    private var programName = -1

    private var start = System.currentTimeMillis()

    private var scale = FloatArray(16)
    private var zRotation = FloatArray(16)
    private var modelToClip = FloatArray(16)

    private var elementCount = 3

    override fun init(drawable: GLAutoDrawable) {

        val gl4 = drawable.gl.gL4

        initDebug(gl4)

        initBuffers(gl4)

        initVertexArray(gl4)

        initProgram(gl4)

        // map the transform buffer and keep it mapped
        with(gl4) {
            transformPointer = glMapNamedBufferRange(
                    bufferName.get(Buffer.TRANSFORM), // buffer
                    0, // offset
                    (16 * Float.BYTES).toLong(), // size
                    GL_MAP_WRITE_BIT or GL_MAP_PERSISTENT_BIT or GL_MAP_COHERENT_BIT or GL_MAP_INVALIDATE_BUFFER_BIT) // flags

            glEnable(GL_DEPTH_TEST)
        }

        start = System.currentTimeMillis()
    }

    private fun initDebug(gl4: GL4) {

        window.context.addGLDebugListener(GlDebugOutput())

        with(gl4) {
            // Turn off all the debug
            glDebugMessageControl(
                    GL_DONT_CARE, // source
                    GL_DONT_CARE, // type
                    GL_DONT_CARE, // severity
                    0, // count
                    null, // id
                    false) // enabled
            // Turn on all OpenGL Errors, shader compilation/linking errors, or highly-dangerous undefined behavior
            glDebugMessageControl(
                    GL_DONT_CARE, // source
                    GL_DONT_CARE, // type
                    GL_DEBUG_SEVERITY_HIGH, // severity
                    0, // count
                    null, // id
                    true) // enabled
            // Turn on all major performance warnings, shader compilation/linking warnings or the use of deprecated functions
            glDebugMessageControl(
                    GL_DONT_CARE, // source
                    GL_DONT_CARE, // type
                    GL_DEBUG_SEVERITY_MEDIUM, // severity
                    0, // count
                    null, // id
                    true) // enabled
        }
    }

    private fun initBuffers(gl4: GL4) {

        val vertexData = floatArrayOf(
                -1f, -1f, /**/ 1f, 0f, 0f,
                +0f, +2f, /**/ 0f, 0f, 1f,
                +1f, -1f, /**/ 0f, 1f, 0f)

        val vertexBuffer = GLBuffers.newDirectFloatBuffer(vertexData)
        val elementBuffer = GLBuffers.newDirectShortBuffer(shortArrayOf(0, 2, 1))

        with(gl4) {

            glCreateBuffers(Buffer.MAX, bufferName)

            if (!bug1287) {

                glNamedBufferStorage(bufferName.get(Buffer.VERTEX), (vertexBuffer.capacity() * Float.BYTES).toLong(),
                        vertexBuffer, GL_STATIC_DRAW)

                glNamedBufferStorage(bufferName.get(Buffer.ELEMENT), (elementBuffer.capacity() * Short.BYTES).toLong(),
                        elementBuffer, GL_STATIC_DRAW)

                glNamedBufferStorage(bufferName.get(Buffer.TRANSFORM), (16 * Float.BYTES).toLong(), null, GL_MAP_WRITE_BIT)

            } else {

                // vertices
                glBindBuffer(GL_ARRAY_BUFFER, bufferName.get(Buffer.VERTEX))
                glBufferStorage(GL_ARRAY_BUFFER, (vertexBuffer.capacity() * Float.BYTES).toLong(), vertexBuffer, 0)
                glBindBuffer(GL_ARRAY_BUFFER, 0);

                // elements
                glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, bufferName.get(Buffer.ELEMENT))
                glBufferStorage(GL_ELEMENT_ARRAY_BUFFER, (elementBuffer.capacity() * Short.BYTES).toLong(),
                        elementBuffer, 0)
                glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0)

                // transform
                glBindBuffer(GL_UNIFORM_BUFFER, bufferName.get(Buffer.TRANSFORM))

                val uniformBufferOffset = GLBuffers.newDirectIntBuffer(1)
                glGetIntegerv(GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT, uniformBufferOffset)
                val uniformBlockSize = Math.max(16 * Float.BYTES, uniformBufferOffset.get(0))

                glBufferStorage(GL_UNIFORM_BUFFER, uniformBlockSize.toLong(), null,
                        GL_MAP_WRITE_BIT or GL_MAP_PERSISTENT_BIT or GL_MAP_COHERENT_BIT)

                BufferUtils.destroyDirectBuffer(uniformBufferOffset)
                glBindBuffer(GL_UNIFORM_BUFFER, 0)
            }
        }

        BufferUtils.destroyDirectBuffer(vertexBuffer)
        BufferUtils.destroyDirectBuffer(elementBuffer)
    }

    private fun initVertexArray(gl4: GL4) {

        with(gl4) {

            glCreateVertexArrays(1, vertexArrayName)

            glVertexArrayAttribBinding(vertexArrayName.get(0), Semantic.Attr.POSITION, Semantic.Stream._0)
            glVertexArrayAttribBinding(vertexArrayName.get(0), Semantic.Attr.COLOR, Semantic.Stream._0)

            glVertexArrayAttribFormat(vertexArrayName.get(0), Semantic.Attr.POSITION, 2, GL_FLOAT, false, 0)
            glVertexArrayAttribFormat(vertexArrayName.get(0), Semantic.Attr.COLOR, 3, GL_FLOAT, false, 2 * Float.BYTES)

            glEnableVertexArrayAttrib(vertexArrayName.get(0), Semantic.Attr.POSITION)
            glEnableVertexArrayAttrib(vertexArrayName.get(0), Semantic.Attr.COLOR)

            glVertexArrayElementBuffer(vertexArrayName.get(0), bufferName.get(Buffer.ELEMENT))
            glVertexArrayVertexBuffer(vertexArrayName.get(0), Semantic.Stream._0, bufferName.get(Buffer.VERTEX), 0,
                    (3 + 2) * Float.BYTES)
        }
    }

    private fun initProgram(gl4: GL4) {

        val vertShader = ShaderCode.create(gl4, GL_VERTEX_SHADER, this.javaClass, SHADERS_ROOT, null,
                SHADERS_SRC, "vert", null, true)
        val fragShader = ShaderCode.create(gl4, GL_FRAGMENT_SHADER, this.javaClass, SHADERS_ROOT, null,
                SHADERS_SRC, "frag", null, true)

        val shaderProgram = ShaderProgram()
        shaderProgram.add(vertShader)
        shaderProgram.add(fragShader)

        shaderProgram.init(gl4)

        programName = shaderProgram.program()

        shaderProgram.link(gl4, System.out)

        vertShader.destroy(gl4)
        fragShader.destroy(gl4)
    }

    override fun display(drawable: GLAutoDrawable): Unit {

        with(drawable.gl.gL4) {

            glClearBufferfv(GL_COLOR, 0, clearColor)
            glClearBufferfv(GL_DEPTH, 0, clearDepth)

            run {
                // update matrix based on time
                var now = System.currentTimeMillis()
                val diff = (now - start) / 1000f
                /**
                 * Here we build the matrix that will multiply our original vertex
                 * positions. We scale, halving it, and rotate it.
                 */
                scale = FloatUtil.makeScale(scale, true, 0.5f, 0.5f, 0.5f)
                zRotation = FloatUtil.makeRotationEuler(zRotation, 0, 0f, 0f, diff)
                modelToClip = FloatUtil.multMatrix(scale, zRotation)

                transformPointer.asFloatBuffer().put(modelToClip)
            }
            glUseProgram(programName)
            glBindVertexArray(vertexArrayName.get(0))

            glBindBufferBase(
                    GL_UNIFORM_BUFFER, // Target
                    Semantic.Uniform.TRANSFORM0, // index
                    bufferName.get(Buffer.TRANSFORM)) // buffer

            glDrawElements(
                    GL_TRIANGLES, // primitive mode
                    elementCount, // element count
                    GL_UNSIGNED_SHORT, // element type
                    0) // element offset}
        }
    }

    override fun reshape(drawable: GLAutoDrawable, x: Int, y: Int, width: Int, height: Int): Unit {

        with(drawable.gl.gL4) {
            /**
             * Just the glViewport for this sample, normally here you update your
             * projection matrix.
             */
            glViewport(x, y, width, height)
        }
    }

    override fun dispose(drawable: GLAutoDrawable): Unit {

        with(drawable.gl.gL4) {

            glUnmapNamedBuffer(bufferName.get(Buffer.TRANSFORM))

            glDeleteProgram(programName)
            glDeleteVertexArrays(1, vertexArrayName)
            glDeleteBuffers(Buffer.MAX, bufferName)
        }

        BufferUtils.destroyDirectBuffer(vertexArrayName)
        BufferUtils.destroyDirectBuffer(bufferName)

        BufferUtils.destroyDirectBuffer(clearColor)
        BufferUtils.destroyDirectBuffer(clearDepth)

        System.exit(0)
    }


    override fun keyPressed(e: KeyEvent) {
        if (e.keyCode === KeyEvent.VK_ESCAPE) {
            animator.remove(window)
            window.destroy()
        }
    }

    override fun keyReleased(e: KeyEvent) {
    }
}
