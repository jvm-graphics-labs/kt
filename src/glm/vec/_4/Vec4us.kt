package glm.vec._4

import glm.glm
import glm.vec.Vec4t
import main.Ushort

/**
 * Created by elect on 09/10/16.
 */

data class Vec4us(override var x: Ushort = Ushort(0), override var y: Ushort = Ushort(0), override var z: Ushort = Ushort(0), override var w: Ushort = Ushort(0)) : Vec4t<Ushort>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(Ushort(v.x), Ushort(v.y), Ushort(v.z), Ushort(v.w))

    constructor(s: Ushort) : this(s.copy(), s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Ushort(s), Ushort(s), Ushort(s), Ushort(s))

    constructor(ba: ShortArray) : this(Ushort(ba[0]), Ushort(ba[1]), Ushort(ba[2]), Ushort(ba[3]))

    constructor(ba: Array<Ushort>) : this(ba[0], ba[1], ba[2], ba[3])


    fun to(v: Vec4t<Number>): Vec4us {
        x.v = v.x.toShort(); y.v = v.y.toShort(); z.v = v.z.toShort(); w.v = v.w.toShort(); return this
    }

    fun to(s: Ushort): Vec4us {
        x.v = s.v; y.v = s.v; z.v = s.v; w.v = s.v; return this
    }

    fun to(s: Short): Vec4us {
        x.v = s.toShort(); y.v = s.toShort(); z.v = s.toShort(); w.v = s.toShort(); return this
    }

    fun to(s: Int): Vec4us {
        x.v = s.toShort(); y.v = s.toShort(); z.v = s.toShort(); w.v = s.toShort(); return this
    }

    fun to(x: Ushort, y: Ushort, z: Ushort, w: Ushort): Vec4us {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; this.w.v = w.v; return this
    }

    fun to(x: Short, y: Short, z: Short, w: Short): Vec4us {
        this.x.v = x; this.y.v = y; this.z.v = z; this.w.v = w; return this
    }

    fun to(x: Int, y: Int, z: Int, w: Int): Vec4us {
        this.x.v = x.toShort(); this.y.v = y.toShort(); this.z.v = z.toShort(); this.w.v = w.toShort(); return this
    }

    fun to(ba: ShortArray): Vec4us {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; w.v = ba[3]; return this
    }

    fun to(ia: IntArray): Vec4us {
        x.v = ia[0].toShort(); y.v = ia[1].toShort(); z.v = ia[2].toShort(); w.v = ia[3].toShort(); return this
    }

    fun to(ba: Array<Ushort>): Vec4us {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; w.v = ba[3].v; return this
    }

    fun to(ba: Array<Short>): Vec4us {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; w.v = ba[3]; return this
    }

    fun to(ia: Array<Int>): Vec4us {
        x.v = ia[0].toShort(); y.v = ia[1].toShort(); z.v = ia[2].toShort(); w.v = ia[3].toShort(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Ushort) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; 2 -> z.v = s.v; else -> w.v = s.v; }
    operator fun set(i: Int, s: Short) = when (i) {0 -> x.v = s; 1 -> y.v = s; 2 -> z.v = s; else -> w.v = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s.toShort(); 1 -> y.v = s.toShort(); 2 -> z.v = s.toShort(); else -> w.v = s.toShort(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4us = glm.add(Vec4us(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4us) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4us = glm.sub(Vec4us(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4us) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ushort) = glm.add(Vec4us(), this, b, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec4us(), this, b, b, b, b)
    operator fun plus(b: Vec4us) = glm.add(Vec4us(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.add(Vec4us(), this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(Vec4us(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Ushort) = glm.add(this, this, b, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.add(this, this, bX, bY, bZ, bW)
    fun addAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4us) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Ushort, res: Vec4us) = glm.add(res, this, b, b, b, b)
    fun add(b: Int, res: Vec4us) = glm.add(res, this, b, b, b, b)
    fun add(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4us, res: Vec4us) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Ushort) = glm.sub(Vec4us(), this, b, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec4us(), this, b, b, b, b)
    operator fun minus(b: Vec4us) = glm.sub(Vec4us(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.sub(Vec4us(), this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(Vec4us(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Ushort) = glm.sub(this, this, b, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.sub(this, this, bX, bY, bZ, bW)
    fun subAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4us) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Ushort, res: Vec4us) = glm.sub(res, this, b, b, b, b)
    fun sub(b: Int, res: Vec4us) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4us, res: Vec4us) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Ushort) = glm.mul(Vec4us(), this, b, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec4us(), this, b, b, b, b)
    operator fun times(b: Vec4us) = glm.mul(Vec4us(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.mul(Vec4us(), this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(Vec4us(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Ushort) = glm.mul(this, this, b, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.mul(this, this, bX, bY, bZ, bW)
    fun mulAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4us) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Ushort, res: Vec4us) = glm.mul(res, this, b, b, b, b)
    fun mul(b: Int, res: Vec4us) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4us, res: Vec4us) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Ushort) = glm.div(Vec4us(), this, b, b, b, b)
    operator fun div(b: Int) = glm.div(Vec4us(), this, b, b, b, b)
    operator fun div(b: Vec4us) = glm.div(Vec4us(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.div(Vec4us(), this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(Vec4us(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Ushort) = glm.div(this, this, b, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.div(this, this, bX, bY, bZ, bW)
    fun divAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4us) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Ushort, res: Vec4us) = glm.div(res, this, b, b, b, b)
    fun div(b: Int, res: Vec4us) = glm.div(res, this, b, b, b, b)
    fun div(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4us, res: Vec4us) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Ushort) = glm.mod(Vec4us(), this, b, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec4us(), this, b, b, b, b)
    operator fun mod(b: Vec4us) = glm.mod(Vec4us(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.mod(Vec4us(), this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(Vec4us(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Ushort) = glm.mod(this, this, b, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.mod(this, this, bX, bY, bZ, bW)
    fun modAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4us) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Ushort, res: Vec4us) = glm.mod(res, this, b, b, b, b)
    fun mod(b: Int, res: Vec4us) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4us, res: Vec4us) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ushort) = glm.and(Vec4us(), this, b, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec4us(), this, b, b, b, b)
    fun and(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.and(Vec4us(), this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(Vec4us(), this, bX, bY, bZ, bW)
    fun and(b: Vec4us) = glm.and(Vec4us(), this, b.x, b.y, b.z, b.w)

    infix inline fun andAss(b: Ushort) = glm.and(this, this, b, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.and(this, this, bX, bY, bZ, bW)
    fun andAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(this, this, bX, bY, bZ, bW)
    infix inline fun andAss(b: Vec4us) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Ushort, res: Vec4us) = glm.and(res, this, b, b, b, b)
    fun and(b: Int, res: Vec4us) = glm.and(res, this, b, b, b, b)
    fun and(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4us, res: Vec4us) = glm.and(res, this, b.x, b.y, b.z, b.w)


    inline infix fun or(b: Ushort) = glm.or(Vec4us(), this, b, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec4us(), this, b, b, b, b)
    fun or(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.or(Vec4us(), this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(Vec4us(), this, bX, bY, bZ, bW)
    fun or(b: Vec4us) = glm.or(Vec4us(), this, b.x, b.y, b.z, b.w)

    infix inline fun orAss(b: Ushort) = glm.or(this, this, b, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.or(this, this, bX, bY, bZ, bW)
    fun orAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(this, this, bX, bY, bZ, bW)
    infix inline fun orAss(b: Vec4us) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Ushort, res: Vec4us) = glm.or(res, this, b, b, b, b)
    fun or(b: Int, res: Vec4us) = glm.or(res, this, b, b, b, b)
    fun or(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4us, res: Vec4us) = glm.or(res, this, b.x, b.y, b.z, b.w)


    inline infix fun xor(b: Ushort) = glm.xor(Vec4us(), this, b, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec4us(), this, b, b, b, b)
    fun xor(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.xor(Vec4us(), this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(Vec4us(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4us) = glm.xor(Vec4us(), this, b.x, b.y, b.z, b.w)

    infix inline fun xorAss(b: Ushort) = glm.xor(this, this, b, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.xor(this, this, bX, bY, bZ, bW)
    fun xorAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(this, this, bX, bY, bZ, bW)
    infix inline fun xorAss(b: Vec4us) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Ushort, res: Vec4us) = glm.xor(res, this, b, b, b, b)
    fun xor(b: Int, res: Vec4us) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4us, res: Vec4us) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shl(b: Ushort) = glm.shl(Vec4us(), this, b, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec4us(), this, b, b, b, b)
    fun shl(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.shl(Vec4us(), this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4us(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4us) = glm.shl(Vec4us(), this, b.x, b.y, b.z, b.w)

    infix inline fun shlAss(b: Ushort) = glm.shl(this, this, b, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.shl(this, this, bX, bY, bZ, bW)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)
    infix inline fun shlAss(b: Vec4us) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Ushort, res: Vec4us) = glm.shl(res, this, b, b, b, b)
    fun shl(b: Int, res: Vec4us) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4us, res: Vec4us) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shr(b: Ushort) = glm.shr(Vec4us(), this, b, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec4us(), this, b, b, b, b)
    fun shr(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.shr(Vec4us(), this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4us(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4us) = glm.shr(Vec4us(), this, b.x, b.y, b.z, b.w)

    infix inline fun shrAss(b: Ushort) = glm.shr(this, this, b, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = glm.shr(this, this, bX, bY, bZ, bW)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)
    infix inline fun shrAss(b: Vec4us) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Ushort, res: Vec4us) = glm.shr(res, this, b, b, b, b)
    fun shr(b: Int, res: Vec4us) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort, res: Vec4us) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4us) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4us, res: Vec4us) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4us(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4us) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ushort.plus(b: Vec4us) = glm.add(Vec4us(), b, this, this, this, this)
inline infix fun Ushort.addAss(b: Vec4us) = glm.add(b, b, this, this, this, this)

operator fun Ushort.minus(b: Vec4us) = glm.sub(Vec4us(), this, this, this, this, b)
inline infix fun Ushort.subAss(b: Vec4us) = glm.sub(b, this, this, this, this, b)

operator fun Ushort.times(b: Vec4us) = glm.mul(Vec4us(), b, this, this, this, this)
inline infix fun Ushort.mulAss(b: Vec4us) = glm.mul(b, b, this, this, this, this)

operator fun Ushort.div(b: Vec4us) = glm.div(Vec4us(), this, this, this, this, b)
inline infix fun Ushort.divAss(b: Vec4us) = glm.div(b, this, this, this, this, b)

operator fun Ushort.mod(b: Vec4us) = glm.mod(Vec4us(), this, this, this, this, b)
inline infix fun Ushort.modAss(b: Vec4us) = glm.mod(b, this, this, this, this, b)


operator fun Int.plus(b: Vec4us) = glm.add(Vec4us(), b, this, this, this, this)
inline infix fun Int.addAss(b: Vec4us) = glm.add(b, b, this, this, this, this)

operator fun Int.minus(b: Vec4us) = glm.sub(Vec4us(), this, this, this, this, b)
inline infix fun Int.subAss(b: Vec4us) = glm.sub(b, this, this, this, this, b)

operator fun Int.times(b: Vec4us) = glm.mul(Vec4us(), b, this, this, this, this)
inline infix fun Int.mulAss(b: Vec4us) = glm.mul(b, b, this, this, this, this)

operator fun Int.div(b: Vec4us) = glm.div(Vec4us(), this, this, this, this, b)
inline infix fun Int.divAss(b: Vec4us) = glm.div(b, this, this, this, this, b)

operator fun Int.mod(b: Vec4us) = glm.mod(Vec4us(), this, this, this, this, b)
inline infix fun Int.modAss(b: Vec4us) = glm.mod(b, this, this, this, this, b)