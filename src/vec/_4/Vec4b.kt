package vec._4

import vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4b(override var x: Byte = 0, override var y: Byte = 0, override var z: Byte = 0, override var w: Byte = 0) : Vec4t<Byte>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(v.x.toByte(), v.y.toByte(), v.z.toByte(), v.w.toByte())

    constructor(s: Byte) : this(s, s, s, s)

    constructor(ba: ByteArray) : this(ba[0], ba[1], ba[2], ba[3])

    constructor(ba: Array<Byte>) : this(ba[0], ba[1], ba[2], ba[3])


    fun to(v: Vec4t<Number>): Vec4b {
        x = v.x.toByte(); y = v.y.toByte(); z = v.z.toByte(); w = v.w.toByte(); return this
    }

    fun to(s: Byte): Vec4b {
        x = s; y = s; z = s; w = s; return this
    }

    fun to(s: Int): Vec4b {
        x = s.toByte(); y = s.toByte(); z = s.toByte(); w = s.toByte(); return this
    }

    fun to(x: Byte, y: Byte, z: Byte, w: Byte): Vec4b {
        this.x = x; this.y = y; this.z = z; this.w = w; return this
    }

    fun to(x: Int, y: Int, z: Int, w: Int): Vec4b {
        this.x = x.toByte(); this.y = y.toByte(); this.z = z.toByte(); this.w = w.toByte(); return this
    }

    fun to(ba: ByteArray): Vec4b {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ia: IntArray): Vec4b {
        x = ia[0].toByte(); y = ia[1].toByte(); z = ia[2].toByte(); w = ia[3].toByte(); return this
    }

    fun to(ba: Array<Byte>): Vec4b {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ia: Array<Int>): Vec4b {
        x = ia[0].toByte(); y = ia[1].toByte(); z = ia[2].toByte(); w = ia[3].toByte(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Byte) = when (i) {0 -> x = s; 1 -> y = s; 2 -> z = s; else -> w = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s.toByte(); 1 -> y = s.toByte(); 2 -> z = s.toByte(); else -> w = s.toByte(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec4b {
        x = (-x).toByte(); y = (-y).toByte(); z = (-z).toByte(); w = (-w).toByte(); return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4b = glm.add(Vec4b(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4b) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4b = glm.sub(Vec4b(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4b) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Byte) = glm.add(Vec4b(), this, b, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec4b(), this, b, b, b, b)
    operator fun plus(b: Vec4b) = glm.add(Vec4b(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.add(Vec4b(), this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(Vec4b(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Byte) = glm.add(this, this, b, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.add(this, this, bX, bY, bZ, bW)
    fun addAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4b) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Byte, res: Vec4b) = glm.add(res, this, b, b, b, b)
    fun add(b: Int, res: Vec4b) = glm.add(res, this, b, b, b, b)
    fun add(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4b, res: Vec4b) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Byte) = glm.sub(Vec4b(), this, b, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec4b(), this, b, b, b, b)
    operator fun minus(b: Vec4b) = glm.sub(Vec4b(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.sub(Vec4b(), this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(Vec4b(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Byte) = glm.sub(this, this, b, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.sub(this, this, bX, bY, bZ, bW)
    fun subAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4b) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Byte, res: Vec4b) = glm.sub(res, this, b, b, b, b)
    fun sub(b: Int, res: Vec4b) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4b, res: Vec4b) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Byte) = glm.mul(Vec4b(), this, b, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec4b(), this, b, b, b, b)
    operator fun times(b: Vec4b) = glm.mul(Vec4b(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.mul(Vec4b(), this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(Vec4b(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Byte) = glm.mul(this, this, b, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.mul(this, this, bX, bY, bZ, bW)
    fun mulAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4b) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Byte, res: Vec4b) = glm.mul(res, this, b, b, b, b)
    fun mul(b: Int, res: Vec4b) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4b, res: Vec4b) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Byte) = glm.div(Vec4b(), this, b, b, b, b)
    operator fun div(b: Int) = glm.div(Vec4b(), this, b, b, b, b)
    operator fun div(b: Vec4b) = glm.div(Vec4b(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.div(Vec4b(), this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(Vec4b(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Byte) = glm.div(this, this, b, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.div(this, this, bX, bY, bZ, bW)
    fun divAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4b) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Byte, res: Vec4b) = glm.div(res, this, b, b, b, b)
    fun div(b: Int, res: Vec4b) = glm.div(res, this, b, b, b, b)
    fun div(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4b, res: Vec4b) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Byte) = glm.mod(Vec4b(), this, b, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec4b(), this, b, b, b, b)
    operator fun mod(b: Vec4b) = glm.mod(Vec4b(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.mod(Vec4b(), this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(Vec4b(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Byte) = glm.mod(this, this, b, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.mod(this, this, bX, bY, bZ, bW)
    fun modAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4b) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Byte, res: Vec4b) = glm.mod(res, this, b, b, b, b)
    fun mod(b: Int, res: Vec4b) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4b, res: Vec4b) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Byte) = glm.and(Vec4b(), this, b, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec4b(), this, b, b, b, b)
    fun and(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.and(Vec4b(), this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(Vec4b(), this, bX, bY, bZ, bW)
    fun and(b: Vec4b) = glm.and(Vec4b(), this, b.x, b.y, b.z, b.w)

    infix inline fun andAss(b: Byte) = glm.and(this, this, b, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.and(this, this, bX, bY, bZ, bW)
    fun andAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(this, this, bX, bY, bZ, bW)
    infix inline fun andAss(b: Vec4b) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Byte, res: Vec4b) = glm.and(res, this, b, b, b, b)
    fun and(b: Int, res: Vec4b) = glm.and(res, this, b, b, b, b)
    fun and(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4b, res: Vec4b) = glm.and(res, this, b.x, b.y, b.z, b.w)


    inline infix fun or(b: Byte) = glm.or(Vec4b(), this, b, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec4b(), this, b, b, b, b)
    fun or(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.or(Vec4b(), this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(Vec4b(), this, bX, bY, bZ, bW)
    fun or(b: Vec4b) = glm.or(Vec4b(), this, b.x, b.y, b.z, b.w)

    infix inline fun orAss(b: Byte) = glm.or(this, this, b, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.or(this, this, bX, bY, bZ, bW)
    fun orAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(this, this, bX, bY, bZ, bW)
    infix inline fun orAss(b: Vec4b) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Byte, res: Vec4b) = glm.or(res, this, b, b, b, b)
    fun or(b: Int, res: Vec4b) = glm.or(res, this, b, b, b, b)
    fun or(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4b, res: Vec4b) = glm.or(res, this, b.x, b.y, b.z, b.w)


    inline infix fun xor(b: Byte) = glm.xor(Vec4b(), this, b, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec4b(), this, b, b, b, b)
    fun xor(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.xor(Vec4b(), this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(Vec4b(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4b) = glm.xor(Vec4b(), this, b.x, b.y, b.z, b.w)

    infix inline fun xorAss(b: Byte) = glm.xor(this, this, b, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.xor(this, this, bX, bY, bZ, bW)
    fun xorAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(this, this, bX, bY, bZ, bW)
    infix inline fun xorAss(b: Vec4b) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Byte, res: Vec4b) = glm.xor(res, this, b, b, b, b)
    fun xor(b: Int, res: Vec4b) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4b, res: Vec4b) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shl(b: Byte) = glm.shl(Vec4b(), this, b, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec4b(), this, b, b, b, b)
    fun shl(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.shl(Vec4b(), this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4b(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4b) = glm.shl(Vec4b(), this, b.x, b.y, b.z, b.w)

    infix inline fun shlAss(b: Byte) = glm.shl(this, this, b, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.shl(this, this, bX, bY, bZ, bW)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)
    infix inline fun shlAss(b: Vec4b) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Byte, res: Vec4b) = glm.shl(res, this, b, b, b, b)
    fun shl(b: Int, res: Vec4b) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4b, res: Vec4b) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shr(b: Byte) = glm.shr(Vec4b(), this, b, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec4b(), this, b, b, b, b)
    fun shr(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.shr(Vec4b(), this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4b(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4b) = glm.shr(Vec4b(), this, b.x, b.y, b.z, b.w)

    infix inline fun shrAss(b: Byte) = glm.shr(this, this, b, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = glm.shr(this, this, bX, bY, bZ, bW)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)
    infix inline fun shrAss(b: Vec4b) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Byte, res: Vec4b) = glm.shr(res, this, b, b, b, b)
    fun shr(b: Int, res: Vec4b) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Byte, bY: Byte, bZ: Byte, bW: Byte, res: Vec4b) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4b) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4b, res: Vec4b) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4b(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4b) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Byte.plus(b: Vec4b) = glm.add(Vec4b(), b, this, this, this, this)
inline infix fun Byte.addAss(b: Vec4b) = glm.add(b, b, this, this, this, this)

operator fun Byte.minus(b: Vec4b) = glm.sub(Vec4b(), this, this, this, this, b)
inline infix fun Byte.subAss(b: Vec4b) = glm.sub(b, this, this, this, this, b)

operator fun Byte.times(b: Vec4b) = glm.mul(Vec4b(), b, this, this, this, this)
inline infix fun Byte.mulAss(b: Vec4b) = glm.mul(b, b, this, this, this, this)

operator fun Byte.div(b: Vec4b) = glm.div(Vec4b(), this, this, this, this, b)
inline infix fun Byte.divAss(b: Vec4b) = glm.div(b, this, this, this, this, b)

operator fun Byte.mod(b: Vec4b) = glm.mod(Vec4b(), this, this, this, this, b)
inline infix fun Byte.modAss(b: Vec4b) = glm.mod(b, this, this, this, this, b)


operator fun Int.plus(b: Vec4b) = glm.add(Vec4b(), b, this, this, this, this)
inline infix fun Int.addAss(b: Vec4b) = glm.add(b, b, this, this, this, this)

operator fun Int.minus(b: Vec4b) = glm.sub(Vec4b(), this, this, this, this, b)
inline infix fun Int.subAss(b: Vec4b) = glm.sub(b, this, this, this, this, b)

operator fun Int.times(b: Vec4b) = glm.mul(Vec4b(), b, this, this, this, this)
inline infix fun Int.mulAss(b: Vec4b) = glm.mul(b, b, this, this, this, this)

operator fun Int.div(b: Vec4b) = glm.div(Vec4b(), this, this, this, this, b)
inline infix fun Int.divAss(b: Vec4b) = glm.div(b, this, this, this, this, b)

operator fun Int.mod(b: Vec4b) = glm.mod(Vec4b(), this, this, this, this, b)
inline infix fun Int.modAss(b: Vec4b) = glm.mod(b, this, this, this, this, b)