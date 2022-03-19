package com.carlosjimz87.tddroverkata

class Rover {
    private var position: Position = Position()
    private var direction: Direction = Direction.NORTH

    fun execute(commands: String): String {

        if (commands.isNotEmpty()) {
            commands.forEach { c ->
                when (c) {
                    'R' -> {
                        direction = direction.right()
                    }
                    'L' -> {
                        direction = direction.left()
                    }
                    'M' -> {
                        position = move()
                    }
                }
            }
        }
        return "$position$direction"
    }

    fun move(): Position {
        when (direction) {
            Direction.EAST -> {
                val newPos = (position.x + 1) % MAX_WIDTH
                return Position(newPos,position.y)
            }
            Direction.WEST -> {
                val newPos = if (position.x > 0) position.x - 1 else MAX_WIDTH - 1
                return Position(newPos,position.y)
            }
            Direction.NORTH -> {
                val newPos = if (position.y > 0) position.y - 1 else MAX_HEIGHT - 1
                return Position(position.x,newPos)
            }
            Direction.SOUTH -> {
                val newPos = (position.y + 1) % MAX_HEIGHT
                return Position(position.x,newPos)
            }
        }
    }

    companion object {
        const val MAX_HEIGHT = 10
        const val MAX_WIDTH = 10
    }
}