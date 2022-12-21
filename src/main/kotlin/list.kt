fun main() {
    // Immutable Lists: Cannot be Modified
    // Values are called element
    // Every element has an Index
    // Index start from 0
                           //0      //1     //2     //3
    val fruits = listOf("Apple", "Mango", "Banana", "Pineapple")
    println(fruits)
    println(fruits[1])
    println(fruits[0])
    println(fruits.get(2))
    println(fruits.size)
    println(fruits.first())
    println(fruits.last())
    println(fruits.indexOf("Mango"))
    println(fruits.contains("Grapes"))

    val nums = listOf(34, 12, 56, 36, 90, 56, 45)
    println(nums.sorted())
    println(nums.sortedDescending())
    println(nums)
}