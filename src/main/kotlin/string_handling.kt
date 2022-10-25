fun main() {
    val name = "Shubham Saurav"
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    val firstName = "Shubham"
    val lastName = "Saurav"
    val fullName = firstName + " " + lastName
    println(fullName)
    println(name.get(3))
    println(name.subSequence(0, 7))
    println(name.compareTo(firstName))
}