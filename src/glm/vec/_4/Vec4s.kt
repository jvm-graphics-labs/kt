package glm.vec._4

import glm.glm
import glm.vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4s(override var x: Short = 0, override var y: Short = 0, override var z: Short = 0, override var w: Short = 0) : Vec4t<Short>(x, y, z, w) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(v.x.toShort(), v.y.toShort(), v.z.toShort(), v.w.toShort())

    constructor(s: Short) : this(s, s, s, s)

    constructor(sa: ShortArray) : this(sa[0], sa[1], sa[2], sa[3])

    constructor(sa: Array<Short>) : this(sa[0], sa[1], sa[2], sa[3])


    fun to(v: Vec4t<Number>): Vec4s {
        x = v.x.toShort(); y = v.y.toShort(); z = v.z.toShort(); w = v.w.toShort(); return this
    }

    fun to(s: Short): Vec4s {
        x = s; y = s; z = s; w = s; return this
    }

    fun to(s: Int): Vec4s {
        x = s.toShort(); y = s.toShort(); z = s.toShort(); w = s.toShort(); return this
    }

    fun to(x: Short, y: Short, z: Short, w: Short): Vec4s {
        this.x = x; this.y = y; this.z = z; this.w = w; return this
    }

    fun to(x: Int, y: Int, z: Int, w: Int): Vec4s {
        this.x = x.toShort(); this.y = y.toShort(); this.z = z.toShort(); this.w = w.toShort(); return this
    }

    fun to(ba: ShortArray): Vec4s {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ia: IntArray): Vec4s {
        x = ia[0].toShort(); y = ia[1].toShort(); z = ia[2].toShort(); w = ia[3].toShort(); return this
    }

    fun to(ba: Array<Short>): Vec4s {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ia: Array<Int>): Vec4s {
        x = ia[0].toShort(); y = ia[1].toShort(); z = ia[2].toShort(); w = ia[3].toShort(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Short) = when (i) {0 -> x = s; 1 -> y = s; 2 -> z = s; else -> w = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s.toShort(); 1 -> y = s.toShort(); 2 -> z = s.toShort(); else -> w = s.toShort(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec4s {
        x = (-x).toShort(); y = (-y).toShort(); z = (-z).toShort(); w = (-w).toShort(); return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4s = glm.add(Vec4s(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4s) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4s = glm.sub(Vec4s(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4s) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Short) = glm.add(Vec4s(), this, b, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec4s(), this, b, b, b, b)
    operator fun plus(b: Vec4s) = glm.add(Vec4s(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.add(Vec4s(), this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(Vec4s(), this, bX, bY, bZ, bW)

    infix fun addAss(b: Short) = glm.add(this, this, b, b, b, b)
    infix fun addAss(b: Int) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.add(this, this, bX, bY, bZ, bW)
    fun addAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(this, this, bX, bY, bZ, bW)
    infix fun addAss(b: Vec4s) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Short, res: Vec4s) = glm.add(res, this, b, b, b, b)
    fun add(b: Int, res: Vec4s) = glm.add(res, this, b, b, b, b)
    fun add(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4s, res: Vec4s) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Short) = glm.sub(Vec4s(), this, b, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec4s(), this, b, b, b, b)
    operator fun minus(b: Vec4s) = glm.sub(Vec4s(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.sub(Vec4s(), this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(Vec4s(), this, bX, bY, bZ, bW)

    infix fun subAss(b: Short) = glm.sub(this, this, b, b, b, b)
    infix fun subAss(b: Int) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.sub(this, this, bX, bY, bZ, bW)
    fun subAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(this, this, bX, bY, bZ, bW)
    infix fun subAss(b: Vec4s) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Short, res: Vec4s) = glm.sub(res, this, b, b, b, b)
    fun sub(b: Int, res: Vec4s) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4s, res: Vec4s) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Short) = glm.mul(Vec4s(), this, b, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec4s(), this, b, b, b, b)
    operator fun times(b: Vec4s) = glm.mul(Vec4s(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.mul(Vec4s(), this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(Vec4s(), this, bX, bY, bZ, bW)

    infix fun mulAss(b: Short) = glm.mul(this, this, b, b, b, b)
    infix fun mulAss(b: Int) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.mul(this, this, bX, bY, bZ, bW)
    fun mulAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(this, this, bX, bY, bZ, bW)
    infix fun mulAss(b: Vec4s) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Short, res: Vec4s) = glm.mul(res, this, b, b, b, b)
    fun mul(b: Int, res: Vec4s) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4s, res: Vec4s) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Short) = glm.div(Vec4s(), this, b, b, b, b)
    operator fun div(b: Int) = glm.div(Vec4s(), this, b, b, b, b)
    operator fun div(b: Vec4s) = glm.div(Vec4s(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.div(Vec4s(), this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(Vec4s(), this, bX, bY, bZ, bW)

    infix fun divAss(b: Short) = glm.div(this, this, b, b, b, b)
    infix fun divAss(b: Int) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.div(this, this, bX, bY, bZ, bW)
    fun divAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(this, this, bX, bY, bZ, bW)
    infix fun divAss(b: Vec4s) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Short, res: Vec4s) = glm.div(res, this, b, b, b, b)
    fun div(b: Int, res: Vec4s) = glm.div(res, this, b, b, b, b)
    fun div(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4s, res: Vec4s) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Short) = glm.mod(Vec4s(), this, b, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec4s(), this, b, b, b, b)
    operator fun mod(b: Vec4s) = glm.mod(Vec4s(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.mod(Vec4s(), this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(Vec4s(), this, bX, bY, bZ, bW)

    infix fun modAss(b: Short) = glm.mod(this, this, b, b, b, b)
    infix fun modAss(b: Int) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.mod(this, this, bX, bY, bZ, bW)
    fun modAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(this, this, bX, bY, bZ, bW)
    infix fun modAss(b: Vec4s) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Short, res: Vec4s) = glm.mod(res, this, b, b, b, b)
    fun mod(b: Int, res: Vec4s) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4s, res: Vec4s) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    infix fun and(b: Short) = glm.and(Vec4s(), this, b, b, b, b)
    infix fun and(b: Int) = glm.and(Vec4s(), this, b, b, b, b)
    fun and(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.and(Vec4s(), this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(Vec4s(), this, bX, bY, bZ, bW)
    fun and(b: Vec4s) = glm.and(Vec4s(), this, b.x, b.y, b.z, b.w)

    infix fun andAss(b: Short) = glm.and(this, this, b, b, b, b)
    infix fun andAss(b: Int) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.and(this, this, bX, bY, bZ, bW)
    fun andAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(this, this, bX, bY, bZ, bW)
    infix fun andAss(b: Vec4s) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Short, res: Vec4s) = glm.and(res, this, b, b, b, b)
    fun and(b: Int, res: Vec4s) = glm.and(res, this, b, b, b, b)
    fun and(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4s, res: Vec4s) = glm.and(res, this, b.x, b.y, b.z, b.w)


    infix fun or(b: Short) = glm.or(Vec4s(), this, b, b, b, b)
    infix fun or(b: Int) = glm.or(Vec4s(), this, b, b, b, b)
    fun or(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.or(Vec4s(), this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(Vec4s(), this, bX, bY, bZ, bW)
    fun or(b: Vec4s) = glm.or(Vec4s(), this, b.x, b.y, b.z, b.w)

    infix fun orAss(b: Short) = glm.or(this, this, b, b, b, b)
    infix fun orAss(b: Int) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.or(this, this, bX, bY, bZ, bW)
    fun orAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(this, this, bX, bY, bZ, bW)
    infix fun orAss(b: Vec4s) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Short, res: Vec4s) = glm.or(res, this, b, b, b, b)
    fun or(b: Int, res: Vec4s) = glm.or(res, this, b, b, b, b)
    fun or(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4s, res: Vec4s) = glm.or(res, this, b.x, b.y, b.z, b.w)


    infix fun xor(b: Short) = glm.xor(Vec4s(), this, b, b, b, b)
    infix fun xor(b: Int) = glm.xor(Vec4s(), this, b, b, b, b)
    fun xor(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.xor(Vec4s(), this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(Vec4s(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4s) = glm.xor(Vec4s(), this, b.x, b.y, b.z, b.w)

    infix fun xorAss(b: Short) = glm.xor(this, this, b, b, b, b)
    infix fun xorAss(b: Int) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.xor(this, this, bX, bY, bZ, bW)
    fun xorAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(this, this, bX, bY, bZ, bW)
    infix fun xorAss(b: Vec4s) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Short, res: Vec4s) = glm.xor(res, this, b, b, b, b)
    fun xor(b: Int, res: Vec4s) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4s, res: Vec4s) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    infix fun shl(b: Short) = glm.shl(Vec4s(), this, b, b, b, b)
    infix fun shl(b: Int) = glm.shl(Vec4s(), this, b, b, b, b)
    fun shl(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.shl(Vec4s(), this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4s(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4s) = glm.shl(Vec4s(), this, b.x, b.y, b.z, b.w)

    infix fun shlAss(b: Short) = glm.shl(this, this, b, b, b, b)
    infix fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.shl(this, this, bX, bY, bZ, bW)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)
    infix fun shlAss(b: Vec4s) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Short, res: Vec4s) = glm.shl(res, this, b, b, b, b)
    fun shl(b: Int, res: Vec4s) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4s, res: Vec4s) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    infix fun shr(b: Short) = glm.shr(Vec4s(), this, b, b, b, b)
    infix fun shr(b: Int) = glm.shr(Vec4s(), this, b, b, b, b)
    fun shr(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.shr(Vec4s(), this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4s(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4s) = glm.shr(Vec4s(), this, b.x, b.y, b.z, b.w)

    infix fun shrAss(b: Short) = glm.shr(this, this, b, b, b, b)
    infix fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Short, bY: Short, bZ: Short, bW: Short) = glm.shr(this, this, bX, bY, bZ, bW)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)
    infix fun shrAss(b: Vec4s) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Short, res: Vec4s) = glm.shr(res, this, b, b, b, b)
    fun shr(b: Int, res: Vec4s) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Short, bY: Short, bZ: Short, bW: Short, res: Vec4s) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4s) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4s, res: Vec4s) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4s(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4s) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Short.plus(b: Vec4s) = glm.add(Vec4s(), b, this, this, this, this)
infix fun Short.addAss(b: Vec4s) = glm.add(b, b, this, this, this, this)

operator fun Short.minus(b: Vec4s) = glm.sub(Vec4s(), this, this, this, this, b)
infix fun Short.subAss(b: Vec4s) = glm.sub(b, this, this, this, this, b)

operator fun Short.times(b: Vec4s) = glm.mul(Vec4s(), b, this, this, this, this)
infix fun Short.mulAss(b: Vec4s) = glm.mul(b, b, this, this, this, this)

operator fun Short.div(b: Vec4s) = glm.div(Vec4s(), this, this, this, this, b)
infix fun Short.divAss(b: Vec4s) = glm.div(b, this, this, this, this, b)

operator fun Short.mod(b: Vec4s) = glm.mod(Vec4s(), this, this, this, this, b)
infix fun Short.modAss(b: Vec4s) = glm.mod(b, this, this, this, this, b)


operator fun Int.plus(b: Vec4s) = glm.add(Vec4s(), b, this, this, this, this)
infix fun Int.addAss(b: Vec4s) = glm.add(b, b, this, this, this, this)

operator fun Int.minus(b: Vec4s) = glm.sub(Vec4s(), this, this, this, this, b)
infix fun Int.subAss(b: Vec4s) = glm.sub(b, this, this, this, this, b)

operator fun Int.times(b: Vec4s) = glm.mul(Vec4s(), b, this, this, this, this)
infix fun Int.mulAss(b: Vec4s) = glm.mul(b, b, this, this, this, this)

operator fun Int.div(b: Vec4s) = glm.div(Vec4s(), this, this, this, this, b)
infix fun Int.divAss(b: Vec4s) = glm.div(b, this, this, this, this, b)

operator fun Int.mod(b: Vec4s) = glm.mod(Vec4s(), this, this, this, this, b)
infix fun Int.modAss(b: Vec4s) = glm.mod(b, this, this, this, this, b)