package gli

import gli.Format.FORMAT_INVALID
import gli.Swizzle.*
import gli.Target.*
import main.vec._2.Vec2i
import main.vec._3.Vec3i
import main.vec._4.Vec4b
import java.nio.ByteBuffer

/**
 * Created by GBarbieri on 13.10.2016.
 */

open class Texture {

    protected val storage: StorageLinear?
    protected val target: Target
    protected val format: Format
    protected val baseLayer: Int
    protected val maxLayer: Int
    protected val baseFace: Int
    protected val maxFace: Int
    protected val baseLevel: Int
    protected val maxLevel: Int
    protected val swizzles: Swizzles


    /**
     * Create an empty texture instance
     */
    constructor() {

        storage = null
        target = TARGET_INVALID
        format = FORMAT_INVALID
        baseLayer = 0; maxLayer = 0
        baseFace = 0; maxFace = 0
        baseLevel = 0; maxLevel = 0
        swizzles = Swizzles(SWIZZLE_ZERO)
    }

    /**
     * Create a texture object and allocate a texture storage for it
     */
    constructor(target: Target,
                format: Format,
                extent: Vec3i,
                layers: Int,
                faces: Int,
                levels: Int,
                swizzles: Swizzles = Swizzles(SWIZZLE_RED, SWIZZLE_GREEN, SWIZZLE_BLUE, SWIZZLE_ALPHA)) {

        storage = StorageLinear(format, extent, layers, faces, levels)
        this.target = target
        this.format = format
        baseLayer = 0; maxLayer = layers - 1
        baseFace = 0; maxFace = faces - 1
        baseLevel = 0; maxLevel = levels - 1
        this.swizzles = swizzles

        assert(target != TARGET_CUBE || (target == TARGET_CUBE && extent.x == extent.y))
        assert(target != TARGET_CUBE_ARRAY || (target == TARGET_CUBE_ARRAY && extent.x == extent.y))
    }

    /**
     * Create a texture object by sharing an existing texture storage_type from another texture instance.
     * This texture object is effectively a texture view where the layer, the face and the level allows identifying
     * a specific subset of the texture storage_linear source.
     * This texture object is effectively a texture view where the target and format can be reinterpreted
     * with a different compatible texture target and texture format.
     */
    constructor(texture: Texture,
                target: Target,
                format: Format,
                baseLayer: Int, maxLayer: Int,
                baseFace: Int, maxFace: Int,
                baseLevel: Int, maxLevel: Int,
                swizzles: Swizzles = Swizzles(SWIZZLE_RED, SWIZZLE_GREEN, SWIZZLE_BLUE, SWIZZLE_ALPHA)) {

        storage = texture.storage
        this.target = target
        this.format = format
        this.baseLayer = baseLayer; this.maxLayer = maxLayer
        this.baseFace = baseFace; this.maxFace = maxFace
        this.baseLevel = baseLevel; this.maxLevel = maxLevel
        this.swizzles = swizzles

        assert(format.blockSize() == texture.format.blockSize())
        assert(target != TARGET_1D || (target == TARGET_1D && layers() == 1 && faces() == 1 && extent().y == 1 && extent().z == 1))
        assert(target != TARGET_1D_ARRAY || (target == TARGET_1D_ARRAY && layers() >= 1 && faces() == 1 && extent().y == 1 && extent().z == 1))
        assert(target != TARGET_2D || (target == TARGET_2D && layers() == 1 && faces() == 1 && extent().y >= 1 && extent().z == 1))
        assert(target != TARGET_2D_ARRAY || (target == TARGET_2D_ARRAY && layers() >= 1 && faces() == 1 && extent().y >= 1 && extent().z == 1))
        assert(target != TARGET_3D || (target == TARGET_3D && layers() == 1 && faces() == 1 && extent().y >= 1 && extent().z >= 1))
        assert(target != TARGET_CUBE || (target == TARGET_CUBE && layers() == 1 && faces() >= 1 && extent().y >= 1 && extent().z == 1))
        assert(target != TARGET_CUBE_ARRAY || (target == TARGET_CUBE_ARRAY && layers() >= 1 && faces() >= 1 && extent().y >= 1 && extent().z == 1))
    }

