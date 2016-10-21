package glm.vec._3

import glm.glm
import glm.vec.Vec3t

/**
 * Created by elect on 09/10/16.
 */

data class Vec3s(override var x: Short = 0, override var y: Short = 0, override var z: Short = 0) : Vec3t<Short>(x, y, z) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(v.x.toShort(), v.y.toShort(), v.z.toShort())

    constructor(s: Short) : this(s, s, s)

    constructor(sa: ShortArray) : this(sa[0], sa[1], sa[2])

    constructor(sa: Array<Short>) : this(sa[0], sa[1], sa[2])


    fun to(v: Vec3t<Number>): Vec3s {
        x = v.x.toShort(); y = v.y.toShort(); z = v.z.toShort(); return this
    }

    fun to(s: Short): Vec3s {
        x = s; y = s; z = s; return this
    }

    fun to(s: Int): Vec3s {
        x = s.toShort(); y = s.toShort(); z = s.toShort(); return this
    }

    fun to(x: Short, y: Short, z: Short): Vec3s {
        this.x = x; this.y = y; this.z = z; return this
    }

    fun to(x: Int, y: Int, z: Int): Vec3s {
        this.x = x.toShort(); this.y = y.toShort(); this.z = z.toShort(); return this
    }

    fun to(ba: ShortArray): Vec3s {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }

    fun to(ia: IntArray): Vec3s {
        x = ia[0].toShort(); y = ia[1].toShort(); z = ia[2].toShort(); return this
    }

    fun to(ba: Array<Short>): Vec3s {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }

    fun to(ia: Array<Int>): Vec3s {
        x = ia[0].toShort(); y = ia[1].toShort(); z = ia[2].toShort(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Short) = when (i) {0 -> x = s; 1 -> y = s; else -> z = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s.toShort(); 1 -> y = s.toShort(); else -> z = s.toShort(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec3s {
        x = (-x).toShort(); y = (-y).toShort(); z = (-z).toShort(); return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3s = glm.add(Vec3s(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3s) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3s = glm.sub(Vec3s(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3s) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Short) = glm.add(Vec3s(), this, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec3s(), this, b, b, b)
    operator fun plus(b: Vec3s) = glm.add(Vec3s(), this, b.x, b.y, b.z)

    fun add(bX: Short, bY: Short, bZ: Short) = glm.add(Vec3s(), this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int) = glm.add(Vec3s(), this, bX, bY, bZ)

    infix fun addAss(b: Short) = glm.add(this, this, b, b, b)
    infix fun addAss(b: Int) = glm.add(this, this, b, b, b)
    fun addAss(bX: Short, bY: Short, bZ: Short) = glm.add(this, this, bX, bY, bZ)
    fun addAss(bX: Int, bY: Int, bZ: Int) = glm.add(this, this, bX, bY, bZ)
    infix fun addAss(b: Vec3s) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Short, res: Vec3s) = glm.add(res, this, b, b, b)
    fun add(b: Int, res: Vec3s) = glm.add(res, this, b, b, b)
    fun add(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.add(res, this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3s, res: Vec3s) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Short) = glm.sub(Vec3s(), this, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec3s(), this, b, b, b)
    operator fun minus(b: Vec3s) = glm.sub(Vec3s(), this, b.x, b.y, b.z)

    fun sub(bX: Short, bY: Short, bZ: Short) = glm.sub(Vec3s(), this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int) = glm.sub(Vec3s(), this, bX, bY, bZ)

    infix fun subAss(b: Short) = glm.sub(this, this, b, b, b)
    infix fun subAss(b: Int) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Short, bY: Short, bZ: Short) = glm.sub(this, this, bX, bY, bZ)
    fun subAss(bX: Int, bY: Int, bZ: Int) = glm.sub(this, this, bX, bY, bZ)
    infix fun subAss(b: Vec3s) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Short, res: Vec3s) = glm.sub(res, this, b, b, b)
    fun sub(b: Int, res: Vec3s) = glm.sub(res, this, b, b, b)
    fun sub(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.sub(res, this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3s, res: Vec3s) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Short) = glm.mul(Vec3s(), this, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec3s(), this, b, b, b)
    operator fun times(b: Vec3s) = glm.mul(Vec3s(), this, b.x, b.y, b.z)

    fun mul(bX: Short, bY: Short, bZ: Short) = glm.mul(Vec3s(), this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int) = glm.mul(Vec3s(), this, bX, bY, bZ)

    infix fun mulAss(b: Short) = glm.mul(this, this, b, b, b)
    infix fun mulAss(b: Int) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Short, bY: Short, bZ: Short) = glm.mul(this, this, bX, bY, bZ)
    fun mulAss(bX: Int, bY: Int, bZ: Int) = glm.mul(this, this, bX, bY, bZ)
    infix fun mulAss(b: Vec3s) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Short, res: Vec3s) = glm.mul(res, this, b, b, b)
    fun mul(b: Int, res: Vec3s) = glm.mul(res, this, b, b, b)
    fun mul(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.mul(res, this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3s, res: Vec3s) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Short) = glm.div(Vec3s(), this, b, b, b)
    operator fun div(b: Int) = glm.div(Vec3s(), this, b, b, b)
    operator fun div(b: Vec3s) = glm.div(Vec3s(), this, b.x, b.y, b.z)

    fun div(bX: Short, bY: Short, bZ: Short) = glm.div(Vec3s(), this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int) = glm.div(Vec3s(), this, bX, bY, bZ)

    infix fun divAss(b: Short) = glm.div(this, this, b, b, b)
    infix fun divAss(b: Int) = glm.div(this, this, b, b, b)
    fun divAss(bX: Short, bY: Short, bZ: Short) = glm.div(this, this, bX, bY, bZ)
    fun divAss(bX: Int, bY: Int, bZ: Int) = glm.div(this, this, bX, bY, bZ)
    infix fun divAss(b: Vec3s) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Short, res: Vec3s) = glm.div(res, this, b, b, b)
    fun div(b: Int, res: Vec3s) = glm.div(res, this, b, b, b)
    fun div(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.div(res, this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3s, res: Vec3s) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Short) = glm.mod(Vec3s(), this, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec3s(), this, b, b, b)
    operator fun mod(b: Vec3s) = glm.mod(Vec3s(), this, b.x, b.y, b.z)

    fun mod(bX: Short, bY: Short, bZ: Short) = glm.mod(Vec3s(), this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int) = glm.mod(Vec3s(), this, bX, bY, bZ)

    infix fun modAss(b: Short) = glm.mod(this, this, b, b, b)
    infix fun modAss(b: Int) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Short, bY: Short, bZ: Short) = glm.mod(this, this, bX, bY, bZ)
    fun modAss(bX: Int, bY: Int, bZ: Int) = glm.mod(this, this, bX, bY, bZ)
    infix fun modAss(b: Vec3s) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Short, res: Vec3s) = glm.mod(res, this, b, b, b)
    fun mod(b: Int, res: Vec3s) = glm.mod(res, this, b, b, b)
    fun mod(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.mod(res, this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3s, res: Vec3s) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    infix fun and(b: Short) = glm.and(Vec3s(), this, b, b, b)
    infix fun and(b: Int) = glm.and(Vec3s(), this, b, b, b)
    fun and(bX: Short, bY: Short, bZ: Short) = glm.and(Vec3s(), this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int) = glm.and(Vec3s(), this, bX, bY, bZ)
    fun and(b: Vec3s) = glm.and(Vec3s(), this, b.x, b.y, b.z)

    infix fun andAss(b: Short) = glm.and(this, this, b, b, b)
    infix fun andAss(b: Int) = glm.and(this, this, b, b, b)
    fun andAss(bX: Short, bY: Short, bZ: Short) = glm.and(this, this, bX, bY, bZ)
    fun andAss(bX: Int, bY: Int, bZ: Int) = glm.and(this, this, bX, bY, bZ)
    infix fun andAss(b: Vec3s) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Short, res: Vec3s) = glm.and(res, this, b, b, b)
    fun and(b: Int, res: Vec3s) = glm.and(res, this, b, b, b)
    fun and(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.and(res, this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3s, res: Vec3s) = glm.and(res, this, b.x, b.y, b.z)


    infix fun or(b: Short) = glm.or(Vec3s(), this, b, b, b)
    infix fun or(b: Int) = glm.or(Vec3s(), this, b, b, b)
    fun or(bX: Short, bY: Short, bZ: Short) = glm.or(Vec3s(), this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int) = glm.or(Vec3s(), this, bX, bY, bZ)
    fun or(b: Vec3s) = glm.or(Vec3s(), this, b.x, b.y, b.z)

    infix fun orAss(b: Short) = glm.or(this, this, b, b, b)
    infix fun orAss(b: Int) = glm.or(this, this, b, b, b)
    fun orAss(bX: Short, bY: Short, bZ: Short) = glm.or(this, this, bX, bY, bZ)
    fun orAss(bX: Int, bY: Int, bZ: Int) = glm.or(this, this, bX, bY, bZ)
    infix fun orAss(b: Vec3s) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Short, res: Vec3s) = glm.or(res, this, b, b, b)
    fun or(b: Int, res: Vec3s) = glm.or(res, this, b, b, b)
    fun or(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.or(res, this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3s, res: Vec3s) = glm.or(res, this, b.x, b.y, b.z)


    infix fun xor(b: Short) = glm.xor(Vec3s(), this, b, b, b)
    infix fun xor(b: Int) = glm.xor(Vec3s(), this, b, b, b)
    fun xor(bX: Short, bY: Short, bZ: Short) = glm.xor(Vec3s(), this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int) = glm.xor(Vec3s(), this, bX, bY, bZ)
    fun xor(b: Vec3s) = glm.xor(Vec3s(), this, b.x, b.y, b.z)

    infix fun xorAss(b: Short) = glm.xor(this, this, b, b, b)
    infix fun xorAss(b: Int) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Short, bY: Short, bZ: Short) = glm.xor(this, this, bX, bY, bZ)
    fun xorAss(bX: Int, bY: Int, bZ: Int) = glm.xor(this, this, bX, bY, bZ)
    infix fun xorAss(b: Vec3s) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Short, res: Vec3s) = glm.xor(res, this, b, b, b)
    fun xor(b: Int, res: Vec3s) = glm.xor(res, this, b, b, b)
    fun xor(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.xor(res, this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3s, res: Vec3s) = glm.xor(res, this, b.x, b.y, b.z)


    infix fun shl(b: Short) = glm.shl(Vec3s(), this, b, b, b)
    infix fun shl(b: Int) = glm.shl(Vec3s(), this, b, b, b)
    fun shl(bX: Short, bY: Short, bZ: Short) = glm.shl(Vec3s(), this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3s(), this, bX, bY, bZ)
    fun shl(b: Vec3s) = glm.shl(Vec3s(), this, b.x, b.y, b.z)

    infix fun shlAss(b: Short) = glm.shl(this, this, b, b, b)
    infix fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Short, bY: Short, bZ: Short) = glm.shl(this, this, bX, bY, bZ)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)
    infix fun shlAss(b: Vec3s) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Short, res: Vec3s) = glm.shl(res, this, b, b, b)
    fun shl(b: Int, res: Vec3s) = glm.shl(res, this, b, b, b)
    fun shl(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.shl(res, this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3s, res: Vec3s) = glm.shl(res, this, b.x, b.y, b.z)


    infix fun shr(b: Short) = glm.shr(Vec3s(), this, b, b, b)
    infix fun shr(b: Int) = glm.shr(Vec3s(), this, b, b, b)
    fun shr(bX: Short, bY: Short, bZ: Short) = glm.shr(Vec3s(), this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3s(), this, bX, bY, bZ)
    fun shr(b: Vec3s) = glm.shr(Vec3s(), this, b.x, b.y, b.z)

    infix fun shrAss(b: Short) = glm.shr(this, this, b, b, b)
    infix fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Short, bY: Short, bZ: Short) = glm.shr(this, this, bX, bY, bZ)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)
    infix fun shrAss(b: Vec3s) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Short, res: Vec3s) = glm.shr(res, this, b, b, b)
    fun shr(b: Int, res: Vec3s) = glm.shr(res, this, b, b, b)
    fun shr(bX: Short, bY: Short, bZ: Short, res: Vec3s) = glm.shr(res, this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3s) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3s, res: Vec3s) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3s(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3s) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Short.plus(b: Vec3s) = glm.add(Vec3s(), b, this, this, this)
