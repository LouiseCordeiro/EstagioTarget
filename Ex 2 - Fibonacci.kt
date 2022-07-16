fun main() {
    val input = Scanner(System.`in`)
    println("Enter positive number :")
    val inputNumber = input.nextInt()
    var firstNumber = 0
    var secondNumber = 1
    var thirdNumber = 0
    while (thirdNumber < inputNumber) {
        thirdNumber = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = thirdNumber
    }
    if (thirdNumber == inputNumber) {
        println("Número pertence à sequencia Fibonacci")
    } else {
        println("Número não pertence à sequencia Fibonacci")
    }
}