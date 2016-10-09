package glm.vec._4

import glm.glm
import Ubyte
import glm.vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4ub(override var x: Ubyte = Ubyte(0), override var y: Ubyte = Ubyte(0), override var z: Ubyte = Ubyte(0), override var w: Ubyte = Ubyte(0)) : Vec4t<Ubyte>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(Ubyte(v.x), Ubyte(v.y), Ubyte(v.z), Ubyte(v.z))

    constructor(s: Ubyte) : this(s.copy(), s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Ubyte(s), Ubyte(s), Ubyte(s), Ubyte(s))

    constructor(ba: ByteArray) : this(Ubyte(ba[0]), Ubyte(ba[1]), Ubyte(ba[2]), Ubyte(ba[3]))

    constructor(ba: Array<Ubyte>) : this(ba[0], ba[1], ba[2], ba[3])


    fun to(v: Vec4t<Number>): Vec4ub {
        x.v = v.x.toByte(); y.v = v.y.toByte(); z.v = v.z.toByte(); w.v = v.w.toByte(); return this
    }

    fun to(s: Ubyte): Vec4ub {
        x.v = s.v; y.v = s.v; z.v = s.v; w.v = s.v; return this
    }

    fun to(s: Byte): Vec4ub {
        x.v = s.toByte(); y.v = s.toByte(); z.v = s.toByte(); w.v = s.toByte(); return this
    }

    fun to(s: Int): Vec4ub {
        x.v = s.toByte(); y.v = s.toByte(); z.v = s.toByte(); w.v = s.toByte(); return this
    }

    fun to(x: Ubyte, y: Ubyte, z: Ubyte, w: Ubyte): Vec4ub {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; this.w.v = w.v; return this
    }

    fun to(x: Byte, y: Byte, z: Byte, w: Byte): Vec4ub {
        this.x.v = x; this.y.v = y; this.z.v = z; this.w.v = w; return this
    }

    fun to(x: Int, y: Int, z: Int, w: Int): Vec4ub {
        this.x.v = x.toByte(); this.y.v = y.toByte(); this.z.v = z.toByte(); this.w.v = w.toByte(); return this
    }

    fun to(ba: ByteArray): Vec4ub {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; w.v = ba[3]; return this
    }

    fun to(ia: IntArray): Vec4ub {
        x.v = ia[0].toByte(); y.v = ia[1].toByte(); z.v = ia[2].toByte(); w.v = ia[3].toByte(); return this
    }

    fun to(ba: Array<Ubyte>): Vec4ub {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; w.v = ba[3].v; return this
    }

    fun to(ba: Array<Byte>): Vec4ub {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; w.v = ba[3]; return this
    }

    fun to(ia: Array<Int>): Vec4ub {
        x.v = ia[0].toByte(); y.v = ia[1].toByte(); z.v = ia[2].toByte(); w.v = ia[3].toByte(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Ubyte) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; 2 -> z.v = s.v; else -> w.v = s.v; }
    operator fun set(i: Int, s: Byte) = when (i) {0 -> x.v = s; 1 -> y.v = s; 2 -> z.v = s; else -> w.v = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s.toByte(); 1 -> y.v = s.toByte(); 2 -> z.v = s.toByte(); else -> w.v = s.toByte(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4ub = glm.add(Vec4ub(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4ub) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4ub = glm.sub(Vec4ub(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4ub) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ubyte) = glm.add(Vec4ub(), this, b, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec4ub(), this, b, b, b, b)
    operator fun plus(b: Vec4ub) = glm.add(Vec4ub(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.add(Vec4ub(), this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(Vec4ub(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Ubyte) = glm.add(this, this, b, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.add(this, this, bX, bY, bZ, bW)
    fun addAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4ub) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Ubyte, res: Vec4ub) = glm.add(res, this, b, b, b, b)
    fun add(b: Int, res: Vec4ub) = glm.add(res, this, b, b, b, b)
    fun add(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4ub, res: Vec4ub) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Ubyte) = glm.sub(Vec4ub(), this, b, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec4ub(), this, b, b, b, b)
    operator fun minus(b: Vec4ub) = glm.sub(Vec4ub(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.sub(Vec4ub(), this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(Vec4ub(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Ubyte) = glm.sub(this, this, b, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.sub(this, this, bX, bY, bZ, bW)
    fun subAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4ub) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Ubyte, res: Vec4ub) = glm.sub(res, this, b, b, b, b)
    fun sub(b: Int, res: Vec4ub) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4ub, res: Vec4ub) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Ubyte) = glm.mul(Vec4ub(), this, b, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec4ub(), this, b, b, b, b)
    operator fun times(b: Vec4ub) = glm.mul(Vec4ub(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.mul(Vec4ub(), this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(Vec4ub(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Ubyte) = glm.mul(this, this, b, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.mul(this, this, bX, bY, bZ, bW)
    fun mulAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4ub) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Ubyte, res: Vec4ub) = glm.mul(res, this, b, b, b, b)
    fun mul(b: Int, res: Vec4ub) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4ub, res: Vec4ub) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Ubyte) = glm.div(Vec4ub(), this, b, b, b, b)
    operator fun div(b: Int) = glm.div(Vec4ub(), this, b, b, b, b)
    operator fun div(b: Vec4ub) = glm.div(Vec4ub(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.div(Vec4ub(), this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(Vec4ub(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Ubyte) = glm.div(this, this, b, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.div(this, this, bX, bY, bZ, bW)
    fun divAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4ub) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Ubyte, res: Vec4ub) = glm.div(res, this, b, b, b, b)
    fun div(b: Int, res: Vec4ub) = glm.div(res, this, b, b, b, b)
    fun div(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4ub, res: Vec4ub) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Ubyte) = glm.mod(Vec4ub(), this, b, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec4ub(), this, b, b, b, b)
    operator fun mod(b: Vec4ub) = glm.mod(Vec4ub(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.mod(Vec4ub(), this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(Vec4ub(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Ubyte) = glm.mod(this, this, b, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.mod(this, this, bX, bY, bZ, bW)
    fun modAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4ub) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Ubyte, res: Vec4ub) = glm.mod(res, this, b, b, b, b)
    fun mod(b: Int, res: Vec4ub) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4ub, res: Vec4ub) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ubyte) = glm.and(Vec4ub(), this, b, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec4ub(), this, b, b, b, b)
    fun and(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.and(Vec4ub(), this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(Vec4ub(), this, bX, bY, bZ, bW)
    fun and(b: Vec4ub) = glm.and(Vec4ub(), this, b.x, b.y, b.z, b.w)

    infix inline fun andAss(b: Ubyte) = glm.and(this, this, b, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.and(this, this, bX, bY, bZ, bW)
    fun andAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(this, this, bX, bY, bZ, bW)
    infix inline fun andAss(b: Vec4ub) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Ubyte, res: Vec4ub) = glm.and(res, this, b, b, b, b)
    fun and(b: Int, res: Vec4ub) = glm.and(res, this, b, b, b, b)
    fun and(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4ub, res: Vec4ub) = glm.and(res, this, b.x, b.y, b.z, b.w)


    inline infix fun or(b: Ubyte) = glm.or(Vec4ub(), this, b, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec4ub(), this, b, b, b, b)
    fun or(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.or(Vec4ub(), this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(Vec4ub(), this, bX, bY, bZ, bW)
    fun or(b: Vec4ub) = glm.or(Vec4ub(), this, b.x, b.y, b.z, b.w)

    infix inline fun orAss(b: Ubyte) = glm.or(this, this, b, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.or(this, this, bX, bY, bZ, bW)
    fun orAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(this, this, bX, bY, bZ, bW)
    infix inline fun orAss(b: Vec4ub) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Ubyte, res: Vec4ub) = glm.or(res, this, b, b, b, b)
    fun or(b: Int, res: Vec4ub) = glm.or(res, this, b, b, b, b)
    fun or(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4ub, res: Vec4ub) = glm.or(res, this, b.x, b.y, b.z, b.w)


    inline infix fun xor(b: Ubyte) = glm.xor(Vec4ub(), this, b, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec4ub(), this, b, b, b, b)
    fun xor(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.xor(Vec4ub(), this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(Vec4ub(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4ub) = glm.xor(Vec4ub(), this, b.x, b.y, b.z, b.w)

    infix inline fun xorAss(b: Ubyte) = glm.xor(this, this, b, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.xor(this, this, bX, bY, bZ, bW)
    fun xorAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(this, this, bX, bY, bZ, bW)
    infix inline fun xorAss(b: Vec4ub) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Ubyte, res: Vec4ub) = glm.xor(res, this, b, b, b, b)
    fun xor(b: Int, res: Vec4ub) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4ub, res: Vec4ub) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shl(b: Ubyte) = glm.shl(Vec4ub(), this, b, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec4ub(), this, b, b, b, b)
    fun shl(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.shl(Vec4ub(), this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4ub(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4ub) = glm.shl(Vec4ub(), this, b.x, b.y, b.z, b.w)

    infix inline fun shlAss(b: Ubyte) = glm.shl(this, this, b, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.shl(this, this, bX, bY, bZ, bW)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)
    infix inline fun shlAss(b: Vec4ub) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Ubyte, res: Vec4ub) = glm.shl(res, this, b, b, b, b)
    fun shl(b: Int, res: Vec4ub) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4ub, res: Vec4ub) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shr(b: Ubyte) = glm.shr(Vec4ub(), this, b, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec4ub(), this, b, b, b, b)
    fun shr(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.shr(Vec4ub(), this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4ub(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4ub) = glm.shr(Vec4ub(), this, b.x, b.y, b.z, b.w)

    infix inline fun shrAss(b: Ubyte) = glm.shr(this, this, b, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = glm.shr(this, this, bX, bY, bZ, bW)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)
    infix inline fun shrAss(b: Vec4ub) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Ubyte, res: Vec4ub) = glm.shr(res, this, b, b, b, b)
    fun shr(b: Int, res: Vec4ub) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte, res: Vec4ub) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ub) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4ub, res: Vec4ub) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4ub(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4ub) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ubyte.plus(b: Vec4ub) = glm.add(Vec4ub(), b, this, this, this, this)
inline infix fun Ubyte.addAss(b: Vec4ub) = glm.add(b, b, this, this, this, this)

operator fun Ubyte.minus(b: Vec4ub) = glm.sub(Vec4ub(), this, this, this, this, b)
inline infix fun Ubyte.subAss(b: Vec4ub) = glm.sub(b, this, this, this, this, b)

operator fun Ubyte.times(b: Vec4ub) = glm.mul(Vec4ub(), b, this, this, this, this)
inline infix fun Ubyte.mulAss(b: Vec4ub) = glm.mul(b, b, this, this, this, this)

operator fun Ubyte.div(b: Vec4ub) = glm.div(Vec4ub(), this, this, this, this, b)
inline infix fun Ubyte.divAss(b: Vec4ub) = glm.div(b, this, this, this, this, b)

operator fun Ubyte.mod(b: Vec4ub) = glm.mod(Vec4ub(), this, this, this, this, b)
inline infix fun Ubyte.modAss(b: Vec4ub) = glm.mod(b, this, this, this, this, b)


operator fun Int.plus(b: Vec4ub) = glm.add(Vec4ub(), b, this, this, this, this)
inline infix fun Int.addAss(b: Vec4ub) = glm.add(b, b, this, this, this, this)

operator fun Int.minus(b: Vec4ub) = glm.sub(Vec4ub(), this, this, this, this, b)
inline infix fun Int.subAss(b: Vec4ub) = glm.sub(b, this, this, this, this, b)

operator fun Int.times(b: Vec4ub) = glm.mul(Vec4ub(), b, this, this, this, this)
inline infix fun Int.mulAss(b: Vec4ub) = glm.mul(b, b, this, this, this, this)

operator fun Int.div(b: Vec4ub) = glm.div(Vec4ub(), this, this, this, this, b)
inline infix fun Int.divAss(b: Vec4ub) = glm.div(b, this, this, this, this, b)

operator fun Int.mod(b: Vec4ub) = glm.mod(Vec4ub(), this, this, this, this, b)
inline infix fun Int.modAss(b: Vec4ub) = glm.mod(b, this, this, this, this, b)