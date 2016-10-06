package vec._2

import vec.Vec2t

/**
 * Created bY GBarbieri on 06.10.2016.
 */

data class Vec2d(override var x: Double = 0.0, override var y: Double = 0.0) : Vec2t<Double>(x, y) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toDouble(), v.y.toDouble())

    constructor(s: Double) : this(s, s)

    constructor(da: DoubleArray) : this(da[0], da[1])

    constructor(da: Array<Double>) : this(da[0], da[1])


    fun set(v: Vec2t<Number>): Vec2d {
        x = v.x.toDouble(); y = v.y.toDouble(); return this
    }

    fun set(s: Double): Vec2d {
        x = s; y = s; return this
    }

    fun set(x: Double, y: Double): Vec2d {
        this.x = x; this.y = y; return this
    }

    fun set(ba: DoubleArray): Vec2d {
        x = ba[0]; y = ba[1]; return this
    }

    fun set(ba: Array<Double>): Vec2d {
        x = ba[0]; y = ba[1]; return this
    }

    // -- Component accesses --
    operator fun get(i: Int): Double = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Double) = when (i) {0 -> x = s; else -> y = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2d {
        x = -x; y = -y; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec2d = glm.add(Vec2d(), this, 1.0, 1.0)
    fun incAss() = glm.add(this, this, 1.0, 1.0)
    fun inc(res: Vec2d) = glm.add(res, this, 1.0, 1.0)


    operator fun dec(): Vec2d = glm.sub(Vec2d(), this, 1.0, 1.0)
    fun decAss() = glm.sub(this, this, 1.0, 1.0)
    fun dec(res: Vec2d) = glm.sub(res, this, 1.0, 1.0)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Double) = glm.add(Vec2d(), this, b, b)
    operator fun plus(b: Vec2d) = glm.add(Vec2d(), this, b.x, b.y)

    fun add(bX: Double, bY: Double) = glm.add(Vec2d(), this, bX, bY)

    infix inline fun addAss(b: Double) = glm.add(this, this, b, b)
    fun addAss(bX: Double, bY: Double) = glm.add(this, this, bX, bY)
    infix inline fun addAss(b: Vec2d) = glm.add(this, this, b.x, b.y)

    fun add(b: Double, res: Vec2d) = glm.add(res, this, b, b)
    fun add(bX: Double, bY: Double, res: Vec2d) = glm.add(res, this, bX, bY)
    fun add(b: Vec2d, res: Vec2d) = glm.add(res, this, b.x, b.y)


    operator fun minus(b: Double) = glm.sub(Vec2d(), this, b, b)
    operator fun minus(b: Vec2d) = glm.sub(Vec2d(), this, b.x, b.y)

    fun sub(bX: Double, bY: Double) = glm.sub(Vec2d(), this, bX, bY)

    infix inline fun subAss(b: Double) = glm.sub(this, this, b, b)
    fun subAss(bX: Double, bY: Double) = glm.sub(this, this, bX, bY)
    infix inline fun subAss(b: Vec2d) = glm.sub(this, this, b.x, b.y)

    fun sub(b: Double, res: Vec2d) = glm.sub(res, this, b, b)
    fun sub(bX: Double, bY: Double, res: Vec2d) = glm.sub(res, this, bX, bY)
    fun sub(b: Vec2d, res: Vec2d) = glm.sub(res, this, b.x, b.y)


    operator fun times(b: Double) = glm.mul(Vec2d(), this, b, b)
    operator fun times(b: Vec2d) = glm.mul(Vec2d(), this, b.x, b.y)

    fun mul(bX: Double, bY: Double) = glm.mul(Vec2d(), this, bX, bY)

    infix inline fun mulAss(b: Double) = glm.mul(this, this, b, b)
    fun mulAss(bX: Double, bY: Double) = glm.mul(this, this, bX, bY)
    infix inline fun mulAss(b: Vec2d) = glm.mul(this, this, b.x, b.y)

    fun mul(b: Double, res: Vec2d) = glm.mul(res, this, b, b)
    fun mul(bX: Double, bY: Double, res: Vec2d) = glm.mul(res, this, bX, bY)
    fun mul(b: Vec2d, res: Vec2d) = glm.mul(res, this, b.x, b.y)


    operator fun div(b: Double) = glm.div(Vec2d(), this, b, b)
    operator fun div(b: Vec2d) = glm.div(Vec2d(), this, b.x, b.y)

    fun div(bX: Double, bY: Double) = glm.div(Vec2d(), this, bX, bY)

    infix inline fun divAss(b: Double) = glm.div(this, this, b, b)
    fun divAss(bX: Double, bY: Double) = glm.div(this, this, bX, bY)
    infix inline fun divAss(b: Vec2d) = glm.div(this, this, b.x, b.y)

    fun div(b: Double, res: Vec2d) = glm.div(res, this, b, b)
    fun div(bX: Double, bY: Double, res: Vec2d) = glm.div(res, this, bX, bY)
    fun div(b: Vec2d, res: Vec2d) = glm.div(res, this, b.x, b.y)

    operator fun mod(s: Double) = glm.mod(Vec2d(), this, s, s)
    operator fun mod(b: Vec2d) = glm.mod(Vec2d(), this, b.x, b.y)

    fun mod(bX: Double, bY: Double) = glm.mod(Vec2d(), this, bX, bY)

    infix inline fun modAss(b: Double) = glm.mod(this, this, b, b)
    fun modAss(bX: Double, bY: Double) = glm.mod(this, this, bX, bY)
    infix inline fun modAss(b: Vec2d) = glm.mod(this, this, b.x, b.y)

    fun mod(b: Double, res: Vec2d) = glm.mod(res, this, b, b)
    fun mod(bX: Double, bY: Double, res: Vec2d) = glm.mod(res, this, bX, bY)
    fun mod(b: Vec2d, res: Vec2d) = glm.mod(res, this, b.x, b.y)
}


// -- Binary arithmetic vecOperators --

operator fun Double.plus(b: Vec2d) = glm.add(Vec2d(), b, this, this)
inline infix fun Double.addAss(b: Vec2d) = glm.add(b, b, this, this)

operator fun Double.minus(b: Vec2d) = glm.sub(Vec2d(), this, this, b)
inline infix fun Double.subAss(b: Vec2d) = glm.sub(b, this, this, b)

operator fun Double.times(b: Vec2d) = glm.mul(Vec2d(), b, this, this)
inline infix fun Double.mulAss(b: Vec2d) = glm.mul(b, b, this, this)

operator fun Double.div(b: Vec2d) = glm.div(Vec2d(), this, this, b)
inline infix fun Double.divAss(b: Vec2d) = glm.div(b, this, this, b)

operator fun Double.mod(b: Vec2d) = glm.mod(Vec2d(), this, this, b)
inline infix fun Double.modAss(b: Vec2d) = glm.mod(b, this, this, b)