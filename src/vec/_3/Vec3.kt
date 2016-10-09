package vec._3

import glm
import vec.Vec3t

/**
 * Created bY GBarbieri on 05.10.2016.
 */

data class Vec3(override var x: Float = 0f, override var y: Float = 0f, override var z: Float = 0f) : Vec3t<Float>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(v.x.toFloat(), v.y.toFloat(), v.z.toFloat())

    constructor(s: Float) : this(s, s, s)

    constructor(fa: FloatArray) : this(fa[0], fa[1], fa[2])

    constructor(fa: Array<Float>) : this(fa[0], fa[1], fa[2])


    fun to(v: Vec3t<Number>): Vec3 {
        x = v.x.toFloat(); y = v.y.toFloat();z = v.z.toFloat(); return this
    }

    fun to(s: Float): Vec3 {
        x = s; y = s;z = s; return this
    }

    fun to(x: Float, y: Float): Vec3 {
        this.x = x; this.y = y;this.z = z; return this
    }

    fun to(fa: FloatArray): Vec3 {
        x = fa[0]; y = fa[1]; z = fa[2]; return this
    }

    fun to(fa: Array<Float>): Vec3 {
        x = fa[0]; y = fa[1];z = fa[2]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Float) = when (i) {0 -> x = s; 1 -> y = s; else -> z = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec3 {
        x = -x; y = -y; z = -z; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3 = glm.add(Vec3(), this, 1f, 1f, 1f)
    fun incAss() = glm.add(this, this, 1f, 1f, 1f)
    fun inc(res: Vec3) = glm.add(res, this, 1f, 1f, 1f)


    operator fun dec(): Vec3 = glm.sub(Vec3(), this, 1f, 1f, 1f)
    fun decAss() = glm.sub(this, this, 1f, 1f, 1f)
    fun dec(res: Vec3) = glm.sub(res, this, 1f, 1f, 1f)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Float) = glm.add(Vec3(), this, b, b, b)
    operator fun plus(b: Vec3) = glm.add(Vec3(), this, b.x, b.y, b.z)

    fun add(bX: Float, bY: Float, bZ: Float) = glm.add(Vec3(), this, bX, bY, bZ)

    infix inline fun addAss(b: Float) = glm.add(this, this, b, b, b)
    fun addAss(bX: Float, bY: Float, bZ: Float) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Float, res: Vec3) = glm.add(res, this, b, b, b)
    fun add(bX: Float, bY: Float, bZ: Float, res: Vec3) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3, res: Vec3) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Float) = glm.sub(Vec3(), this, b, b, b)
    operator fun minus(b: Vec3) = glm.sub(Vec3(), this, b.x, b.y, b.z)

    fun sub(bX: Float, bY: Float, bZ: Float) = glm.sub(Vec3(), this, bX, bY, bZ)

    infix inline fun subAss(b: Float) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Float, bY: Float, bZ: Float) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Float, res: Vec3) = glm.sub(res, this, b, b, b)
    fun sub(bX: Float, bY: Float, bZ: Float, res: Vec3) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3, res: Vec3) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Float) = glm.mul(Vec3(), this, b, b, b)
    operator fun times(b: Vec3) = glm.mul(Vec3(), this, b.x, b.y, b.z)

    fun mul(bX: Float, bY: Float, bZ: Float) = glm.mul(Vec3(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Float) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Float, bY: Float, bZ: Float) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Float, res: Vec3) = glm.mul(res, this, b, b, b)
    fun mul(bX: Float, bY: Float, bZ: Float, res: Vec3) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3, res: Vec3) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Float) = glm.div(Vec3(), this, b, b, b)
    operator fun div(b: Vec3) = glm.div(Vec3(), this, b.x, b.y, b.z)

    fun div(bX: Float, bY: Float, bZ: Float) = glm.div(Vec3(), this, bX, bY, bZ)

    infix inline fun divAss(b: Float) = glm.div(this, this, b, b, b)
    fun divAss(bX: Float, bY: Float, bZ: Float) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Float, res: Vec3) = glm.div(res, this, b, b, b)
    fun div(bX: Float, bY: Float, bZ: Float, res: Vec3) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3, res: Vec3) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Float) = glm.mod(Vec3(), this, b, b, b)
    operator fun mod(b: Vec3) = glm.mod(Vec3(), this, b.x, b.y, b.z)

    fun mod(bX: Float, bY: Float, bZ: Float) = glm.mod(Vec3(), this, bX, bY, bZ)

    infix inline fun modAss(b: Float) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Float, bY: Float, bZ: Float) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Float, res: Vec3) = glm.mod(res, this, b, b, b)
    fun mod(bX: Float, bY: Float, bZ: Float, res: Vec3) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3, res: Vec3) = glm.mod(res, this, b.x, b.y, b.z)
}


// -- Binary arithmetic vecOperators --

operator fun Float.plus(b: Vec3) = glm.add(Vec3(), b, this, this, this)
inline infix fun Float.addAss(b: Vec3) = glm.add(b, b, this, this, this)

operator fun Float.minus(b: Vec3) = glm.sub(Vec3(), this, this, this, b)
inline infix fun Float.subAss(b: Vec3) = glm.sub(b, this, this, this, b)

operator fun Float.times(b: Vec3) = glm.mul(Vec3(), b, this, this, this)
inline infix fun Float.mulAss(b: Vec3) = glm.mul(b, b, this, this, this)

operator fun Float.div(b: Vec3) = glm.div(Vec3(), this, this, this, b)
inline infix fun Float.divAss(b: Vec3) = glm.div(b, this, this, this, b)

operator fun Float.mod(b: Vec3) = glm.mod(Vec3(), this, this, this, b)
inline infix fun Float.modAss(b: Vec3) = glm.mod(b, this, this, this, b)