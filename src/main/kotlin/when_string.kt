fun main() {
    val n1 = 90
    val n2= 56
    val operation = "sudfb"
    var res = 0
    when(operation) {
        "add" -> res = n1 + n2
        "sub" -> res = n1 - n2
        "mul" -> res = n1 * n2
        "div" -> res = n1 / n2
        else -> println("Invalid operation")
    }
    println("Result: ${res}")
}