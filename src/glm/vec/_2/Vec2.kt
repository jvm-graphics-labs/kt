package glm.vec._2

import glm.glm
import glm.vec.Vec2t

/**
 * Created bY GBarbieri on 05.10.2016.
 */

data class Vec2(override var x: Float = 0f, override var y: Float = 0f) : Vec2t<Float>(x, y) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toFloat(), v.y.toFloat())

    constructor(s: Float) : this(s, s)
    constructor(s: Number) : this(s.toFloat(), s.toFloat())
    constructor(x: Number, y: Number) : this(x.toFloat(), y.toFloat())

    constructor(fa: FloatArray) : this(fa[0], fa[1])

    constructor(fa: Array<Float>) : this(fa[0], fa[1])


    fun to(v: Vec2t<Number>): Vec2 {
        x = v.x.toFloat(); y = v.y.toFloat(); return this
    }

    fun to(s: Float): Vec2 {
        x = s; y = s; return this
    }

    fun to(x: Float, y: Float): Vec2 {
        this.x = x; this.y = y; return this
    }

    fun to(fa: FloatArray): Vec2 {
        x = fa[0]; y = fa[1]; return this
    }

    fun to(fa: Array<Float>): Vec2 {
        x = fa[0]; y = fa[1]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Float) = when (i) {0 -> x = s; else -> y = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2 {
        x = -x; y = -y; return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2 = glm.add(Vec2(), this, 1f, 1f)
    fun incAss() = glm.add(this, this, 1f, 1f)
    fun inc(res: Vec2) = glm.add(res, this, 1f, 1f)


    operator fun dec(): Vec2 = glm.sub(Vec2(), this, 1f, 1f)
    fun decAss() = glm.sub(this, this, 1f, 1f)
    fun dec(res: Vec2) = glm.sub(res, this, 1f, 1f)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Float) = glm.add(Vec2(), this, b, b)
    operator fun plus(b: Vec2) = glm.add(Vec2(), this, b.x, b.y)

    fun add(bX: Float, bY: Float) = glm.add(Vec2(), this, bX, bY)

    infix fun addAss(b: Float) = glm.add(this, this, b, b)
    fun addAss(bX: Float, bY: Float) = glm.add(this, this, bX, bY)
    infix fun addAss(b: Vec2) = glm.add(this, this, b.x, b.y)

    fun add(b: Float, res: Vec2) = glm.add(res, this, b, b)
    fun add(bX: Float, bY: Float, res: Vec2) = glm.add(res, this, bX, bY)
    fun add(b: Vec2, res: Vec2) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Float) = glm.sub(Vec2(), this, b, b)
    operator fun minus(b: Vec2) = glm.sub(Vec2(), this, b.x, b.y)

    fun sub(bX: Float, bY: Float) = glm.sub(Vec2(), this, bX, bY)

    infix fun subAss(b: Float) = glm.sub(this, this, b, b)
    fun subAss(bX: Float, bY: Float) = glm.sub(this, this, bX, bY)
    infix fun subAss(b: Vec2) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Float, res: Vec2) = glm.sub(res, this, b, b)
    fun sub(bX: Float, bY: Float, res: Vec2) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2, res: Vec2) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Float) = glm.mul(Vec2(), this, b, b)
    operator fun times(b: Vec2) = glm.mul(Vec2(), this, b.x, b.y)

    fun mul(bX: Float, bY: Float) = glm.mul(Vec2(), this, bX, bY)

    infix fun mulAss(b: Float) = glm.mul(this, this, b, b)
    fun mulAss(bX: Float, bY: Float) = glm.mul(this, this, bX, bY)
    infix fun mulAss(b: Vec2) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Float, res: Vec2) = glm.mul(res, this, b, b)
    fun mul(bX: Float, bY: Float, res: Vec2) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2, res: Vec2) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Float) = glm.div(Vec2(), this, b, b)
    operator fun div(b: Vec2) = glm.div(Vec2(), this, b.x, b.y)

    fun div(bX: Float, bY: Float) = glm.div(Vec2(), this, bX, bY)

    infix fun divAss(b: Float) = glm.div(this, this, b, b)
    fun divAss(bX: Float, bY: Float) = glm.div(this, this, bX, bY)
    infix fun divAss(b: Vec2) = glm.div(this, this, b.x, b.y)

    fun div(b: Float, res: Vec2) = glm.div(res, this, b, b)
    fun div(bX: Float, bY: Float, res: Vec2) = glm.div(res, this, bX, bY)
    fun div(b: Vec2, res: Vec2) = glm.div(res, this, b.x, b.y)

    operator fun mod(b: Float) = glm.mod(Vec2(), this, b, b)
    operator fun mod(b: Vec2) = glm.mod(Vec2(), this, b.x, b.y)

    fun mod(bX: Float, bY: Float) = glm.mod(Vec2(), this, bX, bY)

    infix fun modAss(b: Float) = glm.mod(this, this, b, b)
    fun modAss(bX: Float, bY: Float) = glm.mod(this, this, bX, bY)
    infix fun modAss(b: Vec2) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Float, res: Vec2) = glm.mod(res, this, b, b)
    fun mod(bX: Float, bY: Float, res: Vec2) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2, res: Vec2) = glm.mod(res, this, b.x, b.y)
}


// -- Binary arithmetic vecOperators --

operator fun Float.plus(b: Vec2) = glm.add(Vec2(), b, this, this)
infix fun Float.addAss(b: Vec2) = glm.add(b, b, this, this)

operator fun Float.minus(b: Vec2) = glm.sub(Vec2(), this, this, b)
infix fun Float.subAss(b: Vec2) = glm.sub(b, this, this, b)

operator fun Float.times(b: Vec2) = glm.mul(Vec2(), b, this, this)
infix fun Float.mulAss(b: Vec2) = glm.mul(b, b, this, this)

operator fun Float.div(b: Vec2) = glm.div(Vec2(), this, this, b)
infix fun Float.divAss(b: Vec2) = glm.div(b, this, this, b)

operator fun Float.mod(b: Vec2) = glm.mod(Vec2(), this, this, b)
infix fun Float.modAss(b: Vec2) = glm.mod(b, this, this, b)