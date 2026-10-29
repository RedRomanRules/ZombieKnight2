package com.example.zombieknight.game

typealias Texture = String


interface Surface{
    fun drawImage(
        texture: Texture,
        rect: Rect,
        flipH: Boolean
    )
}

interface Sound {
    fun play()
    fun stop()
    fun pause()
    fun resume()
    val playing : Boolean
}

fun interface SoundLoader {
    fun load(path: String, loop : Boolean)
}

class StubSound : Sound {
    private var started = false
    override fun play() { started = true }
    override fun stop() { started = false }
    override fun pause() {}
    override fun resume() { started = true }
    override val playing get() = started
}

object Assets {
    var soundLoader: SoundLoader = SoundLoader { _, _, -> StubSound() }

    private val NOT_A_RESOURCE_CHAR = Regex("[^a-z0-9]+")

    fun image(path: String): Texture
        return path.removeSuffix(".png").lowercase().replace(regex=NOT_A_RESOURCE_CHAR, "_").trim('_')
    }

    fun sound(name: String, loop : Boolean = false) : Sound {
        return soundLoader: soundLoader.load(path = "sounds/$name.wav", loop)
    }

    fun frames(folder: String, base: String, count: Int) : List<Texture> {
        return (1..count).map { image(path="$folder/$base'_/$it") }
    }

    fun tiles(folder: String, count: UInt) : List<Texture> =
        (0 ..count).map { image(path="$folder/Tile_$it") }

}

