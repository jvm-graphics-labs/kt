/**
 * Created by GBarbieri on 05.10.2016.
 */

object Semantic {

    object Attr {

        val POSITION = 0
        val NORMAL = 1
        val COLOR = 3
        val TEX_COORD = 3
        val DRAW_ID = 4
    }

    object Buffer {

        val STATIC = 0
        val DYNAMIC = 1
    }

    object Frag {

        val COLOR = 0
        val RED = 0
        val GREEN = 1
        val BLUE = 2
        val ALPHA = 0
    }

    object Image {

        val DIFFUSE = 0
        val PICKING = 1
    }

    object Object {

        val VAO = 0
        val VBO = 1
        val IBO = 2
        val TEXTURE = 3
        val SAMPLER = 4
        val SIZE = 5
    }

    object Renderbuffer {

        val DEPTH = 0
        val COLOR0 = 1
    }

    object Sampler {

        val DIFFUSE = 0
        val POSITION = 4
        val TEXCOORD = 5
        val COLOR = 6
    }

    object Storage {

        val VERTEX = 0
    }

    object Uniform {

        val MATERIAL = 0
        val TRANSFORM0 = 1
        val TRANSFORM1 = 2
        val INDIRECTION = 3
        val CONSTANT = 0
        val PER_FRAME = 1
        val PER_PASS = 2
        val LIGHT = 3
    }

    object Vert {

        val POSITION = 0
        val COLOR = 3
        val TEXCOORD = 4
        val INSTANCE = 7
    }

    object Stream {

        val _0 = 0
        val _1 = 1
    }
}