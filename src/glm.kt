import vec._2.*
import vec._3.Vec3

/**
 * Created bY GBarbieri on 06.10.2016.
 */

abstract class glm {

    companion object : ubyte_operators, uint_operators, ulong_operators, ushort_operators,
            vec2_operators, vec3_operators
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

    fun and(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toByte(), (a.x.toInt() and bY).toByte())

    fun or(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toByte(), (a.x.toInt() or bY).toByte())

    fun xor(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.x.toInt() xor bY).toByte())

    fun shl(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.x.toInt() shl bY).toByte())

    fun shr(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.x.toInt() shr bY).toByte())

    fun inv(res: Vec2b, a: Vec2b) = res.to(a.x.toInt().inv().toByte(), a.x.toInt().inv().toByte())


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

    fun and(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x and bX, a.x and bY)

    fun or(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x or bX, a.x or bY)

    fun xor(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x xor bX, a.x xor bY)

    fun shl(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x shl bX, a.x shl bY)

    fun shr(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.to(a.x shr bX, a.x shr bY)

    fun inv(res: Vec2i, a: Vec2i) = res.to(a.x.inv(), a.y.inv())


    fun add(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x + bX, a.y + bY)

    fun sub(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x - bX, a.y - bY)
    fun sub(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.to(aX - b.x, aY - b.y)

    fun mul(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x * bX, a.y * bY)

    fun div(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x / bX, a.y / bY)
    fun div(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.to(aX / b.x, aY / b.y)

    fun mod(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x % bX, a.y % bY)

    fun mod(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.to(aX % b.x, aY % b.y)

    fun and(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x and bX, a.x and bY)

    fun or(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x or bX, a.x or bY)

    fun xor(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x xor bX, a.x xor bY)

    fun shl(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x shl bX.toInt(), a.x shl bY.toInt())
    fun shl(res: Vec2l, a: Vec2l, bX: Int, bY: Int) = res.to(a.x shl bX, a.x shl bY)

    fun shr(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.to(a.x shr bX.toInt(), a.x shr bY.toInt())
    fun shr(res: Vec2l, a: Vec2l, bX: Int, bY: Int) = res.to(a.x shr bX, a.x shr bY)

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

    fun and(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toShort(), (a.x.toInt() and bY).toShort())

    fun or(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toShort(), (a.x.toInt() or bY).toShort())

    fun xor(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.x.toInt() xor bY).toShort())

    fun shl(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.x.toInt() shl bY).toShort())

    fun shr(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.x.toInt() shr bY).toShort())

    fun inv(res: Vec2s, a: Vec2s) = res.to(a.x.toInt().inv().toShort(), a.x.toInt().inv().toShort())


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

    fun and(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toByte(), (a.x.toInt() and bY).toByte())

    fun or(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toByte(), (a.x.toInt() or bY).toByte())

    fun xor(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.x.toInt() xor bY).toByte())

    fun shl(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.x.toInt() shl bY).toByte())

    fun shr(res: Vec2ub, a: Vec2ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2ub, a: Vec2ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2ub, a: Vec2ub, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.x.toInt() shr bY).toByte())

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

    fun and(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v and bX.v, a.x.v and bY.v)
    fun and(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v and bX, a.x.v and bY)

    fun or(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v or bX.v, a.x.v or bY.v)
    fun or(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v or bX, a.x.v or bY)

    fun xor(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v xor bX.v, a.x.v xor bY.v)
    fun xor(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v xor bX, a.x.v xor bY)

    fun shl(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v shl bX.v, a.x.v shl bY.v)
    fun shl(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v shl bX, a.x.v shl bY)

    fun shr(res: Vec2ui, a: Vec2ui, bX: Uint, bY: Uint) = res.to(a.x.v shr bX.v, a.x.v shr bY.v)
    fun shr(res: Vec2ui, a: Vec2ui, bX: Int, bY: Int) = res.to(a.x.v shr bX, a.x.v shr bY)

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

    fun and(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v and bX.v, a.x.v and bY.v)
    fun and(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v and bX, a.x.v and bY)

    fun or(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v or bX.v, a.x.v or bY.v)
    fun or(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v or bX, a.x.v or bY)

    fun xor(res: Vec2ul, a: Vec2ul, bX: Ulong, bY: Ulong) = res.to(a.x.v xor bX.v, a.x.v xor bY.v)
    fun xor(res: Vec2ul, a: Vec2ul, bX: Long, bY: Long) = res.to(a.x.v xor bX, a.x.v xor bY)

    fun shl(res: Vec2ul, a: Vec2ul, bX: Int, bY: Int) = res.to(a.x.v shl bX, a.x.v shl bY)

    fun shr(res: Vec2ul, a: Vec2ul, bX: Int, bY: Int) = res.to(a.x.v shr bX, a.x.v shr bY)

    fun inv(res: Vec2ul, a: Vec2ul) = res.to(a.x.v.inv(), a.x.v.inv())


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

    fun and(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toShort(), (a.x.toInt() and bY).toShort())

    fun or(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toShort(), (a.x.toInt() or bY).toShort())

    fun xor(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.x.toInt() xor bY).toShort())

    fun shl(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.x.toInt() shl bY).toShort())

    fun shr(res: Vec2us, a: Vec2us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2us, a: Vec2us, bX: Short, bY: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2us, a: Vec2us, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.x.toInt() shr bY).toShort())

    fun inv(res: Vec2us, a: Vec2us) = res.to(a.x.toInt().inv().toShort(), a.x.toInt().inv().toShort())
}

