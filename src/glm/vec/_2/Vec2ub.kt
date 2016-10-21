package glm.vec._2

import glm.glm
import glm.vec.Vec2t
import main.Ubyte

/**
 * Created by elect on 07/10/16.
 */

data class Vec2ub(override var x: Ubyte = Ubyte(0), override var y: Ubyte = Ubyte(0)) : Vec2t<Ubyte>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(Ubyte(v.x), Ubyte(v.y))

    constructor(s: Ubyte) : this(s.copy(), s.copy())
    constructor(s: Number) : this(Ubyte(s), Ubyte(s))

    constructor(ba: ByteArray) : this(Ubyte(ba[0]), Ubyte(ba[1]))

    constructor(ba: Array<Ubyte>) : this(ba[0], ba[1])


    fun to(v: Vec2t<Number>): Vec2ub {
        x.v = v.x.toByte(); y.v = v.y.toByte(); return this
    }

    fun to(s: Ubyte): Vec2ub {
        x.v = s.v; y.v = s.v; return this
    }

    fun to(s: Byte): Vec2ub {
        x.v = s.toByte(); y.v = s.toByte(); return this
    }

    fun to(s: Int): Vec2ub {
        x.v = s.toByte(); y.v = s.toByte(); return this
    }

    fun to(x: Ubyte, y: Ubyte): Vec2ub {
        this.x.v = x.v; this.y.v = y.v; return this
    }

    fun to(x: Byte, y: Byte): Vec2ub {
        this.x.v = x; this.y.v = y; return this
    }

    fun to(x: Int, y: Int): Vec2ub {
        this.x.v = x.toByte(); this.y.v = y.toByte(); return this
    }

    fun to(ba: ByteArray): Vec2ub {
        x.v = ba[0]; y.v = ba[1]; return this
    }

    fun to(ia: IntArray): Vec2ub {
        x.v = ia[0].toByte(); y.v = ia[1].toByte(); return this
    }

    fun to(ba: Array<Ubyte>): Vec2ub {
        x.v = ba[0].v; y.v = ba[1].v; return this
    }

    fun to(ba: Array<Byte>): Vec2ub {
        x.v = ba[0]; y.v = ba[1]; return this
    }

    fun to(ia: Array<Int>): Vec2ub {
        x.v = ia[0].toByte(); y.v = ia[1].toByte(); return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Ubyte) = when (i) {0 -> x.v = s.v; else -> y.v = s.v; }
    operator fun set(i: Int, s: Byte) = when (i) {0 -> x.v = s; else -> y.v = s; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s.toByte(); else -> y.v = s.toByte(); }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2ub = glm.add(Vec2ub(), this, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1)
    fun inc(res: Vec2ub) = glm.add(res, this, 1, 1)


    operator fun dec(): Vec2ub = glm.sub(Vec2ub(), this, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1)
    fun dec(res: Vec2ub) = glm.sub(res, this, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Ubyte) = glm.add(Vec2ub(), this, b, b)
    operator fun plus(b: Int) = glm.add(Vec2ub(), this, b, b)
    operator fun plus(b: Vec2ub) = glm.add(Vec2ub(), this, b.x, b.y)

    fun add(bX: Ubyte, bY: Ubyte) = glm.add(Vec2ub(), this, bX, bY)
    fun add(bX: Int, bY: Int) = glm.add(Vec2ub(), this, bX, bY)

    infix fun addAss(b: Ubyte) = glm.add(this, this, b, b)
    infix fun addAss(b: Int) = glm.add(this, this, b, b)
    fun addAss(bX: Ubyte, bY: Ubyte) = glm.add(this, this, bX, bY)
    fun addAss(bX: Int, bY: Int) = glm.add(this, this, bX, bY)
    infix fun addAss(b: Vec2ub) = glm.add(this, this, b.x, b.y)

    fun add(b: Ubyte, res: Vec2ub) = glm.add(res, this, b, b)
    fun add(b: Int, res: Vec2ub) = glm.add(res, this, b, b)
    fun add(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.add(res, this, bX, bY)
    fun add(bX: Int, bY: Int, res: Vec2ub) = glm.add(res, this, bX, bY)
    fun add(b: Vec2ub, res: Vec2ub) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Ubyte) = glm.sub(Vec2ub(), this, b, b)
    operator fun minus(b: Int) = glm.sub(Vec2ub(), this, b, b)
    operator fun minus(b: Vec2ub) = glm.sub(Vec2ub(), this, b.x, b.y)

    fun sub(bX: Ubyte, bY: Ubyte) = glm.sub(Vec2ub(), this, bX, bY)
    fun sub(bX: Int, bY: Int) = glm.sub(Vec2ub(), this, bX, bY)

    infix fun subAss(b: Ubyte) = glm.sub(this, this, b, b)
    infix fun subAss(b: Int) = glm.sub(this, this, b, b)
    fun subAss(bX: Ubyte, bY: Ubyte) = glm.sub(this, this, bX, bY)
    fun subAss(bX: Int, bY: Int) = glm.sub(this, this, bX, bY)
    infix fun subAss(b: Vec2ub) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Ubyte, res: Vec2ub) = glm.sub(res, this, b, b)
    fun sub(b: Int, res: Vec2ub) = glm.sub(res, this, b, b)
    fun sub(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.sub(res, this, bX, bY)
    fun sub(bX: Int, bY: Int, res: Vec2ub) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2ub, res: Vec2ub) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Ubyte) = glm.mul(Vec2ub(), this, b, b)
    operator fun times(b: Int) = glm.mul(Vec2ub(), this, b, b)
    operator fun times(b: Vec2ub) = glm.mul(Vec2ub(), this, b.x, b.y)

    fun mul(bX: Ubyte, bY: Ubyte) = glm.mul(Vec2ub(), this, bX, bY)
    fun mul(bX: Int, bY: Int) = glm.mul(Vec2ub(), this, bX, bY)

    infix fun mulAss(b: Ubyte) = glm.mul(this, this, b, b)
    infix fun mulAss(b: Int) = glm.mul(this, this, b, b)
    fun mulAss(bX: Ubyte, bY: Ubyte) = glm.mul(this, this, bX, bY)
    fun mulAss(bX: Int, bY: Int) = glm.mul(this, this, bX, bY)
    infix fun mulAss(b: Vec2ub) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Ubyte, res: Vec2ub) = glm.mul(res, this, b, b)
    fun mul(b: Int, res: Vec2ub) = glm.mul(res, this, b, b)
    fun mul(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.mul(res, this, bX, bY)
    fun mul(bX: Int, bY: Int, res: Vec2ub) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2ub, res: Vec2ub) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Ubyte) = glm.div(Vec2ub(), this, b, b)
    operator fun div(b: Int) = glm.div(Vec2ub(), this, b, b)
    operator fun div(b: Vec2ub) = glm.div(Vec2ub(), this, b.x, b.y)

    fun div(bX: Ubyte, bY: Ubyte) = glm.div(Vec2ub(), this, bX, bY)
    fun div(bX: Int, bY: Int) = glm.div(Vec2ub(), this, bX, bY)

    infix fun divAss(b: Ubyte) = glm.div(this, this, b, b)
    infix fun divAss(b: Int) = glm.div(this, this, b, b)
    fun divAss(bX: Ubyte, bY: Ubyte) = glm.div(this, this, bX, bY)
    fun divAss(bX: Int, bY: Int) = glm.div(this, this, bX, bY)
    infix fun divAss(b: Vec2ub) = glm.div(this, this, b.x, b.y)

    fun div(b: Ubyte, res: Vec2ub) = glm.div(res, this, b, b)
    fun div(b: Int, res: Vec2ub) = glm.div(res, this, b, b)
    fun div(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.div(res, this, bX, bY)
    fun div(bX: Int, bY: Int, res: Vec2ub) = glm.div(res, this, bX, bY)
    fun div(b: Vec2ub, res: Vec2ub) = glm.div(res, this, b.x, b.y)

    operator fun mod(b: Ubyte) = glm.mod(Vec2ub(), this, b, b)
    operator fun mod(b: Int) = glm.mod(Vec2ub(), this, b, b)
    operator fun mod(b: Vec2ub) = glm.mod(Vec2ub(), this, b.x, b.y)

    fun mod(bX: Ubyte, bY: Ubyte) = glm.mod(Vec2ub(), this, bX, bY)
    fun mod(bX: Int, bY: Int) = glm.mod(Vec2ub(), this, bX, bY)

    infix fun modAss(b: Ubyte) = glm.mod(this, this, b, b)
    infix fun modAss(b: Int) = glm.mod(this, this, b, b)
    fun modAss(bX: Ubyte, bY: Ubyte) = glm.mod(this, this, bX, bY)
    fun modAss(bX: Int, bY: Int) = glm.mod(this, this, bX, bY)
    infix fun modAss(b: Vec2ub) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Ubyte, res: Vec2ub) = glm.mod(res, this, b, b)
    fun mod(b: Int, res: Vec2ub) = glm.mod(res, this, b, b)
    fun mod(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.mod(res, this, bX, bY)
    fun mod(bX: Int, bY: Int, res: Vec2ub) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2ub, res: Vec2ub) = glm.mod(res, this, b.x, b.y)

    // -- Unary bit vecOperators --

    infix fun and(b: Ubyte) = glm.and(Vec2ub(), this, b, b)
    infix fun and(b: Int) = glm.and(Vec2ub(), this, b, b)
    fun and(bX: Ubyte, bY: Ubyte) = glm.and(Vec2ub(), this, bX, bY)
    fun and(bX: Int, bY: Int) = glm.and(Vec2ub(), this, bX, bY)
    fun and(b: Vec2ub) = glm.and(Vec2ub(), this, b.x, b.y)

    infix fun andAss(b: Ubyte) = glm.and(this, this, b, b)
    infix fun andAss(b: Int) = glm.and(this, this, b, b)
    fun andAss(bX: Ubyte, bY: Ubyte) = glm.and(this, this, bX, bY)
    fun andAss(bX: Int, bY: Int) = glm.and(this, this, bX, bY)
    infix fun andAss(b: Vec2ub) = glm.and(this, this, b.x, b.y)

    fun and(b: Ubyte, res: Vec2ub) = glm.and(res, this, b, b)
    fun and(b: Int, res: Vec2ub) = glm.and(res, this, b, b)
    fun and(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.and(res, this, bX, bY)
    fun and(bX: Int, bY: Int, res: Vec2ub) = glm.and(res, this, bX, bY)
    fun and(b: Vec2ub, res: Vec2ub) = glm.and(res, this, b.x, b.y)


    infix fun or(b: Ubyte) = glm.or(Vec2ub(), this, b, b)
    infix fun or(b: Int) = glm.or(Vec2ub(), this, b, b)
    fun or(bX: Ubyte, bY: Ubyte) = glm.or(Vec2ub(), this, bX, bY)
    fun or(bX: Int, bY: Int) = glm.or(Vec2ub(), this, bX, bY)
    fun or(b: Vec2ub) = glm.or(Vec2ub(), this, b.x, b.y)

    infix fun orAss(b: Ubyte) = glm.or(this, this, b, b)
    infix fun orAss(b: Int) = glm.or(this, this, b, b)
    fun orAss(bX: Ubyte, bY: Ubyte) = glm.or(this, this, bX, bY)
    fun orAss(bX: Int, bY: Int) = glm.or(this, this, bX, bY)
    infix fun orAss(b: Vec2ub) = glm.or(this, this, b.x, b.y)

    fun or(b: Ubyte, res: Vec2ub) = glm.or(res, this, b, b)
    fun or(b: Int, res: Vec2ub) = glm.or(res, this, b, b)
    fun or(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.or(res, this, bX, bY)
    fun or(bX: Int, bY: Int, res: Vec2ub) = glm.or(res, this, bX, bY)
    fun or(b: Vec2ub, res: Vec2ub) = glm.or(res, this, b.x, b.y)


    infix fun xor(b: Ubyte) = glm.xor(Vec2ub(), this, b, b)
    infix fun xor(b: Int) = glm.xor(Vec2ub(), this, b, b)
    fun xor(bX: Ubyte, bY: Ubyte) = glm.xor(Vec2ub(), this, bX, bY)
    fun xor(bX: Int, bY: Int) = glm.xor(Vec2ub(), this, bX, bY)
    fun xor(b: Vec2ub) = glm.xor(Vec2ub(), this, b.x, b.y)

    infix fun xorAss(b: Ubyte) = glm.xor(this, this, b, b)
    infix fun xorAss(b: Int) = glm.xor(this, this, b, b)
    fun xorAss(bX: Ubyte, bY: Ubyte) = glm.xor(this, this, bX, bY)
    fun xorAss(bX: Int, bY: Int) = glm.xor(this, this, bX, bY)
    infix fun xorAss(b: Vec2ub) = glm.xor(this, this, b.x, b.y)

    fun xor(b: Ubyte, res: Vec2ub) = glm.xor(res, this, b, b)
    fun xor(b: Int, res: Vec2ub) = glm.xor(res, this, b, b)
    fun xor(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.xor(res, this, bX, bY)
    fun xor(bX: Int, bY: Int, res: Vec2ub) = glm.xor(res, this, bX, bY)
    fun xor(b: Vec2ub, res: Vec2ub) = glm.xor(res, this, b.x, b.y)


    infix fun shl(b: Ubyte) = glm.shl(Vec2ub(), this, b, b)
    infix fun shl(b: Int) = glm.shl(Vec2ub(), this, b, b)
    fun shl(bX: Ubyte, bY: Ubyte) = glm.shl(Vec2ub(), this, bX, bY)
    fun shl(bX: Int, bY: Int) = glm.shl(Vec2ub(), this, bX, bY)
    fun shl(b: Vec2ub) = glm.shl(Vec2ub(), this, b.x, b.y)

    infix fun shlAss(b: Ubyte) = glm.shl(this, this, b, b)
    infix fun shlAss(b: Int) = glm.shl(this, this, b, b)
    fun shlAss(bX: Ubyte, bY: Ubyte) = glm.shl(this, this, bX, bY)
    fun shlAss(bX: Int, bY: Int) = glm.shl(this, this, bX, bY)
    infix fun shlAss(b: Vec2ub) = glm.shl(this, this, b.x, b.y)

    fun shl(b: Ubyte, res: Vec2ub) = glm.shl(res, this, b, b)
    fun shl(b: Int, res: Vec2ub) = glm.shl(res, this, b, b)
    fun shl(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.shl(res, this, bX, bY)
    fun shl(bX: Int, bY: Int, res: Vec2ub) = glm.shl(res, this, bX, bY)
    fun shl(b: Vec2ub, res: Vec2ub) = glm.shl(res, this, b.x, b.y)


    infix fun shr(b: Ubyte) = glm.shr(Vec2ub(), this, b, b)
    infix fun shr(b: Int) = glm.shr(Vec2ub(), this, b, b)
    fun shr(bX: Ubyte, bY: Ubyte) = glm.shr(Vec2ub(), this, bX, bY)
    fun shr(bX: Int, bY: Int) = glm.shr(Vec2ub(), this, bX, bY)
    fun shr(b: Vec2ub) = glm.shr(Vec2ub(), this, b.x, b.y)

    infix fun shrAss(b: Ubyte) = glm.shr(this, this, b, b)
    infix fun shrAss(b: Int) = glm.shr(this, this, b, b)
    fun shrAss(bX: Ubyte, bY: Ubyte) = glm.shr(this, this, bX, bY)
    fun shrAss(bX: Int, bY: Int) = glm.shr(this, this, bX, bY)
    infix fun shrAss(b: Vec2ub) = glm.shr(this, this, b.x, b.y)

    fun shr(b: Ubyte, res: Vec2ub) = glm.shr(res, this, b, b)
    fun shr(b: Int, res: Vec2ub) = glm.shr(res, this, b, b)
    fun shr(bX: Ubyte, bY: Ubyte, res: Vec2ub) = glm.shr(res, this, bX, bY)
    fun shr(bX: Int, bY: Int, res: Vec2ub) = glm.shr(res, this, bX, bY)
    fun shr(b: Vec2ub, res: Vec2ub) = glm.shr(res, this, b.x, b.y)


    fun inv() = glm.inv(Vec2ub(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec2ub) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Ubyte.plus(b: Vec2ub) = glm.add(Vec2ub(), b, this, this)
infix fun Ubyte.addAss(b: Vec2ub) = glm.add(b, b, this, this)

operator fun Ubyte.minus(b: Vec2ub) = glm.sub(Vec2ub(), this, this, b)
infix fun Ubyte.subAss(b: Vec2ub) = glm.sub(b, this, this, b)

operator fun Ubyte.times(b: Vec2ub) = glm.mul(Vec2ub(), b, this, this)
infix fun Ubyte.mulAss(b: Vec2ub) = glm.mul(b, b, this, this)

operator fun Ubyte.div(b: Vec2ub) = glm.div(Vec2ub(), this, this, b)
infix fun Ubyte.divAss(b: Vec2ub) = glm.div(b, this, this, b)

operator fun Ubyte.mod(b: Vec2ub) = glm.mod(Vec2ub(), this, this, b)
infix fun Ubyte.modAss(b: Vec2ub) = glm.mod(b, this, this, b)


operator fun Int.plus(b: Vec2ub) = glm.add(Vec2ub(), b, this, this)
infix fun Int.addAss(b: Vec2ub) = glm.add(b, b, this, this)

operator fun Int.minus(b: Vec2ub) = glm.sub(Vec2ub(), this, this, b)
infix fun Int.subAss(b: Vec2ub) = glm.sub(b, this, this, b)

operator fun Int.times(b: Vec2ub) = glm.mul(Vec2ub(), b, this, this)
infix fun Int.mulAss(b: Vec2ub) = glm.mul(b, b, this, this)

operator fun Int.div(b: Vec2ub) = glm.div(Vec2ub(), this, this, b)
infix fun Int.divAss(b: Vec2ub) = glm.div(b, this, this, b)

operator fun Int.mod(b: Vec2ub) = glm.mod(Vec2ub(), this, this, b)
infix fun Int.modAss(b: Vec2ub) = glm.mod(b, this, this, b)