    /**
     * Create a texture object by sharing an existing texture storage_type from another texture instance.
     * This texture object is effectively a texture view where the target and format can be reinterpreted
     * with a different compatible texture target and texture format.
     */
    constructor(texture: Texture,
                target: Target,
                format: Format,
                swizzles: Swizzles = Swizzles(SWIZZLE_RED, SWIZZLE_GREEN, SWIZZLE_BLUE, SWIZZLE_ALPHA)) {

        storage = texture.storage
        this.target = target
        this.format = format
        baseLayer = texture.baseLayer; maxLayer = texture.maxLayer
        baseFace = texture.baseFace; maxFace = texture.maxFace()
        baseLevel = texture.baseLevel; maxLevel = texture.maxLevel
        this.swizzles = swizzles

        if (empty()) return

        assert(target != TARGET_1D || (target == TARGET_1D && layers() == 1 && faces() == 1 && extent().y == 1 && extent().z == 1))
        assert(target != TARGET_1D_ARRAY || (target == TARGET_1D_ARRAY && layers() >= 1 && faces() == 1 && extent().y == 1 && extent().z == 1))
        assert(target != TARGET_2D || (target == TARGET_2D && layers() == 1 && faces() == 1 && extent().y >= 1 && extent().z == 1))
        assert(target != TARGET_2D_ARRAY || (target == TARGET_2D_ARRAY && layers() >= 1 && faces() == 1 && extent().y >= 1 && extent().z == 1))
        assert(target != TARGET_3D || (target == TARGET_3D && layers() == 1 && faces() == 1 && extent().y >= 1 && extent().z >= 1))
        assert(target != TARGET_CUBE || (target == TARGET_CUBE && layers() == 1 && faces() >= 1 && extent().y >= 1 && extent().z == 1))
        assert(target != TARGET_CUBE_ARRAY || (target == TARGET_CUBE_ARRAY && layers() >= 1 && faces() >= 1 && extent().y >= 1 && extent().z == 1))
    }

    fun empty() = if (storage == null) true else storage.empty()
    fun format() = format
    // TODO swizzles
    fun baseLayer() = baseLayer

    fun maxLayer() = maxLayer
    fun layers() = if (empty()) 0 else maxLayer - baseLayer + 1
    fun baseFace() = baseFace

    fun maxFace() = maxFace
    fun faces() = if (empty()) 0 else maxFace - baseFace + 1
    fun baseLevel() = baseLevel

    fun maxLevel() = maxLevel
    fun levels() = if (empty()) 0 else maxLevel - baseLevel + 1
    fun size(): Int {
        assert(!empty())
        return storage!!.data.capacity()
    }

    fun size(level: Int): Int {
        assert(!empty() && level >= 0 && level < levels())
        return storage!!.levelSize(level)
    }

    fun data(): ByteBuffer {
        assert(!empty())
        return storage!!.data
    }

    fun data(layer: Int, face: Int, level: Int): ByteBuffer {
        assert(!empty())
        assert(layer >= 0 && layer < layers() && face >= 0 && face < faces() && level >= 0 && level < levels())
        return storage!!.data(layer, face, level)
    }

    fun extent(): Vec3i {
        return extent(0)
    }

    fun extent(level: Int): Vec3i {
        assert(!empty())
        assert(level >= 0 && level < levels())

        val srcExtend = storage!!.extent(baseLevel() + level)
        val dstExtend = srcExtend * format.blockExtent() / storage.blockExtent
        return dstExtend max 1
    }

    fun clear() {
        assert(!empty())
        (0 .. storage!!.data.capacity() - 1).forEach { storage.data.put(it, 0) }
    }

    fun Number.BYTES() = when {
        this is Byte -> java.lang.Byte.BYTES
        this is Short -> java.lang.Short.BYTES
        this is Float || this is Int -> java.lang.Float.BYTES
        else -> java.lang.Double.BYTES
    }

    fun clear(texel: Vec4b) {

        assert(!empty())

        val size = storage!!.data.capacity()

        for (i in 0..(size - 1) step 4) {
            storage.data.put(i + 0, texel.x)
            storage.data.put(i + 1, texel.y)
            storage.data.put(i + 2, texel.z)
            storage.data.put(i + 3, texel.w)
        }
    }

