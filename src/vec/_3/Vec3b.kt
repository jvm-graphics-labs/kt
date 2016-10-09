package vec._3

import vec.Vec3t

/**
 * Created by elect on 08/10/16.
 */

data class Vec3b(override var x: Byte = 0, override var y: Byte = 0, override var z: Byte = 0) : Vec3t<Byte>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(v.x.toByte(), v.y.toByte(), v.z.toByte())

    constructor(s: Byte) : this(s, s, s)

    constructor(ba: ByteArray) : this(ba[0], ba[1], ba[2])

    constructor(ba: Array<Byte>) : this(ba[0], ba[1], ba[2])


    fun to(v: Vec3t<Number>): Vec3b {
        x = v.x.toByte(); y = v.y.toByte();z = v.z.toByte(); return this
    }

    fun to(s: Byte): Vec3b {
        x = s; y = s; z = s; return this
    }

    fun to(s: Int): Vec3b {
        x = s.toByte(); y = s.toByte(); z = s.toByte(); return this
    }

    fun to(x: Byte, y: Byte, z: Byte): Vec3b {
        this.x = x; this.y = y; this.z = z; return this
    }

    fun to(x: Int, y: Int, z: Int): Vec3b {
        this.x = x.toByte(); this.y = y.toByte(); this.z = z.toByte(); return this
    }

    fun to(ba: ByteArray): Vec3b {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }

    fun to(ia: IntArray): Vec3b {
        x = ia[0].toByte(); y = ia[1].toByte(); z = ia[2].toByte(); return this
    }

    fun to(ba: Array<Byte>): Vec3b {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }

    fun to(ia: Array<Int>): Vec3b {
        x = ia[0].toByte(); y = ia[1].toByte(); z = ia[2].toByte(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Byte) = when (i) {0 -> x = s; 1 -> y = s; else -> z = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s.toByte(); 1 -> y = s.toByte(); else -> z = s.toByte(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec3b {
        x = (-x).toByte(); y = (-y).toByte(); z = (-z).toByte(); return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3b = glm.add(Vec3b(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3b) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3b = glm.sub(Vec3b(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3b) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Byte) = glm.add(Vec3b(), this, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec3b(), this, b, b, b)
    operator fun plus(b: Vec3b) = glm.add(Vec3b(), this, b.x, b.y, b.z)

    fun add(bX: Byte, bY: Byte, bZ:Byte) = glm.add(Vec3b(), this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int) = glm.add(Vec3b(), this, bX, bY, bZ)

    infix inline fun addAss(b: Byte) = glm.add(this, this, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b)
    fun addAss(bX: Byte, bY: Byte, bZ:Byte) = glm.add(this, this, bX, bY, bZ)
    fun addAss(bX: Int, bY: Int, bZ: Int) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3b) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Byte, res: Vec3b) = glm.add(res, this, b, b, b)
    fun add(b: Int, res: Vec3b) = glm.add(res, this, b, b, b)
    fun add(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.add(res, this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3b, res: Vec3b) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Byte) = glm.sub(Vec3b(), this, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec3b(), this, b, b, b)
    operator fun minus(b: Vec3b) = glm.sub(Vec3b(), this, b.x, b.y, b.z)

    fun sub(bX: Byte, bY: Byte, bZ:Byte) = glm.sub(Vec3b(), this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int) = glm.sub(Vec3b(), this, bX, bY, bZ)

    infix inline fun subAss(b: Byte) = glm.sub(this, this, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Byte, bY: Byte, bZ:Byte) = glm.sub(this, this, bX, bY, bZ)
    fun subAss(bX: Int, bY: Int, bZ: Int) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3b) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Byte, res: Vec3b) = glm.sub(res, this, b, b, b)
    fun sub(b: Int, res: Vec3b) = glm.sub(res, this, b, b, b)
    fun sub(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.sub(res, this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3b, res: Vec3b) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Byte) = glm.mul(Vec3b(), this, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec3b(), this, b, b, b)
    operator fun times(b: Vec3b) = glm.mul(Vec3b(), this, b.x, b.y, b.z)

    fun mul(bX: Byte, bY: Byte, bZ:Byte) = glm.mul(Vec3b(), this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int) = glm.mul(Vec3b(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Byte) = glm.mul(this, this, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Byte, bY: Byte, bZ:Byte) = glm.mul(this, this, bX, bY, bZ)
    fun mulAss(bX: Int, bY: Int, bZ: Int) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3b) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Byte, res: Vec3b) = glm.mul(res, this, b, b, b)
    fun mul(b: Int, res: Vec3b) = glm.mul(res, this, b, b, b)
    fun mul(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.mul(res, this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3b, res: Vec3b) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Byte) = glm.div(Vec3b(), this, b, b, b)
    operator fun div(b: Int) = glm.div(Vec3b(), this, b, b, b)
    operator fun div(b: Vec3b) = glm.div(Vec3b(), this, b.x, b.y, b.z)

    fun div(bX: Byte, bY: Byte, bZ:Byte) = glm.div(Vec3b(), this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int) = glm.div(Vec3b(), this, bX, bY, bZ)

    infix inline fun divAss(b: Byte) = glm.div(this, this, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b)
    fun divAss(bX: Byte, bY: Byte, bZ:Byte) = glm.div(this, this, bX, bY, bZ)
    fun divAss(bX: Int, bY: Int, bZ: Int) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3b) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Byte, res: Vec3b) = glm.div(res, this, b, b, b)
    fun div(b: Int, res: Vec3b) = glm.div(res, this, b, b, b)
    fun div(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.div(res, this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3b, res: Vec3b) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Byte) = glm.mod(Vec3b(), this, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec3b(), this, b, b, b)
    operator fun mod(b: Vec3b) = glm.mod(Vec3b(), this, b.x, b.y, b.z)

    fun mod(bX: Byte, bY: Byte, bZ:Byte) = glm.mod(Vec3b(), this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int) = glm.mod(Vec3b(), this, bX, bY, bZ)

    infix inline fun modAss(b: Byte) = glm.mod(this, this, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Byte, bY: Byte, bZ:Byte) = glm.mod(this, this, bX, bY, bZ)
    fun modAss(bX: Int, bY: Int, bZ: Int) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3b) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Byte, res: Vec3b) = glm.mod(res, this, b, b, b)
    fun mod(b: Int, res: Vec3b) = glm.mod(res, this, b, b, b)
    fun mod(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.mod(res, this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3b, res: Vec3b) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Byte) = glm.and(Vec3b(), this, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec3b(), this, b, b, b)
    fun and(bX: Byte, bY: Byte, bZ:Byte) = glm.and(Vec3b(), this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int) = glm.and(Vec3b(), this, bX, bY, bZ)
    fun and(b: Vec3b) = glm.and(Vec3b(), this, b.x, b.y, b.z)

    infix inline fun andAss(b: Byte) = glm.and(this, this, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b)
    fun andAss(bX: Byte, bY: Byte, bZ:Byte) = glm.and(this, this, bX, bY, bZ)
    fun andAss(bX: Int, bY: Int, bZ: Int) = glm.and(this, this, bX, bY, bZ)
    infix inline fun andAss(b: Vec3b) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Byte, res: Vec3b) = glm.and(res, this, b, b, b)
    fun and(b: Int, res: Vec3b) = glm.and(res, this, b, b, b)
    fun and(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.and(res, this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3b, res: Vec3b) = glm.and(res, this, b.x, b.y, b.z)


    inline infix fun or(b: Byte) = glm.or(Vec3b(), this, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec3b(), this, b, b, b)
    fun or(bX: Byte, bY: Byte, bZ:Byte) = glm.or(Vec3b(), this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int) = glm.or(Vec3b(), this, bX, bY, bZ)
    fun or(b: Vec3b) = glm.or(Vec3b(), this, b.x, b.y, b.z)

    infix inline fun orAss(b: Byte) = glm.or(this, this, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b)
    fun orAss(bX: Byte, bY: Byte, bZ:Byte) = glm.or(this, this, bX, bY, bZ)
    fun orAss(bX: Int, bY: Int, bZ: Int) = glm.or(this, this, bX, bY, bZ)
    infix inline fun orAss(b: Vec3b) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Byte, res: Vec3b) = glm.or(res, this, b, b, b)
    fun or(b: Int, res: Vec3b) = glm.or(res, this, b, b, b)
    fun or(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.or(res, this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3b, res: Vec3b) = glm.or(res, this, b.x, b.y, b.z)


    inline infix fun xor(b: Byte) = glm.xor(Vec3b(), this, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec3b(), this, b, b, b)
    fun xor(bX: Byte, bY: Byte, bZ:Byte) = glm.xor(Vec3b(), this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int) = glm.xor(Vec3b(), this, bX, bY, bZ)
    fun xor(b: Vec3b) = glm.xor(Vec3b(), this, b.x, b.y, b.z)

    infix inline fun xorAss(b: Byte) = glm.xor(this, this, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Byte, bY: Byte, bZ:Byte) = glm.xor(this, this, bX, bY, bZ)
    fun xorAss(bX: Int, bY: Int, bZ: Int) = glm.xor(this, this, bX, bY, bZ)
    infix inline fun xorAss(b: Vec3b) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Byte, res: Vec3b) = glm.xor(res, this, b, b, b)
    fun xor(b: Int, res: Vec3b) = glm.xor(res, this, b, b, b)
    fun xor(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.xor(res, this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3b, res: Vec3b) = glm.xor(res, this, b.x, b.y, b.z)


    inline infix fun shl(b: Byte) = glm.shl(Vec3b(), this, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec3b(), this, b, b, b)
    fun shl(bX: Byte, bY: Byte, bZ:Byte) = glm.shl(Vec3b(), this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3b(), this, bX, bY, bZ)
    fun shl(b: Vec3b) = glm.shl(Vec3b(), this, b.x, b.y, b.z)

    infix inline fun shlAss(b: Byte) = glm.shl(this, this, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Byte, bY: Byte, bZ:Byte) = glm.shl(this, this, bX, bY, bZ)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)
    infix inline fun shlAss(b: Vec3b) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Byte, res: Vec3b) = glm.shl(res, this, b, b, b)
    fun shl(b: Int, res: Vec3b) = glm.shl(res, this, b, b, b)
    fun shl(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.shl(res, this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3b, res: Vec3b) = glm.shl(res, this, b.x, b.y, b.z)


    inline infix fun shr(b: Byte) = glm.shr(Vec3b(), this, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec3b(), this, b, b, b)
    fun shr(bX: Byte, bY: Byte, bZ:Byte) = glm.shr(Vec3b(), this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3b(), this, bX, bY, bZ)
    fun shr(b: Vec3b) = glm.shr(Vec3b(), this, b.x, b.y, b.z)

    infix inline fun shrAss(b: Byte) = glm.shr(this, this, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Byte, bY: Byte, bZ:Byte) = glm.shr(this, this, bX, bY, bZ)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)
    infix inline fun shrAss(b: Vec3b) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Byte, res: Vec3b) = glm.shr(res, this, b, b, b)
    fun shr(b: Int, res: Vec3b) = glm.shr(res, this, b, b, b)
    fun shr(bX: Byte, bY: Byte, bZ:Byte, res: Vec3b) = glm.shr(res, this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3b) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3b, res: Vec3b) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3b(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3b) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Byte.plus(b: Vec3b) = glm.add(Vec3b(), b, this, this, this)
