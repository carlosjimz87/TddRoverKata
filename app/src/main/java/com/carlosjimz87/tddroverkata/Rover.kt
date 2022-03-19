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
                        position = position.move(direction)
                    }
                }
            }
        }
        return "$position$direction"
    }


}