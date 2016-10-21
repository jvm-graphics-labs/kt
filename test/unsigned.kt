import org.junit.Test
import java.math.BigInteger

/**
 * Created by elect on 15/10/16.
 */

class unsigned {

    fun Int.b() = toByte()
    fun Int.s() = toShort()
    fun Long.i() = toInt()
    fun String.hl() = java.lang.Long.parseUnsignedLong(this, 16)
    fun String.l() = java.lang.Long.parseUnsignedLong(this)
    fun String.bl() = java.lang.Long.parseUnsignedLong(this, 2)

    @Test fun math() {

        assert(250.b() udiv 50.b() == 5.b())
        assert(240.b() umod 50.b() == 40.b())
        assert(0b01001101.b() ushr 4.b() == 0b00000100.b())
        assert(0b01001101.b() ucmp 0b01001100.b() > 0)
        assert(0b01001101.b() ucmp 0b01001101.b() == 0)

        assert(65500.s() udiv 500.s() == 131.s())
        assert(65500.s() umod 5000.s() == 500.s())
        assert(0b0100110001110000.s() ushr 8.s() == 0b0000000001001100.s())
        assert(0b0100110001110000.s() ucmp 0b0100110001110001.s() < 0)
        assert(0b0100110001110000.s() ucmp 0b0100110001110000.s() == 0)

        assert(4000000000.i() udiv 2 == 2000000000)
        assert(4000000001.i() umod 2 == 1)
        assert(0b01001100011100001111000001111101 ushr 16 == 0b00000000000000000100110001110000)
        assert(0b01001100011100001111000001111101 ucmp 0b01001100011100001111000001111100 > 0)
        assert(0b01001100011100001111000001111101 ucmp 0b01001100011100001111000001111101 == 0)

        assert("18000000000000000000".l() udiv 2L == "9000000000000000000".l())
        assert("17000000000000000000".l() umod "9000000000000000000".l() == "8000000000000000000".l())
        val l = "0100110001110000111100000111110000001111110000000111111100000000".bl()
        assert(l ushr 32 == "0000000000000000000000000000000001001100011100001111000001111100".bl())
        assert(l ucmp "0100110001110000111100000111110000001111110000000111111100000001".bl() < 0)
        assert(l ucmp "0100110001110000111100000111110000001111110000000111111100000000".bl() == 0)
    }

