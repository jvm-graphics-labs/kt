import gli.Texture2d
import glutil.TimeHack6435126
import main.ceilMultiple
import main.floorMultiple
import main.vec._2.Vec2i
import main.vec._3.Vec3i
import main.vec._4.Vec4b
import org.junit.Test

/**
 * Created by elect on 23/10/16.
 */

class core {

    @Test fun createTextureStorage() {

        val texture = Texture2d(gli.Format.FORMAT_RGBA8_UINT_PACK8, Vec2i(256))
        val texel = Vec4b(255, 127, 0, 255)
        texture.clear(texel)

        assert(texture.levels() > 1)

        assert(!texture.empty())

        assert(texture[0].data() != null)

        val data = texture[0].data()!!
        val texelA = Vec4b(data)
        data.position(Vec4b.SIZE)
        val texelB = Vec4b(data)
        data.position(Vec4b.SIZE * 2)
        val texelC = Vec4b(data)
        data.position(Vec4b.SIZE * 3)
        val texelD = Vec4b(data)

        assert(texelA == texel)
        assert(texelB == texel)
        assert(texelC == texel)
        assert(texelD == texel)
    }

    @Test fun resetZero() {

        val data = IntArray(1 shl 21)

        TimeHack6435126.enableHighResolutionTimer()

        val lastTime = System.nanoTime()

        for (i in 0..((1 shl 4) - 1))
            for (j in 0..(data.size - 1))
                data[j] = 0

        val time = System.nanoTime()
        println("resetZero: ${(time - lastTime) / 1000000} ms")
    }

    @Test fun floorMultiple() {

        assert(4 floorMultiple 1 == 4)
        assert(3 floorMultiple 4 == 0)
        assert(6 floorMultiple 4 == 4)
        assert(8 floorMultiple 4 == 8)
        assert(9 floorMultiple 4 == 8)

        assert(3 ceilMultiple 4 == 4)
        assert(6 ceilMultiple 4 == 8)
        assert(8 ceilMultiple 4 == 8)
        assert(9 ceilMultiple 4 == 12)

        println(1 ceilMultiple 4)
        val extent = Vec3i(4, 4, 1)
        val blockExtent = Vec3i(4, 4, 1)
        println(extent ceilMultiple blockExtent) // format.blockExtent()
        println((extent ceilMultiple blockExtent) / blockExtent) // format.blockExtent()
    }
}