package glm.vec._4

import glm.glm
import glm.vec.Vec4t
import main.Uint

/**
 * Created by elect on 09/10/16.
 */

data class Vec4ui(override var x: Uint = Uint(0), override var y: Uint = Uint(0), override var z: Uint = Uint(0), override var w: Uint = Uint(0)) : Vec4t<Uint>(x, y, z, w) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(Uint(v.x), Uint(v.y), Uint(v.z), Uint(v.w))

    constructor(s: Uint) : this(s.copy(), s.copy(), s.copy(), s.copy())
    constructor(s: Number) : this(Uint(s), Uint(s), Uint(s), Uint(s))
    constructor(x: Number, y: Number, z: Number, w: Number) : this(Uint(x), Uint(y), Uint(z), Uint(w)) // TODO cap constr

    constructor(a: ByteArray) : this(Uint(a[0]), Uint(a[1]), Uint(a[2]), Uint(a[3]))
    constructor(a: IntArray) : this(Uint(a[0]), Uint(a[1]), Uint(a[2]), Uint(a[3]))

    constructor(a: Array<Uint>) : this(a[0], a[1], a[2], a[3])
    constructor(a: Array<Int>) : this(Uint(a[0]), Uint(a[1]), Uint(a[2]), Uint(a[3]))


    fun to(v: Vec4t<Number>): Vec4ui {
        x.v = v.x.toInt(); y.v = v.y.toInt(); z.v = v.z.toInt(); w.v = v.w.toInt(); return this
    }

    fun to(s: Uint): Vec4ui {
        x.v = s.v; y.v = s.v; z.v = s.v; w.v = s.v; return this
    }

    fun to(s: Int): Vec4ui {
        x.v = s; y.v = s; z.v = s; w.v = s; return this
    }

    fun to(x: Uint, y: Uint, z: Uint, w: Uint): Vec4ui {
        this.x.v = x.v; this.y.v = y.v; this.z.v = z.v; this.w.v = w.v; return this
    }

    fun to(x: Int, y: Int, z: Int, w: Int): Vec4ui {
        this.x.v = x; this.y.v = y; this.z.v = z; this.w.v = w; return this
    }

    fun to(ia: IntArray): Vec4ui {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; w.v = ia[3]; return this
    }

    fun to(ba: Array<Uint>): Vec4ui {
        x.v = ba[0].v; y.v = ba[1].v; z.v = ba[2].v; w.v = ba[3].v; return this
    }


    fun to(ia: Array<Int>): Vec4ui {
        x.v = ia[0]; y.v = ia[1]; z.v = ia[2]; w.v = ia[3]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Uint) = when (i) {0 -> x.v = s.v; 1 -> y.v = s.v; 2 -> z.v = s.v; else -> w.v = s.v; }
    operator fun set(i: Int, s: Int) = when (i) {0 -> x.v = s; 1 -> y.v = s; 2 -> z.v = s; else -> w.v = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    // no unaryMinus operator, only signed
    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4ui = glm.add(Vec4ui(), this, 1, 1, 1, 1)
    fun incAss() = glm.add(this, this, 1, 1, 1, 1)
    fun inc(res: Vec4ui) = glm.add(res, this, 1, 1, 1, 1)


    operator fun dec(): Vec4ui = glm.sub(Vec4ui(), this, 1, 1, 1, 1)
    fun decAss() = glm.sub(this, this, 1, 1, 1, 1)
    fun dec(res: Vec4ui) = glm.sub(res, this, 1, 1, 1, 1)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Uint) = glm.add(Vec4ui(), this, b, b, b, b)
    operator fun plus(b: Int) = glm.add(Vec4ui(), this, b, b, b, b)
    operator fun plus(b: Vec4ui) = glm.add(Vec4ui(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.add(Vec4ui(), this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(Vec4ui(), this, bX, bY, bZ, bW)

    infix inline fun addAss(b: Uint) = glm.add(this, this, b, b, b, b)
    infix inline fun addAss(b: Int) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.add(this, this, bX, bY, bZ, bW)
    fun addAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.add(this, this, bX, bY, bZ, bW)
    infix inline fun addAss(b: Vec4ui) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Uint, res: Vec4ui) = glm.add(res, this, b, b, b, b)
    fun add(b: Int, res: Vec4ui) = glm.add(res, this, b, b, b, b)
    fun add(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4ui, res: Vec4ui) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Uint) = glm.sub(Vec4ui(), this, b, b, b, b)
    operator fun minus(b: Int) = glm.sub(Vec4ui(), this, b, b, b, b)
    operator fun minus(b: Vec4ui) = glm.sub(Vec4ui(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.sub(Vec4ui(), this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(Vec4ui(), this, bX, bY, bZ, bW)

    infix inline fun subAss(b: Uint) = glm.sub(this, this, b, b, b, b)
    infix inline fun subAss(b: Int) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.sub(this, this, bX, bY, bZ, bW)
    fun subAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.sub(this, this, bX, bY, bZ, bW)
    infix inline fun subAss(b: Vec4ui) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Uint, res: Vec4ui) = glm.sub(res, this, b, b, b, b)
    fun sub(b: Int, res: Vec4ui) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4ui, res: Vec4ui) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Uint) = glm.mul(Vec4ui(), this, b, b, b, b)
    operator fun times(b: Int) = glm.mul(Vec4ui(), this, b, b, b, b)
    operator fun times(b: Vec4ui) = glm.mul(Vec4ui(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.mul(Vec4ui(), this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(Vec4ui(), this, bX, bY, bZ, bW)

    infix inline fun mulAss(b: Uint) = glm.mul(this, this, b, b, b, b)
    infix inline fun mulAss(b: Int) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.mul(this, this, bX, bY, bZ, bW)
    fun mulAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mul(this, this, bX, bY, bZ, bW)
    infix inline fun mulAss(b: Vec4ui) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Uint, res: Vec4ui) = glm.mul(res, this, b, b, b, b)
    fun mul(b: Int, res: Vec4ui) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4ui, res: Vec4ui) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Uint) = glm.div(Vec4ui(), this, b, b, b, b)
    operator fun div(b: Int) = glm.div(Vec4ui(), this, b, b, b, b)
    operator fun div(b: Vec4ui) = glm.div(Vec4ui(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.div(Vec4ui(), this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(Vec4ui(), this, bX, bY, bZ, bW)

    infix inline fun divAss(b: Uint) = glm.div(this, this, b, b, b, b)
    infix inline fun divAss(b: Int) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.div(this, this, bX, bY, bZ, bW)
    fun divAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.div(this, this, bX, bY, bZ, bW)
    infix inline fun divAss(b: Vec4ui) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Uint, res: Vec4ui) = glm.div(res, this, b, b, b, b)
    fun div(b: Int, res: Vec4ui) = glm.div(res, this, b, b, b, b)
    fun div(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4ui, res: Vec4ui) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Uint) = glm.mod(Vec4ui(), this, b, b, b, b)
    operator fun mod(b: Int) = glm.mod(Vec4ui(), this, b, b, b, b)
    operator fun mod(b: Vec4ui) = glm.mod(Vec4ui(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.mod(Vec4ui(), this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(Vec4ui(), this, bX, bY, bZ, bW)

    infix inline fun modAss(b: Uint) = glm.mod(this, this, b, b, b, b)
    infix inline fun modAss(b: Int) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.mod(this, this, bX, bY, bZ, bW)
    fun modAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.mod(this, this, bX, bY, bZ, bW)
    infix inline fun modAss(b: Vec4ui) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Uint, res: Vec4ui) = glm.mod(res, this, b, b, b, b)
    fun mod(b: Int, res: Vec4ui) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4ui, res: Vec4ui) = glm.mod(res, this, b.x, b.y, b.z, b.w)

    // -- Unary bit vecOperators --

    inline infix fun and(b: Uint) = glm.and(Vec4ui(), this, b, b, b, b)
    inline infix fun and(b: Int) = glm.and(Vec4ui(), this, b, b, b, b)
    fun and(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.and(Vec4ui(), this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(Vec4ui(), this, bX, bY, bZ, bW)
    fun and(b: Vec4ui) = glm.and(Vec4ui(), this, b.x, b.y, b.z, b.w)

    infix inline fun andAss(b: Uint) = glm.and(this, this, b, b, b, b)
    infix inline fun andAss(b: Int) = glm.and(this, this, b, b, b, b)
    fun andAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.and(this, this, bX, bY, bZ, bW)
    fun andAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.and(this, this, bX, bY, bZ, bW)
    infix inline fun andAss(b: Vec4ui) = glm.and(this, this, b.x, b.y, b.z, b.w)

    fun and(b: Uint, res: Vec4ui) = glm.and(res, this, b, b, b, b)
    fun and(b: Int, res: Vec4ui) = glm.and(res, this, b, b, b, b)
    fun and(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.and(res, this, bX, bY, bZ, bW)
    fun and(b: Vec4ui, res: Vec4ui) = glm.and(res, this, b.x, b.y, b.z, b.w)


    inline infix fun or(b: Uint) = glm.or(Vec4ui(), this, b, b, b, b)
    inline infix fun or(b: Int) = glm.or(Vec4ui(), this, b, b, b, b)
    fun or(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.or(Vec4ui(), this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(Vec4ui(), this, bX, bY, bZ, bW)
    fun or(b: Vec4ui) = glm.or(Vec4ui(), this, b.x, b.y, b.z, b.w)

    infix inline fun orAss(b: Uint) = glm.or(this, this, b, b, b, b)
    infix inline fun orAss(b: Int) = glm.or(this, this, b, b, b, b)
    fun orAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.or(this, this, bX, bY, bZ, bW)
    fun orAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.or(this, this, bX, bY, bZ, bW)
    infix inline fun orAss(b: Vec4ui) = glm.or(this, this, b.x, b.y, b.z, b.w)

    fun or(b: Uint, res: Vec4ui) = glm.or(res, this, b, b, b, b)
    fun or(b: Int, res: Vec4ui) = glm.or(res, this, b, b, b, b)
    fun or(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.or(res, this, bX, bY, bZ, bW)
    fun or(b: Vec4ui, res: Vec4ui) = glm.or(res, this, b.x, b.y, b.z, b.w)


    inline infix fun xor(b: Uint) = glm.xor(Vec4ui(), this, b, b, b, b)
    inline infix fun xor(b: Int) = glm.xor(Vec4ui(), this, b, b, b, b)
    fun xor(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.xor(Vec4ui(), this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(Vec4ui(), this, bX, bY, bZ, bW)
    fun xor(b: Vec4ui) = glm.xor(Vec4ui(), this, b.x, b.y, b.z, b.w)

    infix inline fun xorAss(b: Uint) = glm.xor(this, this, b, b, b, b)
    infix inline fun xorAss(b: Int) = glm.xor(this, this, b, b, b, b)
    fun xorAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.xor(this, this, bX, bY, bZ, bW)
    fun xorAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.xor(this, this, bX, bY, bZ, bW)
    infix inline fun xorAss(b: Vec4ui) = glm.xor(this, this, b.x, b.y, b.z, b.w)

    fun xor(b: Uint, res: Vec4ui) = glm.xor(res, this, b, b, b, b)
    fun xor(b: Int, res: Vec4ui) = glm.xor(res, this, b, b, b, b)
    fun xor(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.xor(res, this, bX, bY, bZ, bW)
    fun xor(b: Vec4ui, res: Vec4ui) = glm.xor(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shl(b: Uint) = glm.shl(Vec4ui(), this, b, b, b, b)
    inline infix fun shl(b: Int) = glm.shl(Vec4ui(), this, b, b, b, b)
    fun shl(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.shl(Vec4ui(), this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(Vec4ui(), this, bX, bY, bZ, bW)
    fun shl(b: Vec4ui) = glm.shl(Vec4ui(), this, b.x, b.y, b.z, b.w)

    infix inline fun shlAss(b: Uint) = glm.shl(this, this, b, b, b, b)
    infix inline fun shlAss(b: Int) = glm.shl(this, this, b, b, b, b)
    fun shlAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.shl(this, this, bX, bY, bZ, bW)
    fun shlAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shl(this, this, bX, bY, bZ, bW)
    infix inline fun shlAss(b: Vec4ui) = glm.shl(this, this, b.x, b.y, b.z, b.w)

    fun shl(b: Uint, res: Vec4ui) = glm.shl(res, this, b, b, b, b)
    fun shl(b: Int, res: Vec4ui) = glm.shl(res, this, b, b, b, b)
    fun shl(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.shl(res, this, bX, bY, bZ, bW)
    fun shl(b: Vec4ui, res: Vec4ui) = glm.shl(res, this, b.x, b.y, b.z, b.w)


    inline infix fun shr(b: Uint) = glm.shr(Vec4ui(), this, b, b, b, b)
    inline infix fun shr(b: Int) = glm.shr(Vec4ui(), this, b, b, b, b)
    fun shr(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.shr(Vec4ui(), this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(Vec4ui(), this, bX, bY, bZ, bW)
    fun shr(b: Vec4ui) = glm.shr(Vec4ui(), this, b.x, b.y, b.z, b.w)

    infix inline fun shrAss(b: Uint) = glm.shr(this, this, b, b, b, b)
    infix inline fun shrAss(b: Int) = glm.shr(this, this, b, b, b, b)
    fun shrAss(bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = glm.shr(this, this, bX, bY, bZ, bW)
    fun shrAss(bX: Int, bY: Int, bZ: Int, bW: Int) = glm.shr(this, this, bX, bY, bZ, bW)
    infix inline fun shrAss(b: Vec4ui) = glm.shr(this, this, b.x, b.y, b.z, b.w)

    fun shr(b: Uint, res: Vec4ui) = glm.shr(res, this, b, b, b, b)
    fun shr(b: Int, res: Vec4ui) = glm.shr(res, this, b, b, b, b)
    fun shr(bX: Uint, bY: Uint, bZ: Uint, bW: Uint, res: Vec4ui) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(bX: Int, bY: Int, bZ: Int, bW: Int, res: Vec4ui) = glm.shr(res, this, bX, bY, bZ, bW)
    fun shr(b: Vec4ui, res: Vec4ui) = glm.shr(res, this, b.x, b.y, b.z, b.w)


    fun inv() = glm.inv(Vec4ui(), this)

    fun invAss() = glm.inv(this, this)

    fun inv(res: Vec4ui) = glm.inv(res, this)
}


// -- Binary arithmetic vecOperators --

operator fun Uint.plus(b: Vec4ui) = glm.add(Vec4ui(), b, this, this, this, this)
inline infix fun Uint.addAss(b: Vec4ui) = glm.add(b, b, this, this, this, this)

operator fun Uint.minus(b: Vec4ui) = glm.sub(Vec4ui(), this, this, this, this, b)
inline infix fun Uint.subAss(b: Vec4ui) = glm.sub(b, this, this, this, this, b)

operator fun Uint.times(b: Vec4ui) = glm.mul(Vec4ui(), b, this, this, this, this)
inline infix fun Uint.mulAss(b: Vec4ui) = glm.mul(b, b, this, this, this, this)

operator fun Uint.div(b: Vec4ui) = glm.div(Vec4ui(), this, this, this, this, b)
inline infix fun Uint.divAss(b: Vec4ui) = glm.div(b, this, this, this, this, b)

operator fun Uint.mod(b: Vec4ui) = glm.mod(Vec4ui(), this, this, this, this, b)
inline infix fun Uint.modAss(b: Vec4ui) = glm.mod(b, this, this, this, this, b)


operator fun Int.plus(b: Vec4ui) = glm.add(Vec4ui(), b, this, this, this, this)
inline infix fun Int.addAss(b: Vec4ui) = glm.add(b, b, this, this, this, this)

operator fun Int.minus(b: Vec4ui) = glm.sub(Vec4ui(), this, this, this, this, b)
inline infix fun Int.subAss(b: Vec4ui) = glm.sub(b, this, this, this, this, b)

operator fun Int.times(b: Vec4ui) = glm.mul(Vec4ui(), b, this, this, this, this)
inline infix fun Int.mulAss(b: Vec4ui) = glm.mul(b, b, this, this, this, this)

operator fun Int.div(b: Vec4ui) = glm.div(Vec4ui(), this, this, this, this, b)
inline infix fun Int.divAss(b: Vec4ui) = glm.div(b, this, this, this, this, b)

operator fun Int.mod(b: Vec4ui) = glm.mod(Vec4ui(), this, this, this, this, b)
inline infix fun Int.modAss(b: Vec4ui) = glm.mod(b, this, this, this, this, b)