    @Test fun ubyte() {

        fun Int.b() = toByte()

        assert(Ubyte(0xff).v == 0xff.toByte())
        assert(Ubyte(0b11111111.b()).v == 0xff.toByte())
        assert(Ubyte("255").v == 0xff.toByte())

        var a = Ubyte(0xff)

        assert(a.toBigInteger() == BigInteger.valueOf(0xff))
        assert(a.toDouble() == 0xff.toDouble())
        assert(a.toFloat() == 0xff.toFloat())
        assert(a.toLong() == 0xff.toLong())
        assert(a.toInt() == 0xff.toInt())
        assert(a.toChar() == 0xff.toChar())
        assert(a.toShort() == 0xff.toShort())
        assert(a.toByte() == 0xff.toByte())

        assert(a.toUshort() == Ushort(0xff))
        assert(a.toUint() == Uint(0xff))
        assert(a.toUlong() == Ulong(0xff))

        var b = Ubyte(1)
        var c = Ubyte(0)

        assert(a + b == c)
        assert(a + 1.b() == c)
        assert(a + 1 == c)

        c = Ubyte(0xfe)

        assert(a - b == c)
        assert(a - 1.b() == c)
        assert(a - 1 == c)

        a = Ubyte(100)
        b = Ubyte(2)
        c = Ubyte(200)

        assert(a * b == c)
        assert(a * 2.b() == c)
        assert(a * 2 == c)

        assert(c / b == a)
        assert(c / 2.b() == a)
        assert(c / 2 == a)

        b = Ubyte(175)
        c = Ubyte(75)

        assert(b % a == c)
        assert(b % 100.toByte() == c)
        assert(b % 100 == c)

        a = Ubyte(0b10101010)
        b = Ubyte(0b00001111)
        c = Ubyte(0b00001010)

        assert(a and b == c)
        assert(a and 15.b() == c)
        assert(a and 15 == c)

        c = Ubyte(0b10101111)

        assert(a or b == c)
        assert(a or 175.b() == c)
        assert(a or 175 == c)

        c = Ubyte(0b10100101)

        assert(a xor b == c)
        assert(a xor 15.b() == c)
        assert(a xor 15 == c)

        b = Ubyte(4)
        c = Ubyte(0b10100000)

        assert(a shl b == c)
        assert(a shl 4.b() == c)
        assert(a shl 4 == c)

        c = Ubyte(0b00001010)

        assert(a shr b == c)
        assert(a shr 4.b() == c)
        assert(a shr 4 == c)

        b = Ubyte(0b01010101)

        assert(a.inv() == b)

        a = Ubyte(250)

        assert(a > Ubyte(249))
        assert(a > 249.b())
        assert(a > 249)
        assert(a >= a)
        assert(a >= 250.b())
        assert(a >= 250)

        assert(0xff.b() + Ubyte(1) == 0.b())
        assert(0xff.b() - Ubyte(1) == 0xfe.b())
        assert(100.b() * Ubyte(2) == 200.b())
        assert(200.b() / Ubyte(2) == 100.b())
        assert(175.b() % Ubyte(100) == 75.b())
        assert(0b10101010.b() and Ubyte(0b00001111) == 0b1010.b())
        assert(0b10101010.b() or Ubyte(0b00001111) == 0b10101111.b())
        assert(0b10101010.b() xor Ubyte(0b00001111) == 0b10100101.b())
        assert(0b10101010.b() shl Ubyte(4) == 0b10100000.b())
        assert(0b10101010.b() shr Ubyte(4) == 0b1010.b())
        assert(0b10101010.b().inv() == 0b01010101.b())
        assert(200.b() > Ubyte(199))
        assert(200.b() >= Ubyte(200))

        assert(0xff + Ubyte(1) == 0b100000000)
        assert(0xff - Ubyte(1) == 0xfe)
        assert(100 * Ubyte(2) == 200)
        assert(200 / Ubyte(2) == 100)
        assert(175 % Ubyte(100) == 75)
        assert(0b10101010 and Ubyte(0b00001111) == 0b1010)
        assert(0b10101010 or Ubyte(0b00001111) == 0b10101111)
        assert(0b10101010 xor Ubyte(0b00001111) == 0b10100101)
        assert(0b10101010 shl Ubyte(4) == 0b101010100000)
        assert(0b10101010 shr Ubyte(4) == 0b1010)
        assert(200 > Ubyte(199))
        assert(200 >= Ubyte(200))
    }

