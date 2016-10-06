package vec._2

import vec.Vec2t

/**
 * Created bY GBarbieri on 06.10.2016.
 */

data class Vec2b(override var x: Byte = 0, override var y: Byte = 0) : Vec2t<Byte>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toByte(), v.y.toByte())

    constructor(s: Byte) : this(s, s)

    constructor(ba: ByteArray) : this(ba[0], ba[1])

    constructor(ba: Array<Byte>) : this(ba[0], ba[1])


    fun set(v: Vec2t<Number>): Vec2b {
        x = v.x.toByte(); y = v.y.toByte(); return this
    }

    fun set(s: Byte): Vec2b {
        x = s; y = s; return this
    }

    fun set(s: Int): Vec2b {
        x = s.toByte(); y = s.toByte(); return this
    }

    fun set(x: Byte, y: Byte): Vec2b {
        this.x = x; this.y = y; return this
    }

    fun set(x: Int, y: Int): Vec2b {
        this.x = x.toByte(); this.y = y.toByte(); return this
    }

    fun set(ba: ByteArray): Vec2b {
        x = ba[0]; y = ba[1]; return this
    }

    fun set(ia: IntArray): Vec2b {
        x = ia[0].toByte(); y = ia[1].toByte(); return this
    }

    fun set(ba: Array<Byte>): Vec2b {
        x = ba[0]; y = ba[1]; return this
    }

    fun set(ia: Array<Int>): Vec2b {
        x = ia[0].toByte(); y = ia[1].toByte(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int): Byte = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Byte) = when (i) {0 -> x = s; else -> y = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2b {
        x = (-x).toByte(); y = (-y).toByte(); return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2b = glm.add(Vec2b(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2b) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2b = glm.sub(Vec2b(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2b) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Byte) = glm.add(Vec2b(), this, b, b)
    operator fun plus(b: Int) = glm.add(Vec2b(), this, b, b)
    operator fun plus(b: Vec2b) = glm.add(Vec2b(), this, b.x, b.y)

    fun add(bX: Byte, bY: Byte) = glm.add(Vec2b(), this, bX, bY)
    fun add(bX: Int, bY: Int) = glm.add(Vec2b(), this, bX, bY)

    infix inline fun addAss(b: Byte) = glm.add(this, this, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b)
    fun addAss(bX: Byte, bY: Byte) = glm.add(this, this, bX, bY)
    fun addAss(bX: Int, bY: Int) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2b) = glm.add(this, this, b.x, b.y)

    fun add(b: Byte, res: Vec2b) = glm.add(res, this, b, b)
    fun add(b: Int, res: Vec2b) = glm.add(res, this, b, b)
    fun add(bX: Byte, bY: Byte, res: Vec2b) = glm.add(res, this, bX, bY)
    fun add(bX: Int, bY: Int, res: Vec2b) = glm.add(res, this, bX, bY)
    fun add(b: Vec2b, res: Vec2b) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Byte) = glm.sub(Vec2b(), this, b, b)
    operator fun minus(b: Int) = glm.sub(Vec2b(), this, b, b)
    operator fun minus(b: Vec2b) = glm.sub(Vec2b(), this, b.x, b.y)

    fun sub(bX: Byte, bY: Byte) = glm.sub(Vec2b(), this, bX, bY)
    fun sub(bX: Int, bY: Int) = glm.sub(Vec2b(), this, bX, bY)

    infix inline fun subAss(b: Byte) = glm.sub(this, this, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b)
    fun subAss(bX: Byte, bY: Byte) = glm.sub(this, this, bX, bY)
    fun subAss(bX: Int, bY: Int) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2b) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Byte, res: Vec2b) = glm.sub(res, this, b, b)
    fun sub(b: Int, res: Vec2b) = glm.sub(res, this, b, b)
    fun sub(bX: Byte, bY: Byte, res: Vec2b) = glm.sub(res, this, bX, bY)
    fun sub(bX: Int, bY: Int, res: Vec2b) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2b, res: Vec2b) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Byte) = glm.mul(Vec2b(), this, b, b)
    operator fun times(b: Int) = glm.mul(Vec2b(), this, b, b)
    operator fun times(b: Vec2b) = glm.mul(Vec2b(), this, b.x, b.y)

    fun mul(bX: Byte, bY: Byte) = glm.mul(Vec2b(), this, bX, bY)
    fun mul(bX: Int, bY: Int) = glm.mul(Vec2b(), this, bX, bY)

    infix inline fun mulAss(b: Byte) = glm.mul(this, this, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b)
    fun mulAss(bX: Byte, bY: Byte) = glm.mul(this, this, bX, bY)
    fun mulAss(bX: Int, bY: Int) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2b) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Byte, res: Vec2b) = glm.mul(res, this, b, b)
    fun mul(b: Int, res: Vec2b) = glm.mul(res, this, b, b)
    fun mul(bX: Byte, bY: Byte, res: Vec2b) = glm.mul(res, this, bX, bY)
    fun mul(bX: Int, bY: Int, res: Vec2b) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2b, res: Vec2b) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Byte) = glm.div(Vec2b(), this, b, b)
    operator fun div(b: Int) = glm.div(Vec2b(), this, b, b)
    operator fun div(b: Vec2b) = glm.div(Vec2b(), this, b.x, b.y)

    fun div(bX: Byte, bY: Byte) = glm.div(Vec2b(), this, bX, bY)
    fun div(bX: Int, bY: Int) = glm.div(Vec2b(), this, bX, bY)

    infix inline fun divAss(b: Byte) = glm.div(this, this, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b)
    fun divAss(bX: Byte, bY: Byte) = glm.div(this, this, bX, bY)
    fun divAss(bX: Int, bY: Int) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2b) = glm.div(this, this, b.x, b.y)

    fun div(b: Byte, res: Vec2b) = glm.div(res, this, b, b)
    fun div(b: Int, res: Vec2b) = glm.div(res, this, b, b)
    fun div(bX: Byte, bY: Byte, res: Vec2b) = glm.div(res, this, bX, bY)
    fun div(bX: Int, bY: Int, res: Vec2b) = glm.div(res, this, bX, bY)
    fun div(b: Vec2b, res: Vec2b) = glm.div(res, this, b.x, b.y)

    operator fun mod(s: Byte) = glm.mod(Vec2b(), this, s, s)
    operator fun mod(s: Int) = glm.mod(Vec2b(), this, s, s)
    operator fun mod(b: Vec2b) = glm.mod(Vec2b(), this, b.x, b.y)

    fun mod(bX: Byte, bY: Byte) = glm.mod(Vec2b(), this, bX, bY)
    fun mod(bX: Int, bY: Int) = glm.mod(Vec2b(), this, bX, bY)

    infix inline fun modAss(b: Byte) = glm.mod(this, this, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b)
    fun modAss(bX: Byte, bY: Byte) = glm.mod(this, this, bX, bY)
    fun modAss(bX: Int, bY: Int) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2b) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Byte, res: Vec2b) = glm.mod(res, this, b, b)
    fun mod(b: Int, res: Vec2b) = glm.mod(res, this, b, b)
    fun mod(bX: Byte, bY: Byte, res: Vec2b) = glm.mod(res, this, bX, bY)
    fun mod(bX: Int, bY: Int, res: Vec2b) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2b, res: Vec2b) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Byte) = glm.and(Vec2b(), this, b, b)
    inline infix fun and(b: Int) = glm.and(Vec2b(), this, b, b)
    fun and(bX: Byte, bY: Byte) = glm.and(Vec2b(), this, bX, bY)
    fun and(bX: Int, bY: Int) = glm.and(Vec2b(), this, bX, bY)
    fun and(b: Vec2b) = glm.and(Vec2b(), this, b.x, b.y)

    infix inline fun andAss(b: Byte) = glm.and(this, this, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b)
    fun andAss(bX: Byte, bY: Byte) = glm.and(this, this, bX, bY)
    fun andAss(bX: Int, bY: Int) = glm.and(this, this, bX, bY)
    infix inline fun andAss(b: Vec2b) = glm.and(this, this, b.x, b.y)

    fun and(b: Byte, res: Vec2b) = glm.and(res, this, b, b)
    fun and(b: Int, res: Vec2b) = glm.and(res, this, b, b)
    fun and(bX: Byte, bY: Byte, res: Vec2b) = glm.and(res, this, bX, bY)
    fun and(bX: Int, bY: Int, res: Vec2b) = glm.and(res, this, bX, bY)
    fun and(b: Vec2b, res: Vec2b) = glm.and(res, this, b.x, b.y)


    inline infix fun or(b: Byte) = glm.or(Vec2b(), this, b, b)
    inline infix fun or(b: Int) = glm.or(Vec2b(), this, b, b)
    fun or(bX: Byte, bY: Byte) = glm.or(Vec2b(), this, bX, bY)
    fun or(bX: Int, bY: Int) = glm.or(Vec2b(), this, bX, bY)
    fun or(b: Vec2b) = glm.or(Vec2b(), this, b.x, b.y)

    infix inline fun orAss(b: Byte) = glm.or(this, this, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b)
    fun orAss(bX: Byte, bY: Byte) = glm.or(this, this, bX, bY)
    fun orAss(bX: Int, bY: Int) = glm.or(this, this, bX, bY)
    infix inline fun orAss(b: Vec2b) = glm.or(this, this, b.x, b.y)

    fun or(b: Byte, res: Vec2b) = glm.or(res, this, b, b)
    fun or(b: Int, res: Vec2b) = glm.or(res, this, b, b)
    fun or(bX: Byte, bY: Byte, res: Vec2b) = glm.or(res, this, bX, bY)
    fun or(bX: Int, bY: Int, res: Vec2b) = glm.or(res, this, bX, bY)
    fun or(b: Vec2b, res: Vec2b) = glm.or(res, this, b.x, b.y)


    inline infix fun xor(b: Byte) = glm.xor(Vec2b(), this, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec2b(), this, b, b)
    fun xor(bX: Byte, bY: Byte) = glm.xor(Vec2b(), this, bX, bY)
    fun xor(bX: Int, bY: Int) = glm.xor(Vec2b(), this, bX, bY)
    fun xor(b: Vec2b) = glm.xor(Vec2b(), this, b.x, b.y)

    infix inline fun xorAss(b: Byte) = glm.xor(this, this, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b)
    fun xorAss(bX: Byte, bY: Byte) = glm.xor(this, this, bX, bY)
    fun xorAss(bX: Int, bY: Int) = glm.xor(this, this, bX, bY)
    infix inline fun xorAss(b: Vec2b) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Byte, res: Vec2b) = glm.xor(res, this, b, b)
    fun xor(b: Int, res: Vec2b) = glm.xor(res, this, b, b)
    fun xor(bX: Byte, bY: Byte, res: Vec2b) = glm.xor(res, this, bX, bY)
    fun xor(bX: Int, bY: Int, res: Vec2b) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2b, res: Vec2b) = glm.xor(res, this, b.x, b.y)


    inline infix fun shl(b: Byte) = glm.shl(Vec2b(), this, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec2b(), this, b, b)
    fun shl(bX: Byte, bY: Byte) = glm.shl(Vec2b(), this, bX, bY)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2b(), this, bX, bY)
    fun shl(b: Vec2b) = glm.shl(Vec2b(), this, b.x, b.y)

    infix inline fun shlAss(b: Byte) = glm.shl(this, this, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Byte, bY: Byte) = glm.shl(this, this, bX, bY)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)
    infix inline fun shlAss(b: Vec2b) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Byte, res: Vec2b) = glm.shl(res, this, b, b)
    fun shl(b: Int, res: Vec2b) = glm.shl(res, this, b, b)
    fun shl(bX: Byte, bY: Byte, res: Vec2b) = glm.shl(res, this, bX, bY)
    fun shl(bX: Int, bY: Int, res: Vec2b) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2b, res: Vec2b) = glm.shl(res, this, b.x, b.y)


    inline infix fun shr(b: Byte) = glm.shr(Vec2b(), this, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec2b(), this, b, b)
    fun shr(bX: Byte, bY: Byte) = glm.shr(Vec2b(), this, bX, bY)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2b(), this, bX, bY)
    fun shr(b: Vec2b) = glm.shr(Vec2b(), this, b.x, b.y)

    infix inline fun shrAss(b: Byte) = glm.shr(this, this, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Byte, bY: Byte) = glm.shr(this, this, bX, bY)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)
    infix inline fun shrAss(b: Vec2b) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Byte, res: Vec2b) = glm.shr(res, this, b, b)
    fun shr(b: Int, res: Vec2b) = glm.shr(res, this, b, b)
    fun shr(bX: Byte, bY: Byte, res: Vec2b) = glm.shr(res, this, bX, bY)
    fun shr(bX: Int, bY: Int, res: Vec2b) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2b, res: Vec2b) = glm.shr(res, this, b.x, b.y)


    inline infix fun inv(b: Byte) = glm.inv(Vec2b(), this, b, b)
    inline infix fun inv(b: Int) = glm.inv(Vec2b(), this, b, b)
    fun inv(bX: Byte, bY: Byte) = glm.inv(Vec2b(), this, bX, bY)
    fun inv(bX: Int, bY: Int) = glm.inv(Vec2b(), this, bX, bY)
    fun inv(b: Vec2b) = glm.inv(Vec2b(), this, b.x, b.y)

    infix inline fun invAss(b: Byte) = glm.inv(this, this, b, b)
    infix inline fun invAss(b: Int) = glm.inv(this, this, b, b)
    fun invAss(bX: Byte, bY: Byte) = glm.inv(this, this, bX, bY)
    fun invAss(bX: Int, bY: Int) = glm.inv(this, this, bX, bY)
    infix inline fun invAss(b: Vec2b) = glm.inv(this, this, b.x, b.y)

    fun inv(b: Byte, res: Vec2b) = glm.inv(res, this, b, b)
    fun inv(b: Int, res: Vec2b) = glm.inv(res, this, b, b)
    fun inv(bX: Byte, bY: Byte, res: Vec2b) = glm.inv(res, this, bX, bY)
    fun inv(bX: Int, bY: Int, res: Vec2b) = glm.inv(res, this, bX, bY)
    fun inv(b: Vec2b, res: Vec2b) = glm.inv(res, this, b.x, b.y)
}


