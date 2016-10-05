package glm.vec._2

import glm.vec.Vec2t

/**
 * Created by GBarbieri on 05.10.2016.
 */

data class Vec2(override var x: Float = 0f, override var y: Float = 0f) : Vec2t<Float>(x, y) {

    // -- Explicit basic, conversion s and conversion vector constructors --

    constructor(v: Vec2t<Number>) : this(v.x.toFloat(), v.y.toFloat())

    constructor(s: Float) : this(s, s)

    constructor(fa: FloatArray) : this(fa[0], fa[1])

    constructor(fa: Array<Float>) : this(fa[0], fa[1])

    // -- Component accesses --

    operator fun get(i: Int): Float = when (i) {0 -> x; else -> y; }

    operator fun set(i: Int, s: Float) = when (i) {0 -> x = s; else -> y = s; }

    // -- Unary arithmetic operators --

    operator fun unaryPlus() = this

    operator fun unaryMinus(): Vec2 {
        x = -x; y = -y; return this
    }

    // no not operator, only booleans vec

    operator fun plusAssign(b: Vec2) {
        x += b.x; y += b.y
    }

    operator fun plusAssign(b: Float) {
        x += b; y += b
    }

    operator fun minusAssign(b: Vec2) {
        x -= b.x; y -= b.y
    }

    operator fun minusAssign(b: Float) {
        x -= b; y -= b
    }

    operator fun timesAssign(b: Vec2) {
        x *= b.x; y *= b.y
    }

    operator fun timesAssign(b: Float) {
        x *= b; y *= b
    }

    operator fun divAssign(b: Vec2) {
        x /= b.x; y /= b.y
    }

    operator fun divAssign(b: Float) {
        x /= b.toFloat(); y /= b.toFloat()
    }

    operator fun modAssign(b: Vec2) {
        x %= b.x; y %= b.y
    }

    operator fun modAssign(b: Float) {
        x %= b; y %= b
    }

    // -- Increment and decrement operators --

    operator fun inc(): Vec2 = copy(x + 1, y + 1)

    operator fun dec(): Vec2 = copy(x - 1, y - 1)

    // -- Binary arithmetic operators --

    operator fun plus(s: Float) = Vec2(x + s, y + s)

    operator fun plus(other: Vec2) = Vec2(x + other.x, y + other.y)

    operator fun minus(s: Float) = Vec2(x - s, y - s)

    operator fun minus(other: Vec2) = Vec2(x - other.x, y - other.y)

    operator fun times(s: Float) = Vec2(x * s, y * s)

    operator fun times(other: Vec2) = Vec2(x * other.x, y * other.y)

    operator fun div(s: Float) = Vec2(x / s, y / s)

    operator fun div(other: Vec2) = Vec2(x / other.x, y / other.y)

    operator fun mod(s: Float) = Vec2(x % s, y % s)

    operator fun mod(other: Vec2) = Vec2(x % other.x, y % other.y)
}

inline fun Vec2(scalar: Number) = Vec2(scalar.toFloat(), scalar.toFloat())

inline fun Vec2(a: Number, b: Number) = Vec2(a.toFloat(), b.toFloat())