infix fun Short.addAss(b: Vec3s) = glm.add(b, b, this, this, this)

operator fun Short.minus(b: Vec3s) = glm.sub(Vec3s(), this, this, this, b)
infix fun Short.subAss(b: Vec3s) = glm.sub(b, this, this, this, b)

operator fun Short.times(b: Vec3s) = glm.mul(Vec3s(), b, this, this, this)
infix fun Short.mulAss(b: Vec3s) = glm.mul(b, b, this, this, this)

operator fun Short.div(b: Vec3s) = glm.div(Vec3s(), this, this, this, b)
infix fun Short.divAss(b: Vec3s) = glm.div(b, this, this, this, b)

operator fun Short.mod(b: Vec3s) = glm.mod(Vec3s(), this, this, this, b)
infix fun Short.modAss(b: Vec3s) = glm.mod(b, this, this, this, b)


operator fun Int.plus(b: Vec3s) = glm.add(Vec3s(), b, this, this, this)
infix fun Int.addAss(b: Vec3s) = glm.add(b, b, this, this, this)

operator fun Int.minus(b: Vec3s) = glm.sub(Vec3s(), this, this, this, b)
infix fun Int.subAss(b: Vec3s) = glm.sub(b, this, this, this, b)

operator fun Int.times(b: Vec3s) = glm.mul(Vec3s(), b, this, this, this)
infix fun Int.mulAss(b: Vec3s) = glm.mul(b, b, this, this, this)

operator fun Int.div(b: Vec3s) = glm.div(Vec3s(), this, this, this, b)
infix fun Int.divAss(b: Vec3s) = glm.div(b, this, this, this, b)

operator fun Int.mod(b: Vec3s) = glm.mod(Vec3s(), this, this, this, b)
infix fun Int.modAss(b: Vec3s) = glm.mod(b, this, this, this, b)