    @Test fun uint() {

        /**
         * BUG, 0xffffffff is interpreted as Long
         * https://youtrack.jetbrains.com/issue/KT-2780
         * https://youtrack.jetbrains.com/issue/KT-4749
         */

        assert(Uint(0xffffffff).v == 0xffffffff.toInt())
        assert(Uint("4294967295").v == 0xffffffff.toInt())

        var a = Uint(0xffffffff)

        assert(a.toBigInteger() == BigInteger.valueOf(0xffffffff))
        assert(a.toDouble() == 0xffffffff.toDouble())
        assert(a.toFloat() == 0xffffffff.toFloat())
        assert(a.toLong() == 0xffffffff.toLong())
        assert(a.toInt() == 0xffffffff.toInt())
        assert(a.toChar() == 0xffffffff.toChar())
        assert(a.toShort() == 0xffffffff.toShort())
        assert(a.toByte() == 0xffffffff.toByte())

        assert(a.toUbyte() == Ubyte(0xffffffff))
        assert(a.toUshort() == Ushort(0xffffffff))
        assert(a.toUlong() == Ulong(0xffffffff))

        var b = Uint(1)
        var c = Uint(0)

        assert(a + b == c)
        assert(a + 1 == c)

        c = Uint(0xfffffffe)

        assert(a - b == c)
        assert(a - 1 == c)

        // TODO underscore https://youtrack.jetbrains.com/issue/KT-2964

        a = Uint(2000000000)
        b = Uint(2)
        c = Uint(4000000000)

        assert(a * b == c)
        assert(a * 2 == c)

        assert(c / b == a)
        assert(c / 2 == a)

        b = Uint(2750000000)
        c = Uint(750000000)

        assert(b % a == c)
        assert(b % 2000000000 == c)

        a = Uint(0b10101010101010101010101010101010)
        b = Uint(0b00001111000011110000111100001111)
        c = Uint(0b00001010000010100000101000001010)

        assert(a and b == c)
        assert(a and 0b00001111000011110000111100001111 == c)

        c = Uint(0b10101111101011111010111110101111)

        assert(a or b == c)
        assert(a or 0b10101111101011111010111110101111.i() == c)

        c = Uint(0b10100101101001011010010110100101)

        assert(a xor b == c)
        assert(a xor 0b00001111000011110000111100001111 == c)

        a = Uint(0b01001100011100001111000001111101)
        b = Uint(16)
        c = Uint(0b11110000011111010000000000000000)

        assert(a shl b == c)
        assert(a shl 16 == c)

        c = Uint(0b00000000000000000100110001110000)

        assert(a shr b == c)
        assert(a shr 16 == c)

        b = Uint(0b10110011100011110000111110000010)

        assert(a.inv() == b)

        a = Uint(2e9)

        assert(a > Uint(2000000000 - 1))
        assert(a > (2000000000 - 1))
        assert(a >= a)
        assert(a >= 2000000000)

        assert(0xffffffff.i() + Uint(1) == 0)
        assert(0xffffffff.i() - Uint(1) == 0xfffffffe.i())
        assert(2000000000 * Uint(2) == 4000000000.i())
        assert(4000000000.i() / Uint(2) == 2000000000)
        assert(3750000000.i() % Uint(1000000000) == 750000000)

        var d = 0b01001100011100001111000001111101
        var e = 0b01010101010101010101010101010101
        // 0b01001100011100001111000001111101
        // 0b01010101010101010101010101010101
        // 0b01000100010100000101000001010101
        assert(d and Uint(e) == 0b01000100010100000101000001010101)
        // 0b01001100011100001111000001111101
        // 0b01010101010101010101010101010101
        // 0b01011101011101011111010101111101
        assert(d or Uint(e) == 0b01011101011101011111010101111101)
        // 0b01001100011100001111000001111101
        // 0b01010101010101010101010101010101
        // 0b00011001001001011010010100101000
        assert(d xor Uint(e) == 0b00011001001001011010010100101000)
        assert(d shl Uint(16) == 0b11110000011111010000000000000000.i())
        assert(d shr Uint(16) == 0b00000000000000000100110001110000)
        assert(d > Uint(d - 1))
        assert(d >= Uint(d))
    }

