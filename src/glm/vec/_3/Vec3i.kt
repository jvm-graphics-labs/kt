package glm.vec._3

import glm.glm
import glm.vec.Vec3t
import glm.vec.bool.Vec3bool

/**
 * Created by elect on 08/10/16.
 */

data class Vec3i(override var x: Int = 0, override var y: Int = 0, override var z: Int = 0) : Vec3t<Int>(x, y, z) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec3t<out Number>) : this(v.x.toInt(), v.y.toInt(), v.z.toInt())

    constructor(s: Int) : this(s, s, s)

    constructor(ia: IntArray) : this(ia[0], ia[1], ia[2])

    constructor(ia: Array<Int>) : this(ia[0], ia[1], ia[2])


    fun to(v: Vec3t<Number>): Vec3i {
        x = v.x.toInt(); y = v.y.toInt(); z = v.z.toInt(); return this
    }

    fun to(s: Int): Vec3i {
        x = s; y = s; z = s; return this
    }

    fun to(x: Int, y: Int, z: Int): Vec3i {
        this.x = x; this.y = y; this.z = z; return this
    }

    fun to(ba: IntArray): Vec3i {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }

    fun to(ba: Array<Int>): Vec3i {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Int) = when (i) {0 -> x = s; 1 -> y = s; else -> z = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec3i {
        x = -x; y = -y; z = -z; return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3i = glm.add(Vec3i(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3i) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3i = glm.sub(Vec3i(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3i) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Int) = glm.add(Vec3i(), this, b, b, b)
    operator fun plus(b: Vec3i) = glm.add(Vec3i(), this, b.x, b.y, b.z)

    fun add(bX: Int, bY: Int, bZ: Int) = glm.add(Vec3i(), this, bX, bY, bZ)

    infix fun addAss(b: Int) = glm.add(this, this, b, b, b)
    fun addAss(bX: Int, bY: Int, bZ: Int) = glm.add(this, this, bX, bY, bZ)
    infix fun addAss(b: Vec3i) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Int, res: Vec3i) = glm.add(res, this, b, b, b)
    fun add(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3i, res: Vec3i) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Int) = glm.sub(Vec3i(), this, b, b, b)
    operator fun minus(b: Vec3i) = glm.sub(Vec3i(), this, b.x, b.y, b.z)

    fun sub(bX: Int, bY: Int, bZ: Int) = glm.sub(Vec3i(), this, bX, bY, bZ)

    infix fun subAss(b: Int) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Int, bY: Int, bZ: Int) = glm.sub(this, this, bX, bY, bZ)
    infix fun subAss(b: Vec3i) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Int, res: Vec3i) = glm.sub(res, this, b, b, b)
    fun sub(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3i, res: Vec3i) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Int) = glm.mul(Vec3i(), this, b, b, b)
    operator fun times(b: Vec3i) = glm.mul(Vec3i(), this, b.x, b.y, b.z)

    fun mul(bX: Int, bY: Int, bZ: Int) = glm.mul(Vec3i(), this, bX, bY, bZ)

    infix fun mulAss(b: Int) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Int, bY: Int, bZ: Int) = glm.mul(this, this, bX, bY, bZ)
    infix fun mulAss(b: Vec3i) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Int, res: Vec3i) = glm.mul(res, this, b, b, b)
    fun mul(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3i, res: Vec3i) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Int) = glm.div(Vec3i(), this, b, b, b)
    operator fun div(b: Vec3i) = glm.div(Vec3i(), this, b.x, b.y, b.z)

    fun div(bX: Int, bY: Int, bZ: Int) = glm.div(Vec3i(), this, bX, bY, bZ)

    infix fun divAss(b: Int) = glm.div(this, this, b, b, b)
    fun divAss(bX: Int, bY: Int, bZ: Int) = glm.div(this, this, bX, bY, bZ)
    infix fun divAss(b: Vec3i) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Int, res: Vec3i) = glm.div(res, this, b, b, b)
    fun div(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3i, res: Vec3i) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Int) = glm.mod(Vec3i(), this, b, b, b)
    operator fun mod(b: Vec3i) = glm.mod(Vec3i(), this, b.x, b.y, b.z)

    fun mod(bX: Int, bY: Int, bZ: Int) = glm.mod(Vec3i(), this, bX, bY, bZ)

    infix fun modAss(b: Int) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Int, bY: Int, bZ: Int) = glm.mod(this, this, bX, bY, bZ)
    infix fun modAss(b: Vec3i) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Int, res: Vec3i) = glm.mod(res, this, b, b, b)
    fun mod(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3i, res: Vec3i) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    infix fun and(b: Int) = glm.and(Vec3i(), this, b, b, b)
    fun and(bX: Int, bY: Int, bZ: Int) = glm.and(Vec3i(), this, bX, bY, bZ)
    fun and(b: Vec3i) = glm.and(Vec3i(), this, b.x, b.y, b.z)

    infix fun andAss(b: Int) = glm.and(this, this, b, b, b)
    fun andAss(bX: Int, bY: Int, bZ: Int) = glm.and(this, this, bX, bY, bZ)
    infix fun andAss(b: Vec3i) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Int, res: Vec3i) = glm.and(res, this, b, b, b)
    fun and(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3i, res: Vec3i) = glm.and(res, this, b.x, b.y, b.z)


    infix fun or(b: Int) = glm.or(Vec3i(), this, b, b, b)
    fun or(bX: Int, bY: Int, bZ: Int) = glm.or(Vec3i(), this, bX, bY, bZ)
    fun or(b: Vec3i) = glm.or(Vec3i(), this, b.x, b.y, b.z)

    infix fun orAss(b: Int) = glm.or(this, this, b, b, b)
    fun orAss(bX: Int, bY: Int, bZ: Int) = glm.or(this, this, bX, bY, bZ)
    infix fun orAss(b: Vec3i) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Int, res: Vec3i) = glm.or(res, this, b, b, b)
    fun or(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3i, res: Vec3i) = glm.or(res, this, b.x, b.y, b.z)


    infix fun xor(b: Int) = glm.xor(Vec3i(), this, b, b, b)
    fun xor(bX: Int, bY: Int, bZ: Int) = glm.xor(Vec3i(), this, bX, bY, bZ)
    fun xor(b: Vec3i) = glm.xor(Vec3i(), this, b.x, b.y, b.z)

    infix fun xorAss(b: Int) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Int, bY: Int, bZ: Int) = glm.xor(this, this, bX, bY, bZ)
    infix fun xorAss(b: Vec3i) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Int, res: Vec3i) = glm.xor(res, this, b, b, b)
    fun xor(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3i, res: Vec3i) = glm.xor(res, this, b.x, b.y, b.z)


    infix fun shl(b: Int) = glm.shl(Vec3i(), this, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3i(), this, bX, bY, bZ)
    fun shl(b: Vec3i) = glm.shl(Vec3i(), this, b.x, b.y, b.z)

    infix fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)
    infix fun shlAss(b: Vec3i) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Int, res: Vec3i) = glm.shl(res, this, b, b, b)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3i, res: Vec3i) = glm.shl(res, this, b.x, b.y, b.z)


    infix fun shr(b: Int) = glm.shr(Vec3i(), this, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3i(), this, bX, bY, bZ)
    fun shr(b: Vec3i) = glm.shr(Vec3i(), this, b.x, b.y, b.z)

    infix fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)
    infix fun shrAss(b: Vec3i) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Int, res: Vec3i) = glm.shr(res, this, b, b, b)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3i) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3i, res: Vec3i) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3i(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3i) = glm.inv(res, this)


    // TODO
    fun ceilMultiple(b: Vec3i) = ceilMultiple(b.x, b.y, b.z)

    fun ceilMultiple(bX: Int, bY: Int, bZ: Int) = Vec3i(glm.ceilMultiple(x, bX), glm.ceilMultiple(y, bY), glm.ceilMultiple(z, bZ))

    fun greaterThan(b: Int) = Vec3bool(x > b, y > b, z > b)
}


// -- Binary arithmetic vecOperators --

operator fun Int.plus(b: Vec3i) = glm.add(Vec3i(), b, this, this, this)
infix fun Int.addAss(b: Vec3i) = glm.add(b, b, this, this, this)

operator fun Int.minus(b: Vec3i) = glm.sub(Vec3i(), this, this, this, b)
infix fun Int.subAss(b: Vec3i) = glm.sub(b, this, this, this, b)

operator fun Int.times(b: Vec3i) = glm.mul(Vec3i(), b, this, this, this)
infix fun Int.mulAss(b: Vec3i) = glm.mul(b, b, this, this, this)

operator fun Int.div(b: Vec3i) = glm.div(Vec3i(), this, this, this, b)
infix fun Int.divAss(b: Vec3i) = glm.div(b, this, this, this, b)

operator fun Int.mod(b: Vec3i) = glm.mod(Vec3i(), this, this, this, b)
infix fun Int.modAss(b: Vec3i) = glm.mod(b, this, this, this, b)