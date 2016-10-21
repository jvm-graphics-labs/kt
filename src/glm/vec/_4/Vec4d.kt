package glm.vec._4

import glm.glm
import glm.vec.Vec4t

/**
 * Created by elect on 09/10/16.
 */

data class Vec4d(override var x: Double = 0.0, override var y: Double = 0.0, override var z: Double = 0.0, override var w: Double = 0.0) : Vec4t<Double>(x, y, z, w) {

    // -- Explicit basic, conversion other and conversion vector constructors --

    constructor(v: Vec4t<Number>) : this(v.x.toDouble(), v.y.toDouble(), v.z.toDouble(), v.w.toDouble())

    constructor(s: Double) : this(s, s, s, s)

    constructor(da: DoubleArray) : this(da[0], da[1], da[2], da[3])

    constructor(da: Array<Double>) : this(da[0], da[1], da[2], da[3])


    fun to(v: Vec4t<Number>): Vec4d {
        x = v.x.toDouble(); y = v.y.toDouble(); z = v.z.toDouble(); w = v.w.toDouble(); return this
    }

    fun to(s: Double): Vec4d {
        x = s; y = s; z = s; w = s; return this
    }

    fun to(x: Double, y: Double, z: Double, w: Double): Vec4d {
        this.x = x; this.y = y; this.z = z; this.w = w; return this
    }

    fun to(ba: DoubleArray): Vec4d {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }

    fun to(ba: Array<Double>): Vec4d {
        x = ba[0]; y = ba[1]; z = ba[2]; w = ba[3]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; 2 -> z; else -> w; }

    operator fun set(i: Int, s: Double) = when (i) {0 -> x = s; 1 -> y = s; 2 -> z = s; else -> w = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec4d {
        x = -x; y = -y; z = -z; w = -w; return this
    }

    // no not operator, only booleans glm.vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec4d = glm.add(Vec4d(), this, 1.0, 1.0, 1.0, 1.0)
    fun incAss() = glm.add(this, this, 1.0, 1.0, 1.0, 1.0)
    fun inc(res: Vec4d) = glm.add(res, this, 1.0, 1.0, 1.0, 1.0)


    operator fun dec(): Vec4d = glm.sub(Vec4d(), this, 1.0, 1.0, 1.0, 1.0)
    fun decAss() = glm.sub(this, this, 1.0, 1.0, 1.0, 1.0)
    fun dec(res: Vec4d) = glm.sub(res, this, 1.0, 1.0, 1.0, 1.0)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Double) = glm.add(Vec4d(), this, b, b, b, b)
    operator fun plus(b: Vec4d) = glm.add(Vec4d(), this, b.x, b.y, b.z, b.w)

