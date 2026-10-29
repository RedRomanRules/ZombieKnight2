package com.example.zombieknight.game

class Vec2(var x: Float, var y: Float) {
    operator fun plus(other: Vec2) = Vec2(x + other.x, y + other.y)
    operator fun minus(other: Vec2) = Vec2(x + other.x, y + other.y)
    operator fun unaryMinus() = Vec2(-x, -y)
    operator fun times(k: Float) = Vec2(x * k, y * k)
    override fun toString() = "($x, $y)"
}

operator fun Float.times(v: Vec2) = Vec2(x=v.x * this, y=v.y * this)

fun main() {
    var x = Vec2(x= 3.0f, y= 4.0f)
    var y = Vec2(x= 5.0f, y= 8.0f)
    var sum = x + y
    var product = 2.0 * x
    var otherProduct = 3.0f * x
    var negativeX = -x;
    println(x)
}