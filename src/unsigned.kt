import java.math.BigInteger

/**
 * Created by GBarbieri on 06.10.2016.
 */

data class Ubyte(var v: Byte = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned byte</code> can have, 0.
         */
        const val MIN_VALUE = 0x00
        /**
         * A constant holding the maximum value an <code>unsigned byte</code> can have, 2<sup>8</sup>-1.
         */
        const val MAX_VALUE = 0xff

        fun checkSigned(v: Number) = v.toInt() >= MIN_VALUE && v.toInt() <= MAX_VALUE
    }


    constructor(number: Number) : this(number.toByte())
    constructor(string: String) : this(string.toByte())


    fun toBigInteger() = BigInteger.valueOf(toLong())
    override fun toDouble() = toInt().toDouble()
    override fun toFloat() = toInt().toFloat()
    override fun toLong() = toInt().toLong()
    override fun toInt() = (v.toInt() + MAX_VALUE) % MAX_VALUE
    override fun toChar() = toInt().toChar()
    override fun toShort() = toInt().toShort()
    override fun toByte() = v


    operator fun plus(b: Ubyte) = Ubyte(v + b.v)
    operator fun plus(b: Byte) = Ubyte(v + b)
    operator fun plus(b: Int) = Ubyte(v + b)

    operator fun minus(b: Ubyte) = Ubyte(v - b.v)
    operator fun minus(b: Byte) = Ubyte(v - b)
    operator fun minus(b: Int) = Ubyte(v - b)

    operator fun times(b: Ubyte) = Ubyte(v * b.v)
    operator fun times(b: Byte) = Ubyte(v * b)
    operator fun times(b: Int) = Ubyte(v * b)

    operator fun div(b: Ubyte) = Ubyte(Integer.divideUnsigned(v.toInt(), b.toInt()))
    operator fun div(b: Byte) = Ubyte(Integer.divideUnsigned(v.toInt(), b.toInt()))
    operator fun div(b: Int) = Ubyte(Integer.divideUnsigned(v.toInt(), b))

    operator fun mod(b: Ubyte) = Ubyte(Integer.remainderUnsigned(v.toInt(), b.toInt()))
    operator fun mod(b: Byte) = Ubyte(Integer.remainderUnsigned(v.toInt(), b.toInt()))
    operator fun mod(b: Int) = Ubyte(Integer.remainderUnsigned(v.toInt(), b))

    inline infix fun and(b: Ubyte) = Ubyte(v.toInt() and b.toInt())
    inline infix fun and(b: Byte) = Ubyte(v.toInt() and b.toInt())
    inline infix fun and(b: Int) = Ubyte(v.toInt() and b)

    inline infix fun or(b: Ubyte) = Ubyte(v.toInt() or b.toInt())
    inline infix fun or(b: Byte) = Ubyte(v.toInt() or b.toInt())
    inline infix fun or(b: Int) = Ubyte(v.toInt() or b)

    inline infix fun xor(b: Ubyte) = Ubyte(v.toInt() xor b.toInt())
    inline infix fun xor(b: Byte) = Ubyte(v.toInt() xor b.toInt())
    inline infix fun xor(b: Int) = Ubyte(v.toInt() xor b)

    inline infix fun shl(b: Ubyte) = Ubyte(v.toInt() shl b.toInt())
    inline infix fun shl(b: Byte) = Ubyte(v.toInt() shl b.toInt())
    inline infix fun shl(b: Int) = Ubyte(v.toInt() shl b)

    inline infix fun shr(b: Ubyte) = Ubyte(v.toInt() ushr b.toInt())
    inline infix fun shr(b: Byte) = Ubyte(v.toInt() ushr b.toInt())
    inline infix fun shr(b: Int) = Ubyte(v.toInt() ushr b)

    fun inv() = Ubyte(v.toInt().inv())


    operator fun Byte.plus(b: Ubyte) = (toInt() + b.toInt()).toByte()
    operator fun Byte.minus(b: Ubyte) = (toInt() - b.toInt()).toByte()
    operator fun Byte.times(b: Ubyte) = (toInt() * b.toInt()).toByte()
    operator fun Byte.div(b: Ubyte) = Integer.divideUnsigned(toInt(), b.toInt()).toByte()
    operator fun Byte.mod(b: Ubyte) = Integer.remainderUnsigned(toInt(), b.toInt()).toByte()
    inline infix fun Byte.and(b: Ubyte) = (toInt() and b.toInt()).toByte()
    inline infix fun Byte.or(b: Ubyte) = (toInt() or b.toInt()).toByte()
    inline infix fun Byte.xor(b: Ubyte) = (toInt() xor b.toInt()).toByte()
    inline infix fun Byte.shl(b: Ubyte) = (toInt() shl b.toInt()).toByte()
    inline infix fun Byte.shr(b: Ubyte) = (toInt() shr b.toInt()).toByte()


    operator fun Int.plus(b: Ubyte) = (this + b.toInt()).toByte()
    operator fun Int.minus(b: Ubyte) = (this - b.toInt()).toByte()
    operator fun Int.times(b: Ubyte) = (this * b.toInt()).toByte()
    operator fun Int.div(b: Ubyte) = Integer.divideUnsigned(this, b.toInt()).toByte()
    operator fun Int.mod(b: Ubyte) = Integer.remainderUnsigned(this, b.toInt()).toByte()
    inline infix fun Int.and(b: Ubyte) = (this and b.toInt()).toByte()
    inline infix fun Int.or(b: Ubyte) = (this or b.toInt()).toByte()
    inline infix fun Int.xor(b: Ubyte) = (this xor b.toInt()).toByte()
    inline infix fun Int.shl(b: Ubyte) = (this shl b.toInt()).toByte()
    inline infix fun Int.shr(b: Ubyte) = (this shr b.toInt()).toByte()
}

