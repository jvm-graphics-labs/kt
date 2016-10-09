package vec._2

import vec.Vec2t

/**
 * Created bY GBarbieri on 06.10.2016.
 */

data class Vec2l(override var x: Long = 0, override var y: Long = 0) : Vec2t<Long>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toLong(), v.y.toLong())

    constructor(s: Long) : this(s, s)

    constructor(la: LongArray) : this(la[0], la[1])

    constructor(la: Array<Long>) : this(la[0], la[1])


    fun to(v: Vec2t<Number>): Vec2l {
        x = v.x.toLong(); y = v.y.toLong(); return this
    }

    fun to(s: Long): Vec2l {
        x = s; y = s; return this
    }

    fun to(x: Long, y: Long): Vec2l {
        this.x = x; this.y = y; return this
    }

    fun to(ba: LongArray): Vec2l {
        x = ba[0]; y = ba[1]; return this
    }

    fun to(ba: Array<Long>): Vec2l {
        x = ba[0]; y = ba[1]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Long) = when (i) {0 -> x = s; else -> y = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2l {
        x = -x; y = -y; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2l = glm.add(Vec2l(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2l) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2l = glm.sub(Vec2l(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2l) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Long) = glm.add(Vec2l(), this, b, b)
    operator fun plus(b: Vec2l) = glm.add(Vec2l(), this, b.x, b.y)

    fun add(bX: Long, bY: Long) = glm.add(Vec2l(), this, bX, bY)

    infix inline fun addAss(b: Long) = glm.add(this, this, b, b)
    fun addAss(bX: Long, bY: Long) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2l) = glm.add(this, this, b.x, b.y)

    fun add(b: Long, res: Vec2l) = glm.add(res, this, b, b)
    fun add(bX: Long, bY: Long, res: Vec2l) = glm.add(res, this, bX, bY)
    fun add(b: Vec2l, res: Vec2l) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Long) = glm.sub(Vec2l(), this, b, b)
    operator fun minus(b: Vec2l) = glm.sub(Vec2l(), this, b.x, b.y)

    fun sub(bX: Long, bY: Long) = glm.sub(Vec2l(), this, bX, bY)

    infix inline fun subAss(b: Long) = glm.sub(this, this, b, b)
    fun subAss(bX: Long, bY: Long) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2l) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Long, res: Vec2l) = glm.sub(res, this, b, b)
    fun sub(bX: Long, bY: Long, res: Vec2l) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2l, res: Vec2l) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Long) = glm.mul(Vec2l(), this, b, b)
    operator fun times(b: Vec2l) = glm.mul(Vec2l(), this, b.x, b.y)

    fun mul(bX: Long, bY: Long) = glm.mul(Vec2l(), this, bX, bY)

    infix inline fun mulAss(b: Long) = glm.mul(this, this, b, b)
    fun mulAss(bX: Long, bY: Long) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2l) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Long, res: Vec2l) = glm.mul(res, this, b, b)
    fun mul(bX: Long, bY: Long, res: Vec2l) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2l, res: Vec2l) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Long) = glm.div(Vec2l(), this, b, b)
    operator fun div(b: Vec2l) = glm.div(Vec2l(), this, b.x, b.y)

    fun div(bX: Long, bY: Long) = glm.div(Vec2l(), this, bX, bY)

    infix inline fun divAss(b: Long) = glm.div(this, this, b, b)
    fun divAss(bX: Long, bY: Long) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2l) = glm.div(this, this, b.x, b.y)

    fun div(b: Long, res: Vec2l) = glm.div(res, this, b, b)
    fun div(bX: Long, bY: Long, res: Vec2l) = glm.div(res, this, bX, bY)
    fun div(b: Vec2l, res: Vec2l) = glm.div(res, this, b.x, b.y)

    operator fun mod(b: Long) = glm.mod(Vec2l(), this, b, b)
    operator fun mod(b: Vec2l) = glm.mod(Vec2l(), this, b.x, b.y)

    fun mod(bX: Long, bY: Long) = glm.mod(Vec2l(), this, bX, bY)

    infix inline fun modAss(b: Long) = glm.mod(this, this, b, b)
    fun modAss(bX: Long, bY: Long) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2l) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Long, res: Vec2l) = glm.mod(res, this, b, b)
    fun mod(bX: Long, bY: Long, res: Vec2l) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2l, res: Vec2l) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Long) = glm.and(Vec2l(), this, b, b)
    fun and(bX: Long, bY: Long) = glm.and(Vec2l(), this, bX, bY)
    fun and(b: Vec2l) = glm.and(Vec2l(), this, b.x, b.y)

    infix inline fun andAss(b: Long) = glm.and(this, this, b, b)
    fun andAss(bX: Long, bY: Long) = glm.and(this, this, bX, bY)
    infix inline fun andAss(b: Vec2l) = glm.and(this, this, b.x, b.y)

    fun and(b: Long, res: Vec2l) = glm.and(res, this, b, b)
    fun and(bX: Long, bY: Long, res: Vec2l) = glm.and(res, this, bX, bY)
    fun and(b: Vec2l, res: Vec2l) = glm.and(res, this, b.x, b.y)


    inline infix fun or(b: Long) = glm.or(Vec2l(), this, b, b)
    fun or(bX: Long, bY: Long) = glm.or(Vec2l(), this, bX, bY)
    fun or(b: Vec2l) = glm.or(Vec2l(), this, b.x, b.y)

    infix inline fun orAss(b: Long) = glm.or(this, this, b, b)
    fun orAss(bX: Long, bY: Long) = glm.or(this, this, bX, bY)
    infix inline fun orAss(b: Vec2l) = glm.or(this, this, b.x, b.y)

    fun or(b: Long, res: Vec2l) = glm.or(res, this, b, b)
    fun or(bX: Long, bY: Long, res: Vec2l) = glm.or(res, this, bX, bY)
    fun or(b: Vec2l, res: Vec2l) = glm.or(res, this, b.x, b.y)


    inline infix fun xor(b: Long) = glm.xor(Vec2l(), this, b, b)
    fun xor(bX: Long, bY: Long) = glm.xor(Vec2l(), this, bX, bY)
    fun xor(b: Vec2l) = glm.xor(Vec2l(), this, b.x, b.y)

    infix inline fun xorAss(b: Long) = glm.xor(this, this, b, b)
    fun xorAss(bX: Long, bY: Long) = glm.xor(this, this, bX, bY)
    infix inline fun xorAss(b: Vec2l) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Long, res: Vec2l) = glm.xor(res, this, b, b)
    fun xor(bX: Long, bY: Long, res: Vec2l) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2l, res: Vec2l) = glm.xor(res, this, b.x, b.y)


    inline infix fun shl(b: Long) = glm.shl(Vec2l(), this, b, b)
    fun shl(bX: Long, bY: Long) = glm.shl(Vec2l(), this, bX, bY)
    fun shl(b: Vec2l) = glm.shl(Vec2l(), this, b.x, b.y)

    infix inline fun shlAss(b: Long) = glm.shl(this, this, b, b)
    fun shlAss(bX: Long, bY: Long) = glm.shl(this, this, bX, bY)
    infix inline fun shlAss(b: Vec2l) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Long, res: Vec2l) = glm.shl(res, this, b, b)
    fun shl(bX: Long, bY: Long, res: Vec2l) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2l, res: Vec2l) = glm.shl(res, this, b.x, b.y)


    inline infix fun shr(b: Long) = glm.shr(Vec2l(), this, b, b)
    fun shr(bX: Long, bY: Long) = glm.shr(Vec2l(), this, bX, bY)
    fun shr(b: Vec2l) = glm.shr(Vec2l(), this, b.x, b.y)

    infix inline fun shrAss(b: Long) = glm.shr(this, this, b, b)
    fun shrAss(bX: Long, bY: Long) = glm.shr(this, this, bX, bY)
    infix inline fun shrAss(b: Vec2l) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Long, res: Vec2l) = glm.shr(res, this, b, b)
    fun shr(bX: Long, bY: Long, res: Vec2l) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2l, res: Vec2l) = glm.shr(res, this, b.x, b.y)


    fun inv() = glm.inv(Vec2l(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2l) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Long.plus(b: Vec2l) = glm.add(Vec2l(), b, this, this)
inline infix fun Long.addAss(b: Vec2l) = glm.add(b, b, this, this)

operator fun Long.minus(b: Vec2l) = glm.sub(Vec2l(), this, this, b)
inline infix fun Long.subAss(b: Vec2l) = glm.sub(b, this, this, b)

operator fun Long.times(b: Vec2l) = glm.mul(Vec2l(), b, this, this)
inline infix fun Long.mulAss(b: Vec2l) = glm.mul(b, b, this, this)

operator fun Long.div(b: Vec2l) = glm.div(Vec2l(), this, this, b)
inline infix fun Long.divAss(b: Vec2l) = glm.div(b, this, this, b)

operator fun Long.mod(b: Vec2l) = glm.mod(Vec2l(), this, this, b)
inline infix fun Long.modAss(b: Vec2l) = glm.mod(b, this, this, b)