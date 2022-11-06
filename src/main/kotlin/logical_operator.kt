fun main() {
    // Logical Operator
    // &&	- Returns true if all condition is true
    // ||   - Returns true if any of the condition is true

    // Problem
    //1.  Print "The office is open" if the hour is between 10 and 18(6PM)

//    val hour = 19
//    if(hour >= 10 && hour <= 18) {
//        println("The office is open")
//    } else {
//        println("The office is closed")
//    }




    //2.  Print "The office is closed" if the hour is below 10 or above 18(6PM)
    val hour = 12
    if(hour < 10 || hour > 18) {
        println("The office is closed")
    } else {
        println("The office is open")
    }
}