package org.example.topics

fun checkType(input: Any?) {

    if (input is String?) {

        if (input == null) {
            println("It is null")
        } else {
            println("$input is a string, the lenght is ${input.length}")
        }
    } else if (input is Int) {
        println("$input is a integer, $input")
    } else {
        println("NO CONFIGURATED")
    }
}

fun main() {
    val genericVarible: Any = 5
    var intGenericVariable: Int = genericVarible as Int


    checkType("Hola")
    checkType(15)
    checkType(null)
}
