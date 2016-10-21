/**
 * Created by GBarbieri on 05.10.2016.
 */

import glm.vec._2.*
import glm.vec._2.Vec2
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Vec2 {

    @Test fun operators() {

        run {
            var a = Vec2(1f)
            var b = Vec2(1f)

            assertTrue(a == b)
            assertFalse(a != b)
        }
        run {
            var a = Vec2(1f)
            var c = a + 1f
            a += 1f

            assertTrue(a == Vec2(2f))
            assertTrue(a == c)
        }
        run {
            var a = Vec2(1f)
            var b = Vec2(2f, -1f)
            var c = a + b
            a += b

            assertTrue(a == Vec2(3f, 0f))
            assertTrue(a == c)
        }
        run {
            var a = Vec2(1f)
            var c = a - 1f
            a -= 1f

            assertTrue(a == Vec2())
            assertTrue(a == c)
        }
        run {
            var a = Vec2(1f)
            var b = Vec2(2f, -1f)
            var c = a - b
            a -= b
            assertTrue(a == Vec2(-1f, 2f))
            assertTrue(a == c)
        }
        run {
            var a = Vec2(1f)
            var c = a * 2f
            a *= 2f

            assertTrue(a == Vec2(2f))
            assertTrue(a == c)
        }
        run {
            var a = Vec2(2f)
            var b = Vec2(2f)
            var c = a / b
            a /= b
            assertTrue(a == Vec2(1f))
            assertTrue(a == c)
        }
        run {
            var a = Vec2(1f, 2f)
            var b = Vec2(4f, 5f)

            var c = a + b
            assertTrue(c == Vec2(5f, 7f))

            var d = b - a
            assertTrue(d == Vec2(3f))

            var e = a * b
            assertTrue(e == Vec2(4f, 10f))

            var f = b / a
            assertTrue(f == Vec2(4f, 2.5f))

            var g = a + 1f
            assertTrue(g == Vec2(2f, 3f))

            var h = b - 1f
            assertTrue(h == Vec2(3f, 4f))

            var i = a * 2f
            assertTrue(i == Vec2(2f, 4f))

            var j = b / 2f
            assertTrue(j == Vec2(2f, 2.5f))

            var k = 1f + a
            assertTrue(k == Vec2(2f, 3f))

            var l = 1f - b
            assertTrue(l == Vec2(-3f, -4f))

            var m = 2f * a
            assertTrue(m == Vec2(2f, 4f))

            var n = 2f / b
            assertTrue(n == Vec2(.5f, 2f / 5f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = Vec2(4f, 5f)

            a += b
            assertTrue(a == Vec2(5f, 7f))

            a += 1f
            assertTrue(a == Vec2(6f, 8f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = Vec2(4f, 5f)

            b -= a
            assertTrue(b == Vec2(3f))

            b -= 1f
            assertTrue(b == Vec2(2f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = Vec2(4f, 5f)

            a *= b
            assertTrue(a == Vec2(4f, 10f))

            a *= 2f
            assertTrue(a == Vec2(8f, 20f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = Vec2(4f, 5f)

            b /= a
            assertTrue(b == Vec2(4f, 2.5f))

            b /= 2f
            assertTrue(b == Vec2(2f, 1.25f))
        }
        run {
            var b = Vec2(2f)

            b /= b.y
            assertTrue(b == Vec2(1f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = -a

            assertTrue(b == Vec2(-1f, -2f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = --a

            assertTrue(b == Vec2(0f, 1f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = a--

            assertTrue(b == Vec2(1f, 2f))
            assertTrue(a == Vec2(0f, 1f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = ++a

            assertTrue(b == Vec2(2f, 3f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = a++

            assertTrue(b == Vec2(1f, 2f))
            assertTrue(a == Vec2(2f, 3f))
        }
        run {
            var a = Vec2(1f, 2f)
            a addAss 1f

            assertTrue(a == Vec2(2f, 3f))
        }
        run {
            var a = Vec2(1f, 2f)
            var b = Vec2(3f, 4f)
            a addAss b

            assertTrue(a == Vec2(4f, 6f))
        }
    }
}