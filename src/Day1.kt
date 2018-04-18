fun main(args: Array<String>) {
    val input = Input("Day1.txt").readInts()
    val partOne = partOne(input)
    val partTwo = partTwo(input)

    println("Part 1: $partOne")
    println("Part 2: $partTwo")
}

fun partOne(input: List<Int>): Int {
    var sum = 0
    for (i in 0 until input.size - 1) if (input[i] == input[i+1]) sum += input[i]
    if (input.first() == input.last()) sum += input.first()
    return sum
}

fun partTwo(input: List<Int>): Int {
    val halfSize = input.size / 2
    var sum = 0
    for (i in 0 until halfSize) if (input[i] == input[i+halfSize]) sum += input[i]*2
    return sum
}