package vec._2

import vec.Vec2t

/**
 * Created by GBarbieri on 06.10.2016.
 */

data class Vec2s(override var x: Short = 0, override var y: Short = 0) : Vec2t<Short>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toShort(), v.y.toShort())

    constructor(s: Short) : this(s, s)

    constructor(sa: ShortArray) : this(sa[0], sa[1])

    constructor(sa: Array<Short>) : this(sa[0], sa[1])


    fun to(v: Vec2t<Number>): Vec2s {
        x = v.x.toShort(); y = v.y.toShort(); return this
    }

    fun to(s: Short): Vec2s {
        x = s; y = s; return this
    }

    fun to(s: Int): Vec2s {
        x = s.toShort(); y = s.toShort(); return this
    }

    fun to(x: Short, y: Short): Vec2s {
        this.x = x; this.y = y; return this
    }

    fun to(x: Int, y: Int): Vec2s {
        this.x = x.toShort(); this.y = y.toShort(); return this
    }

    fun to(ba: ShortArray): Vec2s {
        x = ba[0]; y = ba[1]; return this
    }

    fun to(ia: IntArray): Vec2s {
        x = ia[0].toShort(); y = ia[1].toShort(); return this
    }

    fun to(ba: Array<Short>): Vec2s {
        x = ba[0]; y = ba[1]; return this
    }

    fun to(ia: Array<Int>): Vec2s {
        x = ia[0].toShort(); y = ia[1].toShort(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int): Short = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Short) = when (i) {0 -> x = s; else -> y = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2s {
        x = (-x).toShort(); y = (-y).toShort(); return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2s = glm.add(Vec2s(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2s) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2s = glm.sub(Vec2s(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2s) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Short) = glm.add(Vec2s(), this, b, b)
    operator fun plus(b: Int) = glm.add(Vec2s(), this, b, b)
    operator fun plus(b: Vec2s) = glm.add(Vec2s(), this, b.x, b.y)

    fun add(bX: Short, bY: Short) = glm.add(Vec2s(), this, bX, bY)
    fun add(bX: Int, bY: Int) = glm.add(Vec2s(), this, bX, bY)

    infix inline fun addAss(b: Short) = glm.add(this, this, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b)
    fun addAss(bX: Short, bY: Short) = glm.add(this, this, bX, bY)
    fun addAss(bX: Int, bY: Int) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2s) = glm.add(this, this, b.x, b.y)

    fun add(b: Short, res: Vec2s) = glm.add(res, this, b, b)
    fun add(b: Int, res: Vec2s) = glm.add(res, this, b, b)
    fun add(bX: Short, bY: Short, res: Vec2s) = glm.add(res, this, bX, bY)
    fun add(bX: Int, bY: Int, res: Vec2s) = glm.add(res, this, bX, bY)
    fun add(b: Vec2s, res: Vec2s) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Short) = glm.sub(Vec2s(), this, b, b)
    operator fun minus(b: Int) = glm.sub(Vec2s(), this, b, b)
    operator fun minus(b: Vec2s) = glm.sub(Vec2s(), this, b.x, b.y)

    fun sub(bX: Short, bY: Short) = glm.sub(Vec2s(), this, bX, bY)
    fun sub(bX: Int, bY: Int) = glm.sub(Vec2s(), this, bX, bY)

    infix inline fun subAss(b: Short) = glm.sub(this, this, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b)
    fun subAss(bX: Short, bY: Short) = glm.sub(this, this, bX, bY)
    fun subAss(bX: Int, bY: Int) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2s) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Short, res: Vec2s) = glm.sub(res, this, b, b)
    fun sub(b: Int, res: Vec2s) = glm.sub(res, this, b, b)
    fun sub(bX: Short, bY: Short, res: Vec2s) = glm.sub(res, this, bX, bY)
    fun sub(bX: Int, bY: Int, res: Vec2s) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2s, res: Vec2s) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Short) = glm.mul(Vec2s(), this, b, b)
    operator fun times(b: Int) = glm.mul(Vec2s(), this, b, b)
    operator fun times(b: Vec2s) = glm.mul(Vec2s(), this, b.x, b.y)

    fun mul(bX: Short, bY: Short) = glm.mul(Vec2s(), this, bX, bY)
    fun mul(bX: Int, bY: Int) = glm.mul(Vec2s(), this, bX, bY)

    infix inline fun mulAss(b: Short) = glm.mul(this, this, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b)
    fun mulAss(bX: Short, bY: Short) = glm.mul(this, this, bX, bY)
    fun mulAss(bX: Int, bY: Int) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2s) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Short, res: Vec2s) = glm.mul(res, this, b, b)
    fun mul(b: Int, res: Vec2s) = glm.mul(res, this, b, b)
    fun mul(bX: Short, bY: Short, res: Vec2s) = glm.mul(res, this, bX, bY)
    fun mul(bX: Int, bY: Int, res: Vec2s) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2s, res: Vec2s) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Short) = glm.div(Vec2s(), this, b, b)
    operator fun div(b: Int) = glm.div(Vec2s(), this, b, b)
    operator fun div(b: Vec2s) = glm.div(Vec2s(), this, b.x, b.y)

    fun div(bX: Short, bY: Short) = glm.div(Vec2s(), this, bX, bY)
    fun div(bX: Int, bY: Int) = glm.div(Vec2s(), this, bX, bY)

    infix inline fun divAss(b: Short) = glm.div(this, this, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b)
    fun divAss(bX: Short, bY: Short) = glm.div(this, this, bX, bY)
    fun divAss(bX: Int, bY: Int) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2s) = glm.div(this, this, b.x, b.y)

    fun div(b: Short, res: Vec2s) = glm.div(res, this, b, b)
    fun div(b: Int, res: Vec2s) = glm.div(res, this, b, b)
    fun div(bX: Short, bY: Short, res: Vec2s) = glm.div(res, this, bX, bY)
    fun div(bX: Int, bY: Int, res: Vec2s) = glm.div(res, this, bX, bY)
    fun div(b: Vec2s, res: Vec2s) = glm.div(res, this, b.x, b.y)

    operator fun mod(s: Short) = glm.mod(Vec2s(), this, s, s)
    operator fun mod(s: Int) = glm.mod(Vec2s(), this, s, s)
    operator fun mod(b: Vec2s) = glm.mod(Vec2s(), this, b.x, b.y)

    fun mod(bX: Short, bY: Short) = glm.mod(Vec2s(), this, bX, bY)
    fun mod(bX: Int, bY: Int) = glm.mod(Vec2s(), this, bX, bY)

    infix inline fun modAss(b: Short) = glm.mod(this, this, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b)
    fun modAss(bX: Short, bY: Short) = glm.mod(this, this, bX, bY)
    fun modAss(bX: Int, bY: Int) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2s) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Short, res: Vec2s) = glm.mod(res, this, b, b)
    fun mod(b: Int, res: Vec2s) = glm.mod(res, this, b, b)
    fun mod(bX: Short, bY: Short, res: Vec2s) = glm.mod(res, this, bX, bY)
    fun mod(bX: Int, bY: Int, res: Vec2s) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2s, res: Vec2s) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Short) = glm.and(Vec2s(), this, b, b)
    inline infix fun and(b: Int) = glm.and(Vec2s(), this, b, b)
    fun and(bX: Short, bY: Short) = glm.and(Vec2s(), this, bX, bY)
    fun and(bX: Int, bY: Int) = glm.and(Vec2s(), this, bX, bY)
    fun and(b: Vec2s) = glm.and(Vec2s(), this, b.x, b.y)

    infix inline fun andAss(b: Short) = glm.and(this, this, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b)
    fun andAss(bX: Short, bY: Short) = glm.and(this, this, bX, bY)
    fun andAss(bX: Int, bY: Int) = glm.and(this, this, bX, bY)
    infix inline fun andAss(b: Vec2s) = glm.and(this, this, b.x, b.y)

    fun and(b: Short, res: Vec2s) = glm.and(res, this, b, b)
    fun and(b: Int, res: Vec2s) = glm.and(res, this, b, b)
    fun and(bX: Short, bY: Short, res: Vec2s) = glm.and(res, this, bX, bY)
    fun and(bX: Int, bY: Int, res: Vec2s) = glm.and(res, this, bX, bY)
    fun and(b: Vec2s, res: Vec2s) = glm.and(res, this, b.x, b.y)


    inline infix fun or(b: Short) = glm.or(Vec2s(), this, b, b)
    inline infix fun or(b: Int) = glm.or(Vec2s(), this, b, b)
    fun or(bX: Short, bY: Short) = glm.or(Vec2s(), this, bX, bY)
    fun or(bX: Int, bY: Int) = glm.or(Vec2s(), this, bX, bY)
    fun or(b: Vec2s) = glm.or(Vec2s(), this, b.x, b.y)

    infix inline fun orAss(b: Short) = glm.or(this, this, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b)
    fun orAss(bX: Short, bY: Short) = glm.or(this, this, bX, bY)
    fun orAss(bX: Int, bY: Int) = glm.or(this, this, bX, bY)
    infix inline fun orAss(b: Vec2s) = glm.or(this, this, b.x, b.y)

    fun or(b: Short, res: Vec2s) = glm.or(res, this, b, b)
    fun or(b: Int, res: Vec2s) = glm.or(res, this, b, b)
    fun or(bX: Short, bY: Short, res: Vec2s) = glm.or(res, this, bX, bY)
    fun or(bX: Int, bY: Int, res: Vec2s) = glm.or(res, this, bX, bY)
    fun or(b: Vec2s, res: Vec2s) = glm.or(res, this, b.x, b.y)


    inline infix fun xor(b: Short) = glm.xor(Vec2s(), this, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec2s(), this, b, b)
    fun xor(bX: Short, bY: Short) = glm.xor(Vec2s(), this, bX, bY)
    fun xor(bX: Int, bY: Int) = glm.xor(Vec2s(), this, bX, bY)
    fun xor(b: Vec2s) = glm.xor(Vec2s(), this, b.x, b.y)

    infix inline fun xorAss(b: Short) = glm.xor(this, this, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b)
    fun xorAss(bX: Short, bY: Short) = glm.xor(this, this, bX, bY)
    fun xorAss(bX: Int, bY: Int) = glm.xor(this, this, bX, bY)
    infix inline fun xorAss(b: Vec2s) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Short, res: Vec2s) = glm.xor(res, this, b, b)
    fun xor(b: Int, res: Vec2s) = glm.xor(res, this, b, b)
    fun xor(bX: Short, bY: Short, res: Vec2s) = glm.xor(res, this, bX, bY)
    fun xor(bX: Int, bY: Int, res: Vec2s) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2s, res: Vec2s) = glm.xor(res, this, b.x, b.y)


    inline infix fun shl(b: Short) = glm.shl(Vec2s(), this, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec2s(), this, b, b)
    fun shl(bX: Short, bY: Short) = glm.shl(Vec2s(), this, bX, bY)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2s(), this, bX, bY)
    fun shl(b: Vec2s) = glm.shl(Vec2s(), this, b.x, b.y)

    infix inline fun shlAss(b: Short) = glm.shl(this, this, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Short, bY: Short) = glm.shl(this, this, bX, bY)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)
    infix inline fun shlAss(b: Vec2s) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Short, res: Vec2s) = glm.shl(res, this, b, b)
    fun shl(b: Int, res: Vec2s) = glm.shl(res, this, b, b)
    fun shl(bX: Short, bY: Short, res: Vec2s) = glm.shl(res, this, bX, bY)
    fun shl(bX: Int, bY: Int, res: Vec2s) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2s, res: Vec2s) = glm.shl(res, this, b.x, b.y)


    inline infix fun shr(b: Short) = glm.shr(Vec2s(), this, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec2s(), this, b, b)
    fun shr(bX: Short, bY: Short) = glm.shr(Vec2s(), this, bX, bY)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2s(), this, bX, bY)
    fun shr(b: Vec2s) = glm.shr(Vec2s(), this, b.x, b.y)

    infix inline fun shrAss(b: Short) = glm.shr(this, this, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Short, bY: Short) = glm.shr(this, this, bX, bY)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)
    infix inline fun shrAss(b: Vec2s) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Short, res: Vec2s) = glm.shr(res, this, b, b)
    fun shr(b: Int, res: Vec2s) = glm.shr(res, this, b, b)
    fun shr(bX: Short, bY: Short, res: Vec2s) = glm.shr(res, this, bX, bY)
    fun shr(bX: Int, bY: Int, res: Vec2s) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2s, res: Vec2s) = glm.shr(res, this, b.x, b.y)


    fun inv() = glm.inv(Vec2s(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2s) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Short.plus(b: Vec2s) = glm.add(Vec2s(), b, this, this)
inline infix fun Short.addAss(b: Vec2s) = glm.add(b, b, this, this)

operator fun Short.minus(b: Vec2s) = glm.sub(Vec2s(), this, this, b)
inline infix fun Short.subAss(b: Vec2s) = glm.sub(b, this, this, b)

operator fun Short.times(b: Vec2s) = glm.mul(Vec2s(), b, this, this)
inline infix fun Short.mulAss(b: Vec2s) = glm.mul(b, b, this, this)

operator fun Short.div(b: Vec2s) = glm.div(Vec2s(), this, this, b)
inline infix fun Short.divAss(b: Vec2s) = glm.div(b, this, this, b)

operator fun Short.mod(b: Vec2s) = glm.mod(Vec2s(), this, this, b)
inline infix fun Short.modAss(b: Vec2s) = glm.mod(b, this, this, b)


operator fun Int.plus(b: Vec2s) = glm.add(Vec2s(), b, this, this)
inline infix fun Int.addAss(b: Vec2s) = glm.add(b, b, this, this)

operator fun Int.minus(b: Vec2s) = glm.sub(Vec2s(), this, this, b)
inline infix fun Int.subAss(b: Vec2s) = glm.sub(b, this, this, b)

operator fun Int.times(b: Vec2s) = glm.mul(Vec2s(), b, this, this)
inline infix fun Int.mulAss(b: Vec2s) = glm.mul(b, b, this, this)

operator fun Int.div(b: Vec2s) = glm.div(Vec2s(), this, this, b)
inline infix fun Int.divAss(b: Vec2s) = glm.div(b, this, this, b)

operator fun Int.mod(b: Vec2s) = glm.mod(Vec2s(), this, this, b)
inline infix fun Int.modAss(b: Vec2s) = glm.mod(b, this, this, b)