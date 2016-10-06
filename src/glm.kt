import vec._2.*

/**
 * Created bY GBarbieri on 06.10.2016.
 */

abstract class glm {

    companion object : vec2Operators
}

interface vec2Operators {

    fun add(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.set(a.x + bX, a.y + bY)

    fun sub(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.set(a.x - bX, a.y - bY)
    fun sub(res: Vec2, aX: Float, aY: Float, b: Vec2) = res.set(aX - b.x, aY - b.y)

    fun mul(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.set(a.x * bX, a.y * bY)

    fun div(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.set(a.x / bX, a.y / bY)
    fun div(res: Vec2, aX: Float, aY: Float, b: Vec2) = res.set(aX / b.x, aY / b.y)

    fun mod(res: Vec2, a: Vec2, bX: Float, bY: Float) = res.set(a.x % bX, a.y % bY)

    fun mod(res: Vec2, aX: Float, aY: Float, b: Vec2) = res.set(aX % b.x, aY % b.y)


    fun add(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x + bX).toByte(), (a.y + bY).toByte())
    fun add(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x + bX).toByte(), (a.y + bY).toByte())

    fun sub(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x - bX).toByte(), (a.y - bY).toByte())
    fun sub(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x - bX).toByte(), (a.y - bY).toByte())

    fun sub(res: Vec2b, aX: Byte, aY: Byte, b: Vec2b) = res.set((aX - b.x).toByte(), (aY - b.y).toByte())
    fun sub(res: Vec2b, aX: Int, aY: Int, b: Vec2b) = res.set((aX - b.x).toByte(), (aY - b.y).toByte())

