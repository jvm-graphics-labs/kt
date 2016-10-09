package vec._2

import vec.Vec2t
import Ushort

/**
 * Created by elect on 08/10/16.
 */

data class Vec2us(override var x: Ushort = Ushort(0), override var y: Ushort = Ushort(0)) : Vec2t<Ushort>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(Ushort(v.x), Ushort(v.y))

    constructor(s: Ushort) : this(s.copy(), s.copy())
    constructor(s: Number) : this(Ushort(s), Ushort(s))

    constructor(ba: ShortArray) : this(Ushort(ba[0]), Ushort(ba[1]))

    constructor(ba: Array<Ushort>) : this(ba[0], ba[1])


    fun to(v: Vec2t<Number>): Vec2us {
        x.v = v.x.toShort(); y.v = v.y.toShort(); return this
    }

    fun to(s: Ushort): Vec2us {
        x.v = s.v; y.v = s.v; return this
    }

    fun to(s: Short): Vec2us {
        x.v = s.toShort(); y.v = s.toShort(); return this
    }

    fun to(s: Int): Vec2us {
        x.v = s.toShort(); y.v = s.toShort(); return this
    }

    fun to(x: Ushort, y: Ushort): Vec2us {
        this.x.v = x.v; this.y.v = y.v; return this
    }

    fun to(x: Short, y: Short): Vec2us {
        this.x.v = x; this.y.v = y; return this
    }

    fun to(x: Int, y: Int): Vec2us {
        this.x.v = x.toShort(); this.y.v = y.toShort(); return this
    }

    fun to(ba: ShortArray): Vec2us {
        x.v = ba[0]; y.v = ba[1]; return this
    }

    fun to(ia: IntArray): Vec2us {
        x.v = ia[0].toShort(); y.v = ia[1].toShort(); return this
    }

    fun to(ba: Array<Ushort>): Vec2us {
        x.v = ba[0].v; y.v = ba[1].v; return this
    }

    fun to(ba: Array<Short>): Vec2us {
        x.v = ba[0]; y.v = ba[1]; return this
    }

    fun to(ia: Array<Int>): Vec2us {
        x.v = ia[0].toShort(); y.v = ia[1].toShort(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Ushort) = when (i) {0 -> x.v = s.v; else -> y.v = s.v; }
    operator fun set(i: Int, s: Short) = when (i) {0 -> x.v = s; else -> y.v = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s.toShort(); else -> y.v = s.toShort(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2us = glm.add(Vec2us(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2us) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2us = glm.sub(Vec2us(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2us) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ushort) = glm.add(Vec2us(), this, b, b)
    operator fun plus(b: Int) = glm.add(Vec2us(), this, b, b)
    operator fun plus(b: Vec2us) = glm.add(Vec2us(), this, b.x, b.y)

    fun add(bX: Ushort, bY: Ushort) = glm.add(Vec2us(), this, bX, bY)
    fun add(bX: Int, bY: Int) = glm.add(Vec2us(), this, bX, bY)

    infix inline fun addAss(b: Ushort) = glm.add(this, this, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b)
    fun addAss(bX: Ushort, bY: Ushort) = glm.add(this, this, bX, bY)
    fun addAss(bX: Int, bY: Int) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2us) = glm.add(this, this, b.x, b.y)

    fun add(b: Ushort, res: Vec2us) = glm.add(res, this, b, b)
    fun add(b: Int, res: Vec2us) = glm.add(res, this, b, b)
    fun add(bX: Ushort, bY: Ushort, res: Vec2us) = glm.add(res, this, bX, bY)
    fun add(bX: Int, bY: Int, res: Vec2us) = glm.add(res, this, bX, bY)
    fun add(b: Vec2us, res: Vec2us) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Ushort) = glm.sub(Vec2us(), this, b, b)
    operator fun minus(b: Int) = glm.sub(Vec2us(), this, b, b)
    operator fun minus(b: Vec2us) = glm.sub(Vec2us(), this, b.x, b.y)

    fun sub(bX: Ushort, bY: Ushort) = glm.sub(Vec2us(), this, bX, bY)
    fun sub(bX: Int, bY: Int) = glm.sub(Vec2us(), this, bX, bY)

    infix inline fun subAss(b: Ushort) = glm.sub(this, this, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b)
    fun subAss(bX: Ushort, bY: Ushort) = glm.sub(this, this, bX, bY)
    fun subAss(bX: Int, bY: Int) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2us) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Ushort, res: Vec2us) = glm.sub(res, this, b, b)
    fun sub(b: Int, res: Vec2us) = glm.sub(res, this, b, b)
    fun sub(bX: Ushort, bY: Ushort, res: Vec2us) = glm.sub(res, this, bX, bY)
    fun sub(bX: Int, bY: Int, res: Vec2us) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2us, res: Vec2us) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Ushort) = glm.mul(Vec2us(), this, b, b)
    operator fun times(b: Int) = glm.mul(Vec2us(), this, b, b)
    operator fun times(b: Vec2us) = glm.mul(Vec2us(), this, b.x, b.y)

    fun mul(bX: Ushort, bY: Ushort) = glm.mul(Vec2us(), this, bX, bY)
    fun mul(bX: Int, bY: Int) = glm.mul(Vec2us(), this, bX, bY)

    infix inline fun mulAss(b: Ushort) = glm.mul(this, this, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b)
    fun mulAss(bX: Ushort, bY: Ushort) = glm.mul(this, this, bX, bY)
    fun mulAss(bX: Int, bY: Int) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2us) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Ushort, res: Vec2us) = glm.mul(res, this, b, b)
    fun mul(b: Int, res: Vec2us) = glm.mul(res, this, b, b)
    fun mul(bX: Ushort, bY: Ushort, res: Vec2us) = glm.mul(res, this, bX, bY)
    fun mul(bX: Int, bY: Int, res: Vec2us) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2us, res: Vec2us) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Ushort) = glm.div(Vec2us(), this, b, b)
    operator fun div(b: Int) = glm.div(Vec2us(), this, b, b)
    operator fun div(b: Vec2us) = glm.div(Vec2us(), this, b.x, b.y)

    fun div(bX: Ushort, bY: Ushort) = glm.div(Vec2us(), this, bX, bY)
    fun div(bX: Int, bY: Int) = glm.div(Vec2us(), this, bX, bY)

    infix inline fun divAss(b: Ushort) = glm.div(this, this, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b)
    fun divAss(bX: Ushort, bY: Ushort) = glm.div(this, this, bX, bY)
    fun divAss(bX: Int, bY: Int) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2us) = glm.div(this, this, b.x, b.y)

    fun div(b: Ushort, res: Vec2us) = glm.div(res, this, b, b)
    fun div(b: Int, res: Vec2us) = glm.div(res, this, b, b)
    fun div(bX: Ushort, bY: Ushort, res: Vec2us) = glm.div(res, this, bX, bY)
    fun div(bX: Int, bY: Int, res: Vec2us) = glm.div(res, this, bX, bY)
    fun div(b: Vec2us, res: Vec2us) = glm.div(res, this, b.x, b.y)

    operator fun mod(b: Ushort) = glm.mod(Vec2us(), this, b, b)
    operator fun mod(b: Int) = glm.mod(Vec2us(), this, b, b)
    operator fun mod(b: Vec2us) = glm.mod(Vec2us(), this, b.x, b.y)

    fun mod(bX: Ushort, bY: Ushort) = glm.mod(Vec2us(), this, bX, bY)
    fun mod(bX: Int, bY: Int) = glm.mod(Vec2us(), this, bX, bY)

    infix inline fun modAss(b: Ushort) = glm.mod(this, this, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b)
    fun modAss(bX: Ushort, bY: Ushort) = glm.mod(this, this, bX, bY)
    fun modAss(bX: Int, bY: Int) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2us) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Ushort, res: Vec2us) = glm.mod(res, this, b, b)
    fun mod(b: Int, res: Vec2us) = glm.mod(res, this, b, b)
    fun mod(bX: Ushort, bY: Ushort, res: Vec2us) = glm.mod(res, this, bX, bY)
    fun mod(bX: Int, bY: Int, res: Vec2us) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2us, res: Vec2us) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ushort) = glm.and(Vec2us(), this, b, b)
    inline infix fun and(b: Int) = glm.and(Vec2us(), this, b, b)
    fun and(bX: Ushort, bY: Ushort) = glm.and(Vec2us(), this, bX, bY)
    fun and(bX: Int, bY: Int) = glm.and(Vec2us(), this, bX, bY)
    fun and(b: Vec2us) = glm.and(Vec2us(), this, b.x, b.y)

    infix inline fun andAss(b: Ushort) = glm.and(this, this, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b)
    fun andAss(bX: Ushort, bY: Ushort) = glm.and(this, this, bX, bY)
    fun andAss(bX: Int, bY: Int) = glm.and(this, this, bX, bY)
    infix inline fun andAss(b: Vec2us) = glm.and(this, this, b.x, b.y)

    fun and(b: Ushort, res: Vec2us) = glm.and(res, this, b, b)
    fun and(b: Int, res: Vec2us) = glm.and(res, this, b, b)
    fun and(bX: Ushort, bY: Ushort, res: Vec2us) = glm.and(res, this, bX, bY)
    fun and(bX: Int, bY: Int, res: Vec2us) = glm.and(res, this, bX, bY)
    fun and(b: Vec2us, res: Vec2us) = glm.and(res, this, b.x, b.y)


    inline infix fun or(b: Ushort) = glm.or(Vec2us(), this, b, b)
    inline infix fun or(b: Int) = glm.or(Vec2us(), this, b, b)
    fun or(bX: Ushort, bY: Ushort) = glm.or(Vec2us(), this, bX, bY)
    fun or(bX: Int, bY: Int) = glm.or(Vec2us(), this, bX, bY)
    fun or(b: Vec2us) = glm.or(Vec2us(), this, b.x, b.y)

    infix inline fun orAss(b: Ushort) = glm.or(this, this, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b)
    fun orAss(bX: Ushort, bY: Ushort) = glm.or(this, this, bX, bY)
    fun orAss(bX: Int, bY: Int) = glm.or(this, this, bX, bY)
    infix inline fun orAss(b: Vec2us) = glm.or(this, this, b.x, b.y)

    fun or(b: Ushort, res: Vec2us) = glm.or(res, this, b, b)
    fun or(b: Int, res: Vec2us) = glm.or(res, this, b, b)
    fun or(bX: Ushort, bY: Ushort, res: Vec2us) = glm.or(res, this, bX, bY)
    fun or(bX: Int, bY: Int, res: Vec2us) = glm.or(res, this, bX, bY)
    fun or(b: Vec2us, res: Vec2us) = glm.or(res, this, b.x, b.y)


    inline infix fun xor(b: Ushort) = glm.xor(Vec2us(), this, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec2us(), this, b, b)
    fun xor(bX: Ushort, bY: Ushort) = glm.xor(Vec2us(), this, bX, bY)
    fun xor(bX: Int, bY: Int) = glm.xor(Vec2us(), this, bX, bY)
    fun xor(b: Vec2us) = glm.xor(Vec2us(), this, b.x, b.y)

    infix inline fun xorAss(b: Ushort) = glm.xor(this, this, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b)
    fun xorAss(bX: Ushort, bY: Ushort) = glm.xor(this, this, bX, bY)
    fun xorAss(bX: Int, bY: Int) = glm.xor(this, this, bX, bY)
    infix inline fun xorAss(b: Vec2us) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Ushort, res: Vec2us) = glm.xor(res, this, b, b)
    fun xor(b: Int, res: Vec2us) = glm.xor(res, this, b, b)
    fun xor(bX: Ushort, bY: Ushort, res: Vec2us) = glm.xor(res, this, bX, bY)
    fun xor(bX: Int, bY: Int, res: Vec2us) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2us, res: Vec2us) = glm.xor(res, this, b.x, b.y)


    inline infix fun shl(b: Ushort) = glm.shl(Vec2us(), this, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec2us(), this, b, b)
    fun shl(bX: Ushort, bY: Ushort) = glm.shl(Vec2us(), this, bX, bY)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2us(), this, bX, bY)
    fun shl(b: Vec2us) = glm.shl(Vec2us(), this, b.x, b.y)

    infix inline fun shlAss(b: Ushort) = glm.shl(this, this, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Ushort, bY: Ushort) = glm.shl(this, this, bX, bY)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)
    infix inline fun shlAss(b: Vec2us) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Ushort, res: Vec2us) = glm.shl(res, this, b, b)
    fun shl(b: Int, res: Vec2us) = glm.shl(res, this, b, b)
    fun shl(bX: Ushort, bY: Ushort, res: Vec2us) = glm.shl(res, this, bX, bY)
    fun shl(bX: Int, bY: Int, res: Vec2us) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2us, res: Vec2us) = glm.shl(res, this, b.x, b.y)


    inline infix fun shr(b: Ushort) = glm.shr(Vec2us(), this, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec2us(), this, b, b)
    fun shr(bX: Ushort, bY: Ushort) = glm.shr(Vec2us(), this, bX, bY)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2us(), this, bX, bY)
    fun shr(b: Vec2us) = glm.shr(Vec2us(), this, b.x, b.y)

    infix inline fun shrAss(b: Ushort) = glm.shr(this, this, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Ushort, bY: Ushort) = glm.shr(this, this, bX, bY)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)
    infix inline fun shrAss(b: Vec2us) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Ushort, res: Vec2us) = glm.shr(res, this, b, b)
    fun shr(b: Int, res: Vec2us) = glm.shr(res, this, b, b)
    fun shr(bX: Ushort, bY: Ushort, res: Vec2us) = glm.shr(res, this, bX, bY)
    fun shr(bX: Int, bY: Int, res: Vec2us) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2us, res: Vec2us) = glm.shr(res, this, b.x, b.y)


    fun inv() = glm.inv(Vec2us(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2us) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ushort.plus(b: Vec2us) = glm.add(Vec2us(), b, this, this)
inline infix fun Ushort.addAss(b: Vec2us) = glm.add(b, b, this, this)

operator fun Ushort.minus(b: Vec2us) = glm.sub(Vec2us(), this, this, b)
inline infix fun Ushort.subAss(b: Vec2us) = glm.sub(b, this, this, b)

operator fun Ushort.times(b: Vec2us) = glm.mul(Vec2us(), b, this, this)
inline infix fun Ushort.mulAss(b: Vec2us) = glm.mul(b, b, this, this)

operator fun Ushort.div(b: Vec2us) = glm.div(Vec2us(), this, this, b)
inline infix fun Ushort.divAss(b: Vec2us) = glm.div(b, this, this, b)

operator fun Ushort.mod(b: Vec2us) = glm.mod(Vec2us(), this, this, b)
inline infix fun Ushort.modAss(b: Vec2us) = glm.mod(b, this, this, b)


operator fun Int.plus(b: Vec2us) = glm.add(Vec2us(), b, this, this)
inline infix fun Int.addAss(b: Vec2us) = glm.add(b, b, this, this)

operator fun Int.minus(b: Vec2us) = glm.sub(Vec2us(), this, this, b)
inline infix fun Int.subAss(b: Vec2us) = glm.sub(b, this, this, b)

operator fun Int.times(b: Vec2us) = glm.mul(Vec2us(), b, this, this)
inline infix fun Int.mulAss(b: Vec2us) = glm.mul(b, b, this, this)

operator fun Int.div(b: Vec2us) = glm.div(Vec2us(), this, this, b)
inline infix fun Int.divAss(b: Vec2us) = glm.div(b, this, this, b)

operator fun Int.mod(b: Vec2us) = glm.mod(Vec2us(), this, this, b)
inline infix fun Int.modAss(b: Vec2us) = glm.mod(b, this, this, b)