interface vec3_operators {

    fun add(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x + bX, a.y + bY)

    fun sub(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x - bX, a.y - bY)
    fun sub(res: Vec3, aX: Float, aY: Float, bZ: Float, b: Vec3) = res.to(aX - b.x, aY - b.y)

    fun mul(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x * bX, a.y * bY)

    fun div(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x / bX, a.y / bY)
    fun div(res: Vec3, aX: Float, aY: Float, bZ: Float, b: Vec3) = res.to(aX / b.x, aY / b.y)

    fun mod(res: Vec3, a: Vec3, bX: Float, bY: Float, bZ: Float) = res.to(a.x % bX, a.y % bY)
    fun mod(res: Vec3, aX: Float, aY: Float, bZ: Float, b: Vec3) = res.to(aX % b.x, aY % b.y)


//    fun add(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x + bX).toByte(), (a.y + bY).toByte())
//    fun add(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x + bX).toByte(), (a.y + bY).toByte())
//
//    fun sub(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x - bX).toByte(), (a.y - bY).toByte())
//    fun sub(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x - bX).toByte(), (a.y - bY).toByte())
//
//    fun sub(res: Vec3b, aX: Byte, aY: Byte, b: Vec3b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte())
//    fun sub(res: Vec3b, aX: Int, aY: Int, b: Vec3b) = res.to((aX - b.x).toByte(), (aY - b.y).toByte())
//
//    fun mul(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x * bX).toByte(), (a.y * bY).toByte())
//    fun mul(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x * bX).toByte(), (a.y * bY).toByte())
//
//    fun div(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x / bX).toByte(), (a.y / bY).toByte())
//    fun div(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x / bX).toByte(), (a.y / bY).toByte())
//
//    fun div(res: Vec3b, aX: Byte, aY: Byte, b: Vec3b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte())
//    fun div(res: Vec3b, aX: Int, aY: Int, b: Vec3b) = res.to((aX / b.x).toByte(), (aY / b.y).toByte())
//
//    fun mod(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x % bX).toByte(), (a.y % bY).toByte())
//    fun mod(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x % bX).toByte(), (a.y % bY).toByte())
//
//    fun mod(res: Vec3b, aX: Byte, aY: Byte, b: Vec3b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte())
//    fun mod(res: Vec3b, aX: Int, aY: Int, b: Vec3b) = res.to((aX % b.x).toByte(), (aY % b.y).toByte())
//
//    fun and(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
//    fun and(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toByte(), (a.x.toInt() and bY).toByte())
//
//    fun or(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
//    fun or(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toByte(), (a.x.toInt() or bY).toByte())
//
//    fun xor(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
//    fun xor(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.x.toInt() xor bY).toByte())
//
//    fun shl(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
//    fun shl(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.x.toInt() shl bY).toByte())
//
//    fun shr(res: Vec3b, a: Vec3b, bX: Byte, bY: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
//    fun shr(res: Vec3b, a: Vec3b, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.x.toInt() shr bY).toByte())
//
//    fun inv(res: Vec3b, a: Vec3b) = res.to(a.x.toInt().inv().toByte(), a.x.toInt().inv().toByte())
//
//
//    fun add(res: Vec3d, a: Vec3d, bX: Double, bY: Double) = res.to(a.x + bX, a.y + bY)
//
//    fun sub(res: Vec3d, a: Vec3d, bX: Double, bY: Double) = res.to(a.x - bX, a.y - bY)
//    fun sub(res: Vec3d, aX: Double, aY: Double, b: Vec3d) = res.to(aX - b.x, aY - b.y)
//
//    fun mul(res: Vec3d, a: Vec3d, bX: Double, bY: Double) = res.to(a.x * bX, a.y * bY)
//
//    fun div(res: Vec3d, a: Vec3d, bX: Double, bY: Double) = res.to(a.x / bX, a.y / bY)
//    fun div(res: Vec3d, aX: Double, aY: Double, b: Vec3d) = res.to(aX / b.x, aY / b.y)
//
//    fun mod(res: Vec3d, a: Vec3d, bX: Double, bY: Double) = res.to(a.x % bX, a.y % bY)
//
//    fun mod(res: Vec3d, aX: Double, aY: Double, b: Vec3d) = res.to(aX % b.x, aY % b.y)
//
//
//    fun add(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x + bX, a.y + bY)
//
//    fun sub(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x - bX, a.y - bY)
//    fun sub(res: Vec3i, aX: Int, aY: Int, b: Vec3i) = res.to(aX - b.x, aY - b.y)
//
//    fun mul(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x * bX, a.y * bY)
//
//    fun div(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x / bX, a.y / bY)
//    fun div(res: Vec3i, aX: Int, aY: Int, b: Vec3i) = res.to(aX / b.x, aY / b.y)
//
//    fun mod(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x % bX, a.y % bY)
//
//    fun mod(res: Vec3i, aX: Int, aY: Int, b: Vec3i) = res.to(aX % b.x, aY % b.y)
//
//    fun and(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x and bX, a.x and bY)
//
//    fun or(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x or bX, a.x or bY)
//
//    fun xor(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x xor bX, a.x xor bY)
//
//    fun shl(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x shl bX, a.x shl bY)
//
//    fun shr(res: Vec3i, a: Vec3i, bX: Int, bY: Int) = res.to(a.x shr bX, a.x shr bY)
//
//    fun inv(res: Vec3i, a: Vec3i) = res.to(a.x.inv(), a.y.inv())
//
//
//    fun add(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x + bX, a.y + bY)
//
//    fun sub(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x - bX, a.y - bY)
//    fun sub(res: Vec3l, aX: Long, aY: Long, b: Vec3l) = res.to(aX - b.x, aY - b.y)
//
//    fun mul(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x * bX, a.y * bY)
//
//    fun div(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x / bX, a.y / bY)
//    fun div(res: Vec3l, aX: Long, aY: Long, b: Vec3l) = res.to(aX / b.x, aY / b.y)
//
//    fun mod(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x % bX, a.y % bY)
//
//    fun mod(res: Vec3l, aX: Long, aY: Long, b: Vec3l) = res.to(aX % b.x, aY % b.y)
//
//    fun and(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x and bX, a.x and bY)
//
//    fun or(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x or bX, a.x or bY)
//
//    fun xor(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x xor bX, a.x xor bY)
//
//    fun shl(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x shl bX.toInt(), a.x shl bY.toInt())
//    fun shl(res: Vec3l, a: Vec3l, bX: Int, bY: Int) = res.to(a.x shl bX, a.x shl bY)
//
//    fun shr(res: Vec3l, a: Vec3l, bX: Long, bY: Long) = res.to(a.x shr bX.toInt(), a.x shr bY.toInt())
//    fun shr(res: Vec3l, a: Vec3l, bX: Int, bY: Int) = res.to(a.x shr bX, a.x shr bY)
//
//    fun inv(res: Vec3l, a: Vec3l) = res.to(a.x.inv(), a.y.inv())
//
//
//    fun add(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x + bX).toShort(), (a.y + bY).toShort())
//    fun add(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x + bX).toShort(), (a.y + bY).toShort())
//
//    fun sub(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x - bX).toShort(), (a.y - bY).toShort())
//    fun sub(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x - bX).toShort(), (a.y - bY).toShort())
//
//    fun sub(res: Vec3s, aX: Short, aY: Short, b: Vec3s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort())
//    fun sub(res: Vec3s, aX: Int, aY: Int, b: Vec3s) = res.to((aX - b.x).toShort(), (aY - b.y).toShort())
//
//    fun mul(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x * bX).toShort(), (a.y * bY).toShort())
//    fun mul(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x * bX).toShort(), (a.y * bY).toShort())
//
//    fun div(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x / bX).toShort(), (a.y / bY).toShort())
//    fun div(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x / bX).toShort(), (a.y / bY).toShort())
//
//    fun div(res: Vec3s, aX: Short, aY: Short, b: Vec3s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort())
//    fun div(res: Vec3s, aX: Int, aY: Int, b: Vec3s) = res.to((aX / b.x).toShort(), (aY / b.y).toShort())
//
//    fun mod(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x % bX).toShort(), (a.y % bY).toShort())
//    fun mod(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x % bX).toShort(), (a.y % bY).toShort())
//
//    fun mod(res: Vec3s, aX: Short, aY: Short, b: Vec3s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort())
//    fun mod(res: Vec3s, aX: Int, aY: Int, b: Vec3s) = res.to((aX % b.x).toShort(), (aY % b.y).toShort())
//
//    fun and(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
//    fun and(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toShort(), (a.x.toInt() and bY).toShort())
//
//    fun or(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
//    fun or(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toShort(), (a.x.toInt() or bY).toShort())
//
//    fun xor(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
//    fun xor(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.x.toInt() xor bY).toShort())
//
//    fun shl(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
//    fun shl(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.x.toInt() shl bY).toShort())
//
//    fun shr(res: Vec3s, a: Vec3s, bX: Short, bY: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
//    fun shr(res: Vec3s, a: Vec3s, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.x.toInt() shr bY).toShort())
//
//    fun inv(res: Vec3s, a: Vec3s) = res.to(a.x.toInt().inv().toShort(), a.x.toInt().inv().toShort())
//
//
//    fun add(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.v + bX.v).toByte(), (a.y.v + bY.v).toByte())
//    fun add(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte())
//    fun add(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.v + bX).toByte(), (a.y.v + bY).toByte())
//
//    fun sub(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.v - bX.v).toByte(), (a.y.v - bY.v).toByte())
//    fun sub(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte())
//    fun sub(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.v - bX).toByte(), (a.y.v - bY).toByte())
//
//    fun sub(res: Vec3ub, aX: Ubyte, aY: Ubyte, b: Vec3ub) = res.to((aX.v - b.x.v).toByte(), (aY.v - b.y.v).toByte())
//    fun sub(res: Vec3ub, aX: Byte, aY: Byte, b: Vec3ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte())
//    fun sub(res: Vec3ub, aX: Int, aY: Int, b: Vec3ub) = res.to((aX - b.x.v).toByte(), (aY - b.y.v).toByte())
//
//    fun mul(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.v * bX.v).toByte(), (a.y.v * bY.v).toByte())
//    fun mul(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte())
//    fun mul(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.v * bX).toByte(), (a.y.v * bY).toByte())
//
//    fun div(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte())
//    fun div(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte())
//    fun div(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toByte())
//
//    fun div(res: Vec3ub, aX: Ubyte, aY: Ubyte, b: Vec3ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte())
//    fun div(res: Vec3ub, aX: Byte, aY: Byte, b: Vec3ub) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toByte())
//    fun div(res: Vec3ub, aX: Int, aY: Int, b: Vec3ub) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toByte(), Integer.divideUnsigned(aY, b.y.toInt()).toByte())
//
//    fun mod(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte())
//    fun mod(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte())
//    fun mod(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toByte(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toByte())
//
//    fun mod(res: Vec3ub, aX: Ubyte, aY: Ubyte, b: Vec3ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte())
//    fun mod(res: Vec3ub, aX: Byte, aY: Byte, b: Vec3ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte())
//    fun mod(res: Vec3ub, aX: Int, aY: Int, b: Vec3ub) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toByte(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toByte())
//
//    fun and(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
//    fun and(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
//    fun and(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toByte(), (a.x.toInt() and bY).toByte())
//
//    fun or(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
//    fun or(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
//    fun or(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toByte(), (a.x.toInt() or bY).toByte())
//
//    fun xor(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
//    fun xor(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
//    fun xor(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toByte(), (a.x.toInt() xor bY).toByte())
//
//    fun shl(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
//    fun shl(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
//    fun shl(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toByte(), (a.x.toInt() shl bY).toByte())
//
//    fun shr(res: Vec3ub, a: Vec3ub, bX: Ubyte, bY: Ubyte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
//    fun shr(res: Vec3ub, a: Vec3ub, bX: Byte, bY: Byte) = res.to((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
//    fun shr(res: Vec3ub, a: Vec3ub, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toByte(), (a.x.toInt() shr bY).toByte())
//
//    fun inv(res: Vec3ub, a: Vec3ub) = res.to(a.x.toInt().inv().toByte(), a.x.toInt().inv().toByte())
//
//
//    fun add(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v + bX.v, a.y.v + bY.v)
//    fun add(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v + bX, a.y.v + bY)
//
//    fun sub(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v - bX.v, a.y.v - bY.v)
//    fun sub(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v - bX, a.y.v - bY)
//
//    fun sub(res: Vec3ui, aX: Uint, aY: Uint, b: Vec3ui) = res.to(aX.v - b.x.v, aY.v - b.y.v)
//    fun sub(res: Vec3ui, aX: Int, aY: Int, b: Vec3ui) = res.to(aX - b.x.v, aY - b.y.v)
//
//    fun mul(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v * bX.v, a.y.v * bY.v)
//    fun mul(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v * bX, a.y.v * bY)
//
//    fun div(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(Integer.divideUnsigned(a.x.v, bX.v), Integer.divideUnsigned(a.y.v, bY.v))
//    fun div(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(Integer.divideUnsigned(a.x.v, bX), Integer.divideUnsigned(a.y.v, bY))
//
//    fun div(res: Vec3ui, aX: Uint, aY: Uint, b: Vec3ui) = res.to(Integer.divideUnsigned(aX.v, b.x.v), Integer.divideUnsigned(aY.v, b.y.v))
//    fun div(res: Vec3ui, aX: Int, aY: Int, b: Vec3ui) = res.to(Integer.divideUnsigned(aX, b.x.v), Integer.divideUnsigned(aY, b.y.v))
//
//    fun mod(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(Integer.remainderUnsigned(a.x.v, bX.v), Integer.remainderUnsigned(a.y.v, bY.v))
//    fun mod(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(Integer.remainderUnsigned(a.x.v, bX), Integer.remainderUnsigned(a.y.v, bY))
//
//    fun mod(res: Vec3ui, aX: Uint, aY: Uint, b: Vec3ui) = res.to(Integer.remainderUnsigned(aX.v, b.x.v), Integer.remainderUnsigned(aY.v, b.y.v))
//    fun mod(res: Vec3ui, aX: Int, aY: Int, b: Vec3ui) = res.to(Integer.remainderUnsigned(aX, b.x.v), Integer.remainderUnsigned(aY, b.y.v))
//
//    fun and(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v and bX.v, a.x.v and bY.v)
//    fun and(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v and bX, a.x.v and bY)
//
//    fun or(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v or bX.v, a.x.v or bY.v)
//    fun or(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v or bX, a.x.v or bY)
//
//    fun xor(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v xor bX.v, a.x.v xor bY.v)
//    fun xor(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v xor bX, a.x.v xor bY)
//
//    fun shl(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v shl bX.v, a.x.v shl bY.v)
//    fun shl(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v shl bX, a.x.v shl bY)
//
//    fun shr(res: Vec3ui, a: Vec3ui, bX: Uint, bY: Uint) = res.to(a.x.v shr bX.v, a.x.v shr bY.v)
//    fun shr(res: Vec3ui, a: Vec3ui, bX: Int, bY: Int) = res.to(a.x.v shr bX, a.x.v shr bY)
//
//    fun inv(res: Vec3ui, a: Vec3ui) = res.to(a.x.v.inv(), a.x.v.inv())
//
//
//    fun add(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(a.x.v + bX.v, a.y.v + bY.v)
//    fun add(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(a.x.v + bX, a.y.v + bY)
//
//    fun sub(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(a.x.v - bX.v, a.y.v - bY.v)
//    fun sub(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(a.x.v - bX, a.y.v - bY)
//
//    fun sub(res: Vec3ul, aX: Ulong, aY: Ulong, b: Vec3ul) = res.to(aX.v - b.x.v, aY.v - b.y.v)
//    fun sub(res: Vec3ul, aX: Long, aY: Long, b: Vec3ul) = res.to(aX - b.x.v, aY - b.y.v)
//
//    fun mul(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(a.x.v * bX.v, a.y.v * bY.v)
//    fun mul(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(a.x.v * bX, a.y.v * bY)
//
//    fun div(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX.v), java.lang.Long.divideUnsigned(a.y.v, bY.v))
//    fun div(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(java.lang.Long.divideUnsigned(a.x.v, bX), java.lang.Long.divideUnsigned(a.y.v, bY))
//
//    fun div(res: Vec3ul, aX: Ulong, aY: Ulong, b: Vec3ul) = res.to(java.lang.Long.divideUnsigned(aX.v, b.x.v), java.lang.Long.divideUnsigned(aY.v, b.y.v))
//    fun div(res: Vec3ul, aX: Long, aY: Long, b: Vec3ul) = res.to(java.lang.Long.divideUnsigned(aX, b.x.v), java.lang.Long.divideUnsigned(aY, b.y.v))
//
//    fun mod(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX.v), java.lang.Long.remainderUnsigned(a.y.v, bY.v))
//    fun mod(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(java.lang.Long.remainderUnsigned(a.x.v, bX), java.lang.Long.remainderUnsigned(a.y.v, bY))
//
//    fun mod(res: Vec3ul, aX: Ulong, aY: Ulong, b: Vec3ul) = res.to(java.lang.Long.remainderUnsigned(aX.v, b.x.v), java.lang.Long.remainderUnsigned(aY.v, b.y.v))
//    fun mod(res: Vec3ul, aX: Long, aY: Long, b: Vec3ul) = res.to(java.lang.Long.remainderUnsigned(aX, b.x.v), java.lang.Long.remainderUnsigned(aY, b.y.v))
//
//    fun and(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(a.x.v and bX.v, a.x.v and bY.v)
//    fun and(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(a.x.v and bX, a.x.v and bY)
//
//    fun or(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(a.x.v or bX.v, a.x.v or bY.v)
//    fun or(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(a.x.v or bX, a.x.v or bY)
//
//    fun xor(res: Vec3ul, a: Vec3ul, bX: Ulong, bY: Ulong) = res.to(a.x.v xor bX.v, a.x.v xor bY.v)
//    fun xor(res: Vec3ul, a: Vec3ul, bX: Long, bY: Long) = res.to(a.x.v xor bX, a.x.v xor bY)
//
//    fun shl(res: Vec3ul, a: Vec3ul, bX: Int, bY: Int) = res.to(a.x.v shl bX, a.x.v shl bY)
//
//    fun shr(res: Vec3ul, a: Vec3ul, bX: Int, bY: Int) = res.to(a.x.v shr bX, a.x.v shr bY)
//
//    fun inv(res: Vec3ul, a: Vec3ul) = res.to(a.x.v.inv(), a.x.v.inv())
//
//
//    fun add(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.v + bX.v).toShort(), (a.y.v + bY.v).toShort())
//    fun add(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort())
//    fun add(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.v + bX).toShort(), (a.y.v + bY).toShort())
//
//    fun sub(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.v - bX.v).toShort(), (a.y.v - bY.v).toShort())
//    fun sub(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort())
//    fun sub(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.v - bX).toShort(), (a.y.v - bY).toShort())
//
//    fun sub(res: Vec3us, aX: Ushort, aY: Ushort, b: Vec3us) = res.to((aX.v - b.x.v).toShort(), (aY.v - b.y.v).toShort())
//    fun sub(res: Vec3us, aX: Short, aY: Short, b: Vec3us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort())
//    fun sub(res: Vec3us, aX: Int, aY: Int, b: Vec3us) = res.to((aX - b.x.v).toShort(), (aY - b.y.v).toShort())
//
//    fun mul(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.v * bX.v).toShort(), (a.y.v * bY.v).toShort())
//    fun mul(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort())
//    fun mul(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.v * bX).toShort(), (a.y.v * bY).toShort())
//
//    fun div(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort())
//    fun div(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort())
//    fun div(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to(Integer.divideUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.divideUnsigned(a.y.toInt(), bY.toInt()).toShort())
//
//    fun div(res: Vec3us, aX: Ushort, aY: Ushort, b: Vec3us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort())
//    fun div(res: Vec3us, aX: Short, aY: Short, b: Vec3us) = res.to(Integer.divideUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.divideUnsigned(aY.toInt(), b.y.toInt()).toShort())
//    fun div(res: Vec3us, aX: Int, aY: Int, b: Vec3us) = res.to(Integer.divideUnsigned(aX, b.x.toInt()).toShort(), Integer.divideUnsigned(aY, b.y.toInt()).toShort())
//
//    fun mod(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort())
//    fun mod(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort())
//    fun mod(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to(Integer.remainderUnsigned(a.x.toInt(), bX.toInt()).toShort(), Integer.remainderUnsigned(a.y.toInt(), bY.toInt()).toShort())
//
//    fun mod(res: Vec3us, aX: Ushort, aY: Ushort, b: Vec3us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort())
//    fun mod(res: Vec3us, aX: Short, aY: Short, b: Vec3us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort())
//    fun mod(res: Vec3us, aX: Int, aY: Int, b: Vec3us) = res.to(Integer.remainderUnsigned(aX.toInt(), b.x.toInt()).toShort(), Integer.remainderUnsigned(aY.toInt(), b.y.toInt()).toShort())
//
//    fun and(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
//    fun and(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
//    fun and(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.toInt() and bX).toShort(), (a.x.toInt() and bY).toShort())
//
//    fun or(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
//    fun or(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
//    fun or(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.toInt() or bX).toShort(), (a.x.toInt() or bY).toShort())
//
//    fun xor(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
//    fun xor(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
//    fun xor(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.toInt() xor bX).toShort(), (a.x.toInt() xor bY).toShort())
//
//    fun shl(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
//    fun shl(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
//    fun shl(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.toInt() shl bX).toShort(), (a.x.toInt() shl bY).toShort())
//
//    fun shr(res: Vec3us, a: Vec3us, bX: Ushort, bY: Ushort) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
//    fun shr(res: Vec3us, a: Vec3us, bX: Short, bY: Short) = res.to((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
//    fun shr(res: Vec3us, a: Vec3us, bX: Int, bY: Int) = res.to((a.x.toInt() shr bX).toShort(), (a.x.toInt() shr bY).toShort())
//
//    fun inv(res: Vec3us, a: Vec3us) = res.to(a.x.toInt().inv().toShort(), a.x.toInt().inv().toShort())
}