data class Uint(var v: Int = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned int</code> can have, 0.
         */
        const val MIN_VALUE = 0x00000000
        /**
         * A constant holding the maximum value an <code>unsigned int</code> can have, 2<sup>32</sup>-1.
         */
        const val MAX_VALUE = 0xffffffffL

        fun checkSigned(v: Number) = v.toLong() >= MIN_VALUE && v.toLong() <= MAX_VALUE
    }


    constructor(number: Number) : this(number.toInt())
    constructor(string: String) : this(string.toInt())


    fun toBigInteger() = BigInteger.valueOf(toLong())
    override fun toDouble() = toLong().toDouble()
    override fun toFloat() = toLong().toFloat()
    override fun toLong() = (v.toLong() + MAX_VALUE) % MAX_VALUE
    override fun toInt() = v
    override fun toChar() = v.toChar()
    override fun toShort() = v.toShort()
    override fun toByte() = v.toByte()


    operator fun plus(b: Uint) = Uint(v + b.v)
    operator fun plus(b: Int) = Uint(v + b)

    operator fun minus(b: Uint) = Uint(v - b.v)
    operator fun minus(b: Int) = Uint(v - b)

    operator fun times(b: Uint) = Uint(v * b.v)
    operator fun times(b: Int) = Uint(v * b)

    operator fun div(b: Uint) = Uint(Integer.divideUnsigned(v, b.toInt()))
    operator fun div(b: Int) = Uint(Integer.divideUnsigned(v, b))

    operator fun mod(b: Uint) = Uint(Integer.remainderUnsigned(v, b.toInt()))
    operator fun mod(b: Int) = Uint(Integer.remainderUnsigned(v, b))

    inline infix fun and(b: Uint) = Uint(v and b.toInt())
    inline infix fun and(b: Int) = Uint(v and b)

    inline infix fun or(b: Uint) = Uint(v or b.toInt())
    inline infix fun or(b: Int) = Uint(v or b)

    inline infix fun xor(b: Uint) = Uint(v xor b.toInt())
    inline infix fun xor(b: Int) = Uint(v xor b)

    inline infix fun shl(b: Uint) = Uint(v shl b.toInt())
    inline infix fun shl(b: Int) = Uint(v shl b)

    inline infix fun shr(b: Uint) = Uint(v ushr b.toInt())
    inline infix fun shr(b: Int) = Uint(v ushr b)

    fun inv() = Uint(v.inv())


    operator fun Int.plus(b: Uint) = (this + b.toInt()).toByte()
    operator fun Int.minus(b: Uint) = (this - b.toInt()).toByte()
    operator fun Int.times(b: Uint) = (this * b.toInt()).toByte()
    operator fun Int.div(b: Uint) = Integer.divideUnsigned(this, b.toInt()).toByte()
    operator fun Int.mod(b: Uint) = Integer.remainderUnsigned(this, b.toInt()).toByte()
    inline infix fun Int.and(b: Uint) = (this and b.toInt()).toByte()
    inline infix fun Int.or(b: Uint) = (this or b.toInt()).toByte()
    inline infix fun Int.xor(b: Uint) = (this xor b.toInt()).toByte()
    inline infix fun Int.shl(b: Uint) = (this shl b.toInt()).toByte()
    inline infix fun Int.shr(b: Uint) = (this shr b.toInt()).toByte()
}

