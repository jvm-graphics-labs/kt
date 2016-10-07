import java.math.BigInteger

/**
 * Created by GBarbieri on 06.10.2016.
 */

public data class Ubyte(var v: Byte = 0) : Number() {

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
}

data class Uint(var v: Int = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned byte</code> can have, 0.
         */
        const val MIN_VALUE = 0x00000000
        /**
         * A constant holding the maximum value an <code>unsigned byte</code> can have, 2<sup>8</sup>-1.
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

}

data class Ulong(var v: Long = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned byte</code> can have, 0.
         */
        val MIN_VALUE: BigInteger = BigInteger.ZERO
        /**
         * A constant holding the maximum value an <code>unsigned byte</code> can have, 2<sup>8</sup>-1.
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
}

data class Ushort(var v: Short = 0) : Number() {

    companion object {
        /**
         * A constant holding the minimum value an <code>unsigned byte</code> can have, 0.
         */
        const val MIN_VALUE = 0x0000
        /**
         * A constant holding the maximum value an <code>unsigned byte</code> can have, 2<sup>8</sup>-1.
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
}