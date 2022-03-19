package com.carlosjimz87.tddroverkata

class Position(
    private val x: Int = 0,
    private val y: Int = 0
) {
    companion object {
        const val MAX_HEIGHT = 10
        const val MAX_WIDTH = 10
    }

    override fun toString(): String {
        return "$x:$y:"
    }
    
    fun move(dir:Direction): Position {
        return when (dir) {
            Direction.EAST -> {
                Position(inc(this.x ,MAX_WIDTH), this.y)
            }
            Direction.WEST -> {
                Position(dec(this.x, MAX_WIDTH), this.y)
            }
            Direction.NORTH -> {
                Position(this.x, dec(this.y, MAX_HEIGHT))
            }
            Direction.SOUTH -> {
                Position(this.x, inc(this.y, MAX_HEIGHT))
            }
        }
    }

    private fun inc(value:Int ,max: Int): Int {
        return (value + 1) % max
    }

    private fun dec(value:Int ,max: Int): Int {
        return if (value > 0) value - 1 else max - 1
    }
}