data class Ulong(var v: Long = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned long</code> can have, 0.
         */
        val MIN_VALUE: BigInteger = BigInteger.ZERO
        /**
         * A constant holding the maximum value an <code>unsigned long</code> can have, 2<sup>64</sup>-1.
         */
        val MAX_VALUE: BigInteger = BigInteger("18446744073709551615")

        fun checkSigned(v: Number) = BigInteger.valueOf(v.toLong()) >= MIN_VALUE && BigInteger.valueOf(v.toLong()) <= MAX_VALUE
    }

    constructor(number: Number) : this(number.toLong())
    constructor(string: String) : this(string.toLong())

    fun toBigInteger() = (BigInteger.valueOf(v) + MAX_VALUE) % MAX_VALUE
    override fun toDouble() = toBigInteger().toDouble()
    override fun toFloat() = toBigInteger().toFloat()
    override fun toLong() = v
    override fun toInt() = v.toInt()
    override fun toChar() = v.toChar()
    override fun toShort() = v.toShort()
    override fun toByte() = v.toByte()


    operator fun plus(b: Ulong) = Ulong(v + b.v)
    operator fun plus(b: Long) = Ulong(v + b)

    operator fun minus(b: Ulong) = Ulong(v - b.v)
    operator fun minus(b: Long) = Ulong(v - b)

    operator fun times(b: Ulong) = Ulong(v * b.v)
    operator fun times(b: Long) = Ulong(v * b)

    operator fun div(b: Ulong) = Ulong(java.lang.Long.divideUnsigned(v, b.toLong()))
    operator fun div(b: Long) = Ulong(java.lang.Long.divideUnsigned(v, b))

    operator fun mod(b: Ulong) = Ulong(java.lang.Long.remainderUnsigned(v, b.toLong()))
    operator fun mod(b: Long) = Ulong(java.lang.Long.remainderUnsigned(v, b))

    inline infix fun and(b: Ulong) = Ulong(v and b.toLong())
    inline infix fun and(b: Long) = Ulong(v and b)

    inline infix fun or(b: Ulong) = Ulong(v or b.toLong())
    inline infix fun or(b: Long) = Ulong(v or b)

    inline infix fun xor(b: Ulong) = Ulong(v xor b.toLong())
    inline infix fun xor(b: Long) = Ulong(v xor b)

    inline infix fun shl(b: Int) = Ulong(v shl b)

    inline infix fun shr(b: Int) = Ulong(v ushr b)

    fun inv() = Ulong(v.inv())

    operator fun Long.plus(b: Ulong) = (this + b.toLong()).toByte()
    operator fun Long.minus(b: Ulong) = (this - b.toLong()).toByte()
    operator fun Long.times(b: Ulong) = (this * b.toLong()).toByte()
    operator fun Long.div(b: Ulong) = java.lang.Long.divideUnsigned(this, b.toLong()).toByte()
    operator fun Long.mod(b: Ulong) = java.lang.Long.remainderUnsigned(this, b.toLong()).toByte()
    inline infix fun Long.and(b: Ulong) = (this and b.toLong()).toByte()
    inline infix fun Long.or(b: Ulong) = (this or b.toLong()).toByte()
    inline infix fun Long.xor(b: Ulong) = (this xor b.toLong()).toByte()
    // no shl, shr, they require int
}

