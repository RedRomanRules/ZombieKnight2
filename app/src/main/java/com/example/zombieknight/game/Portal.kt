package com.example.zombieknight.game

class Portal (
    pos: Vec2,
    color: String
) : Entity(size=Vec2(x=72f, y=72f)) {

    init{
        currentSprite = 0F
        showTexture("")
        setBottomLeft(pos)
    }

    fun update(){

    }

}