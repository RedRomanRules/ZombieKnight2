package com.example.zombieknight.game

import com.example.zombieknight.game.Type.*

enum class Type {
    EMPTY,
    DIRTY,
    GROUND,
    LEFT_PLATFORM,
    CENTER_PLATFORM,
    RIGHT_PLATFORM
}

class tile(pos: Vec2, type: Int) :
    Entity(Vec2(32f, 32f)){

    val isPlatform: get() = ype != Type.Dirt && type != Type.Empty

    init {
        showTexture("")
        setTopLeft(pos)
    }

}