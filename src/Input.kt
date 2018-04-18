import java.io.File
import java.io.InputStream

class Input(val filename: String) {

    val file: File = File(System.getProperty("user.dir") + "/" + filename)

    fun readLines(): List<String> = file.readLines()

    fun read(): String = file.readText()

    fun readInts(): List<Int> = read().map(Character::getNumericValue)

    fun readIntsLists(): List<List<Int>> = readLines().map { it.split("\t").map { it.toInt() } }
}