// -- Binary arithmetic vecOperators --

operator fun Byte.plus(b: Vec2b) = glm.add(Vec2b(), b, this, this)
inline infix fun Byte.addAss(b: Vec2b) = glm.add(b, b, this, this)

operator fun Byte.minus(b: Vec2b) = glm.sub(Vec2b(), this, this, b)
inline infix fun Byte.subAss(b: Vec2b) = glm.sub(b, this, this, b)

operator fun Byte.times(b: Vec2b) = glm.mul(Vec2b(), b, this, this)
inline infix fun Byte.mulAss(b: Vec2b) = glm.mul(b, b, this, this)

operator fun Byte.div(b: Vec2b) = glm.div(Vec2b(), this, this, b)
inline infix fun Byte.divAss(b: Vec2b) = glm.div(b, this, this, b)

operator fun Byte.mod(b: Vec2b) = glm.mod(Vec2b(), this, this, b)
inline infix fun Byte.modAss(b: Vec2b) = glm.mod(b, this, this, b)


operator fun Int.plus(b: Vec2b) = glm.add(Vec2b(), b, this, this)
inline infix fun Int.addAss(b: Vec2b) = glm.add(b, b, this, this)

operator fun Int.minus(b: Vec2b) = glm.sub(Vec2b(), this, this, b)
inline infix fun Int.subAss(b: Vec2b) = glm.sub(b, this, this, b)

operator fun Int.times(b: Vec2b) = glm.mul(Vec2b(), b, this, this)
inline infix fun Int.mulAss(b: Vec2b) = glm.mul(b, b, this, this)

operator fun Int.div(b: Vec2b) = glm.div(Vec2b(), this, this, b)
inline infix fun Int.divAss(b: Vec2b) = glm.div(b, this, this, b)

operator fun Int.mod(b: Vec2b) = glm.mod(Vec2b(), this, this, b)
inline infix fun Int.modAss(b: Vec2b) = glm.mod(b, this, this, b)