data class Ushort(var v: Short = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned short</code> can have, 0.
         */
        const val MIN_VALUE = 0x0000
        /**
         * A constant holding the maximum value an <code>unsigned short</code> can have, 2<sup>16</sup>-1.
         */
        const val MAX_VALUE = 0xffff

        fun checkSigned(v: Number) = v.toInt() >= MIN_VALUE && v.toInt() <= MAX_VALUE
    }


    constructor(number: Number) : this(number.toShort())
    constructor(string: String) : this(string.toShort())


    fun toBigInteger() = BigInteger.valueOf(toLong())
    override fun toDouble() = toInt().toDouble()
    override fun toFloat() = toInt().toFloat()
    override fun toLong() = toInt().toLong()
    override fun toInt() = (v.toInt() + MAX_VALUE) % MAX_VALUE
    override fun toChar() = v.toChar()
    override fun toShort() = v
    override fun toByte() = v.toByte()


    operator fun plus(b: Ushort) = Ushort(v + b.v)
    operator fun plus(b: Short) = Ushort(v + b)
    operator fun plus(b: Int) = Ushort(v + b)

    operator fun minus(b: Ushort) = Ushort(v - b.v)
    operator fun minus(b: Short) = Ushort(v - b)
    operator fun minus(b: Int) = Ushort(v - b)

    operator fun times(b: Ushort) = Ushort(v * b.v)
    operator fun times(b: Short) = Ushort(v * b)
    operator fun times(b: Int) = Ushort(v * b)

    operator fun div(b: Ushort) = Ushort(Integer.divideUnsigned(v.toInt(), b.toInt()))
    operator fun div(b: Short) = Ushort(Integer.divideUnsigned(v.toInt(), b.toInt()))
    operator fun div(b: Int) = Ushort(Integer.divideUnsigned(v.toInt(), b))

    operator fun mod(b: Ushort) = Ushort(Integer.remainderUnsigned(v.toInt(), b.toInt()))
    operator fun mod(b: Short) = Ushort(Integer.remainderUnsigned(v.toInt(), b.toInt()))
    operator fun mod(b: Int) = Ushort(Integer.remainderUnsigned(v.toInt(), b))

    inline infix fun and(b: Ushort) = Ushort(v.toInt() and b.toInt())
    inline infix fun and(b: Short) = Ushort(v.toInt() and b.toInt())
    inline infix fun and(b: Int) = Ushort(v.toInt() and b)

    inline infix fun or(b: Ushort) = Ushort(v.toInt() or b.toInt())
    inline infix fun or(b: Short) = Ushort(v.toInt() or b.toInt())
    inline infix fun or(b: Int) = Ushort(v.toInt() or b)

    inline infix fun xor(b: Ushort) = Ushort(v.toInt() xor b.toInt())
    inline infix fun xor(b: Short) = Ushort(v.toInt() xor b.toInt())
    inline infix fun xor(b: Int) = Ushort(v.toInt() xor b)

    inline infix fun shl(b: Ushort) = Ushort(v.toInt() shl b.toInt())
    inline infix fun shl(b: Short) = Ushort(v.toInt() shl b.toInt())
    inline infix fun shl(b: Int) = Ushort(v.toInt() shl b)

    inline infix fun shr(b: Ushort) = Ushort(v.toInt() ushr b.toInt())
    inline infix fun shr(b: Short) = Ushort(v.toInt() ushr b.toInt())
    inline infix fun shr(b: Int) = Ushort(v.toInt() ushr b)

    fun inv() = Ushort(v.toInt().inv())


    operator fun Short.plus(b: Ushort) = (toInt() + b.toInt()).toShort()
    operator fun Short.minus(b: Ushort) = (toInt() - b.toInt()).toShort()
    operator fun Short.times(b: Ushort) = (toInt() * b.toInt()).toShort()
    operator fun Short.div(b: Ushort) = Integer.divideUnsigned(toInt(), b.toInt()).toShort()
    operator fun Short.mod(b: Ushort) = Integer.remainderUnsigned(toInt(), b.toInt()).toShort()
    inline infix fun Short.and(b: Ushort) = (toInt() and b.toInt()).toShort()
    inline infix fun Short.or(b: Ushort) = (toInt() or b.toInt()).toShort()
    inline infix fun Short.xor(b: Ushort) = (toInt() xor b.toInt()).toShort()
    inline infix fun Short.shl(b: Ushort) = (toInt() shl b.toInt()).toShort()
    inline infix fun Short.shr(b: Ushort) = (toInt() shr b.toInt()).toShort()


    operator fun Int.plus(b: Ushort) = (this + b.toInt()).toShort()
    operator fun Int.minus(b: Ushort) = (this - b.toInt()).toShort()
    operator fun Int.times(b: Ushort) = (this * b.toInt()).toShort()
    operator fun Int.div(b: Ushort) = Integer.divideUnsigned(this, b.toInt()).toShort()
    operator fun Int.mod(b: Ushort) = Integer.remainderUnsigned(this, b.toInt()).toShort()
    inline infix fun Int.and(b: Ushort) = (this and b.toInt()).toShort()
    inline infix fun Int.or(b: Ushort) = (this or b.toInt()).toShort()
    inline infix fun Int.xor(b: Ushort) = (this xor b.toInt()).toShort()
    inline infix fun Int.shl(b: Ushort) = (this shl b.toInt()).toShort()
    inline infix fun Int.shr(b: Ushort) = (this shr b.toInt()).toShort()
}
