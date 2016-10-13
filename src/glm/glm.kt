package glm

import glm.vec._2.*
import glm.vec._3.*
import glm.vec._4.*

import Ubyte
import Uint
import Ulong
import Ushort

/**
 * Created bY GBarbieri on 06.10.2016.
 */

abstract class glm {

    companion object : ubyte_operators, uint_operators, ulong_operators, ushort_operators,
            vec2_operators, vec3_operators, vec4_operators, gli
}

interface ubyte_operators {

    fun add(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.v + b.v).toByte(); }

    fun add(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.v + b).toByte(); }

    fun add(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.v + b).toByte(); }


    fun sub(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.v - b.v).toByte(); }

    fun sub(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.v - b).toByte(); }

    fun sub(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.v - b).toByte(); }

    fun sub(res: Ubyte, a: Byte, b: Ubyte) {
        res.v = (a - b.v).toByte(); }

    fun sub(res: Ubyte, a: Int, b: Ubyte) {
        res.v = (a - b.v).toByte(); }


    fun mul(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.v * b.v).toByte(); }

    fun mul(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.v * b).toByte(); }

    fun mul(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.v * b).toByte(); }


    fun div(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()).toByte(); }

    fun div(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()).toByte(); }

    fun div(res: Ubyte, a: Ubyte, b: Int) {
        res.v = Integer.divideUnsigned(a.toInt(), b).toByte(); }

    fun div(res: Ubyte, a: Byte, b: Ubyte) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()).toByte(); }

    fun div(res: Ubyte, a: Int, b: Ubyte) {
        res.v = Integer.divideUnsigned(a, b.toInt()).toByte(); }


    fun mod(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.toInt() % b.toInt()).toByte(); }

    fun mod(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.toInt() % b.toInt()).toByte(); }

    fun mod(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.toInt() % b).toByte(); }

    fun mod(res: Ubyte, a: Byte, b: Ubyte) {
        res.v = (a.toInt() % b.toInt()).toByte(); }

    fun mod(res: Ubyte, a: Int, b: Ubyte) {
        res.v = (a % b.toInt()).toByte(); }


    fun and(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.toInt() % b.toInt()).toByte(); }

    fun and(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.toInt() % b.toInt()).toByte(); }

    fun and(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.toInt() % b).toByte(); }


    fun or(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.toInt() or b.toInt()).toByte(); }

    fun or(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.toInt() or b.toInt()).toByte(); }

    fun or(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.toInt() or b).toByte(); }


    fun xor(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.toInt() xor b.toInt()).toByte(); }

    fun xor(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.toInt() xor b.toInt()).toByte(); }

    fun xor(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.toInt() xor b).toByte(); }


    fun shl(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.toInt() shl b.toInt()).toByte(); }

    fun shl(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.toInt() shl b.toInt()).toByte(); }

    fun shl(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.toInt() shl b).toByte(); }


    fun shr(res: Ubyte, a: Ubyte, b: Ubyte) {
        res.v = (a.toInt() shl b.toInt()).toByte(); }

    fun shr(res: Ubyte, a: Ubyte, b: Byte) {
        res.v = (a.toInt() shl b.toInt()).toByte(); }

    fun shr(res: Ubyte, a: Ubyte, b: Int) {
        res.v = (a.toInt() shl b).toByte(); }


    fun inv(res: Ubyte, a: Ubyte) {
        res.v = a.toInt().inv().toByte(); }

    fun inv(res: Ubyte, a: Byte) {
        res.v = a.toInt().inv().toByte(); }

    fun inv(res: Ubyte, a: Int) {
        res.v = a.inv().toByte(); }
}

interface uint_operators {

    fun add(res: Uint, a: Uint, b: Uint) {
        res.v = a.v + b.v; }

    fun add(res: Uint, a: Uint, b: Int) {
        res.v = a.v + b; }


    fun sub(res: Uint, a: Uint, b: Uint) {
        res.v = a.v - b.v; }

    fun sub(res: Uint, a: Uint, b: Int) {
        res.v = a.v - b; }

    fun sub(res: Uint, a: Int, b: Uint) {
        res.v = a - b.v; }


    fun mul(res: Uint, a: Uint, b: Uint) {
        res.v = a.v * b.v; }

    fun mul(res: Uint, a: Uint, b: Int) {
        res.v = a.v * b; }


    fun div(res: Uint, a: Uint, b: Uint) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()); }

    fun div(res: Uint, a: Uint, b: Int) {
        res.v = Integer.divideUnsigned(a.toInt(), b); }

    fun div(res: Uint, a: Int, b: Uint) {
        res.v = Integer.divideUnsigned(a, b.toInt()); }


    fun mod(res: Uint, a: Uint, b: Uint) {
        res.v = a.toInt() % b.toInt(); }

    fun mod(res: Uint, a: Uint, b: Int) {
        res.v = a.toInt() % b; }

    fun mod(res: Uint, a: Int, b: Uint) {
        res.v = a % b.toInt(); }


    fun and(res: Uint, a: Uint, b: Uint) {
        res.v = a.toInt() % b.toInt(); }

    fun and(res: Uint, a: Uint, b: Int) {
        res.v = a.toInt() % b; }


    fun or(res: Uint, a: Uint, b: Uint) {
        res.v = a.toInt() or b.toInt(); }

    fun or(res: Uint, a: Uint, b: Int) {
        res.v = a.toInt() or b; }


    fun xor(res: Uint, a: Uint, b: Uint) {
        res.v = a.toInt() xor b.toInt(); }

    fun xor(res: Uint, a: Uint, b: Int) {
        res.v = a.toInt() xor b; }


    fun shl(res: Uint, a: Uint, b: Uint) {
        res.v = a.toInt() shl b.toInt(); }

    fun shl(res: Uint, a: Uint, b: Int) {
        res.v = a.toInt() shl b; }


    fun shr(res: Uint, a: Uint, b: Uint) {
        res.v = a.toInt() shl b.toInt(); }

    fun shr(res: Uint, a: Uint, b: Int) {
        res.v = a.toInt() shl b; }


    fun inv(res: Uint, a: Uint) {
        res.v = a.v.inv(); }

    fun inv(res: Uint, a: Int) {
        res.v = a.inv(); }
}

interface ulong_operators {

    fun add(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.v + b.v; }

    fun add(res: Ulong, a: Ulong, b: Long) {
        res.v = a.v + b; }


    fun sub(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.v - b.v; }

    fun sub(res: Ulong, a: Ulong, b: Long) {
        res.v = a.v - b; }

    fun sub(res: Ulong, a: Long, b: Ulong) {
        res.v = a - b.v; }


    fun mul(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.v * b.v; }

    fun mul(res: Ulong, a: Ulong, b: Long) {
        res.v = a.v * b; }


    fun div(res: Ulong, a: Ulong, b: Ulong) {
        res.v = java.lang.Long.divideUnsigned(a.toLong(), b.toLong()); }

    fun div(res: Ulong, a: Ulong, b: Long) {
        res.v = java.lang.Long.divideUnsigned(a.toLong(), b); }

    fun div(res: Ulong, a: Long, b: Ulong) {
        res.v = java.lang.Long.divideUnsigned(a, b.toLong()); }


    fun mod(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.toLong() % b.toLong(); }

    fun mod(res: Ulong, a: Ulong, b: Long) {
        res.v = a.toLong() % b; }

    fun mod(res: Ulong, a: Long, b: Ulong) {
        res.v = a % b.toLong(); }


    fun and(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.toLong() % b.toLong(); }

    fun and(res: Ulong, a: Ulong, b: Long) {
        res.v = a.toLong() % b; }


    fun or(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.toLong() or b.toLong(); }

    fun or(res: Ulong, a: Ulong, b: Long) {
        res.v = a.toLong() or b; }


    fun xor(res: Ulong, a: Ulong, b: Ulong) {
        res.v = a.toLong() xor b.toLong(); }

    fun xor(res: Ulong, a: Ulong, b: Long) {
        res.v = a.toLong() xor b; }


    fun shl(res: Ulong, a: Ulong, b: Int) {
        res.v = a.toLong() shl b; }


    fun shr(res: Ulong, a: Ulong, b: Int) {
        res.v = a.toLong() shl b; }


    fun inv(res: Ulong, a: Ulong) {
        res.v = a.v.inv(); }

    fun inv(res: Ulong, a: Long) {
        res.v = a.inv(); }
}

interface ushort_operators {

    fun add(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.v + b.v).toShort(); }

    fun add(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.v + b).toShort(); }

    fun add(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.v + b).toShort(); }


    fun sub(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.v - b.v).toShort(); }

    fun sub(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.v - b).toShort(); }

    fun sub(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.v - b).toShort(); }

    fun sub(res: Ushort, a: Short, b: Ushort) {
        res.v = (a - b.v).toShort(); }

    fun sub(res: Ushort, a: Int, b: Ushort) {
        res.v = (a - b.v).toShort(); }


    fun mul(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.v * b.v).toShort(); }

    fun mul(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.v * b).toShort(); }

    fun mul(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.v * b).toShort(); }


    fun div(res: Ushort, a: Ushort, b: Ushort) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()).toShort(); }

    fun div(res: Ushort, a: Ushort, b: Short) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()).toShort(); }

    fun div(res: Ushort, a: Ushort, b: Int) {
        res.v = Integer.divideUnsigned(a.toInt(), b).toShort(); }

    fun div(res: Ushort, a: Short, b: Ushort) {
        res.v = Integer.divideUnsigned(a.toInt(), b.toInt()).toShort(); }

    fun div(res: Ushort, a: Int, b: Ushort) {
        res.v = Integer.divideUnsigned(a, b.toInt()).toShort(); }


    fun mod(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.toInt() % b.toInt()).toShort(); }

    fun mod(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.toInt() % b.toInt()).toShort(); }

    fun mod(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.toInt() % b).toShort(); }

    fun mod(res: Ushort, a: Short, b: Ushort) {
        res.v = (a.toInt() % b.toInt()).toShort(); }

    fun mod(res: Ushort, a: Int, b: Ushort) {
        res.v = (a % b.toInt()).toShort(); }


    fun and(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.toInt() % b.toInt()).toShort(); }

    fun and(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.toInt() % b.toInt()).toShort(); }

    fun and(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.toInt() % b).toShort(); }


    fun or(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.toInt() or b.toInt()).toShort(); }

    fun or(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.toInt() or b.toInt()).toShort(); }

    fun or(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.toInt() or b).toShort(); }


    fun xor(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.toInt() xor b.toInt()).toShort(); }

    fun xor(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.toInt() xor b.toInt()).toShort(); }

    fun xor(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.toInt() xor b).toShort(); }


    fun shl(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.toInt() shl b.toInt()).toShort(); }

    fun shl(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.toInt() shl b.toInt()).toShort(); }

    fun shl(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.toInt() shl b).toShort(); }


    fun shr(res: Ushort, a: Ushort, b: Ushort) {
        res.v = (a.toInt() shl b.toInt()).toShort(); }

    fun shr(res: Ushort, a: Ushort, b: Short) {
        res.v = (a.toInt() shl b.toInt()).toShort(); }

    fun shr(res: Ushort, a: Ushort, b: Int) {
        res.v = (a.toInt() shl b).toShort(); }


    fun inv(res: Ushort, a: Ushort) {
        res.v = a.toInt().inv().toShort(); }

    fun inv(res: Ushort, a: Short) {
        res.v = a.toInt().inv().toShort(); }

    fun inv(res: Ushort, a: Int) {
        res.v = a.inv().toShort(); }
}

interface vec2_operators {


