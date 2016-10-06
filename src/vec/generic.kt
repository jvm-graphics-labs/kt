package vec

/**
 * Created bY GBarbieri on 05.10.2016.
 */

abstract class Vec2t<T : Number>(open var x: T, open var y: T) {

    fun length() = 2
}

abstract class Vec3t<T : Number>(override var x: T, override var y: T, open var z: T) : Vec2t<T>(x, y)

abstract class Vec4t<T : Number>(override var x: T, override var y: T, override var z: T, open var w: T) : Vec3t<T>(x, y, z)