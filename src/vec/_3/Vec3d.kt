package vec._3

import vec.Vec3t

/**
 * Created by elect on 08/10/16.
 */

data class Vec3d(override var x: Double = 0.0, override var y: Double = 0.0, override var z: Double = 0.0) : Vec3t<Double>(x, y, z) {

    // -- Explicit basic, conversion b and conversion vector constructors --

    constructor(v: Vec3t<Number>) : this(v.x.toDouble(), v.y.toDouble(), v.z.toDouble())

    constructor(s: Double) : this(s, s, s)

    constructor(da: DoubleArray) : this(da[0], da[1], da[2])

    constructor(da: Array<Double>) : this(da[0], da[1], da[2])


    fun to(v: Vec3t<Number>): Vec3d {
        x = v.x.toDouble(); y = v.y.toDouble(); z = v.z.toDouble(); return this
    }

    fun to(s: Double): Vec3d {
        x = s; y = s; z = s; return this
    }

    fun to(x: Double, y: Double, z: Double): Vec3d {
        this.x = x; this.y = y; this.z = z; return this
    }

    fun to(ba: DoubleArray): Vec3d {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }

    fun to(ba: Array<Double>): Vec3d {
        x = ba[0]; y = ba[1]; z = ba[2]; return this
    }


    // -- Component accesses --
    operator fun get(i: Int) = when (i) {0 -> x; 1 -> y; else -> z; }

    operator fun set(i: Int, s: Double) = when (i) {0 -> x = s; 1 -> y = s; else -> z = s; }


    // -- Unary arithmetic vecOperators --
    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec3d {
        x = -x; y = -y; z = -z; return this
    }

    // no not operator, only booleans vec

    // -- Increment and decrement vecOperators --

    operator fun inc(): Vec3d = glm.add(Vec3d(), this, 1.0, 1.0, 1.0)
    fun incAss() = glm.add(this, this, 1.0, 1.0, 1.0)
    fun inc(res: Vec3d) = glm.add(res, this, 1.0, 1.0, 1.0)


    operator fun dec(): Vec3d = glm.sub(Vec3d(), this, 1.0, 1.0, 1.0)
    fun decAss() = glm.sub(this, this, 1.0, 1.0, 1.0)
    fun dec(res: Vec3d) = glm.sub(res, this, 1.0, 1.0, 1.0)


    // -- Binary arithmetic vecOperators --

    operator fun plus(b: Double) = glm.add(Vec3d(), this, b, b, b)
    operator fun plus(b: Vec3d) = glm.add(Vec3d(), this, b.x, b.y, b.z)

    fun add(bX: Double, bY: Double, bZ: Double) = glm.add(Vec3d(), this, bX, bY, bZ)

    infix inline fun addAss(b: Double) = glm.add(this, this, b, b, b)
    fun addAss(bX: Double, bY: Double, bZ: Double) = glm.add(this, this, bX, bY, bZ)
    infix inline fun addAss(b: Vec3d) = glm.add(this, this, b.x, b.y, b.z)

    fun add(b: Double, res: Vec3d) = glm.add(res, this, b, b, b)
    fun add(bX: Double, bY: Double, bZ: Double, res: Vec3d) = glm.add(res, this, bX, bY, bZ)
    fun add(b: Vec3d, res: Vec3d) = glm.add(res, this, b.x, b.y, b.z)


    operator fun minus(b: Double) = glm.sub(Vec3d(), this, b, b, b)
    operator fun minus(b: Vec3d) = glm.sub(Vec3d(), this, b.x, b.y, b.z)

    fun sub(bX: Double, bY: Double, bZ: Double) = glm.sub(Vec3d(), this, bX, bY, bZ)

    infix inline fun subAss(b: Double) = glm.sub(this, this, b, b, b)
    fun subAss(bX: Double, bY: Double, bZ: Double) = glm.sub(this, this, bX, bY, bZ)
    infix inline fun subAss(b: Vec3d) = glm.sub(this, this, b.x, b.y, b.z)

    fun sub(b: Double, res: Vec3d) = glm.sub(res, this, b, b, b)
    fun sub(bX: Double, bY: Double, bZ: Double, res: Vec3d) = glm.sub(res, this, bX, bY, bZ)
    fun sub(b: Vec3d, res: Vec3d) = glm.sub(res, this, b.x, b.y, b.z)


