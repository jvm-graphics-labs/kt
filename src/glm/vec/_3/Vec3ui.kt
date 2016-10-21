package glm.vec._3

import Uint
import glm.glm
import glm.vec.Vec3t

/**
 * Created by elect on 09/10/16.
 */

data class Vec3ui(override var x: Uint = Uint(0), override var y: Uint = Uint(0), override var z: Uint = Uint(0)) : Vec3t<Uint>(x, y, z) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(Uint(v.x), Uint(v.y), Uint(v.z))

    constructor(s: Uint) : this(s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Uint(s), Uint(s), Uint(s))

    constructor(ba: ByteArray) : this(Uint(ba[0]), Uint(ba[1]), Uint(ba[2]))

    constructor(ba: Array<Uint>) : this(ba[0], ba[1], ba[2])


    fun to(v: Vec3t<Number>): Vec3ui {
        x.v = v.x.toInt(); y.v = v.y.toInt(); z.v = v.z.toInt(); return this
    }

    fun to(s: Uint): Vec3ui {
        x.v = s.v; y.v = s.v; z.v = s.v; return this
    }

    fun to(s: Int): Vec3ui {
        x.v = s; y.v = s; z.v = s; return this
    }

    fun to(x: Uint, y: Uint, z: Uint): Vec3ui {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; return this
    }

    fun to(x: Int, y: Int, z: Int): Vec3ui {
        this.x.v = x; this.y.v = y; this.z.v = z; return this
    }

    fun to(ia: IntArray): Vec3ui {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; return this
    }

    fun to(ba: Array<Uint>): Vec3ui {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; return this
    }


    fun to(ia: Array<Int>): Vec3ui {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Uint) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; else -> z.v = s.v; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s; 1 -> y.v = s; else -> z.v = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3ui = glm.add(Vec3ui(), this, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1)
    fun inc(res: Vec3ui) = glm.add(res, this, 1, 1, 1)


    operator fun dec(): Vec3ui = glm.sub(Vec3ui(), this, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1)
    fun dec(res: Vec3ui) = glm.sub(res, this, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Uint) = glm.add(Vec3ui(), this, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec3ui(), this, b, b, b)
    operator fun plus(b: Vec3ui) = glm.add(Vec3ui(), this, b.x, b.y, b.z)

    fun add(bX: Uint, bY: Uint, bZ: Uint) = glm.add(Vec3ui(), this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int) = glm.add(Vec3ui(), this, bX, bY, bZ)

    infix fun addAss(b: Uint) = glm.add(this, this, b, b, b)
    infix fun addAss(b: Int) = glm.add(this, this, b, b, b)
    fun addAss(bX: Uint, bY: Uint, bZ: Uint) = glm.add(this, this, bX, bY, bZ)
    fun addAss(bX: Int, bY: Int, bZ: Int) = glm.add(this, this, bX, bY, bZ)
    infix fun addAss(b: Vec3ui) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Uint, res: Vec3ui) = glm.add(res, this, b, b, b)
    fun add(b: Int, res: Vec3ui) = glm.add(res, this, b, b, b)
    fun add(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.add(res, this, bX, bY, bZ)
    fun add(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3ui, res: Vec3ui) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Uint) = glm.sub(Vec3ui(), this, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec3ui(), this, b, b, b)
    operator fun minus(b: Vec3ui) = glm.sub(Vec3ui(), this, b.x, b.y, b.z)

    fun sub(bX: Uint, bY: Uint, bZ: Uint) = glm.sub(Vec3ui(), this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int) = glm.sub(Vec3ui(), this, bX, bY, bZ)

    infix fun subAss(b: Uint) = glm.sub(this, this, b, b, b)
    infix fun subAss(b: Int) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Uint, bY: Uint, bZ: Uint) = glm.sub(this, this, bX, bY, bZ)
    fun subAss(bX: Int, bY: Int, bZ: Int) = glm.sub(this, this, bX, bY, bZ)
    infix fun subAss(b: Vec3ui) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Uint, res: Vec3ui) = glm.sub(res, this, b, b, b)
    fun sub(b: Int, res: Vec3ui) = glm.sub(res, this, b, b, b)
    fun sub(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.sub(res, this, bX, bY, bZ)
    fun sub(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3ui, res: Vec3ui) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Uint) = glm.mul(Vec3ui(), this, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec3ui(), this, b, b, b)
    operator fun times(b: Vec3ui) = glm.mul(Vec3ui(), this, b.x, b.y, b.z)

    fun mul(bX: Uint, bY: Uint, bZ: Uint) = glm.mul(Vec3ui(), this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int) = glm.mul(Vec3ui(), this, bX, bY, bZ)

    infix fun mulAss(b: Uint) = glm.mul(this, this, b, b, b)
    infix fun mulAss(b: Int) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Uint, bY: Uint, bZ: Uint) = glm.mul(this, this, bX, bY, bZ)
    fun mulAss(bX: Int, bY: Int, bZ: Int) = glm.mul(this, this, bX, bY, bZ)
    infix fun mulAss(b: Vec3ui) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Uint, res: Vec3ui) = glm.mul(res, this, b, b, b)
    fun mul(b: Int, res: Vec3ui) = glm.mul(res, this, b, b, b)
    fun mul(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.mul(res, this, bX, bY, bZ)
    fun mul(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3ui, res: Vec3ui) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Uint) = glm.div(Vec3ui(), this, b, b, b)
    operator fun div(b: Int) = glm.div(Vec3ui(), this, b, b, b)
    operator fun div(b: Vec3ui) = glm.div(Vec3ui(), this, b.x, b.y, b.z)

    fun div(bX: Uint, bY: Uint, bZ: Uint) = glm.div(Vec3ui(), this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int) = glm.div(Vec3ui(), this, bX, bY, bZ)

    infix fun divAss(b: Uint) = glm.div(this, this, b, b, b)
    infix fun divAss(b: Int) = glm.div(this, this, b, b, b)
    fun divAss(bX: Uint, bY: Uint, bZ: Uint) = glm.div(this, this, bX, bY, bZ)
    fun divAss(bX: Int, bY: Int, bZ: Int) = glm.div(this, this, bX, bY, bZ)
    infix fun divAss(b: Vec3ui) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Uint, res: Vec3ui) = glm.div(res, this, b, b, b)
    fun div(b: Int, res: Vec3ui) = glm.div(res, this, b, b, b)
    fun div(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.div(res, this, bX, bY, bZ)
    fun div(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3ui, res: Vec3ui) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Uint) = glm.mod(Vec3ui(), this, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec3ui(), this, b, b, b)
    operator fun mod(b: Vec3ui) = glm.mod(Vec3ui(), this, b.x, b.y, b.z)

    fun mod(bX: Uint, bY: Uint, bZ: Uint) = glm.mod(Vec3ui(), this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int) = glm.mod(Vec3ui(), this, bX, bY, bZ)

    infix fun modAss(b: Uint) = glm.mod(this, this, b, b, b)
    infix fun modAss(b: Int) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Uint, bY: Uint, bZ: Uint) = glm.mod(this, this, bX, bY, bZ)
    fun modAss(bX: Int, bY: Int, bZ: Int) = glm.mod(this, this, bX, bY, bZ)
    infix fun modAss(b: Vec3ui) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Uint, res: Vec3ui) = glm.mod(res, this, b, b, b)
    fun mod(b: Int, res: Vec3ui) = glm.mod(res, this, b, b, b)
    fun mod(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.mod(res, this, bX, bY, bZ)
    fun mod(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3ui, res: Vec3ui) = glm.mod(res, this, b.x, b.y, b.z)

    // -- Unary bit vecOperators --

    infix fun and(b: Uint) = glm.and(Vec3ui(), this, b, b, b)
    infix fun and(b: Int) = glm.and(Vec3ui(), this, b, b, b)
    fun and(bX: Uint, bY: Uint, bZ: Uint) = glm.and(Vec3ui(), this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int) = glm.and(Vec3ui(), this, bX, bY, bZ)
    fun and(b: Vec3ui) = glm.and(Vec3ui(), this, b.x, b.y, b.z)

    infix fun andAss(b: Uint) = glm.and(this, this, b, b, b)
    infix fun andAss(b: Int) = glm.and(this, this, b, b, b)
    fun andAss(bX: Uint, bY: Uint, bZ: Uint) = glm.and(this, this, bX, bY, bZ)
    fun andAss(bX: Int, bY: Int, bZ: Int) = glm.and(this, this, bX, bY, bZ)
    infix fun andAss(b: Vec3ui) = glm.and(this, this, b.x, b.y, b.z)

    fun and(b: Uint, res: Vec3ui) = glm.and(res, this, b, b, b)
    fun and(b: Int, res: Vec3ui) = glm.and(res, this, b, b, b)
    fun and(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.and(res, this, bX, bY, bZ)
    fun and(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.and(res, this, bX, bY, bZ)
    fun and(b: Vec3ui, res: Vec3ui) = glm.and(res, this, b.x, b.y, b.z)


    infix fun or(b: Uint) = glm.or(Vec3ui(), this, b, b, b)
    infix fun or(b: Int) = glm.or(Vec3ui(), this, b, b, b)
    fun or(bX: Uint, bY: Uint, bZ: Uint) = glm.or(Vec3ui(), this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int) = glm.or(Vec3ui(), this, bX, bY, bZ)
    fun or(b: Vec3ui) = glm.or(Vec3ui(), this, b.x, b.y, b.z)

    infix fun orAss(b: Uint) = glm.or(this, this, b, b, b)
    infix fun orAss(b: Int) = glm.or(this, this, b, b, b)
    fun orAss(bX: Uint, bY: Uint, bZ: Uint) = glm.or(this, this, bX, bY, bZ)
    fun orAss(bX: Int, bY: Int, bZ: Int) = glm.or(this, this, bX, bY, bZ)
    infix fun orAss(b: Vec3ui) = glm.or(this, this, b.x, b.y, b.z)

    fun or(b: Uint, res: Vec3ui) = glm.or(res, this, b, b, b)
    fun or(b: Int, res: Vec3ui) = glm.or(res, this, b, b, b)
    fun or(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.or(res, this, bX, bY, bZ)
    fun or(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.or(res, this, bX, bY, bZ)
    fun or(b: Vec3ui, res: Vec3ui) = glm.or(res, this, b.x, b.y, b.z)


    infix fun xor(b: Uint) = glm.xor(Vec3ui(), this, b, b, b)
    infix fun xor(b: Int) = glm.xor(Vec3ui(), this, b, b, b)
    fun xor(bX: Uint, bY: Uint, bZ: Uint) = glm.xor(Vec3ui(), this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int) = glm.xor(Vec3ui(), this, bX, bY, bZ)
    fun xor(b: Vec3ui) = glm.xor(Vec3ui(), this, b.x, b.y, b.z)

    infix fun xorAss(b: Uint) = glm.xor(this, this, b, b, b)
    infix fun xorAss(b: Int) = glm.xor(this, this, b, b, b)
    fun xorAss(bX: Uint, bY: Uint, bZ: Uint) = glm.xor(this, this, bX, bY, bZ)
    fun xorAss(bX: Int, bY: Int, bZ: Int) = glm.xor(this, this, bX, bY, bZ)
    infix fun xorAss(b: Vec3ui) = glm.xor(this, this, b.x, b.y, b.z)

    fun xor(b: Uint, res: Vec3ui) = glm.xor(res, this, b, b, b)
    fun xor(b: Int, res: Vec3ui) = glm.xor(res, this, b, b, b)
    fun xor(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.xor(res, this, bX, bY, bZ)
    fun xor(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.xor(res, this, bX, bY, bZ)
    fun xor(b: Vec3ui, res: Vec3ui) = glm.xor(res, this, b.x, b.y, b.z)


    infix fun shl(b: Uint) = glm.shl(Vec3ui(), this, b, b, b)
    infix fun shl(b: Int) = glm.shl(Vec3ui(), this, b, b, b)
    fun shl(bX: Uint, bY: Uint, bZ: Uint) = glm.shl(Vec3ui(), this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int) = glm.shl(Vec3ui(), this, bX, bY, bZ)
    fun shl(b: Vec3ui) = glm.shl(Vec3ui(), this, b.x, b.y, b.z)

    infix fun shlAss(b: Uint) = glm.shl(this, this, b, b, b)
    infix fun shlAss(b: Int) = glm.shl(this, this, b, b, b)
    fun shlAss(bX: Uint, bY: Uint, bZ: Uint) = glm.shl(this, this, bX, bY, bZ)
    fun shlAss(bX: Int, bY: Int, bZ: Int) = glm.shl(this, this, bX, bY, bZ)
    infix fun shlAss(b: Vec3ui) = glm.shl(this, this, b.x, b.y, b.z)

    fun shl(b: Uint, res: Vec3ui) = glm.shl(res, this, b, b, b)
    fun shl(b: Int, res: Vec3ui) = glm.shl(res, this, b, b, b)
    fun shl(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.shl(res, this, bX, bY, bZ)
    fun shl(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.shl(res, this, bX, bY, bZ)
    fun shl(b: Vec3ui, res: Vec3ui) = glm.shl(res, this, b.x, b.y, b.z)


    infix fun shr(b: Uint) = glm.shr(Vec3ui(), this, b, b, b)
    infix fun shr(b: Int) = glm.shr(Vec3ui(), this, b, b, b)
    fun shr(bX: Uint, bY: Uint, bZ: Uint) = glm.shr(Vec3ui(), this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int) = glm.shr(Vec3ui(), this, bX, bY, bZ)
    fun shr(b: Vec3ui) = glm.shr(Vec3ui(), this, b.x, b.y, b.z)

    infix fun shrAss(b: Uint) = glm.shr(this, this, b, b, b)
    infix fun shrAss(b: Int) = glm.shr(this, this, b, b, b)
    fun shrAss(bX: Uint, bY: Uint, bZ: Uint) = glm.shr(this, this, bX, bY, bZ)
    fun shrAss(bX: Int, bY: Int, bZ: Int) = glm.shr(this, this, bX, bY, bZ)
    infix fun shrAss(b: Vec3ui) = glm.shr(this, this, b.x, b.y, b.z)

    fun shr(b: Uint, res: Vec3ui) = glm.shr(res, this, b, b, b)
    fun shr(b: Int, res: Vec3ui) = glm.shr(res, this, b, b, b)
    fun shr(bX: Uint, bY: Uint, bZ: Uint, res: Vec3ui) = glm.shr(res, this, bX, bY, bZ)
    fun shr(bX: Int, bY: Int, bZ: Int, res: Vec3ui) = glm.shr(res, this, bX, bY, bZ)
    fun shr(b: Vec3ui, res: Vec3ui) = glm.shr(res, this, b.x, b.y, b.z)


    fun inv() = glm.inv(Vec3ui(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec3ui) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Uint.plus(b: Vec3ui) = glm.add(Vec3ui(), b, this, this, this)
infix fun Uint.addAss(b: Vec3ui) = glm.add(b, b, this, this, this)

operator fun Uint.minus(b: Vec3ui) = glm.sub(Vec3ui(), this, this, this, b)
infix fun Uint.subAss(b: Vec3ui) = glm.sub(b, this, this, this, b)

operator fun Uint.times(b: Vec3ui) = glm.mul(Vec3ui(), b, this, this, this)
infix fun Uint.mulAss(b: Vec3ui) = glm.mul(b, b, this, this, this)

operator fun Uint.div(b: Vec3ui) = glm.div(Vec3ui(), this, this, this, b)
infix fun Uint.divAss(b: Vec3ui) = glm.div(b, this, this, this, b)

operator fun Uint.mod(b: Vec3ui) = glm.mod(Vec3ui(), this, this, this, b)
infix fun Uint.modAss(b: Vec3ui) = glm.mod(b, this, this, this, b)


operator fun Int.plus(b: Vec3ui) = glm.add(Vec3ui(), b, this, this, this)
infix fun Int.addAss(b: Vec3ui) = glm.add(b, b, this, this, this)

operator fun Int.minus(b: Vec3ui) = glm.sub(Vec3ui(), this, this, this, b)
infix fun Int.subAss(b: Vec3ui) = glm.sub(b, this, this, this, b)

operator fun Int.times(b: Vec3ui) = glm.mul(Vec3ui(), b, this, this, this)
infix fun Int.mulAss(b: Vec3ui) = glm.mul(b, b, this, this, this)

operator fun Int.div(b: Vec3ui) = glm.div(Vec3ui(), this, this, this, b)
infix fun Int.divAss(b: Vec3ui) = glm.div(b, this, this, this, b)

operator fun Int.mod(b: Vec3ui) = glm.mod(Vec3ui(), this, this, this, b)
infix fun Int.modAss(b: Vec3ui) = glm.mod(b, this, this, this, b)