    // TODO check if ok
    fun clear(texel: Number) {

        assert(!empty())

        val size = storage!!.data.capacity()

        for (i in 0..(size - 1) step texel.BYTES()) when (texel) {
            is Byte -> storage.data.put(i, texel)
            is Short -> storage.data.putShort(i, texel)
            is Float -> storage.data.putFloat(i, texel)
            is Int -> storage.data.putInt(i, texel)
            is Double -> storage.data.putDouble(i, texel)
            else -> storage.data.putLong(i, texel.toLong())
        }
    }

    // TODO check if ok
    fun clear(layer: Int, face: Int, level: Int, texel: Number) {

        assert(!empty())
        assert(layer >= 0 && layer < layers() && face >= 0 && face < faces() && level >= 0 && level < levels())

        val offset = storage!!.baseOffset(layer, face, level)
        val size = storage.levelSize(level)

        for (i in offset..(offset + size - 1) step texel.BYTES()) when (texel) {
            is Byte -> storage.data.put(i, texel)
            is Short -> storage.data.putShort(i, texel)
            is Float -> storage.data.putFloat(i, texel)
            is Int -> storage.data.putInt(i, texel)
            is Double -> storage.data.putDouble(i, texel)
            else -> storage.data.putLong(i, texel.toLong())
        }
    }
}

data class StorageLinear(val layers: Int = 0,
                         val faces: Int = 0,
                         val levels: Int = 0,
                         val blockSize: Int = 0,
                         val blockCount: Vec3i = Vec3i(),
                         val blockExtent: Vec3i = Vec3i(),
                         val extent: Vec3i = Vec3i(),
                         var data: ByteBuffer = ByteBuffer.allocate(0)) {


    constructor(format: gli.Format, extent: Vec3i, layers: Int, faces: Int, levels: Int)
    : this(layers,
            faces,
            levels,
            format.blockSize(),
            (extent ceilMultiple format.blockExtent()) / format.blockExtent(),
            format.blockExtent(),
            extent) {

        assert(layers > 0 && faces > 0 && levels > 0 && extent.greaterThan(0).all())

        data = ByteBuffer.allocate(layerSize(0, faces - 1, 0, levels - 1) * layers)
    }


    fun layerSize(baseFace: Int, maxFace: Int, baseLevel: Int, maxLevel: Int): Int {

        assert(baseFace >= 0 && maxFace < faces && baseFace < faces && maxLevel >= 0 && maxLevel < levels && baseLevel < levels)

        // The size of a layer is the sum of the size of each face. All the faces have the same size.
        return faceSize(baseLevel, maxLevel) * (maxFace - baseFace + 1)
    }

    fun faceSize(baseLevel: Int, maxLevel: Int): Int {

        assert(maxLevel >= 0 && maxLevel < levels && baseLevel >= 0 && baseLevel < levels && baseLevel <= maxLevel)

        // The size of a face is the sum of the size of each level.
        return (baseLevel .. maxLevel).map{ levelSize(it) }.sum()
    }

    fun levelSize(level: Int): Int {

        assert(level >= 0 && level < levels)

        return blockSize * blockCount(level).compMul()
    }

    fun blockCount(level: Int): Vec3i {

        assert(level >= 0 && level < levels)

        return (extent(level) ceilMultiple blockExtent) / blockExtent
    }

    fun extent(level: Int): Vec3i {

        assert(level >= 0 && level < levels)

        return (extent shr level) max 1
    }

    fun empty() = data.capacity() == 0

    fun size(): Int {
        assert(!empty())
        return data.capacity()
    }

    fun data(layer: Int, face: Int, level: Int): ByteBuffer {
        val offset = baseOffset(layer, face, level)
        val levelSize = levelSize(level)
        data.position(offset)
        data.limit(offset + levelSize)
        val result = data.slice()
        data.position(0)
        data.limit(data.capacity())
        return result
    }

    fun baseOffset(layer: Int, face: Int, level: Int): Int {

        assert(!empty())
        assert(layer >= 0 && layer < layers && face >= 0 && face < faces && level >= 0 && level < levels)

        val layerSize = layerSize(0, faces - 1, 0, levels - 1)
        val faceSize = faceSize(0, levels - 1)
        var baseOffset = layerSize * layer + faceSize * face

        return baseOffset + (0.. level - 1).map { levelSize(it) }.sum()
    }

    override fun equals(other: Any?) = when {
        this === other -> true
        else -> true
//        if (other is StorageLinear)
//            if (data.capacity() == other.data.capacity())
//                for (i in 0..data.capacity()) {
//                    if (data.get(i) != other.data.get(i)) return false
//                }
//            else return false
//        else return false
//        return true
    }
}

