package com.carlosjimz87.tddroverkata

class Rover {
    private val x = 0
    private val y = 0
    private var d = 0
    private val directions = listOf("N", "E", "S", "W")

    fun execute(commands: String): String {
        if (commands.isNotEmpty()) {
            commands.forEach { c ->
                when (c) {
                    'R' -> rotateRight()
                    'L' -> rotateLeft()
                }
            }
        }

        return "$x:$y:${directions[d]}"
    }

    private fun rotateRight() {
        d = (d + 1) % directions.size
    }

    private fun rotateLeft() {
        d = if (d > 0) d - 1 else directions.size - 1
    }

    companion object {
        const val MAX_HEIGHT = 10
        const val MAX_WIDTH = 10
    }
}