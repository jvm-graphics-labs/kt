import gli.Format.*
import gli.StorageLinear
import main.vec._3.Vec3i
import org.junit.Test

/**
 * Created by elect on 29/10/16.
 */

class coreAddressing {

    @Test fun layers() {

        class Test(val dimensions: Vec3i, val format: gli.Format, val baseOffset: Int, val size: Int)

        listOf(
                Test(Vec3i(4, 4, 1), FORMAT_RGBA8_UINT_PACK8, 64, 128),
                Test(Vec3i(4, 4, 1), FORMAT_RGB16_SFLOAT_PACK16, 96, 192),
                Test(Vec3i(4, 4, 1), FORMAT_RGBA32_SFLOAT_PACK32, 256, 512),
                Test(Vec3i(4, 4, 1), FORMAT_RGBA_DXT1_UNORM_BLOCK8, 8, 16),
                Test(Vec3i(8, 8, 1), FORMAT_RGBA_DXT1_UNORM_BLOCK8, 32, 64),
                Test(Vec3i(4, 4, 1), FORMAT_R_ATI1N_SNORM_BLOCK8, 8, 16))

                .forEach {

                    val storage = gli.StorageLinear(it.format, it.dimensions, 2, 1, 1)
                    val baseOffset = storage.baseOffset(1, 0, 0)

                    assert(baseOffset == it.baseOffset)
                    assert(storage.size() == it.size)
                }
    }

    @Test fun faces() {

        class Test(val format: gli.Format, val level: Int, val baseOffset: Int, val size: Int)

        listOf(
                Test(FORMAT_RGBA8_UINT_PACK8, 0, 0, 340),
                Test(FORMAT_RGBA8_UINT_PACK8, 1, 256, 340),
                Test(FORMAT_R8_UINT_PACK8, 1, 64, 85),
                Test(FORMAT_RGBA8_UINT_PACK8, 3, 336, 340),
                Test(FORMAT_RGBA32_SFLOAT_PACK32, 0, 0, 1360),
                Test(FORMAT_RGBA32_SFLOAT_PACK32, 1, 1024, 1360),
                Test(FORMAT_RGB_DXT1_UNORM_BLOCK8, 0, 0, 56),
                Test(FORMAT_RGB_DXT1_UNORM_BLOCK8, 1, 32, 56),
                Test(FORMAT_RGBA_DXT5_UNORM_BLOCK16, 1, 64, 112))

                .forEach {

                    val storage = StorageLinear(it.format, Vec3i(8, 8, 1), 1, 1, 4)

                    assert(storage.baseOffset(0, 0, it.level) == it.baseOffset)
                    assert(storage.size() == it.size)
                }
    }

    @Test fun levels() {

        class Test(val format: gli.Format, val level: Int, val baseOffset: Int, val size: Int)

        listOf(
                Test(FORMAT_RGBA8_UINT_PACK8, 0, 0, 340),
                Test(FORMAT_RGBA8_UINT_PACK8, 1, 256, 340),
                Test(FORMAT_RGBA8_UINT_PACK8, 3, 336, 340),
                Test(FORMAT_RGBA32_SFLOAT_PACK32, 0, 0, 1360),
                Test(FORMAT_RGBA32_SFLOAT_PACK32, 1, 1024, 1360),
                Test(FORMAT_RGB_DXT1_UNORM_BLOCK8, 0, 0, 56),
                Test(FORMAT_RGBA_DXT1_UNORM_BLOCK8, 1, 32, 56))

                .forEach {

                    val storage = StorageLinear(it.format, Vec3i(8, 8, 1), 1, 1, 4)

                    assert(storage.baseOffset(0, 0, it.level) == it.baseOffset)
                    assert(storage.size() == it.size)
                }
    }
}