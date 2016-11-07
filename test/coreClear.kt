import gli.Format.FORMAT_RGBA8_UNORM_PACK8
import gli.Texture2d
import main.vec._2.Vec2i
import main.vec._4.Vec4b
import org.junit.Test

/**
 * Created by elect on 29/10/16.
 */

class coreClear {

    @Test fun clear() {

        // TODO duplicate
    }

    @Test fun canClearLevel() {

        run {
            val textureMember = Texture2d(FORMAT_RGBA8_UNORM_PACK8, Vec2i(4), 1)
            textureMember clear Vec4b(255, 127, 0, 255)

            val textureExternal = Texture2d(FORMAT_RGBA8_UNORM_PACK8, Vec2i(4), 1)
            textureExternal clear Vec4b(255, 127, 0, 255)

            assert(textureMember == textureExternal)
        }

        run {
            val textureMember = Texture2d(FORMAT_RGBA8_UNORM_PACK8, Vec2i(4))
            textureMember clear Vec4b(127, 95, 63, 255)
            textureMember.clear(0, 0, 1, Vec4b(255, 127, 0, 255))

            assert(Vec4b(textureMember.data(0, 0, 0)) == Vec4b(127, 95, 63, 255))
            assert(Vec4b(textureMember.data(0, 0, 1)) == Vec4b(255, 127, 0, 255))
            assert(Vec4b(textureMember.data(0, 0, 2)) == Vec4b(127, 95, 63, 255))

            val textureExternal = Texture2d(FORMAT_RGBA8_UNORM_PACK8, Vec2i(4))

            gli.clear(textureExternal, Vec4b(127, 95, 63, 255))
            gli.clear(textureExternal, 0, 0, 1, Vec4b(255, 127, 0, 255))

            assert(Vec4b(textureExternal.data(0, 0, 0)) == Vec4b(127, 95, 63, 255))
            assert(Vec4b(textureExternal.data(0, 0, 1)) == Vec4b(255, 127, 0, 255))
            assert(Vec4b(textureExternal.data(0, 0, 2)) == Vec4b(127, 95, 63, 255))

            assert(textureMember == textureExternal)
        }
    }
}