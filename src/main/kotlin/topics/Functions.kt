package org.example.functions

import java.awt.Stroke

private fun getGretting(): String {
    return "Hello World!"
}

fun customGreetting(great: String = "Default greet", name: String) = "It is a greet: $great for $name"


// Functional function
var greetingFunction: (String) -> String = {
    println("GREETIN FUNCTION: $it")

    "TYPE $it"

}

fun printCalculatedValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println("The value is: ${calculator(value1, value2)}")
}

fun formatFullName(name: String, lastname: String, format: (String, String) -> String): String {
    return "The full name is:${format(name, lastname)}"
}

fun main() {
    fun getGrettingInternal() = "Hello kotlin!"

    println(getGretting())
    println(getGrettingInternal())
    println(customGreetting("Hi there", "Wladimir"))
    println(customGreetting(name = "Mari"))

    // Functional types
    greetingFunction("Wladimir")
    greetingFunction = { field ->
        println("reassig the value of the function $field")
        "resing $field"
    }
    greetingFunction.invoke("Lopez")


    // HIGER-ORDER Functions
    printCalculatedValue(2, 2) { value1, value2 ->
        value1 + value2
    }

    printCalculatedValue(2, 2, { value1, value2 ->
        value1 - value2
    })

    //HighOrder funtion to format the full name
    val format1 = formatFullName("Wilson", "Lopez", { value1, valu2 ->
        value1.lowercase() + " - " + valu2.uppercase();
    })

    val format2 = formatFullName("Amy", "Angelith") { name, lastname ->
        "${lastname.uppercase()}  --- ${name.uppercase()}"

    }

    println(format1)
    println(format2)

}