    fun add(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.to(a.x + bX, a.y + bY)

    fun sub(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.to(a.x - bX, a.y - bY)
    fun sub(res: Vec2, aX: Float, aY: Float, b: Vec2) = res.to(aX - b.x, aY - b.y)

    fun mul(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.to(a.x * bX, a.y * bY)

    fun div(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.to(a.x / bX, a.y / bY)
    fun div(res: Vec2, aX: Float, aY: Float, b: Vec2) = res.to(aX / b.x, aY / b.y)

    fun mod(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.to(a.x % bX, a.y % bY)
    fun mod(res: Vec2, aX: Float, aY: Float, b: Vec2) = res.to(aX % b.x, aY % b.y)


    fun add(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x + bX).toByte(), (a.y + bY).toByte())
    fun add(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x + bX).toByte(), (a.y + bY).toByte())

    fun sub(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x - bX).toByte(), (a.y - bY).toByte())
    fun sub(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x - bX).toByte(), (a.y - bY).toByte())

    fun sub(res: Vec2b, aX: Byte, aY: Byte, b: Vec2b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte())
    fun sub(res: Vec2b, aX: Int, aY: Int, b: Vec2b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte())

    fun mul(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x * bX).toByte(), (a.y * bY).toByte())
    fun mul(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x * bX).toByte(), (a.y * bY).toByte())

    fun div(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x / bX).toByte(), (a.y / bY).toByte())
    fun div(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x / bX).toByte(), (a.y / bY).toByte())

    fun div(res: Vec2b, aX: Byte, aY: Byte, b: Vec2b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte())
    fun div(res: Vec2b, aX: Int, aY: Int, b: Vec2b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte())

    fun mod(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x % bX).toByte(), (a.y % bY).toByte())
    fun mod(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x % bX).toByte(), (a.y % bY).toByte())

    fun mod(res: Vec2b, aX: Byte, aY: Byte, b: Vec2b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte())
    fun mod(res: Vec2b, aX: Int, aY: Int, b: Vec2b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte())

    fun and(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toByte(), (a.y.toInt() and bY).toByte())

    fun or(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toByte(), (a.y.toInt() or bY).toByte())

    fun xor(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.y.toInt() xor bY).toByte())

    fun shl(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.y.toInt() shl bY).toByte())

    fun shr(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.y.toInt() shr bY).toByte())

    fun inv(res: Vec2b, a: Vec2b) = res.to(a.x.toInt().inv().toByte(), a.y.toInt().inv().toByte())


    fun add(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.to(a.x + bX, a.y + bY)

    fun sub(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.to(a.x - bX, a.y - bY)
    fun sub(res: Vec2d, aX: Double, aY: Double, b: Vec2d) = res.to(aX - b.x, aY - b.y)

    fun mul(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.to(a.x * bX, a.y * bY)

    fun div(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.to(a.x / bX, a.y / bY)
    fun div(res: Vec2d, aX: Double, aY: Double, b: Vec2d) = res.to(aX / b.x, aY / b.y)

    fun mod(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.to(a.x % bX, a.y % bY)
    fun mod(res: Vec2d, aX: Double, aY: Double, b: Vec2d) = res.to(aX % b.x, aY % b.y)


    fun add(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x + bX, a.y + bY)

    fun sub(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x - bX, a.y - bY)
    fun sub(res: Vec2i, aX: Int, aY: Int, b: Vec2i) = res.to(aX - b.x, aY - b.y)

    fun mul(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x * bX, a.y * bY)

    fun div(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x / bX, a.y / bY)
    fun div(res: Vec2i, aX: Int, aY: Int, b: Vec2i) = res.to(aX / b.x, aY / b.y)

    fun mod(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x % bX, a.y % bY)
    fun mod(res: Vec2i, aX: Int, aY: Int, b: Vec2i) = res.to(aX % b.x, aY % b.y)

    fun and(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x and bX, a.y and bY)

    fun or(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x or bX, a.y or bY)

    fun xor(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x xor bX, a.y xor bY)

    fun shl(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x shl bX, a.y shl bY)

    fun shr(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x shr bX, a.y shr bY)

    fun inv(res: Vec2i, a: Vec2i) = res.to(a.x.inv(), a.y.inv())


    fun add(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x + bX, a.y + bY)

    fun sub(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x - bX, a.y - bY)
    fun sub(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.to(aX - b.x, aY - b.y)

    fun mul(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x * bX, a.y * bY)

    fun div(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x / bX, a.y / bY)
    fun div(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.to(aX / b.x, aY / b.y)

    fun mod(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x % bX, a.y % bY)
    fun mod(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.to(aX % b.x, aY % b.y)

    fun and(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x and bX, a.y and bY)

    fun or(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x or bX, a.y or bY)

    fun xor(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x xor bX, a.y xor bY)

    fun shl(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x shl bX.toInt(), a.y shl bY.toInt())
    fun shl(res: Vec2l, a: Vec2l, bX: Int, bY: Int) = res.to(a.x shl bX, a.y shl bY)

    fun shr(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x shr bX.toInt(), a.y shr bY.toInt())
    fun shr(res: Vec2l, a: Vec2l, bX: Int, bY: Int) = res.to(a.x shr bX, a.y shr bY)

    fun inv(res: Vec2l, a: Vec2l) = res.to(a.x.inv(), a.y.inv())


    fun add(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x + bX).toShort(), (a.y + bY).toShort())
    fun add(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x + bX).toShort(), (a.y + bY).toShort())

    fun sub(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x - bX).toShort(), (a.y - bY).toShort())
    fun sub(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x - bX).toShort(), (a.y - bY).toShort())

    fun sub(res: Vec2s, aX: Short, aY: Short, b: Vec2s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort())
    fun sub(res: Vec2s, aX: Int, aY: Int, b: Vec2s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort())

    fun mul(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x * bX).toShort(), (a.y * bY).toShort())
    fun mul(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x * bX).toShort(), (a.y * bY).toShort())

    fun div(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x / bX).toShort(), (a.y / bY).toShort())
    fun div(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x / bX).toShort(), (a.y / bY).toShort())

    fun div(res: Vec2s, aX: Short, aY: Short, b: Vec2s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort())
    fun div(res: Vec2s, aX: Int, aY: Int, b: Vec2s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort())

    fun mod(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x % bX).toShort(), (a.y % bY).toShort())
    fun mod(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x % bX).toShort(), (a.y % bY).toShort())

    fun mod(res: Vec2s, aX: Short, aY: Short, b: Vec2s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort())
    fun mod(res: Vec2s, aX: Int, aY: Int, b: Vec2s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort())

    fun and(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toShort(), (a.y.toInt() and bY).toShort())

    fun or(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toShort(), (a.y.toInt() or bY).toShort())

    fun xor(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.y.toInt() xor bY).toShort())

    fun shl(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.y.toInt() shl bY).toShort())

    fun shr(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.y.toInt() shr bY).toShort())

    fun inv(res: Vec2s, a: Vec2s) = res.to(a.x.toInt().inv().toShort(), a.y.toInt().inv().toShort())


    fun add(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.v + bX.v).toByte(), (a.y.v + bY.v).toByte())
    fun add(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte())
    fun add(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte())

    fun sub(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.v - bX.v).toByte(), (a.y.v - bY.v).toByte())
    fun sub(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte())
    fun sub(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte())

    fun sub(res: Vec2ub, aX: Ubyte, aY: Ubyte, b: Vec2ub) = res.to((aX.v - b.x.v).toByte(), (aY.v - b.y.v).toByte())
    fun sub(res: Vec2ub, aX: Byte, aY: Byte, b: Vec2ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte())
    fun sub(res: Vec2ub, aX: Int, aY: Int, b: Vec2ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte())

    fun mul(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.v * bX.v).toByte(), (a.y.v * bY.v).toByte())
    fun mul(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte())
    fun mul(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte())

    fun div(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte())
    fun div(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte())
    fun div(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte())

    fun div(res: Vec2ub, aX: Ubyte, aY: Ubyte, b: Vec2ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte())
    fun div(res: Vec2ub, aX: Byte, aY: Byte, b: Vec2ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte())
    fun div(res: Vec2ub, aX: Int, aY: Int, b: Vec2ub) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toByte(), Integer.divideUnsigned(aY, b.y.toInt()).toByte())

    fun mod(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte())
    fun mod(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte())
    fun mod(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte())

    fun mod(res: Vec2ub, aX: Ubyte, aY: Ubyte, b: Vec2ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte())
    fun mod(res: Vec2ub, aX: Byte, aY: Byte, b: Vec2ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte())
    fun mod(res: Vec2ub, aX: Int, aY: Int, b: Vec2ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte())

    fun and(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toByte(), (a.y.toInt() and bY).toByte())

    fun or(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toByte(), (a.y.toInt() or bY).toByte())

    fun xor(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.y.toInt() xor bY).toByte())

    fun shl(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.y.toInt() shl bY).toByte())

    fun shr(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.y.toInt() shr bY).toByte())

    fun inv(res: Vec2ub, a: Vec2ub) = res.to(a.x.toInt().inv().toByte(), a.x.toInt().inv().toByte())


    fun add(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v + bX.v, a.y.v + bY.v)
    fun add(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v + bX, a.y.v + bY)

    fun sub(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v - bX.v, a.y.v - bY.v)
    fun sub(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v - bX, a.y.v - bY)

    fun sub(res: Vec2ui, aX: Uint, aY: Uint, b: Vec2ui) = res.to(aX.v - b.x.v, aY.v - b.y.v)
    fun sub(res: Vec2ui, aX: Int, aY: Int, b: Vec2ui) = res.to(aX - b.x.v, aY - b.y.v)

    fun mul(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v * bX.v, a.y.v * bY.v)
    fun mul(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v * bX, a.y.v * bY)

    fun div(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(Integer.divideUnsigned(a.x.v, bX.v), Integer.divideUnsigned(a.y.v, bY.v))
    fun div(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(Integer.divideUnsigned(a.x.v, bX), Integer.divideUnsigned(a.y.v, bY))

    fun div(res: Vec2ui, aX: Uint, aY: Uint, b: Vec2ui) = res.to(Integer.divideUnsigned(aX.v, b.x.v), Integer.divideUnsigned(aY.v, b.y.v))
    fun div(res: Vec2ui, aX: Int, aY: Int, b: Vec2ui) = res.to(Integer.divideUnsigned(aX, b.x.v), Integer.divideUnsigned(aY, b.y.v))

    fun mod(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(Integer.remainderUnsigned(a.x.v, bX.v), Integer.remainderUnsigned(a.y.v, bY.v))
    fun mod(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(Integer.remainderUnsigned(a.x.v, bX), Integer.remainderUnsigned(a.y.v, bY))

    fun mod(res: Vec2ui, aX: Uint, aY: Uint, b: Vec2ui) = res.to(Integer.remainderUnsigned(aX.v, b.x.v), Integer.remainderUnsigned(aY.v, b.y.v))
    fun mod(res: Vec2ui, aX: Int, aY: Int, b: Vec2ui) = res.to(Integer.remainderUnsigned(aX, b.x.v), Integer.remainderUnsigned(aY, b.y.v))

    fun and(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v and bX.v, a.y.v and bY.v)
    fun and(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v and bX, a.y.v and bY)

    fun or(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v or bX.v, a.y.v or bY.v)
    fun or(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v or bX, a.y.v or bY)

    fun xor(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v xor bX.v, a.y.v xor bY.v)
    fun xor(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v xor bX, a.y.v xor bY)

    fun shl(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v shl bX.v, a.y.v shl bY.v)
    fun shl(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v shl bX, a.y.v shl bY)

    fun shr(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v shr bX.v, a.y.v shr bY.v)
    fun shr(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v shr bX, a.y.v shr bY)

    fun inv(res: Vec2ui, a: Vec2ui) = res.to(a.x.v.inv(), a.x.v.inv())


    fun add(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v + bX.v, a.y.v + bY.v)
    fun add(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v + bX, a.y.v + bY)

    fun sub(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v - bX.v, a.y.v - bY.v)
    fun sub(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v - bX, a.y.v - bY)

    fun sub(res: Vec2ul, aX: Ulong, aY: Ulong, b: Vec2ul) = res.to(aX.v - b.x.v, aY.v - b.y.v)
    fun sub(res: Vec2ul, aX: Long, aY: Long, b: Vec2ul) = res.to(aX - b.x.v, aY - b.y.v)

    fun mul(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v * bX.v, a.y.v * bY.v)
    fun mul(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v * bX, a.y.v * bY)

    fun div(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX.v), java.lang.Long.divideUnsigned(a.y.v, bY.v))
    fun div(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX), java.lang.Long.divideUnsigned(a.y.v, bY))

    fun div(res: Vec2ul, aX: Ulong, aY: Ulong, b: Vec2ul) = res.to(java.lang.Long.divideUnsigned(aX.v, b.x.v), java.lang.Long.divideUnsigned(aY.v, b.y.v))
    fun div(res: Vec2ul, aX: Long, aY: Long, b: Vec2ul) = res.to(java.lang.Long.divideUnsigned(aX, b.x.v), java.lang.Long.divideUnsigned(aY, b.y.v))

    fun mod(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX.v), java.lang.Long.remainderUnsigned(a.y.v, bY.v))
    fun mod(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX), java.lang.Long.remainderUnsigned(a.y.v, bY))

    fun mod(res: Vec2ul, aX: Ulong, aY: Ulong, b: Vec2ul) = res.to(java.lang.Long.remainderUnsigned(aX.v, b.x.v), java.lang.Long.remainderUnsigned(aY.v, b.y.v))
    fun mod(res: Vec2ul, aX: Long, aY: Long, b: Vec2ul) = res.to(java.lang.Long.remainderUnsigned(aX, b.x.v), java.lang.Long.remainderUnsigned(aY, b.y.v))

    fun and(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v and bX.v, a.y.v and bY.v)
    fun and(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v and bX, a.y.v and bY)

    fun or(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v or bX.v, a.y.v or bY.v)
    fun or(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v or bX, a.y.v or bY)

    fun xor(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v xor bX.v, a.y.v xor bY.v)
    fun xor(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v xor bX, a.y.v xor bY)

    fun shl(res: Vec2ul, a: Vec2ul, bX: Int, bY: Int) = res.to(a.x.v shl bX, a.y.v shl bY)

    fun shr(res: Vec2ul, a: Vec2ul, bX: Int, bY: Int) = res.to(a.x.v shr bX, a.y.v shr bY)

    fun inv(res: Vec2ul, a: Vec2ul) = res.to(a.x.v.inv(), a.y.v.inv())


    fun add(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.v + bX.v).toShort(), (a.y.v + bY.v).toShort())
    fun add(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort())
    fun add(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort())

    fun sub(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.v - bX.v).toShort(), (a.y.v - bY.v).toShort())
    fun sub(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort())
    fun sub(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort())

    fun sub(res: Vec2us, aX: Ushort, aY: Ushort, b: Vec2us) = res.to((aX.v - b.x.v).toShort(), (aY.v - b.y.v).toShort())
    fun sub(res: Vec2us, aX: Short, aY: Short, b: Vec2us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort())
    fun sub(res: Vec2us, aX: Int, aY: Int, b: Vec2us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort())

    fun mul(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.v * bX.v).toShort(), (a.y.v * bY.v).toShort())
    fun mul(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort())
    fun mul(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort())

    fun div(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort())
    fun div(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort())
    fun div(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort())

    fun div(res: Vec2us, aX: Ushort, aY: Ushort, b: Vec2us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort())
    fun div(res: Vec2us, aX: Short, aY: Short, b: Vec2us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort())
    fun div(res: Vec2us, aX: Int, aY: Int, b: Vec2us) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toShort(), Integer.divideUnsigned(aY, b.y.toInt()).toShort())

    fun mod(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort())
    fun mod(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort())
    fun mod(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort())

    fun mod(res: Vec2us, aX: Ushort, aY: Ushort, b: Vec2us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort())
    fun mod(res: Vec2us, aX: Short, aY: Short, b: Vec2us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort())
    fun mod(res: Vec2us, aX: Int, aY: Int, b: Vec2us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort())

    fun and(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toShort(), (a.y.toInt() and bY).toShort())

    fun or(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toShort(), (a.y.toInt() or bY).toShort())

    fun xor(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.y.toInt() xor bY).toShort())

    fun shl(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.y.toInt() shl bY).toShort())

    fun shr(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.y.toInt() shr bY).toShort())

    fun inv(res: Vec2us, a: Vec2us) = res.to(a.x.toInt().inv().toShort(), a.y.toInt().inv().toShort())
}

