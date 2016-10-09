package glm.vec._4

import glm.glm
import Ulong
import glm.vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4ul(override var x: Ulong = Ulong(0), override var y: Ulong = Ulong(0), override var z: Ulong = Ulong(0), override var w: Ulong = Ulong(0)) : Vec4t<Ulong>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(Ulong(v.x), Ulong(v.y), Ulong(v.z), Ulong(v.w))

    constructor(s: Ulong) : this(s.copy(), s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Ulong(s), Ulong(s), Ulong(s), Ulong(s))

    constructor(ba: ByteArray) : this(Ulong(ba[0]), Ulong(ba[1]), Ulong(ba[2]), Ulong(ba[3]))

    constructor(ba: Array<Ulong>) : this(ba[0], ba[1], ba[2], ba[3])


    fun to(v: Vec4t<Number>): Vec4ul {
        x.v = v.x.toLong(); y.v = v.y.toLong(); z.v = v.z.toLong(); w.v = v.w.toLong(); return this
    }

    fun to(s: Ulong): Vec4ul {
        x.v = s.v; y.v = s.v; z.v = s.v; w.v = s.v; return this
    }

    fun to(s: Long): Vec4ul {
        x.v = s; y.v = s; z.v = s; w.v = s; return this
    }

    fun to(x: Ulong, y: Ulong, z: Ulong, w: Ulong): Vec4ul {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; this.w.v = w.v; return this
    }

    fun to(x: Long, y: Long, z: Long, w: Long): Vec4ul {
        this.x.v = x; this.y.v = y; this.z.v = z; this.w.v = w; return this
    }

    fun to(ia: LongArray): Vec4ul {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; w.v = ia[3]; return this
    }

    fun to(ba: Array<Ulong>): Vec4ul {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; w.v = ba[3].v; return this
    }


    fun to(ia: Array<Long>): Vec4ul {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; w.v = ia[3]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Ulong) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; 2 -> z.v = s.v; else -> w.v = s.v; }
    operator fun set(i: Int, s: Long) = when (i) {0 -> x.v = s; 1 -> y.v = s; 2 -> z.v = s; else -> w.v = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4ul = glm.add(Vec4ul(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4ul) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4ul = glm.sub(Vec4ul(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4ul) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ulong) = glm.add(Vec4ul(), this, b, b, b, b)
    operator fun plus(b: Long) = glm.add(Vec4ul(), this, b, b, b, b)
    operator fun plus(b: Vec4ul) = glm.add(Vec4ul(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.add(Vec4ul(), this, bX, bY, bZ, bW)
    fun add(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.add(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Ulong) = glm.add(this, this, b, b, b, b)
    infix inline fun addAss(b: Long) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.add(this, this, bX, bY, bZ, bW)
    fun addAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4ul) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Ulong, res: Vec4ul) = glm.add(res, this, b, b, b, b)
    fun add(b: Long, res: Vec4ul) = glm.add(res, this, b, b, b, b)
    fun add(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4ul, res: Vec4ul) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Ulong) = glm.sub(Vec4ul(), this, b, b, b, b)
    operator fun minus(b: Long) = glm.sub(Vec4ul(), this, b, b, b, b)
    operator fun minus(b: Vec4ul) = glm.sub(Vec4ul(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.sub(Vec4ul(), this, bX, bY, bZ, bW)
    fun sub(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.sub(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Ulong) = glm.sub(this, this, b, b, b, b)
    infix inline fun subAss(b: Long) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.sub(this, this, bX, bY, bZ, bW)
    fun subAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4ul) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Ulong, res: Vec4ul) = glm.sub(res, this, b, b, b, b)
    fun sub(b: Long, res: Vec4ul) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4ul, res: Vec4ul) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Ulong) = glm.mul(Vec4ul(), this, b, b, b, b)
    operator fun times(b: Long) = glm.mul(Vec4ul(), this, b, b, b, b)
    operator fun times(b: Vec4ul) = glm.mul(Vec4ul(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.mul(Vec4ul(), this, bX, bY, bZ, bW)
    fun mul(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mul(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Ulong) = glm.mul(this, this, b, b, b, b)
    infix inline fun mulAss(b: Long) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.mul(this, this, bX, bY, bZ, bW)
    fun mulAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4ul) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Ulong, res: Vec4ul) = glm.mul(res, this, b, b, b, b)
    fun mul(b: Long, res: Vec4ul) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4ul, res: Vec4ul) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Ulong) = glm.div(Vec4ul(), this, b, b, b, b)
    operator fun div(b: Long) = glm.div(Vec4ul(), this, b, b, b, b)
    operator fun div(b: Vec4ul) = glm.div(Vec4ul(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.div(Vec4ul(), this, bX, bY, bZ, bW)
    fun div(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.div(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Ulong) = glm.div(this, this, b, b, b, b)
    infix inline fun divAss(b: Long) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.div(this, this, bX, bY, bZ, bW)
    fun divAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4ul) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Ulong, res: Vec4ul) = glm.div(res, this, b, b, b, b)
    fun div(b: Long, res: Vec4ul) = glm.div(res, this, b, b, b, b)
    fun div(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4ul, res: Vec4ul) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Ulong) = glm.mod(Vec4ul(), this, b, b, b, b)
    operator fun mod(b: Long) = glm.mod(Vec4ul(), this, b, b, b, b)
    operator fun mod(b: Vec4ul) = glm.mod(Vec4ul(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.mod(Vec4ul(), this, bX, bY, bZ, bW)
    fun mod(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mod(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Ulong) = glm.mod(this, this, b, b, b, b)
    infix inline fun modAss(b: Long) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.mod(this, this, bX, bY, bZ, bW)
    fun modAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4ul) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Ulong, res: Vec4ul) = glm.mod(res, this, b, b, b, b)
    fun mod(b: Long, res: Vec4ul) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4ul, res: Vec4ul) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ulong) = glm.and(Vec4ul(), this, b, b, b, b)
    inline infix fun and(b: Long) = glm.and(Vec4ul(), this, b, b, b, b)
    fun and(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.and(Vec4ul(), this, bX, bY, bZ, bW)
    fun and(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.and(Vec4ul(), this, bX, bY, bZ, bW)
    fun and(b: Vec4ul) = glm.and(Vec4ul(), this, b.x, b.y, b.z, b.w)

    infix inline fun andAss(b: Ulong) = glm.and(this, this, b, b, b, b)
    infix inline fun andAss(b: Long) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.and(this, this, bX, bY, bZ, bW)
    fun andAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.and(this, this, bX, bY, bZ, bW)
    infix inline fun andAss(b: Vec4ul) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Ulong, res: Vec4ul) = glm.and(res, this, b, b, b, b)
    fun and(b: Long, res: Vec4ul) = glm.and(res, this, b, b, b, b)
    fun and(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4ul, res: Vec4ul) = glm.and(res, this, b.x, b.y, b.z, b.w)


    inline infix fun or(b: Ulong) = glm.or(Vec4ul(), this, b, b, b, b)
    inline infix fun or(b: Long) = glm.or(Vec4ul(), this, b, b, b, b)
    fun or(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.or(Vec4ul(), this, bX, bY, bZ, bW)
    fun or(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.or(Vec4ul(), this, bX, bY, bZ, bW)
    fun or(b: Vec4ul) = glm.or(Vec4ul(), this, b.x, b.y, b.z, b.w)

    infix inline fun orAss(b: Ulong) = glm.or(this, this, b, b, b, b)
    infix inline fun orAss(b: Long) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.or(this, this, bX, bY, bZ, bW)
    fun orAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.or(this, this, bX, bY, bZ, bW)
    infix inline fun orAss(b: Vec4ul) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Ulong, res: Vec4ul) = glm.or(res, this, b, b, b, b)
    fun or(b: Long, res: Vec4ul) = glm.or(res, this, b, b, b, b)
    fun or(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4ul, res: Vec4ul) = glm.or(res, this, b.x, b.y, b.z, b.w)


    inline infix fun xor(b: Ulong) = glm.xor(Vec4ul(), this, b, b, b, b)
    inline infix fun xor(b: Long) = glm.xor(Vec4ul(), this, b, b, b, b)
    fun xor(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.xor(Vec4ul(), this, bX, bY, bZ, bW)
    fun xor(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.xor(Vec4ul(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4ul) = glm.xor(Vec4ul(), this, b.x, b.y, b.z, b.w)

    infix inline fun xorAss(b: Ulong) = glm.xor(this, this, b, b, b, b)
    infix inline fun xorAss(b: Long) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = glm.xor(this, this, bX, bY, bZ, bW)
    fun xorAss(bX: Long, bY: Long, bZ: Long, bW: Long) = glm.xor(this, this, bX, bY, bZ, bW)
    infix inline fun xorAss(b: Vec4ul) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Ulong, res: Vec4ul) = glm.xor(res, this, b, b, b, b)
    fun xor(b: Long, res: Vec4ul) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong, res: Vec4ul) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(bX: Long, bY: Long, bZ: Long, bW: Long, res: Vec4ul) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4ul, res: Vec4ul) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shl(b: Int) = glm.shl(Vec4ul(), this, b, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)

    fun shl(b: Int, res: Vec4ul) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ul) = glm.shl(res, this, bX, bY, bZ, bW)


    inline infix fun shr(b: Int) = glm.shr(Vec4ul(), this, b, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4ul(), this, bX, bY, bZ, bW)

    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)

    fun shr(b: Int, res: Vec4ul) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ul) = glm.shr(res, this, bX, bY, bZ, bW)


    fun inv() = glm.inv(Vec4ul(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4ul) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ulong.plus(b: Vec4ul) = glm.add(Vec4ul(), b, this, this, this, this)
inline infix fun Ulong.addAss(b: Vec4ul) = glm.add(b, b, this, this, this, this)

operator fun Ulong.minus(b: Vec4ul) = glm.sub(Vec4ul(), this, this, this, this, b)
inline infix fun Ulong.subAss(b: Vec4ul) = glm.sub(b, this, this, this, this, b)

operator fun Ulong.times(b: Vec4ul) = glm.mul(Vec4ul(), b, this, this, this, this)
inline infix fun Ulong.mulAss(b: Vec4ul) = glm.mul(b, b, this, this, this, this)

operator fun Ulong.div(b: Vec4ul) = glm.div(Vec4ul(), this, this, this, this, b)
inline infix fun Ulong.divAss(b: Vec4ul) = glm.div(b, this, this, this, this, b)

operator fun Ulong.mod(b: Vec4ul) = glm.mod(Vec4ul(), this, this, this, this, b)
inline infix fun Ulong.modAss(b: Vec4ul) = glm.mod(b, this, this, this, this, b)


operator fun Long.plus(b: Vec4ul) = glm.add(Vec4ul(), b, this, this, this, this)
inline infix fun Long.addAss(b: Vec4ul) = glm.add(b, b, this, this, this, this)

operator fun Long.minus(b: Vec4ul) = glm.sub(Vec4ul(), this, this, this, this, b)
inline infix fun Long.subAss(b: Vec4ul) = glm.sub(b, this, this, this, this, b)

operator fun Long.times(b: Vec4ul) = glm.mul(Vec4ul(), b, this, this, this, this)
inline infix fun Long.mulAss(b: Vec4ul) = glm.mul(b, b, this, this, this, this)

operator fun Long.div(b: Vec4ul) = glm.div(Vec4ul(), this, this, this, this, b)
inline infix fun Long.divAss(b: Vec4ul) = glm.div(b, this, this, this, this, b)

operator fun Long.mod(b: Vec4ul) = glm.mod(Vec4ul(), this, this, this, this, b)
inline infix fun Long.modAss(b: Vec4ul) = glm.mod(b, this, this, this, this, b)