fun main() {
    // FizzBuzz Problem
    // Write a program where you have a number n.
    // If n is divisible by both 3 and 5 then print "FizzBuzz"
    // If n is divisible by only 3 then print "Fizz"
    // If n is divisible by only 5 then print "Buzz"
    // If n is not divisible by both 3 and 5 then print the value of n


    val n = 17

    if(n % 3 == 0 && n % 5 == 0) {
        println("FizzBuzz")
    } else if(n % 3 == 0) {
        println("Fizz")
    } else if(n % 5 == 0) {
        println("Buzz")
    } else {
        println(n)
    }
}