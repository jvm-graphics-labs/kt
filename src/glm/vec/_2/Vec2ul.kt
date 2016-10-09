package glm.vec._2

import glm.glm
import glm.vec.Vec2t
import Ulong

/**
 * Created by elect on 08/10/16.
 */

data class Vec2ul(override var x: Ulong = Ulong(0), override var y: Ulong = Ulong(0)) : Vec2t<Ulong>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(Ulong(v.x), Ulong(v.y))

    constructor(s: Ulong) : this(s.copy(), s.copy())
    constructor(s: Number) : this(Ulong(s), Ulong(s))

    constructor(ba: ByteArray) : this(Ulong(ba[0]), Ulong(ba[1]))

    constructor(ba: Array<Ulong>) : this(ba[0], ba[1])


    fun to(v: Vec2t<Number>): Vec2ul {
        x.v = v.x.toLong(); y.v = v.y.toLong(); return this
    }

    fun to(s: Ulong): Vec2ul {
        x.v = s.v; y.v = s.v; return this
    }

    fun to(s: Long): Vec2ul {
        x.v = s; y.v = s; return this
    }

    fun to(x: Ulong, y: Ulong): Vec2ul {
        this.x.v = x.v; this.y.v = y.v; return this
    }

    fun to(x: Long, y: Long): Vec2ul {
        this.x.v = x; this.y.v = y; return this
    }

    fun to(ia: LongArray): Vec2ul {
        x.v = ia[0]; y.v = ia[1]; return this
    }

    fun to(ba: Array<Ulong>): Vec2ul {
        x.v = ba[0].v; y.v = ba[1].v; return this
    }


    fun to(ia: Array<Long>): Vec2ul {
        x.v = ia[0]; y.v = ia[1]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Ulong) = when (i) {0 -> x.v = s.v; else -> y.v = s.v; }
    operator fun set(i: Int, s: Long) = when (i) {0 -> x.v = s; else -> y.v = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2ul = glm.add(Vec2ul(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2ul) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2ul = glm.sub(Vec2ul(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2ul) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ulong) = glm.add(Vec2ul(), this, b, b)
    operator fun plus(b: Long) = glm.add(Vec2ul(), this, b, b)
    operator fun plus(b: Vec2ul) = glm.add(Vec2ul(), this, b.x, b.y)

    fun add(bX: Ulong, bY: Ulong) = glm.add(Vec2ul(), this, bX, bY)
    fun add(bX: Long, bY: Long) = glm.add(Vec2ul(), this, bX, bY)

    infix inline fun addAss(b: Ulong) = glm.add(this, this, b, b)
    infix inline fun addAss(b: Long) = glm.add(this, this, b, b)
    fun addAss(bX: Ulong, bY: Ulong) = glm.add(this, this, bX, bY)
    fun addAss(bX: Long, bY: Long) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2ul) = glm.add(this, this, b.x, b.y)

    fun add(b: Ulong, res: Vec2ul) = glm.add(res, this, b, b)
    fun add(b: Long, res: Vec2ul) = glm.add(res, this, b, b)
    fun add(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.add(res, this, bX, bY)
    fun add(bX: Long, bY: Long, res: Vec2ul) = glm.add(res, this, bX, bY)
    fun add(b: Vec2ul, res: Vec2ul) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Ulong) = glm.sub(Vec2ul(), this, b, b)
    operator fun minus(b: Long) = glm.sub(Vec2ul(), this, b, b)
    operator fun minus(b: Vec2ul) = glm.sub(Vec2ul(), this, b.x, b.y)

    fun sub(bX: Ulong, bY: Ulong) = glm.sub(Vec2ul(), this, bX, bY)
    fun sub(bX: Long, bY: Long) = glm.sub(Vec2ul(), this, bX, bY)

    infix inline fun subAss(b: Ulong) = glm.sub(this, this, b, b)
    infix inline fun subAss(b: Long) = glm.sub(this, this, b, b)
    fun subAss(bX: Ulong, bY: Ulong) = glm.sub(this, this, bX, bY)
    fun subAss(bX: Long, bY: Long) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2ul) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Ulong, res: Vec2ul) = glm.sub(res, this, b, b)
    fun sub(b: Long, res: Vec2ul) = glm.sub(res, this, b, b)
    fun sub(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.sub(res, this, bX, bY)
    fun sub(bX: Long, bY: Long, res: Vec2ul) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2ul, res: Vec2ul) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Ulong) = glm.mul(Vec2ul(), this, b, b)
    operator fun times(b: Long) = glm.mul(Vec2ul(), this, b, b)
    operator fun times(b: Vec2ul) = glm.mul(Vec2ul(), this, b.x, b.y)

    fun mul(bX: Ulong, bY: Ulong) = glm.mul(Vec2ul(), this, bX, bY)
    fun mul(bX: Long, bY: Long) = glm.mul(Vec2ul(), this, bX, bY)

    infix inline fun mulAss(b: Ulong) = glm.mul(this, this, b, b)
    infix inline fun mulAss(b: Long) = glm.mul(this, this, b, b)
    fun mulAss(bX: Ulong, bY: Ulong) = glm.mul(this, this, bX, bY)
    fun mulAss(bX: Long, bY: Long) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2ul) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Ulong, res: Vec2ul) = glm.mul(res, this, b, b)
    fun mul(b: Long, res: Vec2ul) = glm.mul(res, this, b, b)
    fun mul(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.mul(res, this, bX, bY)
    fun mul(bX: Long, bY: Long, res: Vec2ul) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2ul, res: Vec2ul) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Ulong) = glm.div(Vec2ul(), this, b, b)
    operator fun div(b: Long) = glm.div(Vec2ul(), this, b, b)
    operator fun div(b: Vec2ul) = glm.div(Vec2ul(), this, b.x, b.y)

    fun div(bX: Ulong, bY: Ulong) = glm.div(Vec2ul(), this, bX, bY)
    fun div(bX: Long, bY: Long) = glm.div(Vec2ul(), this, bX, bY)

    infix inline fun divAss(b: Ulong) = glm.div(this, this, b, b)
    infix inline fun divAss(b: Long) = glm.div(this, this, b, b)
    fun divAss(bX: Ulong, bY: Ulong) = glm.div(this, this, bX, bY)
    fun divAss(bX: Long, bY: Long) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2ul) = glm.div(this, this, b.x, b.y)

    fun div(b: Ulong, res: Vec2ul) = glm.div(res, this, b, b)
    fun div(b: Long, res: Vec2ul) = glm.div(res, this, b, b)
    fun div(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.div(res, this, bX, bY)
    fun div(bX: Long, bY: Long, res: Vec2ul) = glm.div(res, this, bX, bY)
    fun div(b: Vec2ul, res: Vec2ul) = glm.div(res, this, b.x, b.y)

    operator fun mod(b: Ulong) = glm.mod(Vec2ul(), this, b, b)
    operator fun mod(b: Long) = glm.mod(Vec2ul(), this, b, b)
    operator fun mod(b: Vec2ul) = glm.mod(Vec2ul(), this, b.x, b.y)

    fun mod(bX: Ulong, bY: Ulong) = glm.mod(Vec2ul(), this, bX, bY)
    fun mod(bX: Long, bY: Long) = glm.mod(Vec2ul(), this, bX, bY)

    infix inline fun modAss(b: Ulong) = glm.mod(this, this, b, b)
    infix inline fun modAss(b: Long) = glm.mod(this, this, b, b)
    fun modAss(bX: Ulong, bY: Ulong) = glm.mod(this, this, bX, bY)
    fun modAss(bX: Long, bY: Long) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2ul) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Ulong, res: Vec2ul) = glm.mod(res, this, b, b)
    fun mod(b: Long, res: Vec2ul) = glm.mod(res, this, b, b)
    fun mod(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.mod(res, this, bX, bY)
    fun mod(bX: Long, bY: Long, res: Vec2ul) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2ul, res: Vec2ul) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ulong) = glm.and(Vec2ul(), this, b, b)
    inline infix fun and(b: Long) = glm.and(Vec2ul(), this, b, b)
    fun and(bX: Ulong, bY: Ulong) = glm.and(Vec2ul(), this, bX, bY)
    fun and(bX: Long, bY: Long) = glm.and(Vec2ul(), this, bX, bY)
    fun and(b: Vec2ul) = glm.and(Vec2ul(), this, b.x, b.y)

    infix inline fun andAss(b: Ulong) = glm.and(this, this, b, b)
    infix inline fun andAss(b: Long) = glm.and(this, this, b, b)
    fun andAss(bX: Ulong, bY: Ulong) = glm.and(this, this, bX, bY)
    fun andAss(bX: Long, bY: Long) = glm.and(this, this, bX, bY)
    infix inline fun andAss(b: Vec2ul) = glm.and(this, this, b.x, b.y)

    fun and(b: Ulong, res: Vec2ul) = glm.and(res, this, b, b)
    fun and(b: Long, res: Vec2ul) = glm.and(res, this, b, b)
    fun and(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.and(res, this, bX, bY)
    fun and(bX: Long, bY: Long, res: Vec2ul) = glm.and(res, this, bX, bY)
    fun and(b: Vec2ul, res: Vec2ul) = glm.and(res, this, b.x, b.y)


    inline infix fun or(b: Ulong) = glm.or(Vec2ul(), this, b, b)
    inline infix fun or(b: Long) = glm.or(Vec2ul(), this, b, b)
    fun or(bX: Ulong, bY: Ulong) = glm.or(Vec2ul(), this, bX, bY)
    fun or(bX: Long, bY: Long) = glm.or(Vec2ul(), this, bX, bY)
    fun or(b: Vec2ul) = glm.or(Vec2ul(), this, b.x, b.y)

    infix inline fun orAss(b: Ulong) = glm.or(this, this, b, b)
    infix inline fun orAss(b: Long) = glm.or(this, this, b, b)
    fun orAss(bX: Ulong, bY: Ulong) = glm.or(this, this, bX, bY)
    fun orAss(bX: Long, bY: Long) = glm.or(this, this, bX, bY)
    infix inline fun orAss(b: Vec2ul) = glm.or(this, this, b.x, b.y)

    fun or(b: Ulong, res: Vec2ul) = glm.or(res, this, b, b)
    fun or(b: Long, res: Vec2ul) = glm.or(res, this, b, b)
    fun or(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.or(res, this, bX, bY)
    fun or(bX: Long, bY: Long, res: Vec2ul) = glm.or(res, this, bX, bY)
    fun or(b: Vec2ul, res: Vec2ul) = glm.or(res, this, b.x, b.y)


    inline infix fun xor(b: Ulong) = glm.xor(Vec2ul(), this, b, b)
    inline infix fun xor(b: Long) = glm.xor(Vec2ul(), this, b, b)
    fun xor(bX: Ulong, bY: Ulong) = glm.xor(Vec2ul(), this, bX, bY)
    fun xor(bX: Long, bY: Long) = glm.xor(Vec2ul(), this, bX, bY)
    fun xor(b: Vec2ul) = glm.xor(Vec2ul(), this, b.x, b.y)

    infix inline fun xorAss(b: Ulong) = glm.xor(this, this, b, b)
    infix inline fun xorAss(b: Long) = glm.xor(this, this, b, b)
    fun xorAss(bX: Ulong, bY: Ulong) = glm.xor(this, this, bX, bY)
    fun xorAss(bX: Long, bY: Long) = glm.xor(this, this, bX, bY)
    infix inline fun xorAss(b: Vec2ul) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Ulong, res: Vec2ul) = glm.xor(res, this, b, b)
    fun xor(b: Long, res: Vec2ul) = glm.xor(res, this, b, b)
    fun xor(bX: Ulong, bY: Ulong, res: Vec2ul) = glm.xor(res, this, bX, bY)
    fun xor(bX: Long, bY: Long, res: Vec2ul) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2ul, res: Vec2ul) = glm.xor(res, this, b.x, b.y)


    inline infix fun shl(b: Int) = glm.shl(Vec2ul(), this, b, b)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2ul(), this, bX, bY)

    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)

    fun shl(b: Int, res: Vec2ul) = glm.shl(res, this, b, b)
    fun shl(bX: Int, bY: Int, res: Vec2ul) = glm.shl(res, this, bX, bY)


    inline infix fun shr(b: Int) = glm.shr(Vec2ul(), this, b, b)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2ul(), this, bX, bY)

    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)

    fun shr(b: Int, res: Vec2ul) = glm.shr(res, this, b, b)
    fun shr(bX: Int, bY: Int, res: Vec2ul) = glm.shr(res, this, bX, bY)


    fun inv() = glm.inv(Vec2ul(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2ul) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ulong.plus(b: Vec2ul) = glm.add(Vec2ul(), b, this, this)
inline infix fun Ulong.addAss(b: Vec2ul) = glm.add(b, b, this, this)

operator fun Ulong.minus(b: Vec2ul) = glm.sub(Vec2ul(), this, this, b)
inline infix fun Ulong.subAss(b: Vec2ul) = glm.sub(b, this, this, b)

operator fun Ulong.times(b: Vec2ul) = glm.mul(Vec2ul(), b, this, this)
inline infix fun Ulong.mulAss(b: Vec2ul) = glm.mul(b, b, this, this)

operator fun Ulong.div(b: Vec2ul) = glm.div(Vec2ul(), this, this, b)
inline infix fun Ulong.divAss(b: Vec2ul) = glm.div(b, this, this, b)

operator fun Ulong.mod(b: Vec2ul) = glm.mod(Vec2ul(), this, this, b)
inline infix fun Ulong.modAss(b: Vec2ul) = glm.mod(b, this, this, b)


operator fun Long.plus(b: Vec2ul) = glm.add(Vec2ul(), b, this, this)
inline infix fun Long.addAss(b: Vec2ul) = glm.add(b, b, this, this)

operator fun Long.minus(b: Vec2ul) = glm.sub(Vec2ul(), this, this, b)
inline infix fun Long.subAss(b: Vec2ul) = glm.sub(b, this, this, b)

operator fun Long.times(b: Vec2ul) = glm.mul(Vec2ul(), b, this, this)
inline infix fun Long.mulAss(b: Vec2ul) = glm.mul(b, b, this, this)

operator fun Long.div(b: Vec2ul) = glm.div(Vec2ul(), this, this, b)
inline infix fun Long.divAss(b: Vec2ul) = glm.div(b, this, this, b)

operator fun Long.mod(b: Vec2ul) = glm.mod(Vec2ul(), this, this, b)
inline infix fun Long.modAss(b: Vec2ul) = glm.mod(b, this, this, b)