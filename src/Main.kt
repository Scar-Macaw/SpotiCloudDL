import java.io.File


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
firstSetup()
}

fun firstSetup(){
    print("What Is your File Path? ")
    var outDir = File(readln())
    while (!outDir.isDirectory || !outDir.exists()) {
        println("Path does not exist, or is not a valid directory, please input a new path")
        outDir = File(readln())
    }
    val tempOutPath = File("./output.txt")
    tempOutPath.writeText(outDir.getAbsolutePath())
}