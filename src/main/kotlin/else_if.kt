fun main() {
//    Problem
//    Write a program to print the grade of the students based on the percentage.
//    For 80% and above print Grade A
//    For 60% and above print Grade B
//    For 40% and above print Grade C
//    For Below 40%, print Fail


    val per = 25

    if (per >= 80) {
        println("Grade A")
    } else if (per >= 60) {
        println("Grade B")
    } else if (per >= 40) {
        println("Grade C")
    } else {
        println("Fail")
    }

}