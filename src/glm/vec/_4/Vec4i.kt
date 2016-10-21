package glm.vec._4

import glm.glm
import glm.vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4i(override var x: Int = 0, override var y: Int = 0, override var z: Int = 0, override var w: Int = 0) : Vec4t<Int>(x, y, z, w) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(v.x.toInt(), v.y.toInt(), v.z.toInt(), v.w.toInt())

    constructor(s: Int) : this(s, s, s, s)

    constructor(ia: IntArray) : this(ia[0], ia[1], ia[2], ia[3])

    constructor(ia: Array<Int>) : this(ia[0], ia[1], ia[2], ia[3])


    fun to(v: Vec4t<Number>): Vec4i {
        x = v.x.toInt(); y = v.y.toInt(); z = v.z.toInt(); w = v.w.toInt(); return this
    }

    fun to(s: Int): Vec4i {
        x = s; y = s; z = s; w = s; return this
    }

    fun to(x: Int, y: Int, z: Int, w: Int): Vec4i {
        this.x = x; this.y = y; this.z = z; this.w = w; return this
    }

    fun to(ba: IntArray): Vec4i {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ba: Array<Int>): Vec4i {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> 2; }

    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s; 1 -> y = s; 2 -> z = s; else -> w = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec4i {
        x = -x; y = -y; z = -z; w = -w; return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4i = glm.add(Vec4i(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4i) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4i = glm.sub(Vec4i(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4i) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Int) = glm.add(Vec4i(), this, b, b, b, b)
    operator fun plus(b: Vec4i) = glm.add(Vec4i(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(Vec4i(), this, bX, bY, bZ, bW)

    infix fun addAss(b: Int) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(this, this, bX, bY, bZ, bW)
    infix fun addAss(b: Vec4i) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Int, res: Vec4i) = glm.add(res, this, b, b, b, b)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4i, res: Vec4i) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Int) = glm.sub(Vec4i(), this, b, b, b, b)
    operator fun minus(b: Vec4i) = glm.sub(Vec4i(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(Vec4i(), this, bX, bY, bZ, bW)

    infix fun subAss(b: Int) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(this, this, bX, bY, bZ, bW)
    infix fun subAss(b: Vec4i) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Int, res: Vec4i) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4i, res: Vec4i) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Int) = glm.mul(Vec4i(), this, b, b, b, b)
    operator fun times(b: Vec4i) = glm.mul(Vec4i(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(Vec4i(), this, bX, bY, bZ, bW)

    infix fun mulAss(b: Int) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(this, this, bX, bY, bZ, bW)
    infix fun mulAss(b: Vec4i) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Int, res: Vec4i) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4i, res: Vec4i) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Int) = glm.div(Vec4i(), this, b, b, b, b)
    operator fun div(b: Vec4i) = glm.div(Vec4i(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(Vec4i(), this, bX, bY, bZ, bW)

    infix fun divAss(b: Int) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(this, this, bX, bY, bZ, bW)
    infix fun divAss(b: Vec4i) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Int, res: Vec4i) = glm.div(res, this, b, b, b, b)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4i, res: Vec4i) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Int) = glm.mod(Vec4i(), this, b, b, b, b)
    operator fun mod(b: Vec4i) = glm.mod(Vec4i(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(Vec4i(), this, bX, bY, bZ, bW)

    infix fun modAss(b: Int) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(this, this, bX, bY, bZ, bW)
    infix fun modAss(b: Vec4i) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Int, res: Vec4i) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4i, res: Vec4i) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    infix fun and(b: Int) = glm.and(Vec4i(), this, b, b, b, b)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(Vec4i(), this, bX, bY, bZ, bW)
    fun and(b: Vec4i) = glm.and(Vec4i(), this, b.x, b.y, b.z, b.w)

    infix fun andAss(b: Int) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(this, this, bX, bY, bZ, bW)
    infix fun andAss(b: Vec4i) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Int, res: Vec4i) = glm.and(res, this, b, b, b, b)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4i, res: Vec4i) = glm.and(res, this, b.x, b.y, b.z, b.w)


    infix fun or(b: Int) = glm.or(Vec4i(), this, b, b, b, b)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(Vec4i(), this, bX, bY, bZ, bW)
    fun or(b: Vec4i) = glm.or(Vec4i(), this, b.x, b.y, b.z, b.w)

    infix fun orAss(b: Int) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(this, this, bX, bY, bZ, bW)
    infix fun orAss(b: Vec4i) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Int, res: Vec4i) = glm.or(res, this, b, b, b, b)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4i, res: Vec4i) = glm.or(res, this, b.x, b.y, b.z, b.w)


    infix fun xor(b: Int) = glm.xor(Vec4i(), this, b, b, b, b)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(Vec4i(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4i) = glm.xor(Vec4i(), this, b.x, b.y, b.z, b.w)

    infix fun xorAss(b: Int) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(this, this, bX, bY, bZ, bW)
    infix fun xorAss(b: Vec4i) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Int, res: Vec4i) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4i, res: Vec4i) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    infix fun shl(b: Int) = glm.shl(Vec4i(), this, b, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4i(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4i) = glm.shl(Vec4i(), this, b.x, b.y, b.z, b.w)

    infix fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)
    infix fun shlAss(b: Vec4i) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Int, res: Vec4i) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4i, res: Vec4i) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    infix fun shr(b: Int) = glm.shr(Vec4i(), this, b, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4i(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4i) = glm.shr(Vec4i(), this, b.x, b.y, b.z, b.w)

    infix fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)
    infix fun shrAss(b: Vec4i) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Int, res: Vec4i) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4i) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4i, res: Vec4i) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4i(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4i) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Int.plus(b: Vec4i) = glm.add(Vec4i(), b, this, this, this, this)
infix fun Int.addAss(b: Vec4i) = glm.add(b, b, this, this, this, this)

operator fun Int.minus(b: Vec4i) = glm.sub(Vec4i(), this, this, this, this, b)
infix fun Int.subAss(b: Vec4i) = glm.sub(b, this, this, this, this, b)

operator fun Int.times(b: Vec4i) = glm.mul(Vec4i(), b, this, this, this, this)
infix fun Int.mulAss(b: Vec4i) = glm.mul(b, b, this, this, this, this)

operator fun Int.div(b: Vec4i) = glm.div(Vec4i(), this, this, this, this, b)
infix fun Int.divAss(b: Vec4i) = glm.div(b, this, this, this, this, b)

operator fun Int.mod(b: Vec4i) = glm.mod(Vec4i(), this, this, this, this, b)
infix fun Int.modAss(b: Vec4i) = glm.mod(b, this, this, this, this, b)