    @Test fun ulong() {

        /**
         * BUG, 0xffffffffffffffff is outside Long range
         * https://youtrack.jetbrains.com/issue/KT-4749
         */

        val max = "ffffffffffffffff".hl()

        assert(Ulong(Ulong.MAX_VALUE).v == max)
        assert(Ulong("18446744073709551615").v == max)

        var a = Ulong(Ulong.MAX_VALUE)

        assert(a.toBigInteger() == max.toUbigDec())
        assert(a.toDouble() == max.toUbigDec().toDouble())
        assert(a.toFloat() == max.toUbigDec().toFloat())
        assert(a.toLong() == max.toLong())
        assert(a.toInt() == max.toInt())
        assert(a.toChar() == max.toChar())
        assert(a.toShort() == max.toShort())
        assert(a.toByte() == max.toByte())

        assert(a.toUbyte() == Ubyte(max))
        assert(a.toUshort() == Ushort(max))
        assert(a.toUint() == Uint(max))

        var b = Ulong(1)
        var c = Ulong(0)

        assert(a + b == c)
        assert(a + 1 == c)

        c = Ulong("fffffffffffffffe", 16)

        assert(a - b == c)
        assert(a - 1 == c)

        // TODO underscore https://youtrack.jetbrains.com/issue/KT-2964

        a = Ulong("9000000000000000000")
        b = Ulong(2)
        c = Ulong("18000000000000000000")

        assert(a * b == c)
        assert(a * 2 == c)

        assert(c / b == a)
        assert(c / 2 == a)

        b = Ulong("17000000000000000000")
        c = Ulong("8000000000000000000")

        assert(b % a == c)
        assert(b % "9000000000000000000".l() == c)

        a = Ulong("1010101010101010101010101010101010101010101010101010101010101010", 2)
        b = Ulong("0000111100001111000011110000111100001111000011110000111100001111", 2)
        c = Ulong("0000101000001010000010100000101000001010000010100000101000001010", 2)

        assert(a and b == c)
        assert(a and "0000111100001111000011110000111100001111000011110000111100001111".bl() == c)

        // 1010101010101010101010101010101010101010101010101010101010101010
        // 0000111100001111000011110000111100001111000011110000111100001111
        // 1010111110101111101011111010111110101111101011111010111110101111
        c = Ulong("1010111110101111101011111010111110101111101011111010111110101111", 2)

        assert(a or b == c)
        assert(a or "1010111110101111101011111010111110101111101011111010111110101111".bl() == c)

        c = Ulong("1010010110100101101001011010010110100101101001011010010110100101", 2)

        assert(a xor b == c)
        assert(a xor "0000111100001111000011110000111100001111000011110000111100001111".bl() == c)

        a = Ulong("0100110001110000111100000111110000001111110000000111111100000000", 2)
        b = Ulong(32)
        c = Ulong("0000111111000000011111110000000000000000000000000000000000000000", 2)

        assert(a shl b.toInt() == c)
        assert(a shl 32 == c)

        c = Ulong("0000000000000000000000000000000001001100011100001111000001111100", 2)

        assert(a shr b.toInt() == c)
        assert(a shr 32 == c)

        b = Ulong("1011001110001111000011111000001111110000001111111000000011111111", 2)

        assert(a.inv() == b)

        a = Ulong("18000000000000000000")

        assert(a > Ulong("17999999999999999999"))
        assert(a > "17999999999999999999".l())
        assert(a >= a)
        assert(a >= "18000000000000000000".l())

        assert("ffffffffffffffff".hl() + Ulong(1) == 0L)
        assert("ffffffffffffffff".hl() - Ulong(1) == "fffffffffffffffe".hl())
        assert("9000000000000000000".l() * Ulong(2) == "18000000000000000000".l())
        assert("18000000000000000000".l() / Ulong(2) == "9000000000000000000".l())
        assert("17000000000000000000".l() % Ulong("9000000000000000000") == "8000000000000000000".l())

        var d = "1010101010101010101010101010101010101010101010101010101010101010".bl()
        var e = "0000111100001111000011110000111100001111000011110000111100001111".bl()

        assert(d and Ulong(e) == "0000101000001010000010100000101000001010000010100000101000001010".bl())
        assert(d or Ulong(e) == "1010111110101111101011111010111110101111101011111010111110101111".bl())
        assert(d xor Ulong(e) == "1010010110100101101001011010010110100101101001011010010110100101".bl())
        d = "0100110001110000111100000111110000001111110000000111111100000000".bl()
        assert(d shl Ulong(32).toInt() == "0000111111000000011111110000000000000000000000000000000000000000".bl())
        assert(d shr Ulong(32).toInt() == "0000000000000000000000000000000001001100011100001111000001111100".bl())
        assert(d > Ulong("0100110001110000111100000111110000001111110000000111111011111111", 2))
        assert(d >= Ulong(d))
    }