    fun mul(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x * bX).toByte(), (a.y * bY).toByte())
    fun mul(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x * bX).toByte(), (a.y * bY).toByte())

    fun div(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x / bX).toByte(), (a.y / bY).toByte())
    fun div(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x / bX).toByte(), (a.y / bY).toByte())

    fun div(res: Vec2b, aX: Byte, aY: Byte, b: Vec2b) = res.set((aX / b.x).toByte(), (aY / b.y).toByte())
    fun div(res: Vec2b, aX: Int, aY: Int, b: Vec2b) = res.set((aX / b.x).toByte(), (aY / b.y).toByte())

    fun mod(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x % bX).toByte(), (a.y % bY).toByte())
    fun mod(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x % bX).toByte(), (a.y % bY).toByte())

    fun mod(res: Vec2b, aX: Byte, aY: Byte, b: Vec2b) = res.set((aX % b.x).toByte(), (aY % b.y).toByte())
    fun mod(res: Vec2b, aX: Int, aY: Int, b: Vec2b) = res.set((aX % b.x).toByte(), (aY % b.y).toByte())

    fun and(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x.toInt() and bX.toInt()).toByte(), (a.x.toInt() and bY.toInt()).toByte())
    fun and(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x.toInt() and bX).toByte(), (a.x.toInt() and bY).toByte())

    fun or(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x.toInt() or bX.toInt()).toByte(), (a.x.toInt() or bY.toInt()).toByte())
    fun or(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x.toInt() or bX).toByte(), (a.x.toInt() or bY).toByte())

    fun xor(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x.toInt() xor bX.toInt()).toByte(), (a.x.toInt() xor bY.toInt()).toByte())
    fun xor(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x.toInt() xor bX).toByte(), (a.x.toInt() xor bY).toByte())

    fun shl(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x.toInt() shl bX.toInt()).toByte(), (a.x.toInt() shl bY.toInt()).toByte())
    fun shl(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x.toInt() shl bX).toByte(), (a.x.toInt() shl bY).toByte())

    fun shr(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x.toInt() shr bX.toInt()).toByte(), (a.x.toInt() shr bY.toInt()).toByte())
    fun shr(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x.toInt() shr bX).toByte(), (a.x.toInt() shr bY).toByte())

    fun inv(res: Vec2b, a: Vec2b, bX: Byte, bY: Byte) = res.set((a.x.toInt().inv()).toByte(), (a.x.toInt().inv()).toByte())
    fun inv(res: Vec2b, a: Vec2b, bX: Int, bY: Int) = res.set((a.x.toInt().inv()).toByte(), (a.x.toInt().inv()).toByte())


    fun add(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.set(a.x + bX, a.y + bY)

    fun sub(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.set(a.x - bX, a.y - bY)
    fun sub(res: Vec2d, aX: Double, aY: Double, b: Vec2d) = res.set(aX - b.x, aY - b.y)

    fun mul(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.set(a.x * bX, a.y * bY)

    fun div(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.set(a.x / bX, a.y / bY)
    fun div(res: Vec2d, aX: Double, aY: Double, b: Vec2d) = res.set(aX / b.x, aY / b.y)

    fun mod(res: Vec2d, a: Vec2d, bX: Double, bY: Double) = res.set(a.x % bX, a.y % bY)

    fun mod(res: Vec2d, aX: Double, aY: Double, b: Vec2d) = res.set(aX % b.x, aY % b.y)


    fun add(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x + bX, a.y + bY)

    fun sub(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x - bX, a.y - bY)
    fun sub(res: Vec2i, aX: Int, aY: Int, b: Vec2i) = res.set_(aX - b.x, aY - b.y)

    fun mul(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x * bX, a.y * bY)

    fun div(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x / bX, a.y / bY)
    fun div(res: Vec2i, aX: Int, aY: Int, b: Vec2i) = res.set_(aX / b.x, aY / b.y)

    fun mod(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x % bX, a.y % bY)

    fun mod(res: Vec2i, aX: Int, aY: Int, b: Vec2i) = res.set_(aX % b.x, aY % b.y)

    fun and(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x and bX, a.x and bY)

    fun or(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x or bX, a.x or bY)

    fun xor(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x xor bX, a.x xor bY)

    fun shl(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x shl bX, a.x shl bY)

    fun shr(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x shr bX, a.x shr bY)

    fun inv(res: Vec2i, a: Vec2i, bX: Int, bY: Int) = res.set_(a.x.inv(), a.y.inv())


    fun add(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x + bX, a.y + bY)

    fun sub(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x - bX, a.y - bY)
    fun sub(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.set_(aX - b.x, aY - b.y)

    fun mul(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x * bX, a.y * bY)

    fun div(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x / bX, a.y / bY)
    fun div(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.set_(aX / b.x, aY / b.y)

    fun mod(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x % bX, a.y % bY)

    fun mod(res: Vec2l, aX: Long, aY: Long, b: Vec2l) = res.set_(aX % b.x, aY % b.y)

    fun and(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x and bX, a.x and bY)

    fun or(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x or bX, a.x or bY)

    fun xor(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x xor bX, a.x xor bY)

    fun shl(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x shl bX.toInt(), a.x shl bY.toInt())
    fun shl(res: Vec2l, a: Vec2l, bX: Int, bY: Int) = res.set_(a.x shl bX, a.x shl bY)

    fun shr(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x shr bX.toInt(), a.x shr bY.toInt())
    fun shr(res: Vec2l, a: Vec2l, bX: Int, bY: Int) = res.set_(a.x shr bX, a.x shr bY)

    fun inv(res: Vec2l, a: Vec2l, bX: Long, bY: Long) = res.set_(a.x.inv(), a.y.inv())


    fun add(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x + bX).toShort(), (a.y + bY).toShort())
    fun add(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x + bX).toShort(), (a.y + bY).toShort())

    fun sub(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x - bX).toShort(), (a.y - bY).toShort())
    fun sub(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x - bX).toShort(), (a.y - bY).toShort())

    fun sub(res: Vec2s, aX: Short, aY: Short, b: Vec2s) = res.set((aX - b.x).toShort(), (aY - b.y).toShort())
    fun sub(res: Vec2s, aX: Int, aY: Int, b: Vec2s) = res.set((aX - b.x).toShort(), (aY - b.y).toShort())

    fun mul(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x * bX).toShort(), (a.y * bY).toShort())
    fun mul(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x * bX).toShort(), (a.y * bY).toShort())

    fun div(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x / bX).toShort(), (a.y / bY).toShort())
    fun div(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x / bX).toShort(), (a.y / bY).toShort())

    fun div(res: Vec2s, aX: Short, aY: Short, b: Vec2s) = res.set((aX / b.x).toShort(), (aY / b.y).toShort())
    fun div(res: Vec2s, aX: Int, aY: Int, b: Vec2s) = res.set((aX / b.x).toShort(), (aY / b.y).toShort())

    fun mod(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x % bX).toShort(), (a.y % bY).toShort())
    fun mod(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x % bX).toShort(), (a.y % bY).toShort())

    fun mod(res: Vec2s, aX: Short, aY: Short, b: Vec2s) = res.set((aX % b.x).toShort(), (aY % b.y).toShort())
    fun mod(res: Vec2s, aX: Int, aY: Int, b: Vec2s) = res.set((aX % b.x).toShort(), (aY % b.y).toShort())

    fun and(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x.toInt() and bX.toInt()).toShort(), (a.x.toInt() and bY.toInt()).toShort())
    fun and(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x.toInt() and bX).toShort(), (a.x.toInt() and bY).toShort())

    fun or(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x.toInt() or bX.toInt()).toShort(), (a.x.toInt() or bY.toInt()).toShort())
    fun or(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x.toInt() or bX).toShort(), (a.x.toInt() or bY).toShort())

    fun xor(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x.toInt() xor bX.toInt()).toShort(), (a.x.toInt() xor bY.toInt()).toShort())
    fun xor(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x.toInt() xor bX).toShort(), (a.x.toInt() xor bY).toShort())

    fun shl(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x.toInt() shl bX.toInt()).toShort(), (a.x.toInt() shl bY.toInt()).toShort())
    fun shl(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x.toInt() shl bX).toShort(), (a.x.toInt() shl bY).toShort())

    fun shr(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x.toInt() shr bX.toInt()).toShort(), (a.x.toInt() shr bY.toInt()).toShort())
    fun shr(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x.toInt() shr bX).toShort(), (a.x.toInt() shr bY).toShort())

    fun inv(res: Vec2s, a: Vec2s, bX: Short, bY: Short) = res.set((a.x.toInt().inv()).toShort(), (a.x.toInt().inv()).toShort())
    fun inv(res: Vec2s, a: Vec2s, bX: Int, bY: Int) = res.set((a.x.toInt().inv()).toShort(), (a.x.toInt().inv()).toShort())
}