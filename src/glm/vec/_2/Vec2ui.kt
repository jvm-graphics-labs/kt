package glm.vec._2

import glm.glm
import Uint
import glm.vec.Vec2t

/**
 * Created by elect on 08/10/16.
 */

data class Vec2ui(override var x: Uint = Uint(0), override var y: Uint = Uint(0)) : Vec2t<Uint>(x, y) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(Uint(v.x), Uint(v.y))

    constructor(s: Uint) : this(s.copy(), s.copy())
    constructor(s: Number) : this(Uint(s), Uint(s))

    constructor(ba: ByteArray) : this(Uint(ba[0]), Uint(ba[1]))

    constructor(ba: Array<Uint>) : this(ba[0], ba[1])


    fun to(v: Vec2t<Number>): Vec2ui {
        x.v = v.x.toInt(); y.v = v.y.toInt(); return this
    }

    fun to(s: Uint): Vec2ui {
        x.v = s.v; y.v = s.v; return this
    }

    fun to(s: Int): Vec2ui {
        x.v = s; y.v = s; return this
    }

    fun to(x: Uint, y: Uint): Vec2ui {
        this.x.v = x.v; this.y.v = y.v; return this
    }

    fun to(x: Int, y: Int): Vec2ui {
        this.x.v = x; this.y.v = y; return this
    }

    fun to(ia: IntArray): Vec2ui {
        x.v = ia[0]; y.v = ia[1]; return this
    }

    fun to(ba: Array<Uint>): Vec2ui {
        x.v = ba[0].v; y.v = ba[1].v; return this
    }


    fun to(ia: Array<Int>): Vec2ui {
        x.v = ia[0]; y.v = ia[1]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Uint) = when (i) {0 -> x.v = s.v; else -> y.v = s.v; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s; else -> y.v = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2ui = glm.add(Vec2ui(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2ui) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2ui = glm.sub(Vec2ui(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2ui) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Uint) = glm.add(Vec2ui(), this, b, b)
    operator fun plus(b: Int) = glm.add(Vec2ui(), this, b, b)
    operator fun plus(b: Vec2ui) = glm.add(Vec2ui(), this, b.x, b.y)

    fun add(bX: Uint, bY: Uint) = glm.add(Vec2ui(), this, bX, bY)
    fun add(bX: Int, bY: Int) = glm.add(Vec2ui(), this, bX, bY)

    infix fun addAss(b: Uint) = glm.add(this, this, b, b)
    infix fun addAss(b: Int) = glm.add(this, this, b, b)
    fun addAss(bX: Uint, bY: Uint) = glm.add(this, this, bX, bY)
    fun addAss(bX: Int, bY: Int) = glm.add(this, this, bX, bY)
    infix fun addAss(b: Vec2ui) = glm.add(this, this, b.x, b.y)

    fun add(b: Uint, res: Vec2ui) = glm.add(res, this, b, b)
    fun add(b: Int, res: Vec2ui) = glm.add(res, this, b, b)
    fun add(bX: Uint, bY: Uint, res: Vec2ui) = glm.add(res, this, bX, bY)
    fun add(bX: Int, bY: Int, res: Vec2ui) = glm.add(res, this, bX, bY)
    fun add(b: Vec2ui, res: Vec2ui) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Uint) = glm.sub(Vec2ui(), this, b, b)
    operator fun minus(b: Int) = glm.sub(Vec2ui(), this, b, b)
    operator fun minus(b: Vec2ui) = glm.sub(Vec2ui(), this, b.x, b.y)

    fun sub(bX: Uint, bY: Uint) = glm.sub(Vec2ui(), this, bX, bY)
    fun sub(bX: Int, bY: Int) = glm.sub(Vec2ui(), this, bX, bY)

    infix fun subAss(b: Uint) = glm.sub(this, this, b, b)
    infix fun subAss(b: Int) = glm.sub(this, this, b, b)
    fun subAss(bX: Uint, bY: Uint) = glm.sub(this, this, bX, bY)
    fun subAss(bX: Int, bY: Int) = glm.sub(this, this, bX, bY)
    infix fun subAss(b: Vec2ui) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Uint, res: Vec2ui) = glm.sub(res, this, b, b)
    fun sub(b: Int, res: Vec2ui) = glm.sub(res, this, b, b)
    fun sub(bX: Uint, bY: Uint, res: Vec2ui) = glm.sub(res, this, bX, bY)
    fun sub(bX: Int, bY: Int, res: Vec2ui) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2ui, res: Vec2ui) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Uint) = glm.mul(Vec2ui(), this, b, b)
    operator fun times(b: Int) = glm.mul(Vec2ui(), this, b, b)
    operator fun times(b: Vec2ui) = glm.mul(Vec2ui(), this, b.x, b.y)

    fun mul(bX: Uint, bY: Uint) = glm.mul(Vec2ui(), this, bX, bY)
    fun mul(bX: Int, bY: Int) = glm.mul(Vec2ui(), this, bX, bY)

    infix fun mulAss(b: Uint) = glm.mul(this, this, b, b)
    infix fun mulAss(b: Int) = glm.mul(this, this, b, b)
    fun mulAss(bX: Uint, bY: Uint) = glm.mul(this, this, bX, bY)
    fun mulAss(bX: Int, bY: Int) = glm.mul(this, this, bX, bY)
    infix fun mulAss(b: Vec2ui) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Uint, res: Vec2ui) = glm.mul(res, this, b, b)
    fun mul(b: Int, res: Vec2ui) = glm.mul(res, this, b, b)
    fun mul(bX: Uint, bY: Uint, res: Vec2ui) = glm.mul(res, this, bX, bY)
    fun mul(bX: Int, bY: Int, res: Vec2ui) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2ui, res: Vec2ui) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Uint) = glm.div(Vec2ui(), this, b, b)
    operator fun div(b: Int) = glm.div(Vec2ui(), this, b, b)
    operator fun div(b: Vec2ui) = glm.div(Vec2ui(), this, b.x, b.y)

    fun div(bX: Uint, bY: Uint) = glm.div(Vec2ui(), this, bX, bY)
    fun div(bX: Int, bY: Int) = glm.div(Vec2ui(), this, bX, bY)

    infix fun divAss(b: Uint) = glm.div(this, this, b, b)
    infix fun divAss(b: Int) = glm.div(this, this, b, b)
    fun divAss(bX: Uint, bY: Uint) = glm.div(this, this, bX, bY)
    fun divAss(bX: Int, bY: Int) = glm.div(this, this, bX, bY)
    infix fun divAss(b: Vec2ui) = glm.div(this, this, b.x, b.y)

    fun div(b: Uint, res: Vec2ui) = glm.div(res, this, b, b)
    fun div(b: Int, res: Vec2ui) = glm.div(res, this, b, b)
    fun div(bX: Uint, bY: Uint, res: Vec2ui) = glm.div(res, this, bX, bY)
    fun div(bX: Int, bY: Int, res: Vec2ui) = glm.div(res, this, bX, bY)
    fun div(b: Vec2ui, res: Vec2ui) = glm.div(res, this, b.x, b.y)

    operator fun mod(b: Uint) = glm.mod(Vec2ui(), this, b, b)
    operator fun mod(b: Int) = glm.mod(Vec2ui(), this, b, b)
    operator fun mod(b: Vec2ui) = glm.mod(Vec2ui(), this, b.x, b.y)

    fun mod(bX: Uint, bY: Uint) = glm.mod(Vec2ui(), this, bX, bY)
    fun mod(bX: Int, bY: Int) = glm.mod(Vec2ui(), this, bX, bY)

    infix fun modAss(b: Uint) = glm.mod(this, this, b, b)
    infix fun modAss(b: Int) = glm.mod(this, this, b, b)
    fun modAss(bX: Uint, bY: Uint) = glm.mod(this, this, bX, bY)
    fun modAss(bX: Int, bY: Int) = glm.mod(this, this, bX, bY)
    infix fun modAss(b: Vec2ui) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Uint, res: Vec2ui) = glm.mod(res, this, b, b)
    fun mod(b: Int, res: Vec2ui) = glm.mod(res, this, b, b)
    fun mod(bX: Uint, bY: Uint, res: Vec2ui) = glm.mod(res, this, bX, bY)
    fun mod(bX: Int, bY: Int, res: Vec2ui) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2ui, res: Vec2ui) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    infix fun and(b: Uint) = glm.and(Vec2ui(), this, b, b)
    infix fun and(b: Int) = glm.and(Vec2ui(), this, b, b)
    fun and(bX: Uint, bY: Uint) = glm.and(Vec2ui(), this, bX, bY)
    fun and(bX: Int, bY: Int) = glm.and(Vec2ui(), this, bX, bY)
    fun and(b: Vec2ui) = glm.and(Vec2ui(), this, b.x, b.y)

    infix fun andAss(b: Uint) = glm.and(this, this, b, b)
    infix fun andAss(b: Int) = glm.and(this, this, b, b)
    fun andAss(bX: Uint, bY: Uint) = glm.and(this, this, bX, bY)
    fun andAss(bX: Int, bY: Int) = glm.and(this, this, bX, bY)
    infix fun andAss(b: Vec2ui) = glm.and(this, this, b.x, b.y)

    fun and(b: Uint, res: Vec2ui) = glm.and(res, this, b, b)
    fun and(b: Int, res: Vec2ui) = glm.and(res, this, b, b)
    fun and(bX: Uint, bY: Uint, res: Vec2ui) = glm.and(res, this, bX, bY)
    fun and(bX: Int, bY: Int, res: Vec2ui) = glm.and(res, this, bX, bY)
    fun and(b: Vec2ui, res: Vec2ui) = glm.and(res, this, b.x, b.y)


    infix fun or(b: Uint) = glm.or(Vec2ui(), this, b, b)
    infix fun or(b: Int) = glm.or(Vec2ui(), this, b, b)
    fun or(bX: Uint, bY: Uint) = glm.or(Vec2ui(), this, bX, bY)
    fun or(bX: Int, bY: Int) = glm.or(Vec2ui(), this, bX, bY)
    fun or(b: Vec2ui) = glm.or(Vec2ui(), this, b.x, b.y)

    infix fun orAss(b: Uint) = glm.or(this, this, b, b)
    infix fun orAss(b: Int) = glm.or(this, this, b, b)
    fun orAss(bX: Uint, bY: Uint) = glm.or(this, this, bX, bY)
    fun orAss(bX: Int, bY: Int) = glm.or(this, this, bX, bY)
    infix fun orAss(b: Vec2ui) = glm.or(this, this, b.x, b.y)

    fun or(b: Uint, res: Vec2ui) = glm.or(res, this, b, b)
    fun or(b: Int, res: Vec2ui) = glm.or(res, this, b, b)
    fun or(bX: Uint, bY: Uint, res: Vec2ui) = glm.or(res, this, bX, bY)
    fun or(bX: Int, bY: Int, res: Vec2ui) = glm.or(res, this, bX, bY)
    fun or(b: Vec2ui, res: Vec2ui) = glm.or(res, this, b.x, b.y)


    infix fun xor(b: Uint) = glm.xor(Vec2ui(), this, b, b)
    infix fun xor(b: Int) = glm.xor(Vec2ui(), this, b, b)
    fun xor(bX: Uint, bY: Uint) = glm.xor(Vec2ui(), this, bX, bY)
    fun xor(bX: Int, bY: Int) = glm.xor(Vec2ui(), this, bX, bY)
    fun xor(b: Vec2ui) = glm.xor(Vec2ui(), this, b.x, b.y)

    infix fun xorAss(b: Uint) = glm.xor(this, this, b, b)
    infix fun xorAss(b: Int) = glm.xor(this, this, b, b)
    fun xorAss(bX: Uint, bY: Uint) = glm.xor(this, this, bX, bY)
    fun xorAss(bX: Int, bY: Int) = glm.xor(this, this, bX, bY)
    infix fun xorAss(b: Vec2ui) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Uint, res: Vec2ui) = glm.xor(res, this, b, b)
    fun xor(b: Int, res: Vec2ui) = glm.xor(res, this, b, b)
    fun xor(bX: Uint, bY: Uint, res: Vec2ui) = glm.xor(res, this, bX, bY)
    fun xor(bX: Int, bY: Int, res: Vec2ui) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2ui, res: Vec2ui) = glm.xor(res, this, b.x, b.y)


    infix fun shl(b: Uint) = glm.shl(Vec2ui(), this, b, b)
    infix fun shl(b: Int) = glm.shl(Vec2ui(), this, b, b)
    fun shl(bX: Uint, bY: Uint) = glm.shl(Vec2ui(), this, bX, bY)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2ui(), this, bX, bY)
    fun shl(b: Vec2ui) = glm.shl(Vec2ui(), this, b.x, b.y)

    infix fun shlAss(b: Uint) = glm.shl(this, this, b, b)
    infix fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Uint, bY: Uint) = glm.shl(this, this, bX, bY)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)
    infix fun shlAss(b: Vec2ui) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Uint, res: Vec2ui) = glm.shl(res, this, b, b)
    fun shl(b: Int, res: Vec2ui) = glm.shl(res, this, b, b)
    fun shl(bX: Uint, bY: Uint, res: Vec2ui) = glm.shl(res, this, bX, bY)
    fun shl(bX: Int, bY: Int, res: Vec2ui) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2ui, res: Vec2ui) = glm.shl(res, this, b.x, b.y)


    infix fun shr(b: Uint) = glm.shr(Vec2ui(), this, b, b)
    infix fun shr(b: Int) = glm.shr(Vec2ui(), this, b, b)
    fun shr(bX: Uint, bY: Uint) = glm.shr(Vec2ui(), this, bX, bY)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2ui(), this, bX, bY)
    fun shr(b: Vec2ui) = glm.shr(Vec2ui(), this, b.x, b.y)

    infix fun shrAss(b: Uint) = glm.shr(this, this, b, b)
    infix fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Uint, bY: Uint) = glm.shr(this, this, bX, bY)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)
    infix fun shrAss(b: Vec2ui) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Uint, res: Vec2ui) = glm.shr(res, this, b, b)
    fun shr(b: Int, res: Vec2ui) = glm.shr(res, this, b, b)
    fun shr(bX: Uint, bY: Uint, res: Vec2ui) = glm.shr(res, this, bX, bY)
    fun shr(bX: Int, bY: Int, res: Vec2ui) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2ui, res: Vec2ui) = glm.shr(res, this, b.x, b.y)


    fun inv() = glm.inv(Vec2ui(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2ui) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Uint.plus(b: Vec2ui) = glm.add(Vec2ui(), b, this, this)
infix fun Uint.addAss(b: Vec2ui) = glm.add(b, b, this, this)

operator fun Uint.minus(b: Vec2ui) = glm.sub(Vec2ui(), this, this, b)
infix fun Uint.subAss(b: Vec2ui) = glm.sub(b, this, this, b)

operator fun Uint.times(b: Vec2ui) = glm.mul(Vec2ui(), b, this, this)
infix fun Uint.mulAss(b: Vec2ui) = glm.mul(b, b, this, this)

operator fun Uint.div(b: Vec2ui) = glm.div(Vec2ui(), this, this, b)
infix fun Uint.divAss(b: Vec2ui) = glm.div(b, this, this, b)

operator fun Uint.mod(b: Vec2ui) = glm.mod(Vec2ui(), this, this, b)
infix fun Uint.modAss(b: Vec2ui) = glm.mod(b, this, this, b)


operator fun Int.plus(b: Vec2ui) = glm.add(Vec2ui(), b, this, this)
infix fun Int.addAss(b: Vec2ui) = glm.add(b, b, this, this)

operator fun Int.minus(b: Vec2ui) = glm.sub(Vec2ui(), this, this, b)
infix fun Int.subAss(b: Vec2ui) = glm.sub(b, this, this, b)

operator fun Int.times(b: Vec2ui) = glm.mul(Vec2ui(), b, this, this)
infix fun Int.mulAss(b: Vec2ui) = glm.mul(b, b, this, this)

operator fun Int.div(b: Vec2ui) = glm.div(Vec2ui(), this, this, b)
infix fun Int.divAss(b: Vec2ui) = glm.div(b, this, this, b)

operator fun Int.mod(b: Vec2ui) = glm.mod(Vec2ui(), this, this, b)
infix fun Int.modAss(b: Vec2ui) = glm.mod(b, this, this, b)