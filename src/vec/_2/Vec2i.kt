package vec._2

import vec.Vec2t

/**
 * Created bY GBarbieri on 06.10.2016.
 */

data class Vec2i(override var x: Int = 0, override var y: Int = 0) : Vec2t<Int>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toInt(), v.y.toInt())

    constructor(s: Int) : this(s, s)

    constructor(ia: IntArray) : this(ia[0], ia[1])

    constructor(ia: Array<Int>) : this(ia[0], ia[1])


    fun to(v: Vec2t<Number>): Vec2i {
        x = v.x.toInt(); y = v.y.toInt(); return this
    }

    fun to(s: Int): Vec2i {
        x = s; y = s; return this
    }

    fun to(x: Int, y: Int): Vec2i {
        this.x = x; this.y = y; return this
    }

    fun to(ba: IntArray): Vec2i {
        x = ba[0]; y = ba[1]; return this
    }

    fun to(ba: Array<Int>): Vec2i {
        x = ba[0]; y = ba[1]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int): Int = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s; else -> y = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2i {
        x = -x; y = -y; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2i = glm.add(Vec2i(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2i) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2i = glm.sub(Vec2i(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2i) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Int) = glm.add(Vec2i(), this, b, b)
    operator fun plus(b: Vec2i) = glm.add(Vec2i(), this, b.x, b.y)

    fun add(bX: Int, bY: Int) = glm.add(Vec2i(), this, bX, bY)

    infix inline fun addAss(b: Int) = glm.add(this, this, b, b)
    fun addAss(bX: Int, bY: Int) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2i) = glm.add(this, this, b.x, b.y)

    fun add(b: Int, res: Vec2i) = glm.add(res, this, b, b)
    fun add(bX: Int, bY: Int, res: Vec2i) = glm.add(res, this, bX, bY)
    fun add(b: Vec2i, res: Vec2i) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Int) = glm.sub(Vec2i(), this, b, b)
    operator fun minus(b: Vec2i) = glm.sub(Vec2i(), this, b.x, b.y)

    fun sub(bX: Int, bY: Int) = glm.sub(Vec2i(), this, bX, bY)

    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b)
    fun subAss(bX: Int, bY: Int) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2i) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Int, res: Vec2i) = glm.sub(res, this, b, b)
    fun sub(bX: Int, bY: Int, res: Vec2i) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2i, res: Vec2i) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Int) = glm.mul(Vec2i(), this, b, b)
    operator fun times(b: Vec2i) = glm.mul(Vec2i(), this, b.x, b.y)

    fun mul(bX: Int, bY: Int) = glm.mul(Vec2i(), this, bX, bY)

    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b)
    fun mulAss(bX: Int, bY: Int) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2i) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Int, res: Vec2i) = glm.mul(res, this, b, b)
    fun mul(bX: Int, bY: Int, res: Vec2i) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2i, res: Vec2i) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Int) = glm.div(Vec2i(), this, b, b)
    operator fun div(b: Vec2i) = glm.div(Vec2i(), this, b.x, b.y)

    fun div(bX: Int, bY: Int) = glm.div(Vec2i(), this, bX, bY)

    infix inline fun divAss(b: Int) = glm.div(this, this, b, b)
    fun divAss(bX: Int, bY: Int) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2i) = glm.div(this, this, b.x, b.y)

    fun div(b: Int, res: Vec2i) = glm.div(res, this, b, b)
    fun div(bX: Int, bY: Int, res: Vec2i) = glm.div(res, this, bX, bY)
    fun div(b: Vec2i, res: Vec2i) = glm.div(res, this, b.x, b.y)

    operator fun mod(s: Int) = glm.mod(Vec2i(), this, s, s)
    operator fun mod(b: Vec2i) = glm.mod(Vec2i(), this, b.x, b.y)

    fun mod(bX: Int, bY: Int) = glm.mod(Vec2i(), this, bX, bY)

    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b)
    fun modAss(bX: Int, bY: Int) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2i) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Int, res: Vec2i) = glm.mod(res, this, b, b)
    fun mod(bX: Int, bY: Int, res: Vec2i) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2i, res: Vec2i) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Int) = glm.and(Vec2i(), this, b, b)
    fun and(bX: Int, bY: Int) = glm.and(Vec2i(), this, bX, bY)
    fun and(b: Vec2i) = glm.and(Vec2i(), this, b.x, b.y)

    infix inline fun andAss(b: Int) = glm.and(this, this, b, b)
    fun andAss(bX: Int, bY: Int) = glm.and(this, this, bX, bY)
    infix inline fun andAss(b: Vec2i) = glm.and(this, this, b.x, b.y)

    fun and(b: Int, res: Vec2i) = glm.and(res, this, b, b)
    fun and(bX: Int, bY: Int, res: Vec2i) = glm.and(res, this, bX, bY)
    fun and(b: Vec2i, res: Vec2i) = glm.and(res, this, b.x, b.y)


    inline infix fun or(b: Int) = glm.or(Vec2i(), this, b, b)
    fun or(bX: Int, bY: Int) = glm.or(Vec2i(), this, bX, bY)
    fun or(b: Vec2i) = glm.or(Vec2i(), this, b.x, b.y)

    infix inline fun orAss(b: Int) = glm.or(this, this, b, b)
    fun orAss(bX: Int, bY: Int) = glm.or(this, this, bX, bY)
    infix inline fun orAss(b: Vec2i) = glm.or(this, this, b.x, b.y)

    fun or(b: Int, res: Vec2i) = glm.or(res, this, b, b)
    fun or(bX: Int, bY: Int, res: Vec2i) = glm.or(res, this, bX, bY)
    fun or(b: Vec2i, res: Vec2i) = glm.or(res, this, b.x, b.y)


    inline infix fun xor(b: Int) = glm.xor(Vec2i(), this, b, b)
    fun xor(bX: Int, bY: Int) = glm.xor(Vec2i(), this, bX, bY)
    fun xor(b: Vec2i) = glm.xor(Vec2i(), this, b.x, b.y)

    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b)
    fun xorAss(bX: Int, bY: Int) = glm.xor(this, this, bX, bY)
    infix inline fun xorAss(b: Vec2i) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Int, res: Vec2i) = glm.xor(res, this, b, b)
    fun xor(bX: Int, bY: Int, res: Vec2i) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2i, res: Vec2i) = glm.xor(res, this, b.x, b.y)


    inline infix fun shl(b: Int) = glm.shl(Vec2i(), this, b, b)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2i(), this, bX, bY)
    fun shl(b: Vec2i) = glm.shl(Vec2i(), this, b.x, b.y)

    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)
    infix inline fun shlAss(b: Vec2i) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Int, res: Vec2i) = glm.shl(res, this, b, b)
    fun shl(bX: Int, bY: Int, res: Vec2i) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2i, res: Vec2i) = glm.shl(res, this, b.x, b.y)


    inline infix fun shr(b: Int) = glm.shr(Vec2i(), this, b, b)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2i(), this, bX, bY)
    fun shr(b: Vec2i) = glm.shr(Vec2i(), this, b.x, b.y)

    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)
    infix inline fun shrAss(b: Vec2i) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Int, res: Vec2i) = glm.shr(res, this, b, b)
    fun shr(bX: Int, bY: Int, res: Vec2i) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2i, res: Vec2i) = glm.shr(res, this, b.x, b.y)


    fun inv() = glm.inv(Vec2i(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2i) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Int.plus(b: Vec2i) = glm.add(Vec2i(), b, this, this)
inline infix fun Int.addAss(b: Vec2i) = glm.add(b, b, this, this)

operator fun Int.minus(b: Vec2i) = glm.sub(Vec2i(), this, this, b)
inline infix fun Int.subAss(b: Vec2i) = glm.sub(b, this, this, b)

operator fun Int.times(b: Vec2i) = glm.mul(Vec2i(), b, this, this)
inline infix fun Int.mulAss(b: Vec2i) = glm.mul(b, b, this, this)

operator fun Int.div(b: Vec2i) = glm.div(Vec2i(), this, this, b)
inline infix fun Int.divAss(b: Vec2i) = glm.div(b, this, this, b)

operator fun Int.mod(b: Vec2i) = glm.mod(Vec2i(), this, this, b)
inline infix fun Int.modAss(b: Vec2i) = glm.mod(b, this, this, b)