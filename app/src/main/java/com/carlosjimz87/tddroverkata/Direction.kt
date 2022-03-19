package com.carlosjimz87.tddroverkata


private val DIRECTIONS = listOf(
    Direction.NORTH,
    Direction.EAST,
    Direction.SOUTH,
    Direction.WEST
)

enum class Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    private var pos:Int = this.ordinal

    fun right(): Direction {
        return DIRECTIONS[(pos + 1) % DIRECTIONS.size]
    }

    fun left(): Direction {
        return DIRECTIONS[if (pos > 0) pos - 1 else DIRECTIONS.size - 1]
    }

    override fun toString(): String {
        return when (this) {
            NORTH -> "N"
            EAST -> "E"
            SOUTH -> "S"
            WEST -> "W"
        }
    }
}