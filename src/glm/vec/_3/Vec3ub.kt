package glm.vec._3

import glm.glm
import glm.vec.Vec3t
import Ubyte

/**
 * Created by elect on 09/10/16.
 */

data class Vec3ub(override var x: Ubyte = Ubyte(0), override var y: Ubyte = Ubyte(0), override var z: Ubyte = Ubyte(0)) : Vec3t<Ubyte>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(Ubyte(v.x), Ubyte(v.y), Ubyte(v.z))

    constructor(s: Ubyte) : this(s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Ubyte(s), Ubyte(s), Ubyte(s))
    constructor(x: Number, y: Number, z: Number) : this(Ubyte(x), Ubyte(y), Ubyte(z))

    constructor(ba: ByteArray) : this(Ubyte(ba[0]), Ubyte(ba[1]), Ubyte(ba[2]))

    constructor(ba: Array<Ubyte>) : this(ba[0], ba[1], ba[2])


    fun to(v: Vec3t<Number>): Vec3ub {
        x.v = v.x.toByte(); y.v = v.y.toByte(); z.v = v.z.toByte(); return this
    }

    fun to(s: Ubyte): Vec3ub {
        x.v = s.v; y.v = s.v; z.v = s.v; return this
    }

    fun to(s: Byte): Vec3ub {
        x.v = s.toByte(); y.v = s.toByte(); z.v = s.toByte(); return this
    }

    fun to(s: Int): Vec3ub {
        x.v = s.toByte(); y.v = s.toByte(); z.v = s.toByte(); return this
    }

    fun to(x: Ubyte, y: Ubyte, z: Ubyte): Vec3ub {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; return this
    }

    fun to(x: Byte, y: Byte, z: Byte): Vec3ub {
        this.x.v = x; this.y.v = y; this.z.v = z; return this
    }

    fun to(x: Int, y: Int, z: Int): Vec3ub {
        this.x.v = x.toByte(); this.y.v = y.toByte(); this.z.v = z.toByte(); return this
    }

    fun to(ba: ByteArray): Vec3ub {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; return this
    }

    fun to(ia: IntArray): Vec3ub {
        x.v = ia[0].toByte(); y.v = ia[1].toByte(); z.v = ia[2].toByte(); return this
    }

    fun to(ba: Array<Ubyte>): Vec3ub {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; return this
    }

    fun to(ba: Array<Byte>): Vec3ub {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; return this
    }

    fun to(ia: Array<Int>): Vec3ub {
        x.v = ia[0].toByte(); y.v = ia[1].toByte(); z.v = ia[2].toByte(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Ubyte) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; else -> z.v = s.v; }
    operator fun set(i: Int, s: Byte) = when (i) {0 -> x.v = s; 1 -> y.v = s; else -> z.v = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s.toByte(); 1 -> y.v = s.toByte(); else -> z.v = s.toByte(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3ub = glm.add(Vec3ub(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3ub) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3ub = glm.sub(Vec3ub(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3ub) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ubyte) = glm.add(Vec3ub(), this, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec3ub(), this, b, b, b)
    operator fun plus(b: Vec3ub) = glm.add(Vec3ub(), this, b.x, b.y, b.z)

    fun add(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.add(Vec3ub(), this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int) = glm.add(Vec3ub(), this, bX, bY, bZ)

    infix inline fun addAss(b: Ubyte) = glm.add(this, this, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b)
    fun addAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.add(this, this, bX, bY, bZ)
    fun addAss(bX: Int, bY: Int, bZ: Int) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3ub) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Ubyte, res: Vec3ub) = glm.add(res, this, b, b, b)
    fun add(b: Int, res: Vec3ub) = glm.add(res, this, b, b, b)
    fun add(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.add(res, this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3ub, res: Vec3ub) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Ubyte) = glm.sub(Vec3ub(), this, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec3ub(), this, b, b, b)
    operator fun minus(b: Vec3ub) = glm.sub(Vec3ub(), this, b.x, b.y, b.z)

    fun sub(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.sub(Vec3ub(), this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int) = glm.sub(Vec3ub(), this, bX, bY, bZ)

    infix inline fun subAss(b: Ubyte) = glm.sub(this, this, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.sub(this, this, bX, bY, bZ)
    fun subAss(bX: Int, bY: Int, bZ: Int) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3ub) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Ubyte, res: Vec3ub) = glm.sub(res, this, b, b, b)
    fun sub(b: Int, res: Vec3ub) = glm.sub(res, this, b, b, b)
    fun sub(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.sub(res, this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3ub, res: Vec3ub) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Ubyte) = glm.mul(Vec3ub(), this, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec3ub(), this, b, b, b)
    operator fun times(b: Vec3ub) = glm.mul(Vec3ub(), this, b.x, b.y, b.z)

    fun mul(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.mul(Vec3ub(), this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int) = glm.mul(Vec3ub(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Ubyte) = glm.mul(this, this, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.mul(this, this, bX, bY, bZ)
    fun mulAss(bX: Int, bY: Int, bZ: Int) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3ub) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Ubyte, res: Vec3ub) = glm.mul(res, this, b, b, b)
    fun mul(b: Int, res: Vec3ub) = glm.mul(res, this, b, b, b)
    fun mul(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.mul(res, this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3ub, res: Vec3ub) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Ubyte) = glm.div(Vec3ub(), this, b, b, b)
    operator fun div(b: Int) = glm.div(Vec3ub(), this, b, b, b)
    operator fun div(b: Vec3ub) = glm.div(Vec3ub(), this, b.x, b.y, b.z)

    fun div(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.div(Vec3ub(), this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int) = glm.div(Vec3ub(), this, bX, bY, bZ)

    infix inline fun divAss(b: Ubyte) = glm.div(this, this, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b)
    fun divAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.div(this, this, bX, bY, bZ)
    fun divAss(bX: Int, bY: Int, bZ: Int) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3ub) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Ubyte, res: Vec3ub) = glm.div(res, this, b, b, b)
    fun div(b: Int, res: Vec3ub) = glm.div(res, this, b, b, b)
    fun div(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.div(res, this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3ub, res: Vec3ub) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Ubyte) = glm.mod(Vec3ub(), this, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec3ub(), this, b, b, b)
    operator fun mod(b: Vec3ub) = glm.mod(Vec3ub(), this, b.x, b.y, b.z)

    fun mod(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.mod(Vec3ub(), this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int) = glm.mod(Vec3ub(), this, bX, bY, bZ)

    infix inline fun modAss(b: Ubyte) = glm.mod(this, this, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.mod(this, this, bX, bY, bZ)
    fun modAss(bX: Int, bY: Int, bZ: Int) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3ub) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Ubyte, res: Vec3ub) = glm.mod(res, this, b, b, b)
    fun mod(b: Int, res: Vec3ub) = glm.mod(res, this, b, b, b)
    fun mod(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.mod(res, this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3ub, res: Vec3ub) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ubyte) = glm.and(Vec3ub(), this, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec3ub(), this, b, b, b)
    fun and(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.and(Vec3ub(), this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int) = glm.and(Vec3ub(), this, bX, bY, bZ)
    fun and(b: Vec3ub) = glm.and(Vec3ub(), this, b.x, b.y, b.z)

    infix inline fun andAss(b: Ubyte) = glm.and(this, this, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b)
    fun andAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.and(this, this, bX, bY, bZ)
    fun andAss(bX: Int, bY: Int, bZ: Int) = glm.and(this, this, bX, bY, bZ)
    infix inline fun andAss(b: Vec3ub) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Ubyte, res: Vec3ub) = glm.and(res, this, b, b, b)
    fun and(b: Int, res: Vec3ub) = glm.and(res, this, b, b, b)
    fun and(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.and(res, this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3ub, res: Vec3ub) = glm.and(res, this, b.x, b.y, b.z)


    inline infix fun or(b: Ubyte) = glm.or(Vec3ub(), this, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec3ub(), this, b, b, b)
    fun or(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.or(Vec3ub(), this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int) = glm.or(Vec3ub(), this, bX, bY, bZ)
    fun or(b: Vec3ub) = glm.or(Vec3ub(), this, b.x, b.y, b.z)

    infix inline fun orAss(b: Ubyte) = glm.or(this, this, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b)
    fun orAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.or(this, this, bX, bY, bZ)
    fun orAss(bX: Int, bY: Int, bZ: Int) = glm.or(this, this, bX, bY, bZ)
    infix inline fun orAss(b: Vec3ub) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Ubyte, res: Vec3ub) = glm.or(res, this, b, b, b)
    fun or(b: Int, res: Vec3ub) = glm.or(res, this, b, b, b)
    fun or(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.or(res, this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3ub, res: Vec3ub) = glm.or(res, this, b.x, b.y, b.z)


    inline infix fun xor(b: Ubyte) = glm.xor(Vec3ub(), this, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec3ub(), this, b, b, b)
    fun xor(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.xor(Vec3ub(), this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int) = glm.xor(Vec3ub(), this, bX, bY, bZ)
    fun xor(b: Vec3ub) = glm.xor(Vec3ub(), this, b.x, b.y, b.z)

    infix inline fun xorAss(b: Ubyte) = glm.xor(this, this, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.xor(this, this, bX, bY, bZ)
    fun xorAss(bX: Int, bY: Int, bZ: Int) = glm.xor(this, this, bX, bY, bZ)
    infix inline fun xorAss(b: Vec3ub) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Ubyte, res: Vec3ub) = glm.xor(res, this, b, b, b)
    fun xor(b: Int, res: Vec3ub) = glm.xor(res, this, b, b, b)
    fun xor(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.xor(res, this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3ub, res: Vec3ub) = glm.xor(res, this, b.x, b.y, b.z)


    inline infix fun shl(b: Ubyte) = glm.shl(Vec3ub(), this, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec3ub(), this, b, b, b)
    fun shl(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.shl(Vec3ub(), this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3ub(), this, bX, bY, bZ)
    fun shl(b: Vec3ub) = glm.shl(Vec3ub(), this, b.x, b.y, b.z)

    infix inline fun shlAss(b: Ubyte) = glm.shl(this, this, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.shl(this, this, bX, bY, bZ)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)
    infix inline fun shlAss(b: Vec3ub) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Ubyte, res: Vec3ub) = glm.shl(res, this, b, b, b)
    fun shl(b: Int, res: Vec3ub) = glm.shl(res, this, b, b, b)
    fun shl(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.shl(res, this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3ub, res: Vec3ub) = glm.shl(res, this, b.x, b.y, b.z)


    inline infix fun shr(b: Ubyte) = glm.shr(Vec3ub(), this, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec3ub(), this, b, b, b)
    fun shr(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.shr(Vec3ub(), this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3ub(), this, bX, bY, bZ)
    fun shr(b: Vec3ub) = glm.shr(Vec3ub(), this, b.x, b.y, b.z)

    infix inline fun shrAss(b: Ubyte) = glm.shr(this, this, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Ubyte, bY: Ubyte, bZ: Ubyte) = glm.shr(this, this, bX, bY, bZ)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)
    infix inline fun shrAss(b: Vec3ub) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Ubyte, res: Vec3ub) = glm.shr(res, this, b, b, b)
    fun shr(b: Int, res: Vec3ub) = glm.shr(res, this, b, b, b)
    fun shr(bX: Ubyte, bY: Ubyte, bZ: Ubyte, res: Vec3ub) = glm.shr(res, this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3ub) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3ub, res: Vec3ub) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3ub(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3ub) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ubyte.plus(b: Vec3ub) = glm.add(Vec3ub(), b, this, this, this)
inline infix fun Ubyte.addAss(b: Vec3ub) = glm.add(b, b, this, this, this)

operator fun Ubyte.minus(b: Vec3ub) = glm.sub(Vec3ub(), this, this, this, b)
inline infix fun Ubyte.subAss(b: Vec3ub) = glm.sub(b, this, this, this, b)

operator fun Ubyte.times(b: Vec3ub) = glm.mul(Vec3ub(), b, this, this, this)
inline infix fun Ubyte.mulAss(b: Vec3ub) = glm.mul(b, b, this, this, this)

operator fun Ubyte.div(b: Vec3ub) = glm.div(Vec3ub(), this, this, this, b)
inline infix fun Ubyte.divAss(b: Vec3ub) = glm.div(b, this, this, this, b)

operator fun Ubyte.mod(b: Vec3ub) = glm.mod(Vec3ub(), this, this, this, b)
inline infix fun Ubyte.modAss(b: Vec3ub) = glm.mod(b, this, this, this, b)


operator fun Int.plus(b: Vec3ub) = glm.add(Vec3ub(), b, this, this, this)
inline infix fun Int.addAss(b: Vec3ub) = glm.add(b, b, this, this, this)

operator fun Int.minus(b: Vec3ub) = glm.sub(Vec3ub(), this, this, this, b)
inline infix fun Int.subAss(b: Vec3ub) = glm.sub(b, this, this, this, b)

operator fun Int.times(b: Vec3ub) = glm.mul(Vec3ub(), b, this, this, this)
inline infix fun Int.mulAss(b: Vec3ub) = glm.mul(b, b, this, this, this)

operator fun Int.div(b: Vec3ub) = glm.div(Vec3ub(), this, this, this, b)
inline infix fun Int.divAss(b: Vec3ub) = glm.div(b, this, this, this, b)

operator fun Int.mod(b: Vec3ub) = glm.mod(Vec3ub(), this, this, this, b)
inline infix fun Int.modAss(b: Vec3ub) = glm.mod(b, this, this, this, b)