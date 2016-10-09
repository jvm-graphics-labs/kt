package vec._4

import vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4l(override var x: Long = 0, override var y: Long = 0, override var z: Long = 0, override var w: Long = 0) : Vec4t<Long>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(v.x.toLong(), v.y.toLong(), v.z.toLong(), v.w.toLong())

    constructor(s: Long) : this(s, s, s, s)

    constructor(la: LongArray) : this(la[0], la[1], la[2], la[3])

    constructor(la: Array<Long>) : this(la[0], la[1], la[2], la[3])


    fun to(v: Vec4t<Number>): Vec4l {
        x = v.x.toLong(); y = v.y.toLong(); z = v.z.toLong(); w = v.w.toLong(); return this
    }

    fun to(s: Long): Vec4l {
        x = s; y = s; z = s; w = s; return this
    }

    fun to(x: Long, y: Long, z: Long, w: Long): Vec4l {
        this.x = x; this.y = y; this.z = z; this.w = w; return this
    }

    fun to(ba: LongArray): Vec4l {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ba: Array<Long>): Vec4l {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Long) = when (i) {0 -> x = s; 1 -> y = s; 2 -> z = s; else -> w = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec4l {
        x = -x; y = -y; z = -z; w = -w; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4l = glm.add(Vec4l(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4l) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4l = glm.sub(Vec4l(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4l) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Long) = glm.add(Vec4l(), this, b, b, b, b)
    operator fun plus(b: Vec4l) = glm.add(Vec4l(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.add(Vec4l(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Long) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4l) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Long, res: Vec4l) = glm.add(res, this, b, b, b, b)
    fun add(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4l, res: Vec4l) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Long) = glm.sub(Vec4l(), this, b, b, b, b)
    operator fun minus(b: Vec4l) = glm.sub(Vec4l(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.sub(Vec4l(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Long) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4l) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Long, res: Vec4l) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4l, res: Vec4l) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Long) = glm.mul(Vec4l(), this, b, b, b, b)
    operator fun times(b: Vec4l) = glm.mul(Vec4l(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mul(Vec4l(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Long) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4l) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Long, res: Vec4l) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4l, res: Vec4l) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Long) = glm.div(Vec4l(), this, b, b, b, b)
    operator fun div(b: Vec4l) = glm.div(Vec4l(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.div(Vec4l(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Long) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4l) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Long, res: Vec4l) = glm.div(res, this, b, b, b, b)
    fun div(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4l, res: Vec4l) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Long) = glm.mod(Vec4l(), this, b, b, b, b)
    operator fun mod(b: Vec4l) = glm.mod(Vec4l(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mod(Vec4l(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Long) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4l) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Long, res: Vec4l) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4l, res: Vec4l) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Long) = glm.and(Vec4l(), this, b, b, b, b)
    fun and(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.and(Vec4l(), this, bX, bY, bZ, bW)
    fun and(b: Vec4l) = glm.and(Vec4l(), this, b.x, b.y, b.z, b.w)

    infix inline fun andAss(b: Long) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.and(this, this, bX, bY, bZ, bW)
    infix inline fun andAss(b: Vec4l) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Long, res: Vec4l) = glm.and(res, this, b, b, b, b)
    fun and(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4l, res: Vec4l) = glm.and(res, this, b.x, b.y, b.z, b.w)


    inline infix fun or(b: Long) = glm.or(Vec4l(), this, b, b, b, b)
    fun or(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.or(Vec4l(), this, bX, bY, bZ, bW)
    fun or(b: Vec4l) = glm.or(Vec4l(), this, b.x, b.y, b.z, b.w)

    infix inline fun orAss(b: Long) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.or(this, this, bX, bY, bZ, bW)
    infix inline fun orAss(b: Vec4l) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Long, res: Vec4l) = glm.or(res, this, b, b, b, b)
    fun or(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4l, res: Vec4l) = glm.or(res, this, b.x, b.y, b.z, b.w)


    inline infix fun xor(b: Long) = glm.xor(Vec4l(), this, b, b, b, b)
    fun xor(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.xor(Vec4l(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4l) = glm.xor(Vec4l(), this, b.x, b.y, b.z, b.w)

    infix inline fun xorAss(b: Long) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.xor(this, this, bX, bY, bZ, bW)
    infix inline fun xorAss(b: Vec4l) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Long, res: Vec4l) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4l, res: Vec4l) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shl(b: Long) = glm.shl(Vec4l(), this, b, b, b, b)
    fun shl(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.shl(Vec4l(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4l) = glm.shl(Vec4l(), this, b.x, b.y, b.z, b.w)

    infix inline fun shlAss(b: Long) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.shl(this, this, bX, bY, bZ, bW)
    infix inline fun shlAss(b: Vec4l) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Long, res: Vec4l) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4l, res: Vec4l) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shr(b: Long) = glm.shr(Vec4l(), this, b, b, b, b)
    fun shr(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.shr(Vec4l(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4l) = glm.shr(Vec4l(), this, b.x, b.y, b.z, b.w)

    infix inline fun shrAss(b: Long) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.shr(this, this, bX, bY, bZ, bW)
    infix inline fun shrAss(b: Vec4l) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Long, res: Vec4l) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4l) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4l, res: Vec4l) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4l(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4l) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Long.plus(b: Vec4l) = glm.add(Vec4l(), b, this, this, this, this)
inline infix fun Long.addAss(b: Vec4l) = glm.add(b, b, this, this, this, this)

operator fun Long.minus(b: Vec4l) = glm.sub(Vec4l(), this, this, this, this, b)
inline infix fun Long.subAss(b: Vec4l) = glm.sub(b, this, this, this, this, b)

operator fun Long.times(b: Vec4l) = glm.mul(Vec4l(), b, this, this, this, this)
inline infix fun Long.mulAss(b: Vec4l) = glm.mul(b, b, this, this, this, this)

operator fun Long.div(b: Vec4l) = glm.div(Vec4l(), this, this, this, this, b)
inline infix fun Long.divAss(b: Vec4l) = glm.div(b, this, this, this, this, b)

operator fun Long.mod(b: Vec4l) = glm.mod(Vec4l(), this, this, this, this, b)
inline infix fun Long.modAss(b: Vec4l) = glm.mod(b, this, this, this, this, b)