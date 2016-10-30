import gli.Texture2d
import org.junit.Test
import gli.Format.*
import main.vec._2.Vec2i
import main.vec._4.Vec4b

/**
 * Created by elect on 29/10/16.
 */

class coreClear {

    @Test fun clear() {

        // TODO duplicate
    }

    @Test fun canClearLevel() {

        val textureMember = Texture2d(FORMAT_RGBA8_UNORM_PACK8, Vec2i(4), 1)
        textureMember.clear(Vec4b(255, 127, 0, 255))

        val textureExternal = Texture2d(FORMAT_RGBA8_UNORM_PACK8, Vec2i(4), 1)
        textureExternal.clear(Vec4b(255, 127, 0, 255))

        assert(textureMember == textureExternal)
    }
}