interface vec3_operators {

    fun add(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x + bX, a.y + bY, a.z + bZ)

    fun sub(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x - bX, a.y - bY, a.z - bZ)
    fun sub(res: Vec3, aX: Float, aY: Float, aZ: Float, b: Vec3) = res.to(aX - b.x, aY - b.y, aZ - b.z)

    fun mul(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x * bX, a.y * bY, a.z * bZ)

    fun div(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x / bX, a.y / bY, a.z / bZ)
    fun div(res: Vec3, aX: Float, aY: Float, aZ: Float, b: Vec3) = res.to(aX / b.x, aY / b.y, aZ / b.z)

    fun mod(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x % bX, a.y % bY, a.z % bZ)
    fun mod(res: Vec3, aX: Float, aY: Float, aZ: Float, b: Vec3) = res.to(aX % b.x, aY % b.y, aZ % b.z)


    fun add(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x + bX).toByte(), (a.y + bY).toByte(), (a.z + bZ).toByte())
    fun add(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x + bX).toByte(), (a.y + bY).toByte(), (a.z + bZ).toByte())

    fun sub(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x - bX).toByte(), (a.y - bY).toByte(), (a.z - bZ).toByte())
    fun sub(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x - bX).toByte(), (a.y - bY).toByte(), (a.z - bZ).toByte())

    fun sub(res: Vec3b, aX: Byte, aY: Byte, aZ: Byte, b: Vec3b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte(), (aZ - b.z).toByte())
    fun sub(res: Vec3b, aX: Int, aY: Int, aZ: Int, b: Vec3b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte(), (aZ - b.z).toByte())

    fun mul(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x * bX).toByte(), (a.y * bY).toByte(), (a.z * bZ).toByte())
    fun mul(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x * bX).toByte(), (a.y * bY).toByte(), (a.z * bZ).toByte())

    fun div(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x / bX).toByte(), (a.y / bY).toByte(), (a.z / bZ).toByte())
    fun div(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x / bX).toByte(), (a.y / bY).toByte(), (a.z / bZ).toByte())

    fun div(res: Vec3b, aX: Byte, aY: Byte, aZ: Byte, b: Vec3b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte(), (aZ / b.z).toByte())
    fun div(res: Vec3b, aX: Int, aY: Int, aZ: Int, b: Vec3b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte(), (aZ / b.z).toByte())

    fun mod(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x % bX).toByte(), (a.y % bY).toByte(), (a.z % bZ).toByte())
    fun mod(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x % bX).toByte(), (a.y % bY).toByte(), (a.z % bZ).toByte())

    fun mod(res: Vec3b, aX: Byte, aY: Byte, aZ: Byte, b: Vec3b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte(), (aZ % b.z).toByte())
    fun mod(res: Vec3b, aX: Int, aY: Int, aZ: Int, b: Vec3b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte(), (aZ % b.z).toByte())

    fun and(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte(), (a.z.toInt() and bZ.toInt()).toByte())
    fun and(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() and bX).toByte(), (a.y.toInt() and bY).toByte(), (a.z.toInt() and bZ.toInt()).toByte())

    fun or(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte(), (a.z.toInt() or bZ.toInt()).toByte())
    fun or(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() or bX).toByte(), (a.y.toInt() or bY).toByte(), (a.z.toInt() or bZ.toInt()).toByte())

    fun xor(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte(), (a.z.toInt() xor bZ.toInt()).toByte())
    fun xor(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.y.toInt() xor bY).toByte(), (a.z.toInt() xor bZ.toInt()).toByte())

    fun shl(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte(), (a.z.toInt() shl bZ.toInt()).toByte())
    fun shl(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.y.toInt() shl bY).toByte(), (a.z.toInt() shl bZ.toInt()).toByte())

    fun shr(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte(), (a.z.toInt() shr bZ.toInt()).toByte())
    fun shr(res: Vec3b, a: Vec3b, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.y.toInt() shr bY).toByte(), (a.z.toInt() shr bZ.toInt()).toByte())

    fun inv(res: Vec3b, a: Vec3b) = res.to(a.x.toInt().inv().toByte(), a.y.toInt().inv().toByte(), a.z.toInt().inv().toByte())


    fun add(res: Vec3d, a: Vec3d, bX: Double, bY: Double, bZ: Double) = res.to(a.x + bX, a.y + bY, a.z + bZ)

    fun sub(res: Vec3d, a: Vec3d, bX: Double, bY: Double, bZ: Double) = res.to(a.x - bX, a.y - bY, a.z - bZ)
    fun sub(res: Vec3d, aX: Double, aY: Double, aZ: Double, b: Vec3d) = res.to(aX - b.x, aY - b.y, aZ - b.z)

    fun mul(res: Vec3d, a: Vec3d, bX: Double, bY: Double, bZ: Double) = res.to(a.x * bX, a.y * bY, a.z * bZ)

    fun div(res: Vec3d, a: Vec3d, bX: Double, bY: Double, bZ: Double) = res.to(a.x / bX, a.y / bY, a.z / bZ)
    fun div(res: Vec3d, aX: Double, aY: Double, aZ: Double, b: Vec3d) = res.to(aX / b.x, aY / b.y, aZ / b.z)

    fun mod(res: Vec3d, a: Vec3d, bX: Double, bY: Double, bZ: Double) = res.to(a.x % bX, a.y % bY, a.z % bZ)

    fun mod(res: Vec3d, aX: Double, aY: Double, aZ: Double, b: Vec3d) = res.to(aX % b.x, aY % b.y, aZ % b.z)


    fun add(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x + bX, a.y + bY, a.z + bZ)

    fun sub(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x - bX, a.y - bY, a.z - bZ)
    fun sub(res: Vec3i, aX: Int, aY: Int, aZ: Int, b: Vec3i) = res.to(aX - b.x, aY - b.y, aZ - b.z)

    fun mul(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x * bX, a.y * bY, a.z * bZ)

    fun div(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x / bX, a.y / bY, a.z / bZ)
    fun div(res: Vec3i, aX: Int, aY: Int, aZ: Int, b: Vec3i) = res.to(aX / b.x, aY / b.y, aZ / b.z)

    fun mod(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x % bX, a.y % bY, a.z % bZ)
    fun mod(res: Vec3i, aX: Int, aY: Int, aZ: Int, b: Vec3i) = res.to(aX % b.x, aY % b.y, aZ % b.z)

    fun and(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x and bX, a.y and bY, a.z and bZ)

    fun or(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x or bX, a.y or bY, a.z or bZ)

    fun xor(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x xor bX, a.y xor bY, a.z xor bZ)

    fun shl(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x shl bX, a.y shl bY, a.z shl bZ)

    fun shr(res: Vec3i, a: Vec3i, bX: Int, bY: Int, bZ: Int) = res.to(a.x shr bX, a.y shr bY, a.z shr bZ)

    fun inv(res: Vec3i, a: Vec3i) = res.to(a.x.inv(), a.y.inv(), a.z.inv())


    fun add(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x + bX, a.y + bY, a.z + bZ)

    fun sub(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x - bX, a.y - bY, a.z - bZ)
    fun sub(res: Vec3l, aX: Long, aY: Long, aZ: Long, b: Vec3l) = res.to(aX - b.x, aY - b.y, aZ - b.z)

    fun mul(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x * bX, a.y * bY, a.z * bZ)

    fun div(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x / bX, a.y / bY, a.z / bZ)
    fun div(res: Vec3l, aX: Long, aY: Long, aZ: Long, b: Vec3l) = res.to(aX / b.x, aY / b.y, aZ / b.z)

    fun mod(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x % bX, a.y % bY, a.z % bZ)
    fun mod(res: Vec3l, aX: Long, aY: Long, aZ: Long, b: Vec3l) = res.to(aX % b.x, aY % b.y, aZ % b.z)

    fun and(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x and bX, a.y and bY, a.z and bZ)

    fun or(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x or bX, a.y or bY, a.z or bZ)

    fun xor(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x xor bX, a.y xor bY, a.z xor bZ)

    fun shl(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x shl bX.toInt(), a.y shl bY.toInt(), a.z shl bZ.toInt())
    fun shl(res: Vec3l, a: Vec3l, bX: Int, bY: Int, bZ: Int) = res.to(a.x shl bX, a.y shl bY, a.z shl bZ)

    fun shr(res: Vec3l, a: Vec3l, bX: Long, bY: Long, bZ: Long) = res.to(a.x shr bX.toInt(), a.y shr bY.toInt(), a.z shr bZ.toInt())
    fun shr(res: Vec3l, a: Vec3l, bX: Int, bY: Int, bZ: Int) = res.to(a.x shr bX, a.y shr bY, a.z shr bZ)

    fun inv(res: Vec3l, a: Vec3l) = res.to(a.x.inv(), a.y.inv(), a.z.inv())


    fun add(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x + bX).toShort(), (a.y + bY).toShort(), (a.z + bZ).toShort())
    fun add(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x + bX).toShort(), (a.y + bY).toShort(), (a.z + bZ).toShort())

    fun sub(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x - bX).toShort(), (a.y - bY).toShort(), (a.z - bZ).toShort())
    fun sub(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x - bX).toShort(), (a.y - bY).toShort(), (a.z - bZ).toShort())

    fun sub(res: Vec3s, aX: Short, aY: Short, aZ: Short, b: Vec3s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort(), (aZ - b.z).toShort())
    fun sub(res: Vec3s, aX: Int, aY: Int, aZ: Int, b: Vec3s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort(), (aZ - b.z).toShort())

    fun mul(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x * bX).toShort(), (a.y * bY).toShort(), (a.z * bZ).toShort())
    fun mul(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x * bX).toShort(), (a.y * bY).toShort(), (a.z * bZ).toShort())

    fun div(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x / bX).toShort(), (a.y / bY).toShort(), (a.z / bZ).toShort())
    fun div(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x / bX).toShort(), (a.y / bY).toShort(), (a.z / bZ).toShort())

    fun div(res: Vec3s, aX: Short, aY: Short, aZ: Short, b: Vec3s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort(), (aZ / b.z).toShort())
    fun div(res: Vec3s, aX: Int, aY: Int, aZ: Int, b: Vec3s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort(), (aZ / b.z).toShort())

    fun mod(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x % bX).toShort(), (a.y % bY).toShort(), (a.z % bZ).toShort())
    fun mod(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x % bX).toShort(), (a.y % bY).toShort(), (a.z % bZ).toShort())

    fun mod(res: Vec3s, aX: Short, aY: Short, aZ: Short, b: Vec3s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort(), (aZ % b.z).toShort())
    fun mod(res: Vec3s, aX: Int, aY: Int, aZ: Int, b: Vec3s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort(), (aZ % b.z).toShort())

    fun and(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort(), (a.z.toInt() and bZ.toInt()).toShort())
    fun and(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() and bX).toShort(), (a.y.toInt() and bY).toShort(), (a.z.toInt() and bZ).toShort())

    fun or(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort(), (a.z.toInt() or bZ.toInt()).toShort())
    fun or(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() or bX).toShort(), (a.y.toInt() or bY).toShort(), (a.z.toInt() or bZ).toShort())

    fun xor(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort(), (a.z.toInt() xor bZ.toInt()).toShort())
    fun xor(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.y.toInt() xor bY).toShort(), (a.z.toInt() xor bZ).toShort())

    fun shl(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort(), (a.z.toInt() shl bZ.toInt()).toShort())
    fun shl(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.y.toInt() shl bY).toShort(), (a.z.toInt() shl bZ).toShort())

    fun shr(res: Vec3s, a: Vec3s, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort(), (a.z.toInt() shr bZ.toInt()).toShort())
    fun shr(res: Vec3s, a: Vec3s, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.y.toInt() shr bY).toShort(), (a.z.toInt() shr bZ).toShort())

    fun inv(res: Vec3s, a: Vec3s) = res.to(a.x.toInt().inv().toShort(), a.y.toInt().inv().toShort(), a.z.toInt().inv().toShort())


    fun add(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.v + bX.v).toByte(), (a.y.v + bY.v).toByte(), (a.z.v + bZ.v).toByte())
    fun add(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte(), (a.z.v + bZ).toByte())
    fun add(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte(), (a.z.v + bZ).toByte())

    fun sub(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.v - bX.v).toByte(), (a.y.v - bY.v).toByte(), (a.z.v - bZ.v).toByte())
    fun sub(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte(), (a.z.v - bZ).toByte())
    fun sub(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte(), (a.z.v - bZ).toByte())

    fun sub(res: Vec3ub, aX: Ubyte, aY: Ubyte, aZ: Ubyte, b: Vec3ub) = res.to((aX.v - b.x.v).toByte(), (aY.v - b.y.v).toByte(), (aZ.v - b.z.v).toByte())
    fun sub(res: Vec3ub, aX: Byte, aY: Byte, aZ: Byte, b: Vec3ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte(), (aZ - b.z.toInt()).toByte())
    fun sub(res: Vec3ub, aX: Int, aY: Int, aZ: Int, b: Vec3ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte(), (aZ - b.z.toInt()).toByte())

    fun mul(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.v * bX.v).toByte(), (a.y.v * bY.v).toByte(), (a.z.v * bZ.v).toByte())
    fun mul(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte(), (a.z.v * bZ.toInt()).toByte())
    fun mul(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte(), (a.z.v * bZ.toInt()).toByte())

    fun div(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toByte())
    fun div(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toByte())
    fun div(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toByte())

    fun div(res: Vec3ub, aX: Ubyte, aY: Ubyte, aZ: Ubyte, b: Vec3ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toByte())
    fun div(res: Vec3ub, aX: Byte, aY: Byte, aZ: Byte, b: Vec3ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toByte())
    fun div(res: Vec3ub, aX: Int, aY: Int, aZ: Int, b: Vec3ub) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toByte(), Integer.divideUnsigned(aY, b.y.toInt()).toByte(), Integer.divideUnsigned(aZ, b.z.toInt()).toByte())

    fun mod(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toByte())
    fun mod(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toByte())
    fun mod(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toByte())

    fun mod(res: Vec3ub, aX: Ubyte, aY: Ubyte, aZ: Ubyte, b: Vec3ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toByte())
    fun mod(res: Vec3ub, aX: Byte, aY: Byte, aZ: Byte, b: Vec3ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toByte())
    fun mod(res: Vec3ub, aX: Int, aY: Int, aZ: Int, b: Vec3ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toByte())

    fun and(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte(), (a.z.toInt() and bZ.toInt()).toByte())
    fun and(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte(), (a.z.toInt() and bZ.toInt()).toByte())
    fun and(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() and bX).toByte(), (a.y.toInt() and bY).toByte(), (a.z.toInt() and bZ).toByte())

    fun or(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte(), (a.z.toInt() or bZ.toInt()).toByte())
    fun or(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte(), (a.z.toInt() or bZ.toInt()).toByte())
    fun or(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() or bX).toByte(), (a.y.toInt() or bY).toByte(), (a.z.toInt() or bZ).toByte())

    fun xor(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte(), (a.z.toInt() xor bZ.toInt()).toByte())
    fun xor(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte(), (a.z.toInt() xor bZ.toInt()).toByte())
    fun xor(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.y.toInt() xor bY).toByte(), (a.z.toInt() xor bZ).toByte())

    fun shl(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte(), (a.z.toInt() shl bZ.toInt()).toByte())
    fun shl(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte(), (a.z.toInt() shl bZ.toInt()).toByte())
    fun shl(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.y.toInt() shl bY).toByte(), (a.z.toInt() shl bZ).toByte())

    fun shr(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte(), (a.z.toInt() shr bZ.toInt()).toByte())
    fun shr(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte, bZ: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte(), (a.z.toInt() shr bZ.toInt()).toByte())
    fun shr(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.y.toInt() shr bY).toByte(), (a.z.toInt() shr bZ).toByte())

    fun inv(res: Vec3ub, a: Vec3ub) = res.to(a.x.toInt().inv().toByte(), a.y.toInt().inv().toByte(), a.z.toInt().inv().toByte())


    fun add(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v + bX.v, a.y.v + bY.v, a.z.v + bZ.v)
    fun add(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v + bX, a.y.v + bY, a.z.v + bZ)

    fun sub(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v - bX.v, a.y.v - bY.v, a.z.v - bZ.v)
    fun sub(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v - bX, a.y.v - bY, a.z.v - bZ)

    fun sub(res: Vec3ui, aX: Uint, aY: Uint, aZ: Uint, b: Vec3ui) = res.to(aX.v - b.x.v, aY.v - b.y.v, aZ.v - b.z.v)
    fun sub(res: Vec3ui, aX: Int, aY: Int, aZ: Int, b: Vec3ui) = res.to(aX - b.x.v, aY - b.y.v, aZ - b.z.v)

    fun mul(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v * bX.v, a.y.v * bY.v, a.z.v * bZ.v)
    fun mul(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v * bX, a.y.v * bY, a.z.v * bZ)

    fun div(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(Integer.divideUnsigned(a.x.v, bX.v), Integer.divideUnsigned(a.y.v, bY.v), Integer.divideUnsigned(a.z.v, bZ.v))
    fun div(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(Integer.divideUnsigned(a.x.v, bX), Integer.divideUnsigned(a.y.v, bY), Integer.divideUnsigned(a.z.v, bZ))

    fun div(res: Vec3ui, aX: Uint, aY: Uint, aZ: Uint, b: Vec3ui) = res.to(Integer.divideUnsigned(aX.v, b.x.v), Integer.divideUnsigned(aY.v, b.y.v), Integer.divideUnsigned(aZ.v, b.z.v))
    fun div(res: Vec3ui, aX: Int, aY: Int, aZ: Int, b: Vec3ui) = res.to(Integer.divideUnsigned(aX, b.x.v), Integer.divideUnsigned(aY, b.y.v), Integer.divideUnsigned(aZ, b.z.v))

    fun mod(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(Integer.remainderUnsigned(a.x.v, bX.v), Integer.remainderUnsigned(a.y.v, bY.v), Integer.remainderUnsigned(a.z.v, bZ.v))
    fun mod(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(Integer.remainderUnsigned(a.x.v, bX), Integer.remainderUnsigned(a.y.v, bY), Integer.remainderUnsigned(a.z.v, bZ))

    fun mod(res: Vec3ui, aX: Uint, aY: Uint, aZ: Uint, b: Vec3ui) = res.to(Integer.remainderUnsigned(aX.v, b.x.v), Integer.remainderUnsigned(aY.v, b.y.v), Integer.remainderUnsigned(aZ.v, b.z.v))
    fun mod(res: Vec3ui, aX: Int, aY: Int, aZ: Int, b: Vec3ui) = res.to(Integer.remainderUnsigned(aX, b.x.v), Integer.remainderUnsigned(aY, b.y.v), Integer.remainderUnsigned(aZ, b.z.v))

    fun and(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v and bX.v, a.y.v and bY.v, a.z.v and bZ.v)
    fun and(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v and bX, a.y.v and bY, a.z.v and bZ)

    fun or(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v or bX.v, a.y.v or bY.v, a.z.v or bZ.v)
    fun or(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v or bX, a.y.v or bY, a.z.v or bZ)

    fun xor(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v xor bX.v, a.y.v xor bY.v, a.z.v xor bZ.v)
    fun xor(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v xor bX, a.y.v xor bY, a.z.v xor bZ)

    fun shl(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v shl bX.v, a.y.v shl bY.v, a.z.v shl bZ.v)
    fun shl(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v shl bX, a.y.v shl bY, a.z.v shl bZ)

    fun shr(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint, bZ: Uint) = res.to(a.x.v shr bX.v, a.y.v shr bY.v, a.z.v shr bZ.v)
    fun shr(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v shr bX, a.y.v shr bY, a.z.v shr bZ)

    fun inv(res: Vec3ui, a: Vec3ui) = res.to(a.x.v.inv(), a.y.v.inv(), a.z.v.inv())


    fun add(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(a.x.v + bX.v, a.y.v + bY.v, a.z.v + bZ.v)
    fun add(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(a.x.v + bX, a.y.v + bY, a.z.v + bZ)

    fun sub(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(a.x.v - bX.v, a.y.v - bY.v, a.z.v - bZ.v)
    fun sub(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(a.x.v - bX, a.y.v - bY, a.z.v - bZ)

    fun sub(res: Vec3ul, aX: Ulong, aY: Ulong, aZ: Ulong, b: Vec3ul) = res.to(aX.v - b.x.v, aY.v - b.y.v, aZ.v - b.z.v)
    fun sub(res: Vec3ul, aX: Long, aY: Long, aZ: Long, b: Vec3ul) = res.to(aX - b.x.v, aY - b.y.v, aZ - b.z.v)

    fun mul(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(a.x.v * bX.v, a.y.v * bY.v, a.z.v * bZ.v)
    fun mul(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(a.x.v * bX, a.y.v * bY, a.z.v * bZ)

    fun div(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX.v), java.lang.Long.divideUnsigned(a.y.v, bY.v), java.lang.Long.divideUnsigned(a.z.v, bZ.v))
    fun div(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX), java.lang.Long.divideUnsigned(a.y.v, bY), java.lang.Long.divideUnsigned(a.z.v, bZ))

    fun div(res: Vec3ul, aX: Ulong, aY: Ulong, aZ: Ulong, b: Vec3ul) = res.to(java.lang.Long.divideUnsigned(aX.v, b.x.v), java.lang.Long.divideUnsigned(aY.v, b.y.v), java.lang.Long.divideUnsigned(aZ.v, b.z.v))
    fun div(res: Vec3ul, aX: Long, aY: Long, aZ: Long, b: Vec3ul) = res.to(java.lang.Long.divideUnsigned(aX, b.x.v), java.lang.Long.divideUnsigned(aY, b.y.v), java.lang.Long.divideUnsigned(aZ, b.z.v))

    fun mod(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX.v), java.lang.Long.remainderUnsigned(a.y.v, bY.v), java.lang.Long.remainderUnsigned(a.z.v, bZ.v))
    fun mod(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX), java.lang.Long.remainderUnsigned(a.y.v, bY), java.lang.Long.remainderUnsigned(a.z.v, bZ))

    fun mod(res: Vec3ul, aX: Ulong, aY: Ulong, aZ: Ulong, b: Vec3ul) = res.to(java.lang.Long.remainderUnsigned(aX.v, b.x.v), java.lang.Long.remainderUnsigned(aY.v, b.y.v), java.lang.Long.remainderUnsigned(aZ.v, b.z.v))
    fun mod(res: Vec3ul, aX: Long, aY: Long, aZ: Long, b: Vec3ul) = res.to(java.lang.Long.remainderUnsigned(aX, b.x.v), java.lang.Long.remainderUnsigned(aY, b.y.v), java.lang.Long.remainderUnsigned(aZ, b.z.v))

    fun and(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(a.x.v and bX.v, a.y.v and bY.v, a.z.v and bZ.v)
    fun and(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(a.x.v and bX, a.y.v and bY, a.z.v and bZ)

    fun or(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(a.x.v or bX.v, a.y.v or bY.v, a.z.v or bZ.v)
    fun or(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(a.x.v or bX, a.y.v or bY, a.z.v or bZ)

    fun xor(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong, bZ: Ulong) = res.to(a.x.v xor bX.v, a.y.v xor bY.v, a.z.v xor bZ.v)
    fun xor(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long, bZ: Long) = res.to(a.x.v xor bX, a.y.v xor bY, a.z.v xor bZ)

    fun shl(res: Vec3ul, a: Vec3ul, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v shl bX, a.y.v shl bY, a.z.v shl bZ)

    fun shr(res: Vec3ul, a: Vec3ul, bX: Int, bY: Int, bZ: Int) = res.to(a.x.v shr bX, a.y.v shr bY, a.z.v shr bZ)

    fun inv(res: Vec3ul, a: Vec3ul) = res.to(a.x.v.inv(), a.y.v.inv(), a.z.v.inv())


    fun add(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.v + bX.v).toShort(), (a.y.v + bY.v).toShort(), (a.z.v + bZ.v).toShort())
    fun add(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort(), (a.z.v + bZ).toShort())
    fun add(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort(), (a.z.v + bZ).toShort())

    fun sub(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.v - bX.v).toShort(), (a.y.v - bY.v).toShort(), (a.z.v - bZ.v).toShort())
    fun sub(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort(), (a.z.v - bZ).toShort())
    fun sub(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort(), (a.z.v - bZ).toShort())

    fun sub(res: Vec3us, aX: Ushort, aY: Ushort, aZ: Ushort, b: Vec3us) = res.to((aX.v - b.x.v).toShort(), (aY.v - b.y.v).toShort(), (aZ.v - b.z.v).toShort())
    fun sub(res: Vec3us, aX: Short, aY: Short, aZ: Short, b: Vec3us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort(), (aZ - b.z.v).toShort())
    fun sub(res: Vec3us, aX: Int, aY: Int, aZ: Int, b: Vec3us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort(), (aZ - b.z.v).toShort())

    fun mul(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.v * bX.v).toShort(), (a.y.v * bY.v).toShort(), (a.z.v * bZ.v).toShort())
    fun mul(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort(), (a.z.v * bZ).toShort())
    fun mul(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort(), (a.z.v * bZ).toShort())

    fun div(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toShort())
    fun div(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toShort())
    fun div(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toShort())

    fun div(res: Vec3us, aX: Ushort, aY: Ushort, aZ: Ushort, b: Vec3us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toShort())
    fun div(res: Vec3us, aX: Short, aY: Short, aZ: Short, b: Vec3us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toShort())
    fun div(res: Vec3us, aX: Int, aY: Int, aZ: Int, b: Vec3us) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toShort(), Integer.divideUnsigned(aY, b.y.toInt()).toShort(), Integer.divideUnsigned(aZ, b.z.toInt()).toShort())

    fun mod(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toShort())
    fun mod(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toShort())
    fun mod(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toShort())

    fun mod(res: Vec3us, aX: Ushort, aY: Ushort, aZ: Ushort, b: Vec3us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toShort())
    fun mod(res: Vec3us, aX: Short, aY: Short, aZ: Short, b: Vec3us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toShort())
    fun mod(res: Vec3us, aX: Int, aY: Int, aZ: Int, b: Vec3us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toShort())

    fun and(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort(), (a.z.toInt() and bZ.toInt()).toShort())
    fun and(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort(), (a.z.toInt() and bZ.toInt()).toShort())
    fun and(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() and bX).toShort(), (a.y.toInt() and bY).toShort(), (a.z.toInt() and bZ).toShort())

    fun or(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort(), (a.z.toInt() or bZ.toInt()).toShort())
    fun or(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort(), (a.z.toInt() or bZ.toInt()).toShort())
    fun or(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() or bX).toShort(), (a.y.toInt() or bY).toShort(), (a.z.toInt() or bZ).toShort())

    fun xor(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort(), (a.z.toInt() xor bZ.toInt()).toShort())
    fun xor(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort(), (a.z.toInt() xor bZ.toInt()).toShort())
    fun xor(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.y.toInt() xor bY).toShort(), (a.z.toInt() xor bZ).toShort())

    fun shl(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort(), (a.z.toInt() shl bZ.toInt()).toShort())
    fun shl(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort(), (a.z.toInt() shl bZ.toInt()).toShort())
    fun shl(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.y.toInt() shl bY).toShort(), (a.z.toInt() shl bZ).toShort())

    fun shr(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort, bZ: Ushort) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort(), (a.z.toInt() shr bZ.toInt()).toShort())
    fun shr(res: Vec3us, a: Vec3us, bX: Short, bY: Short, bZ: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort(), (a.z.toInt() shr bZ.toInt()).toShort())
    fun shr(res: Vec3us, a: Vec3us, bX: Int, bY: Int, bZ: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.y.toInt() shr bY).toShort(), (a.z.toInt() shr bZ).toShort())

    fun inv(res: Vec3us, a: Vec3us) = res.to(a.x.toInt().inv().toShort(), a.y.toInt().inv().toShort(), a.z.toInt().inv().toShort())
}

