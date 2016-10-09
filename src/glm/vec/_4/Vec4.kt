package glm.vec._4

import glm.glm
import glm.vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4(override var x: Float = 0f, override var y: Float = 0f, override var z: Float = 0f, override var w: Float = 0f) : Vec4t<Float>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(v.x.toFloat(), v.y.toFloat(), v.z.toFloat(), v.w.toFloat())

    constructor(s: Float) : this(s, s, s, s)

    constructor(fa: FloatArray) : this(fa[0], fa[1], fa[2], fa[3])

    constructor(fa: Array<Float>) : this(fa[0], fa[1], fa[2], fa[3])


    fun to(v: Vec4t<Number>): Vec4 {
        x = v.x.toFloat(); y = v.y.toFloat(); z = v.z.toFloat(); w = v.w.toFloat(); return this
    }

    fun to(s: Float): Vec4 {
        x = s; y = s; z = s; w = s; return this
    }

    fun to(x: Float, y: Float, z: Float, w: Float): Vec4 {
        this.x = x; this.y = y; this.z = z; this.w = w; return this
    }

    fun to(fa: FloatArray): Vec4 {
        x = fa[0]; y = fa[1]; z = fa[2]; w = fa[3]; return this
    }

    fun to(fa: Array<Float>): Vec4 {
        x = fa[0]; y = fa[1]; z = fa[2]; w = fa[3]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Float) = when (i) {0 -> x = s; 1 -> y = s; 2 -> z = s; else -> w = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec4 {
        x = -x; y = -y; z = -z; w = -w; return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4 = glm.add(Vec4(), this, 1f, 1f, 1f, 1f)
    fun incAss() = glm.add(this, this, 1f, 1f, 1f, 1f)
    fun inc(res: Vec4) = glm.add(res, this, 1f, 1f, 1f, 1f)


    operator fun dec(): Vec4 = glm.sub(Vec4(), this, 1f, 1f, 1f, 1f)
    fun decAss() = glm.sub(this, this, 1f, 1f, 1f, 1f)
    fun dec(res: Vec4) = glm.sub(res, this, 1f, 1f, 1f, 1f)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Float) = glm.add(Vec4(), this, b, b, b, b)
    operator fun plus(b: Vec4) = glm.add(Vec4(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.add(Vec4(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Float) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Float, res: Vec4) = glm.add(res, this, b, b, b, b)
    fun add(bX: Float, bY: Float, bZ: Float, bW: Float, res: Vec4) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4, res: Vec4) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Float) = glm.sub(Vec4(), this, b, b, b, b)
    operator fun minus(b: Vec4) = glm.sub(Vec4(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.sub(Vec4(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Float) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Float, res: Vec4) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Float, bY: Float, bZ: Float, bW: Float, res: Vec4) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4, res: Vec4) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Float) = glm.mul(Vec4(), this, b, b, b, b)
    operator fun times(b: Vec4) = glm.mul(Vec4(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.mul(Vec4(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Float) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Float, res: Vec4) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Float, bY: Float, bZ: Float, bW: Float, res: Vec4) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4, res: Vec4) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Float) = glm.div(Vec4(), this, b, b, b, b)
    operator fun div(b: Vec4) = glm.div(Vec4(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.div(Vec4(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Float) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Float, res: Vec4) = glm.div(res, this, b, b, b, b)
    fun div(bX: Float, bY: Float, bZ: Float, bW: Float, res: Vec4) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4, res: Vec4) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Float) = glm.mod(Vec4(), this, b, b, b, b)
    operator fun mod(b: Vec4) = glm.mod(Vec4(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.mod(Vec4(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Float) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Float, bY: Float, bZ: Float, bW: Float) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Float, res: Vec4) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Float, bY: Float, bZ: Float, bW: Float, res: Vec4) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4, res: Vec4) = glm.mod(res, this, b.x, b.y, b.z, b.w)
}


// -- Binary arithmetic vecOperators --

operator fun Float.plus(b: Vec4) = glm.add(Vec4(), b, this, this, this, this)
inline infix fun Float.addAss(b: Vec4) = glm.add(b, b, this, this, this, this)

operator fun Float.minus(b: Vec4) = glm.sub(Vec4(), this, this, this, this, b)
inline infix fun Float.subAss(b: Vec4) = glm.sub(b, this, this, this, this, b)

operator fun Float.times(b: Vec4) = glm.mul(Vec4(), b, this, this, this, this)
inline infix fun Float.mulAss(b: Vec4) = glm.mul(b, b, this, this, this, this)

operator fun Float.div(b: Vec4) = glm.div(Vec4(), this, this, this, this, b)
inline infix fun Float.divAss(b: Vec4) = glm.div(b, this, this, this, this, b)

operator fun Float.mod(b: Vec4) = glm.mod(Vec4(), this, this, this, this, b)
inline infix fun Float.modAss(b: Vec4) = glm.mod(b, this, this, this, this, b)