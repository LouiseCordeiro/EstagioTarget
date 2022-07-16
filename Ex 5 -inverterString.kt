fun main() {
    var userInput = readLine()!!
 
    var reversedUserInput = reverseString(userInput)
 
    println(reversedUserInput)
}

fun reverseString(userInput: String): String {
    val chars = CharArray(userInput.length)
    userInput.indices.forEach { chars[userInput.length - it - 1] = userInput[it] }
    return String(chars)
}