inline infix fun Byte.addAss(b: Vec3b) = glm.add(b, b, this, this, this)

operator fun Byte.minus(b: Vec3b) = glm.sub(Vec3b(), this, this, this, b)
inline infix fun Byte.subAss(b: Vec3b) = glm.sub(b, this, this, this, b)

operator fun Byte.times(b: Vec3b) = glm.mul(Vec3b(), b, this, this, this)
inline infix fun Byte.mulAss(b: Vec3b) = glm.mul(b, b, this, this, this)

operator fun Byte.div(b: Vec3b) = glm.div(Vec3b(), this, this, this, b)
inline infix fun Byte.divAss(b: Vec3b) = glm.div(b, this, this, this, b)

operator fun Byte.mod(b: Vec3b) = glm.mod(Vec3b(), this, this, this, b)
inline infix fun Byte.modAss(b: Vec3b) = glm.mod(b, this, this, this, b)


operator fun Int.plus(b: Vec3b) = glm.add(Vec3b(), b, this, this, this)
inline infix fun Int.addAss(b: Vec3b) = glm.add(b, b, this, this, this)

operator fun Int.minus(b: Vec3b) = glm.sub(Vec3b(), this, this, this, b)
inline infix fun Int.subAss(b: Vec3b) = glm.sub(b, this, this, this, b)

operator fun Int.times(b: Vec3b) = glm.mul(Vec3b(), b, this, this, this)
inline infix fun Int.mulAss(b: Vec3b) = glm.mul(b, b, this, this, this)

operator fun Int.div(b: Vec3b) = glm.div(Vec3b(), this, this, this, b)
inline infix fun Int.divAss(b: Vec3b) = glm.div(b, this, this, this, b)

operator fun Int.mod(b: Vec3b) = glm.mod(Vec3b(), this, this, this, b)
inline infix fun Int.modAss(b: Vec3b) = glm.mod(b, this, this, this, b)