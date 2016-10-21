package gli

import glm.vec._3.Vec3i
import main.Ulong
import java.nio.ByteBuffer

/**
 * Created by GBarbieri on 13.10.2016.
 */

class Texture {

//    var sizeType: Ulong
//    val targetType: gli.Target
//    val formatType: gli.Format
//    val swizzlesType: gli.Swizzles
//    val storageType: StorageLinear

    constructor() {

    }
}

class StorageLinear(
        private val layers: Ulong = Ulong(0),
        private val faces: Ulong = Ulong(0),
        private val levels: Ulong = Ulong(0),
        private val blockSize: Ulong = Ulong(0),
        private val blockCount: Vec3i = Vec3i(0),
        private val blockExtent: Vec3i = Vec3i(0),
        private val extent: Vec3i = Vec3i(0)) {


    private lateinit var data: ByteBuffer

    constructor(format: gli.Format, extent: Vec3i, layers: Ulong, faces: Ulong, levels: Ulong)
    : this(
            layers,
            faces,
            levels,
            format.blockSize().toUlong(),
            extent.ceilMultiple(format.blockExtent()) / format.blockExtent(),
            format.blockExtent(),
            extent) {

        assert(layers > 0 && faces > 0 && levels > 0 && extent.greaterThan(0).all())

//        data = ByteBuffer.allocateDirect()
    }

//    fun layerSize(baseFace: Ulong, maxFace: Ulong, baseLevel: Ulong, maxLevel: Ulong) {
//
//        assert(baseFace >= 0 && maxFace < faces && baseFace < faces && maxLevel >= 0 && maxLevel < levels && baseLevel < levels)
//
//        // The size of a layer is the sum of the size of each face. All the faces have the same size.
//        return faceSize(ba)
//    }
//
//    fun faceSize(baseLevel: Ulong, maxLevel: Ulong) {
//
//        assert(maxLevel >= 0 && maxLevel < levels && baseLevel >= 0 && baseLevel < levels && baseLevel <= maxLevel)
//
//        var faceSize_ = Ulong(0)
//
//        // The size of a face is the sum of the size of each level.
//        for (level in baseLevel..maxLevel) faceSize_ +=
//    }
//
//    fun levelSize(level: Ulong) {
//
//        assert(level >= 0 && level < levels)
//
//        return blockSize * le
//    }
//
//    fun blockCount(level: Ulong) {
//
//        assert(level >= 0 && level < levels)
//
//
//    }
//
//    fun extent(level: Ulong) {
//
//        assert(level >= 0 && level < levels)
//
//
//    }
}