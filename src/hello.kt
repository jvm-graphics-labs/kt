import com.jogamp.newt.opengl.GLWindow
import com.jogamp.opengl.*
import com.jogamp.opengl.GL2ES3.*
import com.jogamp.opengl.GL4.*
import com.jogamp.opengl.util.Animator
import com.jogamp.opengl.util.GLBuffers
import glutil.BufferUtils
import glutil.GlDebugOutput

/**
 * Created by elect on 04/10/16.
 */


fun main(args: Array<String>) {

    var hello = Hello()
}

class Hello : GLEventListener {

    private val window = GLWindow.create(GLCapabilities(GLProfile.get(GLProfile.GL4)))
    private val animator = Animator(window)

    init {
        with(window) {
            setSize(1024, 768); setPosition(100, 50)
            isUndecorated = false; isAlwaysOnTop = false; isFullscreen = false; isPointerVisible = true; confinePointer(false);
            title = "hello"; contextCreationFlags = GLContext.CTX_OPTION_DEBUG; isVisible = true
            addGLEventListener(this@Hello)
        }
        animator.start()
    }

    object Buffer {
        val VERTEX = 0
        val ELEMENT = 1
        val TRANSFORM = 2
        val MAX = 3
    }

    private val vertexData = floatArrayOf(
            -1f, -1f, /**/ 1f, 0f, 0f,
            +0f, +2f, /**/ 0f, 0f, 1f,
            +1f, -1f, /**/ 0f, 1f, 0f)
    private val elementData = shortArrayOf(0, 2, 1)

    private var bufferName = GLBuffers.newDirectIntBuffer(Buffer.MAX)
    private var vertexArrayName = GLBuffers.newDirectIntBuffer(1)

    private val bug1287 = true

    override fun init(drawable: GLAutoDrawable) {

        var gl4 = drawable.gl.gL4

        initDebug(gl4)

        initBuffers(gl4)
    }

    fun initDebug(gl4: GL4) {

        window.context.addGLDebugListener(GlDebugOutput())
        // Turn off all the debug
        gl4.glDebugMessageControl(
                GL_DONT_CARE, // source
                GL_DONT_CARE, // type
                GL_DONT_CARE, // severity
                0, // count
                null, // id
                false) // enabled
        // Turn on all OpenGL Errors, shader compilation/linking errors, or highly-dangerous undefined behavior
        gl4.glDebugMessageControl(
                GL_DONT_CARE, // source
                GL_DONT_CARE, // type
                GL_DEBUG_SEVERITY_HIGH, // severity
                0, // count
                null, // id
                true) // enabled
        // Turn on all major performance warnings, shader compilation/linking warnings or the use of deprecated functions
        gl4.glDebugMessageControl(
                GL_DONT_CARE, // source
                GL_DONT_CARE, // type
                GL_DEBUG_SEVERITY_MEDIUM, // severity
                0, // count
                null, // id
                true) // enabled
    }

    fun initBuffers(gl4: GL4) {

        val vertexBuffer = GLBuffers.newDirectFloatBuffer(vertexData)
        val elementBuffer = GLBuffers.newDirectShortBuffer(elementData)

        with(gl4) {

            glCreateBuffers(Buffer.MAX, bufferName)

            if (!bug1287) {

                glNamedBufferStorage(bufferName.get(Buffer.VERTEX), (vertexBuffer.capacity() * java.lang.Float.BYTES).toLong(),
                        vertexBuffer, GL_STATIC_DRAW)

                glNamedBufferStorage(bufferName.get(Buffer.ELEMENT), (elementBuffer.capacity() * java.lang.Short.BYTES).toLong(),
                        elementBuffer, GL_STATIC_DRAW)

                glNamedBufferStorage(bufferName.get(Buffer.TRANSFORM), (16 * java.lang.Float.BYTES).toLong(), null, GL_MAP_WRITE_BIT)

            } else {
                // vertices
                glBindBuffer(GL_ARRAY_BUFFER, bufferName.get(Buffer.VERTEX))
                glBufferStorage(GL_ARRAY_BUFFER, (vertexBuffer.capacity() * java.lang.Float.BYTES).toLong(), vertexBuffer, 0)
                glBindBuffer(GL_ARRAY_BUFFER, 0);
                // elements
                glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, bufferName.get(Buffer.ELEMENT))
                glBufferStorage(GL_ELEMENT_ARRAY_BUFFER, (elementBuffer.capacity() * java.lang.Short.BYTES).toLong(), elementBuffer, 0)
                glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0)
                // transform
                glBindBuffer(GL_UNIFORM_BUFFER, bufferName.get(Buffer.TRANSFORM))
                run {
                    val uniformBufferOffset = GLBuffers.newDirectIntBuffer(1)
                    glGetIntegerv(GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT, uniformBufferOffset)
                    val uniformBlockSize = Math.max(16 * java.lang.Float.BYTES, uniformBufferOffset.get(0))

                    glBufferStorage(GL_UNIFORM_BUFFER, uniformBlockSize.toLong(), null,
                            GL_MAP_WRITE_BIT or GL_MAP_PERSISTENT_BIT or GL_MAP_COHERENT_BIT)

                    BufferUtils.destroyDirectBuffer(uniformBufferOffset)
                }
                glBindBuffer(GL_UNIFORM_BUFFER, 0)
            }
        }

        BufferUtils.destroyDirectBuffer(vertexBuffer)
        BufferUtils.destroyDirectBuffer(elementBuffer)
    }

    override fun display(drawable: GLAutoDrawable): Unit {
        println("display")
    }

    override fun reshape(drawable: GLAutoDrawable, x: Int, y: Int, width: Int, height: Int): Unit {
        println("reshape")
    }

    override fun dispose(drawable: GLAutoDrawable): Unit {
        println("dispose")
    }
}
