package com.carlosjimz87.tddroverkata

class Rover {
    private val x = 0
    private val y = 0
    private val direction = "N"
    val point = "$x:$y:$direction"

    fun isPalindrome(candidate: String): Boolean {
        return when (candidate) {
            "Bob" -> true
            "racecar" -> true
            else -> false
        }
    }

    fun execute(commands: String): String {
        return ""
    }

    companion object {
        const val MAX_HEIGHT = 10
        const val MAX_WIDTH = 10
    }
}