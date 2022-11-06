fun main() {
    // Problem:
    // Write a program where you print the largest number among three numbers
    val n1 = 19
    val n2 = 30
    val n3 = 7

    if (n1 >= n2 && n1 >= n3) {
        println("$n1 is the largest")
    } else if(n2 >= n1 && n2 >= n3) {
        println("$n2 is the largest")
    } else {
        println("$n3 is the largest")
    }


}