    @Test fun ushort() {

        assert(Ushort(0xffff).v == 0xffff.toShort())
        assert(Ushort(0b1111111111111111.s()).v == 0xffff.toShort())
        assert(Ushort("65535").v == 0xffff.toShort())

        var a = Ushort(0xffff)

        assert(a.toBigInteger() == BigInteger.valueOf(0xffff))
        assert(a.toDouble() == 0xffff.toDouble())
        assert(a.toFloat() == 0xffff.toFloat())
        assert(a.toLong() == 0xffff.toLong())
        assert(a.toInt() == 0xffff.toInt())
        assert(a.toChar() == 0xffff.toChar())
        assert(a.toShort() == 0xffff.toShort())
        assert(a.toByte() == 0xffff.toByte())

        assert(a.toUlong() == Ulong(0xffff))
        assert(a.toUint() == Uint(0xffff))
        assert(a.toUbyte() == Ubyte(0xffff))

        var b = Ushort(1)
        var c = Ushort(0)

        assert(a + b == c)
        assert(a + 1.s() == c)
        assert(a + 1 == c)

        c = Ushort(0xfffe)

        assert(a - b == c)
        assert(a - 1.s() == c)
        assert(a - 1 == c)

        a = Ushort(30000)
        b = Ushort(2)
        c = Ushort(60000)

        assert(a * b == c)
        assert(a * 2.s() == c)
        assert(a * 2 == c)

        assert(c / b == a)
        assert(c / 2.s() == a)
        assert(c / 2 == a)

        b = Ushort(50000)
        c = Ushort(20000)

        assert(b % a == c)
        assert(b % 30000.s() == c)
        assert(b % 30000 == c)

        a = Ushort(0b1010101010101010)
        b = Ushort(0b0000111100001111)
        c = Ushort(0b0000101000001010)

        assert(a and b == c)
        assert(a and 0b0000111100001111.s() == c)
        assert(a and 3855 == c)

        c = Ushort(0b1010111110101111)

        assert(a or b == c)
        assert(a or 0b1010111110101111.s() == c)
        assert(a or 44975 == c)

        c = Ushort(0b1010010110100101)

        assert(a xor b == c)
        assert(a xor 0b0000111100001111.s() == c)
        assert(a xor 3855 == c)

        a = Ushort(0b0100110000111101)
        b = Ushort(8)
        c = Ushort(0b0011110100000000)

        assert(a shl b == c)
        assert(a shl 8.s() == c)
        assert(a shl 8 == c)

        c = Ushort(0b0000000001001100)

        assert(a shr b == c)
        assert(a shr 8.s() == c)
        assert(a shr 8 == c)

        b = Ushort(0b1011001111000010)

        assert(a.inv() == b)

        a = Ushort(65500)

        assert(a > Ushort(65499))
        assert(a > 65499.s())
        assert(a > 65499)
        assert(a >= a)
        assert(a >= 65500.s())
        assert(a >= 65500)

        assert(0xffff.s() + Ushort(1) == 0.s())
        assert(0xffff.s() - Ushort(1) == 0xfffe.s())
        assert(30000.s() * Ushort(2) == 60000.s())
        assert(60000.s() / Ushort(2) == 30000.s())
        assert(65000.s() % Ushort(10000) == 5000.s())
        assert(0b1010101010101010.s() and Ushort(0b0000111100001111) == 0b0000101000001010.s())
        assert(0b1010101010101010.s() or Ushort(0b0000111100001111) == 0b1010111110101111.s())
        assert(0b1010101010101010.s() xor Ushort(0b0000111100001111) == 0b1010010110100101.s())
        assert(0b0100110000111101.s() shl Ushort(8) == 0b0011110100000000.s())
        assert(0b0100110000111101.s() shr Ushort(8) == 0b0000000001001100.s())
        assert(0b0100110000111101.s().inv() == 0b1011001111000010.s())
        assert(65500.s() > Ushort(65499))
        assert(65500.s() >= Ushort(65500))

        assert(0xffff + Ushort(1) == 0b10000000000000000)
        assert(0xffff - Ushort(1) == 0xfffe)
        assert(30000 * Ushort(2) == 60000)
        assert(60000 / Ushort(2) == 30000)
        assert(65000 % Ushort(10000) == 5000)
        assert(0b1010101010101010 and Ushort(0b0000111100001111) == 0b0000101000001010)
        assert(0b1010101010101010 or Ushort(0b0000111100001111) == 0b1010111110101111)
        assert(0b1010101010101010 xor Ushort(0b0000111100001111) == 0b1010010110100101)
        assert(0b0100110000111101 shl Ushort(8) == 0b010011000011110100000000)
        assert(0b0100110000111101 shr Ushort(8) == 0b1001100)
        assert(65500 > Ushort(65499))
        assert(65500 >= Ushort(65500))
    }
}