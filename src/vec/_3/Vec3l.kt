package vec._3

import vec.Vec3t

/**
 * Created by elect on 09/10/16.
 */

data class Vec3l(override var x: Long = 0, override var y: Long = 0, override var z: Long = 0) : Vec3t<Long>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(v.x.toLong(), v.y.toLong(), v.z.toLong())

    constructor(s: Long) : this(s, s, s)

    constructor(la: LongArray) : this(la[0], la[1], la[2])

    constructor(la: Array<Long>) : this(la[0], la[1], la[2])


    fun to(v: Vec3t<Number>): Vec3l {
        x = v.x.toLong(); y = v.y.toLong(); z = v.z.toLong(); return this
    }

    fun to(s: Long): Vec3l {
        x = s; y = s; z = s; return this
    }

    fun to(x: Long, y: Long, z: Long): Vec3l {
        this.x = x; this.y = y; this.z = z; return this
    }

    fun to(ba: LongArray): Vec3l {
        x = ba[0]; y = ba[1];  z = ba[2]; return this
    }

    fun to(ba: Array<Long>): Vec3l {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Long) = when (i) {0 -> x = s; 1 -> y = s; else -> z = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec3l {
        x = -x; y = -y; z = -z; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3l = glm.add(Vec3l(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3l) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3l = glm.sub(Vec3l(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3l) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Long) = glm.add(Vec3l(), this, b, b, b)
    operator fun plus(b: Vec3l) = glm.add(Vec3l(), this, b.x, b.y, b.z)

    fun add(bX: Long, bY: Long, bZ: Long) = glm.add(Vec3l(), this, bX, bY, bZ)

    infix inline fun addAss(b: Long) = glm.add(this, this, b, b, b)
    fun addAss(bX: Long, bY: Long, bZ: Long) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3l) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Long, res: Vec3l) = glm.add(res, this, b, b, b)
    fun add(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3l, res: Vec3l) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Long) = glm.sub(Vec3l(), this, b, b, b)
    operator fun minus(b: Vec3l) = glm.sub(Vec3l(), this, b.x, b.y, b.z)

    fun sub(bX: Long, bY: Long, bZ: Long) = glm.sub(Vec3l(), this, bX, bY, bZ)

    infix inline fun subAss(b: Long) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Long, bY: Long, bZ: Long) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3l) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Long, res: Vec3l) = glm.sub(res, this, b, b, b)
    fun sub(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3l, res: Vec3l) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Long) = glm.mul(Vec3l(), this, b, b, b)
    operator fun times(b: Vec3l) = glm.mul(Vec3l(), this, b.x, b.y, b.z)

    fun mul(bX: Long, bY: Long, bZ: Long) = glm.mul(Vec3l(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Long) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Long, bY: Long, bZ: Long) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3l) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Long, res: Vec3l) = glm.mul(res, this, b, b, b)
    fun mul(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3l, res: Vec3l) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Long) = glm.div(Vec3l(), this, b, b, b)
    operator fun div(b: Vec3l) = glm.div(Vec3l(), this, b.x, b.y, b.z)

    fun div(bX: Long, bY: Long, bZ: Long) = glm.div(Vec3l(), this, bX, bY, bZ)

    infix inline fun divAss(b: Long) = glm.div(this, this, b, b, b)
    fun divAss(bX: Long, bY: Long, bZ: Long) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3l) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Long, res: Vec3l) = glm.div(res, this, b, b, b)
    fun div(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3l, res: Vec3l) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Long) = glm.mod(Vec3l(), this, b, b, b)
    operator fun mod(b: Vec3l) = glm.mod(Vec3l(), this, b.x, b.y, b.z)

    fun mod(bX: Long, bY: Long, bZ: Long) = glm.mod(Vec3l(), this, bX, bY, bZ)

    infix inline fun modAss(b: Long) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Long, bY: Long, bZ: Long) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3l) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Long, res: Vec3l) = glm.mod(res, this, b, b, b)
    fun mod(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3l, res: Vec3l) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Long) = glm.and(Vec3l(), this, b, b, b)
    fun and(bX: Long, bY: Long, bZ: Long) = glm.and(Vec3l(), this, bX, bY, bZ)
    fun and(b: Vec3l) = glm.and(Vec3l(), this, b.x, b.y, b.z)

    infix inline fun andAss(b: Long) = glm.and(this, this, b, b, b)
    fun andAss(bX: Long, bY: Long, bZ: Long) = glm.and(this, this, bX, bY, bZ)
    infix inline fun andAss(b: Vec3l) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Long, res: Vec3l) = glm.and(res, this, b, b, b)
    fun and(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3l, res: Vec3l) = glm.and(res, this, b.x, b.y, b.z)


    inline infix fun or(b: Long) = glm.or(Vec3l(), this, b, b, b)
    fun or(bX: Long, bY: Long, bZ: Long) = glm.or(Vec3l(), this, bX, bY, bZ)
    fun or(b: Vec3l) = glm.or(Vec3l(), this, b.x, b.y, b.z)

    infix inline fun orAss(b: Long) = glm.or(this, this, b, b, b)
    fun orAss(bX: Long, bY: Long, bZ: Long) = glm.or(this, this, bX, bY, bZ)
    infix inline fun orAss(b: Vec3l) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Long, res: Vec3l) = glm.or(res, this, b, b, b)
    fun or(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3l, res: Vec3l) = glm.or(res, this, b.x, b.y, b.z)


    inline infix fun xor(b: Long) = glm.xor(Vec3l(), this, b, b, b)
    fun xor(bX: Long, bY: Long, bZ: Long) = glm.xor(Vec3l(), this, bX, bY, bZ)
    fun xor(b: Vec3l) = glm.xor(Vec3l(), this, b.x, b.y, b.z)

    infix inline fun xorAss(b: Long) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Long, bY: Long, bZ: Long) = glm.xor(this, this, bX, bY, bZ)
    infix inline fun xorAss(b: Vec3l) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Long, res: Vec3l) = glm.xor(res, this, b, b, b)
    fun xor(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3l, res: Vec3l) = glm.xor(res, this, b.x, b.y, b.z)


    inline infix fun shl(b: Long) = glm.shl(Vec3l(), this, b, b, b)
    fun shl(bX: Long, bY: Long, bZ: Long) = glm.shl(Vec3l(), this, bX, bY, bZ)
    fun shl(b: Vec3l) = glm.shl(Vec3l(), this, b.x, b.y, b.z)

    infix inline fun shlAss(b: Long) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Long, bY: Long, bZ: Long) = glm.shl(this, this, bX, bY, bZ)
    infix inline fun shlAss(b: Vec3l) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Long, res: Vec3l) = glm.shl(res, this, b, b, b)
    fun shl(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3l, res: Vec3l) = glm.shl(res, this, b.x, b.y, b.z)


    inline infix fun shr(b: Long) = glm.shr(Vec3l(), this, b, b, b)
    fun shr(bX: Long, bY: Long, bZ: Long) = glm.shr(Vec3l(), this, bX, bY, bZ)
    fun shr(b: Vec3l) = glm.shr(Vec3l(), this, b.x, b.y, b.z)

    infix inline fun shrAss(b: Long) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Long, bY: Long, bZ: Long) = glm.shr(this, this, bX, bY, bZ)
    infix inline fun shrAss(b: Vec3l) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Long, res: Vec3l) = glm.shr(res, this, b, b, b)
    fun shr(bX: Long, bY: Long, bZ: Long, res: Vec3l) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3l, res: Vec3l) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3l(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3l) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Long.plus(b: Vec3l) = glm.add(Vec3l(), b, this, this, this)
inline infix fun Long.addAss(b: Vec3l) = glm.add(b, b, this, this, this)

operator fun Long.minus(b: Vec3l) = glm.sub(Vec3l(), this, this, this, b)
inline infix fun Long.subAss(b: Vec3l) = glm.sub(b, this, this, this, b)

operator fun Long.times(b: Vec3l) = glm.mul(Vec3l(), b, this, this, this)
inline infix fun Long.mulAss(b: Vec3l) = glm.mul(b, b, this, this, this)

operator fun Long.div(b: Vec3l) = glm.div(Vec3l(), this, this, this, b)
inline infix fun Long.divAss(b: Vec3l) = glm.div(b, this, this, this, b)

operator fun Long.mod(b: Vec3l) = glm.mod(Vec3l(), this, this, this, b)
inline infix fun Long.modAss(b: Vec3l) = glm.mod(b, this, this, this, b)