    operator fun times(b: Double) = glm.mul(Vec3d(), this, b, b, b)
    operator fun times(b: Vec3d) = glm.mul(Vec3d(), this, b.x, b.y, b.z)

    fun mul(bX: Double, bY: Double, bZ: Double) = glm.mul(Vec3d(), this, bX, bY, bZ)

    infix inline fun mulAss(b: Double) = glm.mul(this, this, b, b, b)
    fun mulAss(bX: Double, bY: Double, bZ: Double) = glm.mul(this, this, bX, bY, bZ)
    infix inline fun mulAss(b: Vec3d) = glm.mul(this, this, b.x, b.y, b.z)

    fun mul(b: Double, res: Vec3d) = glm.mul(res, this, b, b, b)
    fun mul(bX: Double, bY: Double, bZ: Double, res: Vec3d) = glm.mul(res, this, bX, bY, bZ)
    fun mul(b: Vec3d, res: Vec3d) = glm.mul(res, this, b.x, b.y, b.z)


    operator fun div(b: Double) = glm.div(Vec3d(), this, b, b, b)
    operator fun div(b: Vec3d) = glm.div(Vec3d(), this, b.x, b.y, b.z)

    fun div(bX: Double, bY: Double, bZ: Double) = glm.div(Vec3d(), this, bX, bY, bZ)

    infix inline fun divAss(b: Double) = glm.div(this, this, b, b, b)
    fun divAss(bX: Double, bY: Double, bZ: Double) = glm.div(this, this, bX, bY, bZ)
    infix inline fun divAss(b: Vec3d) = glm.div(this, this, b.x, b.y, b.z)

    fun div(b: Double, res: Vec3d) = glm.div(res, this, b, b, b)
    fun div(bX: Double, bY: Double, bZ: Double, res: Vec3d) = glm.div(res, this, bX, bY, bZ)
    fun div(b: Vec3d, res: Vec3d) = glm.div(res, this, b.x, b.y, b.z)

    operator fun mod(b: Double) = glm.mod(Vec3d(), this, b, b, b)
    operator fun mod(b: Vec3d) = glm.mod(Vec3d(), this, b.x, b.y, b.z)

    fun mod(bX: Double, bY: Double, bZ: Double) = glm.mod(Vec3d(), this, bX, bY, bZ)

    infix inline fun modAss(b: Double) = glm.mod(this, this, b, b, b)
    fun modAss(bX: Double, bY: Double, bZ: Double) = glm.mod(this, this, bX, bY, bZ)
    infix inline fun modAss(b: Vec3d) = glm.mod(this, this, b.x, b.y, b.z)

    fun mod(b: Double, res: Vec3d) = glm.mod(res, this, b, b, b)
    fun mod(bX: Double, bY: Double, bZ: Double, res: Vec3d) = glm.mod(res, this, bX, bY, bZ)
    fun mod(b: Vec3d, res: Vec3d) = glm.mod(res, this, b.x, b.y, b.z)
}


// -- Binary arithmetic vecOperators --

operator fun Double.plus(b: Vec3d) = glm.add(Vec3d(), b, this, this, this)
inline infix fun Double.addAss(b: Vec3d) = glm.add(b, b, this, this, this)

operator fun Double.minus(b: Vec3d) = glm.sub(Vec3d(), this, this, this, b)
inline infix fun Double.subAss(b: Vec3d) = glm.sub(b, b, this, this, this)

operator fun Double.times(b: Vec3d) = glm.mul(Vec3d(), b, this, this, this)
inline infix fun Double.mulAss(b: Vec3d) = glm.mul(b, b, this, this, this)

operator fun Double.div(b: Vec3d) = glm.div(Vec3d(), this, this, this, b)
inline infix fun Double.divAss(b: Vec3d) = glm.div(b, this, this, this, b)

operator fun Double.mod(b: Vec3d) = glm.mod(Vec3d(), this, this, this, b)
inline infix fun Double.modAss(b: Vec3d) = glm.mod(b, this, this, this, b)