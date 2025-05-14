package main.kotlin

import java.io.File

fun main() {
    if (!File("./outputPath.txt").exists() || File("./outputPath.txt").length() <= 2) {
        firstSetup()
    }
    setup()
}

/**
 * First time setup function
 */
fun firstSetup(){
    print("What Is your File Path? ")
    var outDir = File(readln())
    while (!outDir.isDirectory || !outDir.exists()) {
        println("Path does not exist, or is not a valid directory, please input a new path")
        outDir = File(readln())
    }
    val tempOutPath = File("./outputPath.txt")
    tempOutPath.writeText(outDir.absolutePath)
}


fun setup(): String{
    val outPath = File("./outputPath.txt")
    return outPath.readLines()[0]
}

fun getLink(url: String){

}