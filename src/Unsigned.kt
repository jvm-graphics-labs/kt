import java.math.BigInteger

/**
 * Created by GBarbieri on 06.10.2016.
 */


class Ubyte(var value: Byte = 0)  {

    companion object {

        /**
         * A constant holding the minimum value an <code>unsigned byte</code> can have, 0.
         */
        const val MIN_VALUE = 0x00

        /**
         * A constant holding the maximum value an <code>unsigned byte</code> can have, 2<sup>8</sup>-1.
         */
        const val MAX_VALUE = 0xff;
    }

    constructor(value: Number) : this(value.toByte())

    constructor(value: java.lang.Number)
}

    /**
     * Create an <code>unsigned byte</code>
     *
     * @param value
     */
    public UByte(String value) {
        this.value = Byte.parseByte(value);
    }

    public UByte(UByte uByte) {
        this.value = uByte.value;
    }

    @Override
    public int hashCode() {
        return Short.valueOf(value).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UByte) {
            return value == ((UByte) obj).value;
        }
        return false;
    }

    @Override
    public String toString() {
        return Short.toString(value);
    }

    @Override
    public int compareTo(UByte o) {
        int a = value & 0xff, b = o.value & 0xff;
        return a < b ? -1 : (a == b ? 0 : 1);
    }

    public short shortValue() {
        return (short) (value & 0xff);
    }

    public int intValue() {
        return value & 0xff;
    }

    public long longValue() {
        return value & 0xff;
    }

    /**
     * Throw exception if value out of range (short version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws ArithmeticException if value is out of range
     */
    public static byte checkSigned(byte value) throws ArithmeticException {
        if (value < 0) {
            throw new ArithmeticException("Value is out of range : " + value);
        }
        return value;
    }

    /**
     * Throw exception if value out of range (short version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws ArithmeticException if value is out of range
     */
    public static byte checkSigned(short value) throws ArithmeticException {
        if (value < 0 || value > MAX_VALUE) {
            throw new ArithmeticException("Value is out of range : " + value);
        }
        return (byte) value;
    }

    /**
     * Throw exception if value out of range (int version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws ArithmeticException if value is out of range
     */
    public static byte checkSigned(int value) throws ArithmeticException {
        if (value < 0 || value > MAX_VALUE) {
            throw new ArithmeticException("Value is out of range : " + value);
        }
        return (byte) value;
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws ArithmeticException if value is out of range
     */
    public static byte checkSigned(long value) throws ArithmeticException {
        if (value < 0 || value > MAX_VALUE) {
            throw new ArithmeticException("Value is out of range : " + value);
        }
        return (byte) value;
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws ArithmeticException if value is out of range
     */
    public static byte checkSigned(BigInteger value) throws ArithmeticException {
        if (value.compareTo(BigInteger.ZERO) < 0 || value.intValue() > MAX_VALUE) {
            throw new ArithmeticException("Value is out of range : " + value);
        }
        return value.byteValue();
    }

    /**
     * Throw exception if value out of range (long version)
     *
     * @param value Value to check
     * @return value if it is in range
     * @throws ArithmeticException if value is out of range
     */
    public static byte checkSigned(String value) throws ArithmeticException {
        if (value.startsWith("-")) {
            throw new ArithmeticException("Value is out of range : " + value);
        }
        return Byte.parseByte(value);
    }