package glm.vec._2

import glm.vec.Vec2t

/**
 * Created by GBarbieri on 05.10.2016.
 */

data class Vec2(override var x: Float = 0f, override var y: Float = 0f) : Vec2t<Float>(x, y) {

    override var array: Array<Float> = arrayOf(x, y)

    // -- Explicit basic, conversion scalar and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toFloat(), v.y.toFloat())

    constructor(s: Float) : this(s, s)

    constructor(fa: FloatArray) : this(fa[0], fa[1])

    // -- Component accesses --

    operator fun get(i: Int): Float = when (i) {0 -> x; else -> y; }

    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2 {
        for (i in array.indices) array[i] = -array[i]
        return this
    }
}

inline fun Vec2(scalar: Number) = Vec2(scalar.toFloat(), scalar.toFloat())

inline fun Vec2(a: Number, b: Number) = Vec2(a.toFloat(), b.toFloat())