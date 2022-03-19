package com.carlosjimz87.tddroverkata

class Position(
    val x: Int = 0,
    val y: Int = 0
) {
    override fun toString(): String {
        return "$x:$y:"
    }
}