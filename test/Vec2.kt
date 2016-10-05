/**
 * Created by GBarbieri on 05.10.2016.
 */

import glm.vec._2.Vec2
import org.junit.Test as test
import org.junit.Assert.*

class Vec2 {

    @test fun test() {

        run {
            var a = Vec2(1.0f)
            var b = Vec2(1.0f)

            assertTrue(a == b)
            assertFalse(a != b)
        }
        run {
            var a = Vec2(1.0f)
            var c = a + 1.0f
            a += 1.0f

        }
    }
}