class Image {

    private val storage: StorageLinear?
    private val format: Format
    private val baseLevel: Int
    private val size: Int

    constructor() {
        format = FORMAT_INVALID
        baseLevel = 0
        storage = null
        size = 0
    }

    constructor(format: gli.Format, extent: Vec3i) {
        storage = StorageLinear(format, extent, 1, 1, 1)
        this.format = format
        baseLevel = 0
        size = computeSize(0)
    }

    // TODO check baseLayer and baseFace
    constructor(storage: StorageLinear, format: Format, baseLayer: Int, baseFace: Int, baseLevel: Int) {
        this.storage = storage
        this.format = format
        this.baseLevel = baseLevel
        size = computeSize(baseLevel)
    }

    constructor(image: Image, format: Format) {
        storage = image.storage
        this.format = format
        baseLevel = image.baseLevel
        size = image.size
    }

    fun empty() = if (storage == null) true else storage.empty()

    fun size(): Int {
        assert(!empty())
        return size
    }

    fun format() = format

    fun extent(): Vec3i {

        assert(!empty())

        val srcExtent = storage!!.extent(baseLevel)
        val dstExtent = srcExtent * format.blockExtent() / storage.blockExtent

        return dstExtent max 1
    }

    fun data() = storage?.data

    fun computeSize(level: Int): Int {
        assert(!empty())
        return storage!!.levelSize(level)
    }
}

class Texture2d : Texture {

    /**
     * Create an empty texture 2D.
     */
    constructor() : super()

    /**
     * Create a texture2d and allocate a new storage_linear with a complete mipmap chain.
     */
    constructor(format: Format,
                extent: Vec2i,
                levels: Int,
                swizzles: Swizzles = Swizzles(SWIZZLE_RED, SWIZZLE_GREEN, SWIZZLE_BLUE, SWIZZLE_ALPHA)) :
    super(Target.TARGET_2D, format, Vec3i(extent, 1), 1, 1, levels, swizzles)

    /**
     * Create a texture2d and allocate a new storage_linear.
     */
    constructor(format: Format,
                extent: Vec2i,
                swizzles: Swizzles = Swizzles(SWIZZLE_RED, SWIZZLE_GREEN, SWIZZLE_BLUE, SWIZZLE_ALPHA)) :
    super(Target.TARGET_2D, format, Vec3i(extent, 1), 1, 1, extent.levels(), swizzles)

    /**
     * Create a texture2d view with an existing storage_linear.
     */
    constructor(texture: Texture) : super(texture, TARGET_2D, texture.format())

    /**
     * Create a texture2d view with an existing storage_linear.
     */
    constructor(texture: Texture,
                format: Format,
                baseLayer: Int, maxLayer: Int,
                baseFace: Int, maxFace: Int,
                baseLevel: Int, maxLevel: Int,
                swizzles: Swizzles = Swizzles(SWIZZLE_RED, SWIZZLE_GREEN, SWIZZLE_BLUE, SWIZZLE_ALPHA)) :
    super(texture, TARGET_2D, format, baseLayer, maxLayer, baseFace, maxFace, baseLevel, maxLevel)

    /**
     * Create a texture2d view, reference a subset of an existing texture2d instance.
     */
    constructor(texture: Texture2d,
                baseLevel: Int, maxLevel: Int) :
    super(texture, TARGET_2D, texture.format(),
            texture.baseLayer(), texture.maxLayer(),
            texture.baseFace(), texture.maxFace(),
            texture.baseLevel(), texture.maxLevel())

    operator fun get(level: Int): Image = Image(storage!!, format, baseLayer, baseFace, baseLevel + level)
}