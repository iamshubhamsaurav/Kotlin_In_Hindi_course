fun main() {
//    val n = -2
//    when(n) {
//        1,2,3,4,5 ->
//        {
//            println("BuildWithShubham")
//        }
//        -1 -> {
//            println("-1")
//        }
//        -2,-3,-4 -> println("Negative num")
//    }
    val n = 101
    when(n) {
        in 1..100 -> {
            println("n is between 1 and 100")
        }
        in 101..200 -> {
            println("n is between 101 and 200")
        }
    }

}