    fun add(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.add(Vec4d(), this, bX, bY, bZ, bW)

    infix fun addAss(b: Double) = glm.add(this, this, b, b, b, b)
    fun addAss(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.add(this, this, bX, bY, bZ, bW)
    infix fun addAss(b: Vec4d) = glm.add(this, this, b.x, b.y, b.z, b.w)

    fun add(b: Double, res: Vec4d) = glm.add(res, this, b, b, b, b)
    fun add(bX: Double, bY: Double, bZ: Double, bW: Double, res: Vec4d) = glm.add(res, this, bX, bY, bZ, bW)
    fun add(b: Vec4d, res: Vec4d) = glm.add(res, this, b.x, b.y, b.z, b.w)


    operator fun minus(b: Double) = glm.sub(Vec4d(), this, b, b, b, b)
    operator fun minus(b: Vec4d) = glm.sub(Vec4d(), this, b.x, b.y, b.z, b.w)

    fun sub(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.sub(Vec4d(), this, bX, bY, bZ, bW)

    infix fun subAss(b: Double) = glm.sub(this, this, b, b, b, b)
    fun subAss(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.sub(this, this, bX, bY, bZ, bW)
    infix fun subAss(b: Vec4d) = glm.sub(this, this, b.x, b.y, b.z, b.w)

    fun sub(b: Double, res: Vec4d) = glm.sub(res, this, b, b, b, b)
    fun sub(bX: Double, bY: Double, bZ: Double, bW: Double, res: Vec4d) = glm.sub(res, this, bX, bY, bZ, bW)
    fun sub(b: Vec4d, res: Vec4d) = glm.sub(res, this, b.x, b.y, b.z, b.w)


    operator fun times(b: Double) = glm.mul(Vec4d(), this, b, b, b, b)
    operator fun times(b: Vec4d) = glm.mul(Vec4d(), this, b.x, b.y, b.z, b.w)

    fun mul(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.mul(Vec4d(), this, bX, bY, bZ, bW)

    infix fun mulAss(b: Double) = glm.mul(this, this, b, b, b, b)
    fun mulAss(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.mul(this, this, bX, bY, bZ, bW)
    infix fun mulAss(b: Vec4d) = glm.mul(this, this, b.x, b.y, b.z, b.w)

    fun mul(b: Double, res: Vec4d) = glm.mul(res, this, b, b, b, b)
    fun mul(bX: Double, bY: Double, bZ: Double, bW: Double, res: Vec4d) = glm.mul(res, this, bX, bY, bZ, bW)
    fun mul(b: Vec4d, res: Vec4d) = glm.mul(res, this, b.x, b.y, b.z, b.w)


    operator fun div(b: Double) = glm.div(Vec4d(), this, b, b, b, b)
    operator fun div(b: Vec4d) = glm.div(Vec4d(), this, b.x, b.y, b.z, b.w)

    fun div(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.div(Vec4d(), this, bX, bY, bZ, bW)

    infix fun divAss(b: Double) = glm.div(this, this, b, b, b, b)
    fun divAss(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.div(this, this, bX, bY, bZ, bW)
    infix fun divAss(b: Vec4d) = glm.div(this, this, b.x, b.y, b.z, b.w)

    fun div(b: Double, res: Vec4d) = glm.div(res, this, b, b, b, b)
    fun div(bX: Double, bY: Double, bZ: Double, bW: Double, res: Vec4d) = glm.div(res, this, bX, bY, bZ, bW)
    fun div(b: Vec4d, res: Vec4d) = glm.div(res, this, b.x, b.y, b.z, b.w)

    operator fun mod(b: Double) = glm.mod(Vec4d(), this, b, b, b, b)
    operator fun mod(b: Vec4d) = glm.mod(Vec4d(), this, b.x, b.y, b.z, b.w)

    fun mod(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.mod(Vec4d(), this, bX, bY, bZ, bW)

    infix fun modAss(b: Double) = glm.mod(this, this, b, b, b, b)
    fun modAss(bX: Double, bY: Double, bZ: Double, bW: Double) = glm.mod(this, this, bX, bY, bZ, bW)
    infix fun modAss(b: Vec4d) = glm.mod(this, this, b.x, b.y, b.z, b.w)

    fun mod(b: Double, res: Vec4d) = glm.mod(res, this, b, b, b, b)
    fun mod(bX: Double, bY: Double, bZ: Double, bW: Double, res: Vec4d) = glm.mod(res, this, bX, bY, bZ, bW)
    fun mod(b: Vec4d, res: Vec4d) = glm.mod(res, this, b.x, b.y, b.z, b.w)
}


// -- Binary arithmetic vecOperators --

operator fun Double.plus(b: Vec4d) = glm.add(Vec4d(), b, this, this, this, this)
infix fun Double.addAss(b: Vec4d) = glm.add(b, b, this, this, this, this)

operator fun Double.minus(b: Vec4d) = glm.sub(Vec4d(), this, this, this, this, b)
infix fun Double.subAss(b: Vec4d) = glm.sub(b, b, this, this, this, this)

operator fun Double.times(b: Vec4d) = glm.mul(Vec4d(), b, this, this, this, this)
infix fun Double.mulAss(b: Vec4d) = glm.mul(b, b, this, this, this, this)

operator fun Double.div(b: Vec4d) = glm.div(Vec4d(), this, this, this, this, b)
infix fun Double.divAss(b: Vec4d) = glm.div(b, this, this, this, this, b)

operator fun Double.mod(b: Vec4d) = glm.mod(Vec4d(), this, this, this, this, b)
infix fun Double.modAss(b: Vec4d) = glm.mod(b, this, this, this, this, b)