interface vec4_operators {


    fun add(res: Vec4, a: Vec4, bX: Float, bY: Float, bZ: Float, bW: Float) = res.to(a.x + bX, a.y + bY, a.z + bZ, a.w + bW)

    fun sub(res: Vec4, a: Vec4, bX: Float, bY: Float, bZ: Float, bW: Float) = res.to(a.x - bX, a.y - bY, a.z - bZ, a.w - bW)
    fun sub(res: Vec4, aX: Float, aY: Float, aZ: Float, aW: Float, b: Vec4) = res.to(aX - b.x, aY - b.y, aZ - b.z, aW - b.w)

    fun mul(res: Vec4, a: Vec4, bX: Float, bY: Float, bZ: Float, bW: Float) = res.to(a.x * bX, a.y * bY, a.z * bZ, a.w * bW)

    fun div(res: Vec4, a: Vec4, bX: Float, bY: Float, bZ: Float, bW: Float) = res.to(a.x / bX, a.y / bY, a.z / bZ, a.w / bW)
    fun div(res: Vec4, aX: Float, aY: Float, aZ: Float, aW: Float, b: Vec4) = res.to(aX / b.x, aY / b.y, aZ / b.z, aW / b.w)

    fun mod(res: Vec4, a: Vec4, bX: Float, bY: Float, bZ: Float, bW: Float) = res.to(a.x % bX, a.y % bY, a.z % bZ, a.w % bW)
    fun mod(res: Vec4, aX: Float, aY: Float, aZ: Float, aW: Float, b: Vec4) = res.to(aX % b.x, aY % b.y, aZ % b.z, aW % b.w)


