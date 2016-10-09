package vec._3

import vec.Vec3t
import Ulong

/**
 * Created by elect on 09/10/16.
 */

data class Vec3ul(override var x: Ulong = Ulong(0), override var y: Ulong = Ulong(0), override var z: Ulong = Ulong(0)) : Vec3t<Ulong>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(Ulong(v.x), Ulong(v.y), Ulong(v.z))

    constructor(s: Ulong) : this(s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Ulong(s), Ulong(s), Ulong(s))

    constructor(ba: ByteArray) : this(Ulong(ba[0]), Ulong(ba[1]), Ulong(ba[2]))

    constructor(ba: Array<Ulong>) : this(ba[0], ba[1], ba[2])


    fun to(v: Vec3t<Number>): Vec3ul {
        x.v = v.x.toLong(); y.v = v.y.toLong(); z.v = v.z.toLong(); return this
    }

    fun to(s: Ulong): Vec3ul {
        x.v = s.v; y.v = s.v; z.v = s.v; return this
    }

    fun to(s: Long): Vec3ul {
        x.v = s; y.v = s; z.v = s; return this
    }

    fun to(x: Ulong, y: Ulong, z: Ulong): Vec3ul {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; return this
    }

    fun to(x: Long, y: Long, z: Long): Vec3ul {
        this.x.v = x; this.y.v = y; this.z.v = z; return this
    }

    fun to(ia: LongArray): Vec3ul {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; return this
    }

    fun to(ba: Array<Ulong>): Vec3ul {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; return this
    }


    fun to(ia: Array<Long>): Vec3ul {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Ulong) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; else -> z.v = s.v; }
    operator fun set(i: Int, s: Long) = when (i) {0 -> x.v = s; 1 -> y.v = s; else -> z.v = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3ul = glm.add(Vec3ul(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3ul) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3ul = glm.sub(Vec3ul(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3ul) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ulong) = glm.add(Vec3ul(), this, b, b, b)
    operator fun plus(b: Long) = glm.add(Vec3ul(), this, b, b, b)
    operator fun plus(b: Vec3ul) = glm.add(Vec3ul(), this, b.x, b.y, b.z)

    fun add(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.add(Vec3ul(), this, bX, bY, bZ)
    fun add(bX: Long, bY: Long, bZ: Long) = glm.add(Vec3ul(), this, bX, bY, bZ)

    infix inline fun addAss(b: Ulong) = glm.add(this, this, b, b, b)
    infix inline fun addAss(b: Long) = glm.add(this, this, b, b, b)
    fun addAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.add(this, this, bX, bY, bZ)
    fun addAss(bX: Long, bY: Long, bZ: Long) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3ul) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Ulong, res: Vec3ul) = glm.add(res, this, b, b, b)
    fun add(b: Long, res: Vec3ul) = glm.add(res, this, b, b, b)
    fun add(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.add(res, this, bX, bY, bZ)
    fun add(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3ul, res: Vec3ul) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Ulong) = glm.sub(Vec3ul(), this, b, b, b)
    operator fun minus(b: Long) = glm.sub(Vec3ul(), this, b, b, b)
    operator fun minus(b: Vec3ul) = glm.sub(Vec3ul(), this, b.x, b.y, b.z)

    fun sub(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.sub(Vec3ul(), this, bX, bY, bZ)
    fun sub(bX: Long, bY: Long, bZ: Long) = glm.sub(Vec3ul(), this, bX, bY, bZ)

    infix inline fun subAss(b: Ulong) = glm.sub(this, this, b, b, b)
    infix inline fun subAss(b: Long) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.sub(this, this, bX, bY, bZ)
    fun subAss(bX: Long, bY: Long, bZ: Long) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3ul) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Ulong, res: Vec3ul) = glm.sub(res, this, b, b, b)
    fun sub(b: Long, res: Vec3ul) = glm.sub(res, this, b, b, b)
    fun sub(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.sub(res, this, bX, bY, bZ)
    fun sub(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3ul, res: Vec3ul) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Ulong) = glm.mul(Vec3ul(), this, b, b, b)
    operator fun times(b: Long) = glm.mul(Vec3ul(), this, b, b, b)
    operator fun times(b: Vec3ul) = glm.mul(Vec3ul(), this, b.x, b.y, b.z)

    fun mul(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.mul(Vec3ul(), this, bX, bY, bZ)
    fun mul(bX: Long, bY: Long, bZ: Long) = glm.mul(Vec3ul(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Ulong) = glm.mul(this, this, b, b, b)
    infix inline fun mulAss(b: Long) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.mul(this, this, bX, bY, bZ)
    fun mulAss(bX: Long, bY: Long, bZ: Long) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3ul) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Ulong, res: Vec3ul) = glm.mul(res, this, b, b, b)
    fun mul(b: Long, res: Vec3ul) = glm.mul(res, this, b, b, b)
    fun mul(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.mul(res, this, bX, bY, bZ)
    fun mul(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3ul, res: Vec3ul) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Ulong) = glm.div(Vec3ul(), this, b, b, b)
    operator fun div(b: Long) = glm.div(Vec3ul(), this, b, b, b)
    operator fun div(b: Vec3ul) = glm.div(Vec3ul(), this, b.x, b.y, b.z)

    fun div(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.div(Vec3ul(), this, bX, bY, bZ)
    fun div(bX: Long, bY: Long, bZ: Long) = glm.div(Vec3ul(), this, bX, bY, bZ)

    infix inline fun divAss(b: Ulong) = glm.div(this, this, b, b, b)
    infix inline fun divAss(b: Long) = glm.div(this, this, b, b, b)
    fun divAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.div(this, this, bX, bY, bZ)
    fun divAss(bX: Long, bY: Long, bZ: Long) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3ul) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Ulong, res: Vec3ul) = glm.div(res, this, b, b, b)
    fun div(b: Long, res: Vec3ul) = glm.div(res, this, b, b, b)
    fun div(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.div(res, this, bX, bY, bZ)
    fun div(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3ul, res: Vec3ul) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Ulong) = glm.mod(Vec3ul(), this, b, b, b)
    operator fun mod(b: Long) = glm.mod(Vec3ul(), this, b, b, b)
    operator fun mod(b: Vec3ul) = glm.mod(Vec3ul(), this, b.x, b.y, b.z)

    fun mod(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.mod(Vec3ul(), this, bX, bY, bZ)
    fun mod(bX: Long, bY: Long, bZ: Long) = glm.mod(Vec3ul(), this, bX, bY, bZ)

    infix inline fun modAss(b: Ulong) = glm.mod(this, this, b, b, b)
    infix inline fun modAss(b: Long) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.mod(this, this, bX, bY, bZ)
    fun modAss(bX: Long, bY: Long, bZ: Long) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3ul) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Ulong, res: Vec3ul) = glm.mod(res, this, b, b, b)
    fun mod(b: Long, res: Vec3ul) = glm.mod(res, this, b, b, b)
    fun mod(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.mod(res, this, bX, bY, bZ)
    fun mod(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3ul, res: Vec3ul) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Ulong) = glm.and(Vec3ul(), this, b, b, b)
    inline infix fun and(b: Long) = glm.and(Vec3ul(), this, b, b, b)
    fun and(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.and(Vec3ul(), this, bX, bY, bZ)
    fun and(bX: Long, bY: Long, bZ: Long) = glm.and(Vec3ul(), this, bX, bY, bZ)
    fun and(b: Vec3ul) = glm.and(Vec3ul(), this, b.x, b.y, b.z)

    infix inline fun andAss(b: Ulong) = glm.and(this, this, b, b, b)
    infix inline fun andAss(b: Long) = glm.and(this, this, b, b, b)
    fun andAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.and(this, this, bX, bY, bZ)
    fun andAss(bX: Long, bY: Long, bZ: Long) = glm.and(this, this, bX, bY, bZ)
    infix inline fun andAss(b: Vec3ul) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Ulong, res: Vec3ul) = glm.and(res, this, b, b, b)
    fun and(b: Long, res: Vec3ul) = glm.and(res, this, b, b, b)
    fun and(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.and(res, this, bX, bY, bZ)
    fun and(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3ul, res: Vec3ul) = glm.and(res, this, b.x, b.y, b.z)


    inline infix fun or(b: Ulong) = glm.or(Vec3ul(), this, b, b, b)
    inline infix fun or(b: Long) = glm.or(Vec3ul(), this, b, b, b)
    fun or(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.or(Vec3ul(), this, bX, bY, bZ)
    fun or(bX: Long, bY: Long, bZ: Long) = glm.or(Vec3ul(), this, bX, bY, bZ)
    fun or(b: Vec3ul) = glm.or(Vec3ul(), this, b.x, b.y, b.z)

    infix inline fun orAss(b: Ulong) = glm.or(this, this, b, b, b)
    infix inline fun orAss(b: Long) = glm.or(this, this, b, b, b)
    fun orAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.or(this, this, bX, bY, bZ)
    fun orAss(bX: Long, bY: Long, bZ: Long) = glm.or(this, this, bX, bY, bZ)
    infix inline fun orAss(b: Vec3ul) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Ulong, res: Vec3ul) = glm.or(res, this, b, b, b)
    fun or(b: Long, res: Vec3ul) = glm.or(res, this, b, b, b)
    fun or(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.or(res, this, bX, bY, bZ)
    fun or(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3ul, res: Vec3ul) = glm.or(res, this, b.x, b.y, b.z)


    inline infix fun xor(b: Ulong) = glm.xor(Vec3ul(), this, b, b, b)
    inline infix fun xor(b: Long) = glm.xor(Vec3ul(), this, b, b, b)
    fun xor(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.xor(Vec3ul(), this, bX, bY, bZ)
    fun xor(bX: Long, bY: Long, bZ: Long) = glm.xor(Vec3ul(), this, bX, bY, bZ)
    fun xor(b: Vec3ul) = glm.xor(Vec3ul(), this, b.x, b.y, b.z)

    infix inline fun xorAss(b: Ulong) = glm.xor(this, this, b, b, b)
    infix inline fun xorAss(b: Long) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Ulong, bY: Ulong, bZ: Ulong) = glm.xor(this, this, bX, bY, bZ)
    fun xorAss(bX: Long, bY: Long, bZ: Long) = glm.xor(this, this, bX, bY, bZ)
    infix inline fun xorAss(b: Vec3ul) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Ulong, res: Vec3ul) = glm.xor(res, this, b, b, b)
    fun xor(b: Long, res: Vec3ul) = glm.xor(res, this, b, b, b)
    fun xor(bX: Ulong, bY: Ulong, bZ: Ulong, res: Vec3ul) = glm.xor(res, this, bX, bY, bZ)
    fun xor(bX: Long, bY: Long, bZ: Long, res: Vec3ul) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3ul, res: Vec3ul) = glm.xor(res, this, b.x, b.y, b.z)


    inline infix fun shl(b: Int) = glm.shl(Vec3ul(), this, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3ul(), this, bX, bY, bZ)

    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)

    fun shl(b: Int, res: Vec3ul) = glm.shl(res, this, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3ul) = glm.shl(res, this, bX, bY, bZ)


    inline infix fun shr(b: Int) = glm.shr(Vec3ul(), this, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3ul(), this, bX, bY, bZ)

    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)

    fun shr(b: Int, res: Vec3ul) = glm.shr(res, this, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3ul) = glm.shr(res, this, bX, bY, bZ)


    fun inv() = glm.inv(Vec3ul(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3ul) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ulong.plus(b: Vec3ul) = glm.add(Vec3ul(), b, this, this, this)
inline infix fun Ulong.addAss(b: Vec3ul) = glm.add(b, b, this, this, this)

operator fun Ulong.minus(b: Vec3ul) = glm.sub(Vec3ul(), this, this, this, b)
inline infix fun Ulong.subAss(b: Vec3ul) = glm.sub(b, this, this, this, b)

operator fun Ulong.times(b: Vec3ul) = glm.mul(Vec3ul(), b, this, this, this)
inline infix fun Ulong.mulAss(b: Vec3ul) = glm.mul(b, b, this, this, this)

operator fun Ulong.div(b: Vec3ul) = glm.div(Vec3ul(), this, this, this, b)
inline infix fun Ulong.divAss(b: Vec3ul) = glm.div(b, this, this, this, b)

operator fun Ulong.mod(b: Vec3ul) = glm.mod(Vec3ul(), this, this, this, b)
inline infix fun Ulong.modAss(b: Vec3ul) = glm.mod(b, this, this, this, b)


operator fun Long.plus(b: Vec3ul) = glm.add(Vec3ul(), b, this, this, this)
inline infix fun Long.addAss(b: Vec3ul) = glm.add(b, b, this, this, this)

operator fun Long.minus(b: Vec3ul) = glm.sub(Vec3ul(), this, this, this, b)
inline infix fun Long.subAss(b: Vec3ul) = glm.sub(b, this, this, this, b)

operator fun Long.times(b: Vec3ul) = glm.mul(Vec3ul(), b, this, this, this)
inline infix fun Long.mulAss(b: Vec3ul) = glm.mul(b, b, this, this, this)

operator fun Long.div(b: Vec3ul) = glm.div(Vec3ul(), this, this, this, b)
inline infix fun Long.divAss(b: Vec3ul) = glm.div(b, this, this, this, b)

operator fun Long.mod(b: Vec3ul) = glm.mod(Vec3ul(), this, this, this, b)
inline infix fun Long.modAss(b: Vec3ul) = glm.mod(b, this, this, this, b)