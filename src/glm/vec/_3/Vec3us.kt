package glm.vec._3

import glm.glm
import Ushort
import glm.vec.Vec3t

/**
 * Created by elect on 09/10/16.
 */

data class Vec3us(override var x: Ushort = Ushort(0), override var y: Ushort = Ushort(0), override var z: Ushort = Ushort(0)) : Vec3t<Ushort>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(Ushort(v.x), Ushort(v.y), Ushort(v.z))

    constructor(s: Ushort) : this(s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Ushort(s), Ushort(s), Ushort(s))

    constructor(ba: ShortArray) : this(Ushort(ba[0]), Ushort(ba[1]), Ushort(ba[2]))

    constructor(ba: Array<Ushort>) : this(ba[0], ba[1], ba[2])


    fun to(v: Vec3t<Number>): Vec3us {
        x.v = v.x.toShort(); y.v = v.y.toShort(); z.v = v.z.toShort(); return this
    }

    fun to(s: Ushort): Vec3us {
        x.v = s.v; y.v = s.v; z.v = s.v; return this
    }

    fun to(s: Short): Vec3us {
        x.v = s.toShort(); y.v = s.toShort(); z.v = s.toShort(); return this
    }

    fun to(s: Int): Vec3us {
        x.v = s.toShort(); y.v = s.toShort(); z.v = s.toShort(); return this
    }

    fun to(x: Ushort, y: Ushort, z: Ushort): Vec3us {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; return this
    }

    fun to(x: Short, y: Short, z: Short): Vec3us {
        this.x.v = x; this.y.v = y; this.z.v = z; return this
    }

    fun to(x: Int, y: Int, z: Int): Vec3us {
        this.x.v = x.toShort(); this.y.v = y.toShort(); this.z.v = z.toShort(); return this
    }

    fun to(ba: ShortArray): Vec3us {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; return this
    }

    fun to(ia: IntArray): Vec3us {
        x.v = ia[0].toShort(); y.v = ia[1].toShort(); z.v = ia[2].toShort(); return this
    }

    fun to(ba: Array<Ushort>): Vec3us {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; return this
    }

    fun to(ba: Array<Short>): Vec3us {
        x.v = ba[0]; y.v = ba[1]; z.v = ba[2]; return this
    }

    fun to(ia: Array<Int>): Vec3us {
        x.v = ia[0].toShort(); y.v = ia[1].toShort(); z.v = ia[2].toShort(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Ushort) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; else -> z.v = s.v; }
    operator fun set(i: Int, s: Short) = when (i) {0 -> x.v = s; 1 -> y.v = s; else -> z.v = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s.toShort(); 1 -> y.v = s.toShort(); else -> z.v = s.toShort(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3us = glm.add(Vec3us(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3us) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3us = glm.sub(Vec3us(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3us) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ushort) = glm.add(Vec3us(), this, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec3us(), this, b, b, b)
    operator fun plus(b: Vec3us) = glm.add(Vec3us(), this, b.x, b.y, b.z)

    fun add(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.add(Vec3us(), this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int) = glm.add(Vec3us(), this, bX, bY, bZ)

    infix inline fun addAss(b: Ushort) = glm.add(this, this, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b)
    fun addAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.add(this, this, bX, bY, bZ)
    fun addAss(bX: Int, bY: Int, bZ: Int) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3us) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Ushort, res: Vec3us) = glm.add(res, this, b, b, b)
    fun add(b: Int, res: Vec3us) = glm.add(res, this, b, b, b)
    fun add(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.add(res, this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3us, res: Vec3us) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Ushort) = glm.sub(Vec3us(), this, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec3us(), this, b, b, b)
    operator fun minus(b: Vec3us) = glm.sub(Vec3us(), this, b.x, b.y, b.z)

    fun sub(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.sub(Vec3us(), this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int) = glm.sub(Vec3us(), this, bX, bY, bZ)

    infix inline fun subAss(b: Ushort) = glm.sub(this, this, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.sub(this, this, bX, bY, bZ)
    fun subAss(bX: Int, bY: Int, bZ: Int) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3us) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Ushort, res: Vec3us) = glm.sub(res, this, b, b, b)
    fun sub(b: Int, res: Vec3us) = glm.sub(res, this, b, b, b)
    fun sub(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.sub(res, this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3us, res: Vec3us) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Ushort) = glm.mul(Vec3us(), this, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec3us(), this, b, b, b)
    operator fun times(b: Vec3us) = glm.mul(Vec3us(), this, b.x, b.y, b.z)

    fun mul(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.mul(Vec3us(), this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int) = glm.mul(Vec3us(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Ushort) = glm.mul(this, this, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.mul(this, this, bX, bY, bZ)
    fun mulAss(bX: Int, bY: Int, bZ: Int) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3us) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Ushort, res: Vec3us) = glm.mul(res, this, b, b, b)
    fun mul(b: Int, res: Vec3us) = glm.mul(res, this, b, b, b)
    fun mul(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.mul(res, this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3us, res: Vec3us) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Ushort) = glm.div(Vec3us(), this, b, b, b)
    operator fun div(b: Int) = glm.div(Vec3us(), this, b, b, b)
    operator fun div(b: Vec3us) = glm.div(Vec3us(), this, b.x, b.y, b.z)

    fun div(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.div(Vec3us(), this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int) = glm.div(Vec3us(), this, bX, bY, bZ)

    infix inline fun divAss(b: Ushort) = glm.div(this, this, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b)
    fun divAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.div(this, this, bX, bY, bZ)
    fun divAss(bX: Int, bY: Int, bZ: Int) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3us) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Ushort, res: Vec3us) = glm.div(res, this, b, b, b)
    fun div(b: Int, res: Vec3us) = glm.div(res, this, b, b, b)
    fun div(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.div(res, this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3us, res: Vec3us) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Ushort) = glm.mod(Vec3us(), this, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec3us(), this, b, b, b)
    operator fun mod(b: Vec3us) = glm.mod(Vec3us(), this, b.x, b.y, b.z)

    fun mod(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.mod(Vec3us(), this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int) = glm.mod(Vec3us(), this, bX, bY, bZ)

    infix inline fun modAss(b: Ushort) = glm.mod(this, this, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.mod(this, this, bX, bY, bZ)
    fun modAss(bX: Int, bY: Int, bZ: Int) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3us) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Ushort, res: Vec3us) = glm.mod(res, this, b, b, b)
    fun mod(b: Int, res: Vec3us) = glm.mod(res, this, b, b, b)
    fun mod(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.mod(res, this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3us, res: Vec3us) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ushort) = glm.and(Vec3us(), this, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec3us(), this, b, b, b)
    fun and(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.and(Vec3us(), this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int) = glm.and(Vec3us(), this, bX, bY, bZ)
    fun and(b: Vec3us) = glm.and(Vec3us(), this, b.x, b.y, b.z)

    infix inline fun andAss(b: Ushort) = glm.and(this, this, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b)
    fun andAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.and(this, this, bX, bY, bZ)
    fun andAss(bX: Int, bY: Int, bZ: Int) = glm.and(this, this, bX, bY, bZ)
    infix inline fun andAss(b: Vec3us) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Ushort, res: Vec3us) = glm.and(res, this, b, b, b)
    fun and(b: Int, res: Vec3us) = glm.and(res, this, b, b, b)
    fun and(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.and(res, this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3us, res: Vec3us) = glm.and(res, this, b.x, b.y, b.z)


    inline infix fun or(b: Ushort) = glm.or(Vec3us(), this, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec3us(), this, b, b, b)
    fun or(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.or(Vec3us(), this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int) = glm.or(Vec3us(), this, bX, bY, bZ)
    fun or(b: Vec3us) = glm.or(Vec3us(), this, b.x, b.y, b.z)

    infix inline fun orAss(b: Ushort) = glm.or(this, this, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b)
    fun orAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.or(this, this, bX, bY, bZ)
    fun orAss(bX: Int, bY: Int, bZ: Int) = glm.or(this, this, bX, bY, bZ)
    infix inline fun orAss(b: Vec3us) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Ushort, res: Vec3us) = glm.or(res, this, b, b, b)
    fun or(b: Int, res: Vec3us) = glm.or(res, this, b, b, b)
    fun or(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.or(res, this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3us, res: Vec3us) = glm.or(res, this, b.x, b.y, b.z)


    inline infix fun xor(b: Ushort) = glm.xor(Vec3us(), this, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec3us(), this, b, b, b)
    fun xor(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.xor(Vec3us(), this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int) = glm.xor(Vec3us(), this, bX, bY, bZ)
    fun xor(b: Vec3us) = glm.xor(Vec3us(), this, b.x, b.y, b.z)

    infix inline fun xorAss(b: Ushort) = glm.xor(this, this, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.xor(this, this, bX, bY, bZ)
    fun xorAss(bX: Int, bY: Int, bZ: Int) = glm.xor(this, this, bX, bY, bZ)
    infix inline fun xorAss(b: Vec3us) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Ushort, res: Vec3us) = glm.xor(res, this, b, b, b)
    fun xor(b: Int, res: Vec3us) = glm.xor(res, this, b, b, b)
    fun xor(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.xor(res, this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3us, res: Vec3us) = glm.xor(res, this, b.x, b.y, b.z)


    inline infix fun shl(b: Ushort) = glm.shl(Vec3us(), this, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec3us(), this, b, b, b)
    fun shl(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.shl(Vec3us(), this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3us(), this, bX, bY, bZ)
    fun shl(b: Vec3us) = glm.shl(Vec3us(), this, b.x, b.y, b.z)

    infix inline fun shlAss(b: Ushort) = glm.shl(this, this, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.shl(this, this, bX, bY, bZ)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)
    infix inline fun shlAss(b: Vec3us) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Ushort, res: Vec3us) = glm.shl(res, this, b, b, b)
    fun shl(b: Int, res: Vec3us) = glm.shl(res, this, b, b, b)
    fun shl(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.shl(res, this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3us, res: Vec3us) = glm.shl(res, this, b.x, b.y, b.z)


    inline infix fun shr(b: Ushort) = glm.shr(Vec3us(), this, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec3us(), this, b, b, b)
    fun shr(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.shr(Vec3us(), this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3us(), this, bX, bY, bZ)
    fun shr(b: Vec3us) = glm.shr(Vec3us(), this, b.x, b.y, b.z)

    infix inline fun shrAss(b: Ushort) = glm.shr(this, this, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Ushort, bY: Ushort, bZ: Ushort) = glm.shr(this, this, bX, bY, bZ)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)
    infix inline fun shrAss(b: Vec3us) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Ushort, res: Vec3us) = glm.shr(res, this, b, b, b)
    fun shr(b: Int, res: Vec3us) = glm.shr(res, this, b, b, b)
    fun shr(bX: Ushort, bY: Ushort, bZ: Ushort, res: Vec3us) = glm.shr(res, this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3us) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3us, res: Vec3us) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3us(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3us) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ushort.plus(b: Vec3us) = glm.add(Vec3us(), b, this, this, this)
inline infix fun Ushort.addAss(b: Vec3us) = glm.add(b, b, this, this, this)

operator fun Ushort.minus(b: Vec3us) = glm.sub(Vec3us(), this, this, this, b)
inline infix fun Ushort.subAss(b: Vec3us) = glm.sub(b, this, this, this, b)

operator fun Ushort.times(b: Vec3us) = glm.mul(Vec3us(), b, this, this, this)
inline infix fun Ushort.mulAss(b: Vec3us) = glm.mul(b, b, this, this, this)

operator fun Ushort.div(b: Vec3us) = glm.div(Vec3us(), this, this, this, b)
inline infix fun Ushort.divAss(b: Vec3us) = glm.div(b, this, this, this, b)

operator fun Ushort.mod(b: Vec3us) = glm.mod(Vec3us(), this, this, this, b)
inline infix fun Ushort.modAss(b: Vec3us) = glm.mod(b, this, this, this, b)


operator fun Int.plus(b: Vec3us) = glm.add(Vec3us(), b, this, this, this)
inline infix fun Int.addAss(b: Vec3us) = glm.add(b, b, this, this, this)

operator fun Int.minus(b: Vec3us) = glm.sub(Vec3us(), this, this, this, b)
inline infix fun Int.subAss(b: Vec3us) = glm.sub(b, this, this, this, b)

operator fun Int.times(b: Vec3us) = glm.mul(Vec3us(), b, this, this, this)
inline infix fun Int.mulAss(b: Vec3us) = glm.mul(b, b, this, this, this)

operator fun Int.div(b: Vec3us) = glm.div(Vec3us(), this, this, this, b)
inline infix fun Int.divAss(b: Vec3us) = glm.div(b, this, this, this, b)

operator fun Int.mod(b: Vec3us) = glm.mod(Vec3us(), this, this, this, b)
inline infix fun Int.modAss(b: Vec3us) = glm.mod(b, this, this, this, b)