    fun add(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x + bX).toByte(), (a.y + bY).toByte(), (a.z + bZ).toByte(), (a.w + bW).toByte())
    fun add(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x + bX).toByte(), (a.y + bY).toByte(), (a.z + bZ).toByte(), (a.z + bZ).toByte())

    fun sub(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x - bX).toByte(), (a.y - bY).toByte(), (a.z - bZ).toByte(), (a.w - bW).toByte())
    fun sub(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x - bX).toByte(), (a.y - bY).toByte(), (a.z - bZ).toByte(), (a.w - bW).toByte())

    fun sub(res: Vec4b, aX: Byte, aY: Byte, aZ: Byte, aW: Byte, b: Vec4b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte(), (aZ - b.z).toByte(), (aW - b.w).toByte())
    fun sub(res: Vec4b, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte(), (aZ - b.z).toByte(), (aW - b.w).toByte())

    fun mul(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x * bX).toByte(), (a.y * bY).toByte(), (a.z * bZ).toByte(), (a.w * bW).toByte())
    fun mul(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x * bX).toByte(), (a.y * bY).toByte(), (a.z * bZ).toByte(), (a.w * bW).toByte())

    fun div(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x / bX).toByte(), (a.y / bY).toByte(), (a.z / bZ).toByte(), (a.w / bW).toByte())
    fun div(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x / bX).toByte(), (a.y / bY).toByte(), (a.z / bZ).toByte(), (a.w / bW).toByte())

    fun div(res: Vec4b, aX: Byte, aY: Byte, aZ: Byte, aW: Byte, b: Vec4b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte(), (aZ / b.z).toByte(), (aW / b.w).toByte())
    fun div(res: Vec4b, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte(), (aZ / b.z).toByte(), (aW / b.w).toByte())

    fun mod(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x % bX).toByte(), (a.y % bY).toByte(), (a.z % bZ).toByte(), (a.w % bW).toByte())
    fun mod(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x % bX).toByte(), (a.y % bY).toByte(), (a.z % bZ).toByte(), (a.w % bW).toByte())

    fun mod(res: Vec4b, aX: Byte, aY: Byte, aZ: Byte, aW: Byte, b: Vec4b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte(), (aZ % b.z).toByte(), (aW % b.w).toByte())
    fun mod(res: Vec4b, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte(), (aZ % b.z).toByte(), (aW % b.w).toByte())

    fun and(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte(), (a.z.toInt() and bZ.toInt()).toByte(), (a.w.toInt() and bW.toInt()).toByte())
    fun and(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() and bX).toByte(), (a.y.toInt() and bY).toByte(), (a.z.toInt() and bZ.toInt()).toByte(), (a.w.toInt() and bW.toInt()).toByte())

    fun or(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte(), (a.z.toInt() or bZ.toInt()).toByte(), (a.w.toInt() or bW.toInt()).toByte())
    fun or(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() or bX).toByte(), (a.y.toInt() or bY).toByte(), (a.z.toInt() or bZ.toInt()).toByte(), (a.w.toInt() or bW.toInt()).toByte())

    fun xor(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte(), (a.z.toInt() xor bZ.toInt()).toByte(), (a.w.toInt() xor bW.toInt()).toByte())
    fun xor(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.y.toInt() xor bY).toByte(), (a.z.toInt() xor bZ.toInt()).toByte(), (a.w.toInt() xor bW.toInt()).toByte())

    fun shl(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte(), (a.z.toInt() shl bZ.toInt()).toByte(), (a.w.toInt() shl bW.toInt()).toByte())
    fun shl(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.y.toInt() shl bY).toByte(), (a.z.toInt() shl bZ.toInt()).toByte(), (a.w.toInt() shl bW.toInt()).toByte())

    fun shr(res: Vec4b, a: Vec4b, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte(), (a.z.toInt() shr bZ.toInt()).toByte(), (a.w.toInt() shr bW.toInt()).toByte())
    fun shr(res: Vec4b, a: Vec4b, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.y.toInt() shr bY).toByte(), (a.z.toInt() shr bZ.toInt()).toByte(), (a.w.toInt() shr bW.toInt()).toByte())

    fun inv(res: Vec4b, a: Vec4b) = res.to(a.x.toInt().inv().toByte(), a.y.toInt().inv().toByte(), a.z.toInt().inv().toByte(), a.w.toInt().inv().toByte())


    fun add(res: Vec4d, a: Vec4d, bX: Double, bY: Double, bZ: Double, bW: Double) = res.to(a.x + bX, a.y + bY, a.z + bZ, a.w + bW)

    fun sub(res: Vec4d, a: Vec4d, bX: Double, bY: Double, bZ: Double, bW: Double) = res.to(a.x - bX, a.y - bY, a.z - bZ, a.w - bW)
    fun sub(res: Vec4d, aX: Double, aY: Double, aZ: Double, aW: Double, b: Vec4d) = res.to(aX - b.x, aY - b.y, aZ - b.z, aW - b.w)

    fun mul(res: Vec4d, a: Vec4d, bX: Double, bY: Double, bZ: Double, bW: Double) = res.to(a.x * bX, a.y * bY, a.z * bZ, a.w * bW)

    fun div(res: Vec4d, a: Vec4d, bX: Double, bY: Double, bZ: Double, bW: Double) = res.to(a.x / bX, a.y / bY, a.z / bZ, a.w / bW)
    fun div(res: Vec4d, aX: Double, aY: Double, aZ: Double, aW: Double, b: Vec4d) = res.to(aX / b.x, aY / b.y, aZ / b.z, aW / b.w)

    fun mod(res: Vec4d, a: Vec4d, bX: Double, bY: Double, bZ: Double, bW: Double) = res.to(a.x % bX, a.y % bY, a.z % bZ, a.w % bW)

    fun mod(res: Vec4d, aX: Double, aY: Double, aZ: Double, aW: Double, b: Vec4d) = res.to(aX % b.x, aY % b.y, aZ % b.z, aW % b.w)


    fun add(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x + bX, a.y + bY, a.z + bZ, a.w + bW)

    fun sub(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x - bX, a.y - bY, a.z - bZ, a.w - bW)
    fun sub(res: Vec4i, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4i) = res.to(aX - b.x, aY - b.y, aZ - b.z, aW - b.w)

    fun mul(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x * bX, a.y * bY, a.z * bZ, a.w * bW)

    fun div(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x / bX, a.y / bY, a.z / bZ, a.w / bW)
    fun div(res: Vec4i, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4i) = res.to(aX / b.x, aY / b.y, aZ / b.z, aW / b.w)

    fun mod(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x % bX, a.y % bY, a.z % bZ, a.w % bW)
    fun mod(res: Vec4i, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4i) = res.to(aX % b.x, aY % b.y, aZ % b.z, aW % b.w)

    fun and(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x and bX, a.y and bY, a.z and bZ, a.w and bW)

    fun or(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x or bX, a.y or bY, a.z or bZ, a.w or bW)

    fun xor(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x xor bX, a.y xor bY, a.z xor bZ, a.w xor bW)

    fun shl(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x shl bX, a.y shl bY, a.z shl bZ, a.w shl bW)

    fun shr(res: Vec4i, a: Vec4i, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x shr bX, a.y shr bY, a.z shr bZ, a.w shr bW)

    fun inv(res: Vec4i, a: Vec4i) = res.to(a.x.inv(), a.y.inv(), a.z.inv(), a.w.inv())


    fun add(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x + bX, a.y + bY, a.z + bZ, a.w + bW)

    fun sub(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x - bX, a.y - bY, a.z - bZ, a.w - bW)
    fun sub(res: Vec4l, aX: Long, aY: Long, aZ: Long, aW: Long, b: Vec4l) = res.to(aX - b.x, aY - b.y, aZ - b.z, aW - b.w)

    fun mul(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x * bX, a.y * bY, a.z * bZ, a.w * bW)

    fun div(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x / bX, a.y / bY, a.z / bZ, a.w / bW)
    fun div(res: Vec4l, aX: Long, aY: Long, aZ: Long, aW: Long, b: Vec4l) = res.to(aX / b.x, aY / b.y, aZ / b.z, aW / b.w)

    fun mod(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x % bX, a.y % bY, a.z % bZ, a.w % bW)
    fun mod(res: Vec4l, aX: Long, aY: Long, aZ: Long, aW: Long, b: Vec4l) = res.to(aX % b.x, aY % b.y, aZ % b.z, aW % b.w)

    fun and(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x and bX, a.y and bY, a.z and bZ, a.w and bW)

    fun or(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x or bX, a.y or bY, a.z or bZ, a.w or bW)

    fun xor(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x xor bX, a.y xor bY, a.z xor bZ, a.w xor bW)

    fun shl(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x shl bX.toInt(), a.y shl bY.toInt(), a.z shl bZ.toInt(), a.w shl bW.toInt())
    fun shl(res: Vec4l, a: Vec4l, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x shl bX, a.y shl bY, a.z shl bZ, a.w shl bW)

    fun shr(res: Vec4l, a: Vec4l, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x shr bX.toInt(), a.y shr bY.toInt(), a.z shr bZ.toInt(), a.w shr bW.toInt())
    fun shr(res: Vec4l, a: Vec4l, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x shr bX, a.y shr bY, a.z shr bZ, a.w shr bW)

    fun inv(res: Vec4l, a: Vec4l) = res.to(a.x.inv(), a.y.inv(), a.z.inv(), a.w.inv())


    fun add(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x + bX).toShort(), (a.y + bY).toShort(), (a.z + bZ).toShort(), (a.w + bW).toShort())
    fun add(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x + bX).toShort(), (a.y + bY).toShort(), (a.z + bZ).toShort(), (a.w + bW).toShort())

    fun sub(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x - bX).toShort(), (a.y - bY).toShort(), (a.z - bZ).toShort(), (a.w - bW).toShort())
    fun sub(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x - bX).toShort(), (a.y - bY).toShort(), (a.z - bZ).toShort(), (a.z - bW).toShort())

    fun sub(res: Vec4s, aX: Short, aY: Short, aZ: Short, aW: Short, b: Vec4s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort(), (aZ - b.z).toShort(), (aW - b.w).toShort())
    fun sub(res: Vec4s, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort(), (aZ - b.z).toShort(), (aW - b.w).toShort())

    fun mul(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x * bX).toShort(), (a.y * bY).toShort(), (a.z * bZ).toShort(), (a.w * bW).toShort())
    fun mul(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x * bX).toShort(), (a.y * bY).toShort(), (a.z * bZ).toShort(), (a.w * bW).toShort())

    fun div(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x / bX).toShort(), (a.y / bY).toShort(), (a.z / bZ).toShort(), (a.w / bW).toShort())
    fun div(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x / bX).toShort(), (a.y / bY).toShort(), (a.z / bZ).toShort(), (a.w / bW).toShort())

    fun div(res: Vec4s, aX: Short, aY: Short, aZ: Short, aW: Short, b: Vec4s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort(), (aZ / b.z).toShort(), (aW / b.w).toShort())
    fun div(res: Vec4s, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort(), (aZ / b.z).toShort(), (aW / b.w).toShort())

    fun mod(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x % bX).toShort(), (a.y % bY).toShort(), (a.z % bZ).toShort(), (a.w % bW).toShort())
    fun mod(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x % bX).toShort(), (a.y % bY).toShort(), (a.z % bZ).toShort(), (a.w % bW).toShort())

    fun mod(res: Vec4s, aX: Short, aY: Short, aZ: Short, aW: Short, b: Vec4s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort(), (aZ % b.z).toShort(), (aW % b.w).toShort())
    fun mod(res: Vec4s, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort(), (aZ % b.z).toShort(), (aW % b.w).toShort())

    fun and(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort(), (a.z.toInt() and bZ.toInt()).toShort(), (a.w.toInt() and bW.toInt()).toShort())
    fun and(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() and bX).toShort(), (a.y.toInt() and bY).toShort(), (a.z.toInt() and bZ).toShort(), (a.w.toInt() and bW).toShort())

    fun or(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort(), (a.z.toInt() or bZ.toInt()).toShort(), (a.w.toInt() or bW.toInt()).toShort())
    fun or(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() or bX).toShort(), (a.y.toInt() or bY).toShort(), (a.z.toInt() or bZ).toShort(), (a.w.toInt() or bW).toShort())

    fun xor(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort(), (a.z.toInt() xor bZ.toInt()).toShort(), (a.w.toInt() xor bW.toInt()).toShort())
    fun xor(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.y.toInt() xor bY).toShort(), (a.z.toInt() xor bZ).toShort(), (a.w.toInt() xor bW).toShort())

    fun shl(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort(), (a.z.toInt() shl bZ.toInt()).toShort(), (a.w.toInt() shl bW.toInt()).toShort())
    fun shl(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.y.toInt() shl bY).toShort(), (a.z.toInt() shl bZ).toShort(), (a.w.toInt() shl bW).toShort())

    fun shr(res: Vec4s, a: Vec4s, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort(), (a.z.toInt() shr bZ.toInt()).toShort(), (a.w.toInt() shr bW.toInt()).toShort())
    fun shr(res: Vec4s, a: Vec4s, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.y.toInt() shr bY).toShort(), (a.z.toInt() shr bZ).toShort(), (a.w.toInt() shr bW).toShort())

    fun inv(res: Vec4s, a: Vec4s) = res.to(a.x.toInt().inv().toShort(), a.y.toInt().inv().toShort(), a.z.toInt().inv().toShort(), a.w.toInt().inv().toShort())


    fun add(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.v + bX.v).toByte(), (a.y.v + bY.v).toByte(), (a.z.v + bZ.v).toByte(), (a.w.v + bW.v).toByte())
    fun add(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte(), (a.z.v + bZ).toByte(), (a.w.v + bW).toByte())
    fun add(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte(), (a.z.v + bZ).toByte(), (a.w.v + bW).toByte())

    fun sub(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.v - bX.v).toByte(), (a.y.v - bY.v).toByte(), (a.z.v - bZ.v).toByte(), (a.w.v - bW.v).toByte())
    fun sub(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte(), (a.z.v - bZ).toByte(), (a.w.v - bW).toByte())
    fun sub(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte(), (a.z.v - bZ).toByte(), (a.w.v - bW).toByte())

    fun sub(res: Vec4ub, aX: Ubyte, aY: Ubyte, aZ: Ubyte, aW: Ubyte, b: Vec4ub) = res.to((aX.v - b.x.v).toByte(), (aY.v - b.y.v).toByte(), (aZ.v - b.z.v).toByte(), (aW.v - b.w.v).toByte())
    fun sub(res: Vec4ub, aX: Byte, aY: Byte, aZ: Byte, aW: Byte, b: Vec4ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte(), (aZ - b.z.toInt()).toByte(), (aW - b.w.toInt()).toByte())
    fun sub(res: Vec4ub, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte(), (aZ - b.z.toInt()).toByte(), (aW - b.w.toInt()).toByte())

    fun mul(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.v * bX.v).toByte(), (a.y.v * bY.v).toByte(), (a.z.v * bZ.v).toByte(), (a.w.v * bW.v).toByte())
    fun mul(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte(), (a.z.v * bZ.toInt()).toByte(), (a.w.v * bW.toInt()).toByte())
    fun mul(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte(), (a.z.v * bZ.toInt()).toByte(), (a.w.v * bW.toInt()).toByte())

    fun div(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toByte(), Integer.divideUnsigned(a.w.toInt(), bW.toInt()).toByte())
    fun div(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toByte(), Integer.divideUnsigned(a.w.toInt(), bW.toInt()).toByte())
    fun div(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toByte(), Integer.divideUnsigned(a.w.toInt(), bW.toInt()).toByte())

    fun div(res: Vec4ub, aX: Ubyte, aY: Ubyte, aZ: Ubyte, aW: Ubyte, b: Vec4ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toByte(), Integer.divideUnsigned(aW.toInt(), b.w.toInt()).toByte())
    fun div(res: Vec4ub, aX: Byte, aY: Byte, aZ: Byte, aW: Byte, b: Vec4ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toByte(), Integer.divideUnsigned(aW.toInt(), b.w.toInt()).toByte())
    fun div(res: Vec4ub, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4ub) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toByte(), Integer.divideUnsigned(aY, b.y.toInt()).toByte(), Integer.divideUnsigned(aZ, b.z.toInt()).toByte(), Integer.divideUnsigned(aW, b.w.toInt()).toByte())

    fun mod(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toByte(), Integer.remainderUnsigned(a.w.toInt(), bW.toInt()).toByte())
    fun mod(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toByte(), Integer.remainderUnsigned(a.w.toInt(), bW.toInt()).toByte())
    fun mod(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toByte(), Integer.remainderUnsigned(a.w.toInt(), bW.toInt()).toByte())

    fun mod(res: Vec4ub, aX: Ubyte, aY: Ubyte, aZ: Ubyte, aW: Ubyte, b: Vec4ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toByte(), Integer.remainderUnsigned(aW.toInt(), b.w.toInt()).toByte())
    fun mod(res: Vec4ub, aX: Byte, aY: Byte, aZ: Byte, aW: Byte, b: Vec4ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toByte(), Integer.remainderUnsigned(aW.toInt(), b.w.toInt()).toByte())
    fun mod(res: Vec4ub, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toByte(), Integer.remainderUnsigned(aW.toInt(), b.w.toInt()).toByte())

    fun and(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte(), (a.z.toInt() and bZ.toInt()).toByte(), (a.w.toInt() and bW.toInt()).toByte())
    fun and(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.y.toInt() and bY.toInt()).toByte(), (a.z.toInt() and bZ.toInt()).toByte(), (a.w.toInt() and bW.toInt()).toByte())
    fun and(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() and bX).toByte(), (a.y.toInt() and bY).toByte(), (a.z.toInt() and bZ).toByte(), (a.w.toInt() and bW).toByte())

    fun or(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte(), (a.z.toInt() or bZ.toInt()).toByte(), (a.w.toInt() or bW.toInt()).toByte())
    fun or(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.y.toInt() or bY.toInt()).toByte(), (a.z.toInt() or bZ.toInt()).toByte(), (a.w.toInt() or bW.toInt()).toByte())
    fun or(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() or bX).toByte(), (a.y.toInt() or bY).toByte(), (a.z.toInt() or bZ).toByte(), (a.w.toInt() or bW).toByte())

    fun xor(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte(), (a.z.toInt() xor bZ.toInt()).toByte(), (a.w.toInt() xor bW.toInt()).toByte())
    fun xor(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.y.toInt() xor bY.toInt()).toByte(), (a.z.toInt() xor bZ.toInt()).toByte(), (a.w.toInt() xor bW.toInt()).toByte())
    fun xor(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.y.toInt() xor bY).toByte(), (a.z.toInt() xor bZ).toByte(), (a.w.toInt() xor bW).toByte())

    fun shl(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte(), (a.z.toInt() shl bZ.toInt()).toByte(), (a.w.toInt() shl bW.toInt()).toByte())
    fun shl(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.y.toInt() shl bY.toInt()).toByte(), (a.z.toInt() shl bZ.toInt()).toByte(), (a.w.toInt() shl bW.toInt()).toByte())
    fun shl(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.y.toInt() shl bY).toByte(), (a.z.toInt() shl bZ).toByte(), (a.w.toInt() shl bW).toByte())

    fun shr(res: Vec4ub, a: Vec4ub, bX: Ubyte, bY: Ubyte, bZ: Ubyte, bW: Ubyte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte(), (a.z.toInt() shr bZ.toInt()).toByte(), (a.w.toInt() shr bW.toInt()).toByte())
    fun shr(res: Vec4ub, a: Vec4ub, bX: Byte, bY: Byte, bZ: Byte, bW: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.y.toInt() shr bY.toInt()).toByte(), (a.z.toInt() shr bZ.toInt()).toByte(), (a.w.toInt() shr bW.toInt()).toByte())
    fun shr(res: Vec4ub, a: Vec4ub, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.y.toInt() shr bY).toByte(), (a.z.toInt() shr bZ).toByte(), (a.w.toInt() shr bW).toByte())

    fun inv(res: Vec4ub, a: Vec4ub) = res.to(a.x.toInt().inv().toByte(), a.y.toInt().inv().toByte(), a.z.toInt().inv().toByte(), a.w.toInt().inv().toByte())


    fun add(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v + bX.v, a.y.v + bY.v, a.z.v + bZ.v, a.w.v + bW.v)
    fun add(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v + bX, a.y.v + bY, a.z.v + bZ, a.w.v + bW)

    fun sub(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v - bX.v, a.y.v - bY.v, a.z.v - bZ.v, a.w.v - bW.v)
    fun sub(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v - bX, a.y.v - bY, a.z.v - bZ, a.w.v - bW)

    fun sub(res: Vec4ui, aX: Uint, aY: Uint, aZ: Uint, aW: Uint, b: Vec4ui) = res.to(aX.v - b.x.v, aY.v - b.y.v, aZ.v - b.z.v, aW.v - b.w.v)
    fun sub(res: Vec4ui, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4ui) = res.to(aX - b.x.v, aY - b.y.v, aZ - b.z.v, aW - b.w.v)

    fun mul(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v * bX.v, a.y.v * bY.v, a.z.v * bZ.v, a.w.v * bW.v)
    fun mul(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v * bX, a.y.v * bY, a.z.v * bZ, a.w.v * bW)

    fun div(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(Integer.divideUnsigned(a.x.v, bX.v), Integer.divideUnsigned(a.y.v, bY.v), Integer.divideUnsigned(a.z.v, bZ.v), Integer.divideUnsigned(a.w.v, bW.v))
    fun div(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(Integer.divideUnsigned(a.x.v, bX), Integer.divideUnsigned(a.y.v, bY), Integer.divideUnsigned(a.z.v, bZ), Integer.divideUnsigned(a.w.v, bW))

    fun div(res: Vec4ui, aX: Uint, aY: Uint, aZ: Uint, aW: Uint, b: Vec4ui) = res.to(Integer.divideUnsigned(aX.v, b.x.v), Integer.divideUnsigned(aY.v, b.y.v), Integer.divideUnsigned(aZ.v, b.z.v), Integer.divideUnsigned(aW.v, b.w.v))
    fun div(res: Vec4ui, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4ui) = res.to(Integer.divideUnsigned(aX, b.x.v), Integer.divideUnsigned(aY, b.y.v), Integer.divideUnsigned(aZ, b.z.v), Integer.divideUnsigned(aW, b.w.v))

    fun mod(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(Integer.remainderUnsigned(a.x.v, bX.v), Integer.remainderUnsigned(a.y.v, bY.v), Integer.remainderUnsigned(a.z.v, bZ.v), Integer.remainderUnsigned(a.w.v, bW.v))
    fun mod(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(Integer.remainderUnsigned(a.x.v, bX), Integer.remainderUnsigned(a.y.v, bY), Integer.remainderUnsigned(a.z.v, bZ), Integer.remainderUnsigned(a.w.v, bW))

    fun mod(res: Vec4ui, aX: Uint, aY: Uint, aZ: Uint, aW: Uint, b: Vec4ui) = res.to(Integer.remainderUnsigned(aX.v, b.x.v), Integer.remainderUnsigned(aY.v, b.y.v), Integer.remainderUnsigned(aZ.v, b.z.v), Integer.remainderUnsigned(aW.v, b.w.v))
    fun mod(res: Vec4ui, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4ui) = res.to(Integer.remainderUnsigned(aX, b.x.v), Integer.remainderUnsigned(aY, b.y.v), Integer.remainderUnsigned(aZ, b.z.v), Integer.remainderUnsigned(aW, b.w.v))

    fun and(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v and bX.v, a.y.v and bY.v, a.z.v and bZ.v, a.w.v and bW.v)
    fun and(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v and bX, a.y.v and bY, a.z.v and bZ, a.w.v and bW)

    fun or(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v or bX.v, a.y.v or bY.v, a.z.v or bZ.v, a.w.v or bW.v)
    fun or(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v or bX, a.y.v or bY, a.z.v or bZ, a.w.v or bW)

    fun xor(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v xor bX.v, a.y.v xor bY.v, a.z.v xor bZ.v, a.w.v xor bW.v)
    fun xor(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v xor bX, a.y.v xor bY, a.z.v xor bZ, a.w.v xor bW)

    fun shl(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v shl bX.v, a.y.v shl bY.v, a.z.v shl bZ.v, a.w.v shl bW.v)
    fun shl(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v shl bX, a.y.v shl bY, a.z.v shl bZ, a.w.v shl bW)

    fun shr(res: Vec4ui, a: Vec4ui, bX: Uint, bY: Uint, bZ: Uint, bW: Uint) = res.to(a.x.v shr bX.v, a.y.v shr bY.v, a.z.v shr bZ.v, a.w.v shr bW.v)
    fun shr(res: Vec4ui, a: Vec4ui, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v shr bX, a.y.v shr bY, a.z.v shr bZ, a.w.v shr bW)

    fun inv(res: Vec4ui, a: Vec4ui) = res.to(a.x.v.inv(), a.y.v.inv(), a.z.v.inv(), a.w.v.inv())


    fun add(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(a.x.v + bX.v, a.y.v + bY.v, a.z.v + bZ.v, a.w.v + bW.v)
    fun add(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x.v + bX, a.y.v + bY, a.z.v + bZ, a.w.v + bW)

    fun sub(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(a.x.v - bX.v, a.y.v - bY.v, a.z.v - bZ.v, a.w.v - bW.v)
    fun sub(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x.v - bX, a.y.v - bY, a.z.v - bZ, a.w.v - bW)

    fun sub(res: Vec4ul, aX: Ulong, aY: Ulong, aZ: Ulong, aW: Ulong, b: Vec4ul) = res.to(aX.v - b.x.v, aY.v - b.y.v, aZ.v - b.z.v, aW.v - b.w.v)
    fun sub(res: Vec4ul, aX: Long, aY: Long, aZ: Long, aW: Long, b: Vec4ul) = res.to(aX - b.x.v, aY - b.y.v, aZ - b.z.v, aW - b.w.v)

    fun mul(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(a.x.v * bX.v, a.y.v * bY.v, a.z.v * bZ.v, a.w.v * bW.v)
    fun mul(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x.v * bX, a.y.v * bY, a.z.v * bZ, a.w.v * bW)

    fun div(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX.v), java.lang.Long.divideUnsigned(a.y.v, bY.v), java.lang.Long.divideUnsigned(a.z.v, bZ.v), java.lang.Long.divideUnsigned(a.w.v, bW.v))
    fun div(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX), java.lang.Long.divideUnsigned(a.y.v, bY), java.lang.Long.divideUnsigned(a.z.v, bZ), java.lang.Long.divideUnsigned(a.w.v, bW))

    fun div(res: Vec4ul, aX: Ulong, aY: Ulong, aZ: Ulong, aW: Ulong, b: Vec4ul) = res.to(java.lang.Long.divideUnsigned(aX.v, b.x.v), java.lang.Long.divideUnsigned(aY.v, b.y.v), java.lang.Long.divideUnsigned(aZ.v, b.z.v), java.lang.Long.divideUnsigned(aW.v, b.w.v))
    fun div(res: Vec4ul, aX: Long, aY: Long, aZ: Long, aW: Long, b: Vec4ul) = res.to(java.lang.Long.divideUnsigned(aX, b.x.v), java.lang.Long.divideUnsigned(aY, b.y.v), java.lang.Long.divideUnsigned(aZ, b.z.v), java.lang.Long.divideUnsigned(aW, b.w.v))

    fun mod(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX.v), java.lang.Long.remainderUnsigned(a.y.v, bY.v), java.lang.Long.remainderUnsigned(a.z.v, bZ.v), java.lang.Long.remainderUnsigned(a.w.v, bW.v))
    fun mod(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX), java.lang.Long.remainderUnsigned(a.y.v, bY), java.lang.Long.remainderUnsigned(a.z.v, bZ), java.lang.Long.remainderUnsigned(a.w.v, bW))

    fun mod(res: Vec4ul, aX: Ulong, aY: Ulong, aZ: Ulong, aW: Ulong, b: Vec4ul) = res.to(java.lang.Long.remainderUnsigned(aX.v, b.x.v), java.lang.Long.remainderUnsigned(aY.v, b.y.v), java.lang.Long.remainderUnsigned(aZ.v, b.z.v), java.lang.Long.remainderUnsigned(aW.v, b.w.v))
    fun mod(res: Vec4ul, aX: Long, aY: Long, aZ: Long, aW: Long, b: Vec4ul) = res.to(java.lang.Long.remainderUnsigned(aX, b.x.v), java.lang.Long.remainderUnsigned(aY, b.y.v), java.lang.Long.remainderUnsigned(aZ, b.z.v), java.lang.Long.remainderUnsigned(aW, b.w.v))

    fun and(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(a.x.v and bX.v, a.y.v and bY.v, a.z.v and bZ.v, a.w.v and bW.v)
    fun and(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x.v and bX, a.y.v and bY, a.z.v and bZ, a.w.v and bW)

    fun or(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(a.x.v or bX.v, a.y.v or bY.v, a.z.v or bZ.v, a.w.v or bW.v)
    fun or(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x.v or bX, a.y.v or bY, a.z.v or bZ, a.w.v or bW)

    fun xor(res: Vec4ul, a: Vec4ul, bX: Ulong, bY: Ulong, bZ: Ulong, bW: Ulong) = res.to(a.x.v xor bX.v, a.y.v xor bY.v, a.z.v xor bZ.v, a.w.v xor bW.v)
    fun xor(res: Vec4ul, a: Vec4ul, bX: Long, bY: Long, bZ: Long, bW: Long) = res.to(a.x.v xor bX, a.y.v xor bY, a.z.v xor bZ, a.w.v xor bW)

    fun shl(res: Vec4ul, a: Vec4ul, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v shl bX, a.y.v shl bY, a.z.v shl bZ, a.w.v shl bW)

    fun shr(res: Vec4ul, a: Vec4ul, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(a.x.v shr bX, a.y.v shr bY, a.z.v shr bZ, a.w.v shr bW)

    fun inv(res: Vec4ul, a: Vec4ul) = res.to(a.x.v.inv(), a.y.v.inv(), a.z.v.inv(), a.w.v.inv())


    fun add(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.v + bX.v).toShort(), (a.y.v + bY.v).toShort(), (a.z.v + bZ.v).toShort(), (a.w.v + bW.v).toShort())
    fun add(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort(), (a.z.v + bZ).toShort(), (a.w.v + bW).toShort())
    fun add(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort(), (a.z.v + bZ).toShort(), (a.w.v + bW).toShort())

    fun sub(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.v - bX.v).toShort(), (a.y.v - bY.v).toShort(), (a.z.v - bZ.v).toShort(), (a.w.v - bW.v).toShort())
    fun sub(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort(), (a.z.v - bZ).toShort(), (a.w.v - bW).toShort())
    fun sub(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort(), (a.z.v - bZ).toShort(), (a.w.v - bW).toShort())

    fun sub(res: Vec4us, aX: Ushort, aY: Ushort, aZ: Ushort, aW: Ushort, b: Vec4us) = res.to((aX.v - b.x.v).toShort(), (aY.v - b.y.v).toShort(), (aZ.v - b.z.v).toShort(), (aW.v - b.w.v).toShort())
    fun sub(res: Vec4us, aX: Short, aY: Short, aZ: Short, aW: Short, b: Vec4us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort(), (aZ - b.z.v).toShort(), (aW - b.w.v).toShort())
    fun sub(res: Vec4us, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort(), (aZ - b.z.v).toShort(), (aW - b.w.v).toShort())

    fun mul(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.v * bX.v).toShort(), (a.y.v * bY.v).toShort(), (a.z.v * bZ.v).toShort(), (a.w.v * bW.v).toShort())
    fun mul(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort(), (a.z.v * bZ).toShort(), (a.w.v * bW).toShort())
    fun mul(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort(), (a.z.v * bZ).toShort(), (a.w.v * bW).toShort())

    fun div(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toShort(), Integer.divideUnsigned(a.w.toInt(), bW.toInt()).toShort())
    fun div(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toShort(), Integer.divideUnsigned(a.w.toInt(), bW.toInt()).toShort())
    fun div(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.divideUnsigned(a.z.toInt(), bZ.toInt()).toShort(), Integer.divideUnsigned(a.w.toInt(), bW.toInt()).toShort())

    fun div(res: Vec4us, aX: Ushort, aY: Ushort, aZ: Ushort, aW: Ushort, b: Vec4us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toShort(), Integer.divideUnsigned(aW.toInt(), b.w.toInt()).toShort())
    fun div(res: Vec4us, aX: Short, aY: Short, aZ: Short, aW: Short, b: Vec4us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.divideUnsigned(aZ.toInt(), b.z.toInt()).toShort(), Integer.divideUnsigned(aW.toInt(), b.w.toInt()).toShort())
    fun div(res: Vec4us, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4us) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toShort(), Integer.divideUnsigned(aY, b.y.toInt()).toShort(), Integer.divideUnsigned(aZ, b.z.toInt()).toShort(), Integer.divideUnsigned(aW, b.w.toInt()).toShort())

    fun mod(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toShort(), Integer.remainderUnsigned(a.w.toInt(), bW.toInt()).toShort())
    fun mod(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toShort(), Integer.remainderUnsigned(a.w.toInt(), bW.toInt()).toShort())
    fun mod(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort(), Integer.remainderUnsigned(a.z.toInt(), bZ.toInt()).toShort(), Integer.remainderUnsigned(a.w.toInt(), bW.toInt()).toShort())

    fun mod(res: Vec4us, aX: Ushort, aY: Ushort, aZ: Ushort, aW: Ushort, b: Vec4us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toShort(), Integer.remainderUnsigned(aW.toInt(), b.w.toInt()).toShort())
    fun mod(res: Vec4us, aX: Short, aY: Short, aZ: Short, aW: Short, b: Vec4us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toShort(), Integer.remainderUnsigned(aW.toInt(), b.w.toInt()).toShort())
    fun mod(res: Vec4us, aX: Int, aY: Int, aZ: Int, aW: Int, b: Vec4us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort(), Integer.remainderUnsigned(aZ.toInt(), b.z.toInt()).toShort(), Integer.remainderUnsigned(aW.toInt(), b.w.toInt()).toShort())

    fun and(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort(), (a.z.toInt() and bZ.toInt()).toShort(), (a.w.toInt() and bW.toInt()).toShort())
    fun and(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.y.toInt() and bY.toInt()).toShort(), (a.z.toInt() and bZ.toInt()).toShort(), (a.w.toInt() and bW.toInt()).toShort())
    fun and(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() and bX).toShort(), (a.y.toInt() and bY).toShort(), (a.z.toInt() and bZ).toShort(), (a.w.toInt() and bW).toShort())

    fun or(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort(), (a.z.toInt() or bZ.toInt()).toShort(), (a.w.toInt() or bW.toInt()).toShort())
    fun or(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.y.toInt() or bY.toInt()).toShort(), (a.z.toInt() or bZ.toInt()).toShort(), (a.w.toInt() or bW.toInt()).toShort())
    fun or(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() or bX).toShort(), (a.y.toInt() or bY).toShort(), (a.z.toInt() or bZ).toShort(), (a.w.toInt() or bW).toShort())

    fun xor(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort(), (a.z.toInt() xor bZ.toInt()).toShort(), (a.w.toInt() xor bW.toInt()).toShort())
    fun xor(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.y.toInt() xor bY.toInt()).toShort(), (a.z.toInt() xor bZ.toInt()).toShort(), (a.w.toInt() xor bW.toInt()).toShort())
    fun xor(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.y.toInt() xor bY).toShort(), (a.z.toInt() xor bZ).toShort(), (a.w.toInt() xor bW).toShort())

    fun shl(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort(), (a.z.toInt() shl bZ.toInt()).toShort(), (a.w.toInt() shl bW.toInt()).toShort())
    fun shl(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.y.toInt() shl bY.toInt()).toShort(), (a.z.toInt() shl bZ.toInt()).toShort(), (a.w.toInt() shl bW.toInt()).toShort())
    fun shl(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.y.toInt() shl bY).toShort(), (a.z.toInt() shl bZ).toShort(), (a.w.toInt() shl bW).toShort())

    fun shr(res: Vec4us, a: Vec4us, bX: Ushort, bY: Ushort, bZ: Ushort, bW: Ushort) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort(), (a.z.toInt() shr bZ.toInt()).toShort(), (a.w.toInt() shr bW.toInt()).toShort())
    fun shr(res: Vec4us, a: Vec4us, bX: Short, bY: Short, bZ: Short, bW: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.y.toInt() shr bY.toInt()).toShort(), (a.z.toInt() shr bZ.toInt()).toShort(), (a.w.toInt() shr bW.toInt()).toShort())
    fun shr(res: Vec4us, a: Vec4us, bX: Int, bY: Int, bZ: Int, bW: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.y.toInt() shr bY).toShort(), (a.z.toInt() shr bZ).toShort(), (a.w.toInt() shr bW).toShort())

    fun inv(res: Vec4us, a: Vec4us) = res.to(a.x.toInt().inv().toShort(), a.y.toInt().inv().toShort(), a.z.toInt().inv().toShort(), a.z.toInt().inv().toShort())
}

interface gli {

//    fun <T : Number> T.ceilMultiple(a: T, b: T) = a + if (a > 0) -(a % b) else (-a) % b
//    fun <T : Number> ceilMultiple(a: T, b: T): T = a + if (a > 0) -(a % b) else (-a) % b
    fun ceilMultiple(a: Int, b: Int) = a + if (a > 0) -(a % b) else (-a) % b
}