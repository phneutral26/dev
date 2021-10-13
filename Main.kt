fun main() {
    println("Hello to my first Application! \nP.S: Please start your Answers with an Uppercase...")
    println("What is your Name? I herewith want to know it: ")
    var userName = readLine()
    println("Oh, $userName, what a wonderful Name! \nI suppose you must be popular in school. Are you? ")
    var popular = readLine()
    val popularTOF = if (popular == "Yes") "True" else "False"
    print(popularTOF)
}
