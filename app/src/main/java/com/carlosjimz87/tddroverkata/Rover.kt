package com.carlosjimz87.tddroverkata

class Rover {
    private val x = 0
    private val y = 0
    var direction: Direction = Direction.NORTH

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
                }
            }
        }
        return "$x:$y:$direction"
    }

    companion object {
        const val MAX_HEIGHT = 10
        const val MAX_WIDTH = 10
    }
}