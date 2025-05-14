package main.kotlin

open class Song {
    var name: String = ""
    var album: String = ""
    var artist: String = ""
    var genre: String = ""
    var trackNo: Int = 0
    var year: Int = 0
    var discNo: Int = 0

    open fun getInfo(url: String) {
    }
}