package org.example.topics.collections


fun usingArrays() {
    val ints = arrayOf(1, 2, 3, 4, 5, null)

    // For create with a size
    val nulls = arrayOfNulls<Int>(5);

    // Create an array with the values 0 to 4
    val custom = Array(5) { index ->
        index
    }

    //Size
    val sizeOfArray = ints.size;

    // Getting values
    var firstValue = ints.get(0);
    firstValue = ints[0]

    // Setting values
    ints.set(0, 99);
    ints[0] = 99

    // Primitives
    val primitiveInts = intArrayOf(1, 2, 3, 4, 5)
    val primitiveShorts = ushortArrayOf(1u, 2u)

    // Looping
    for (i in 0 until ints.size) {
        println(ints[i])
    }

    for (item in ints) {
        println(item)
    }

    ints.forEach { it -> println(it) }
}


fun greetThinks(greeting: String, items: Array<Any>) {
    for (item in items) {
        println("$greeting $item")
    }
}

fun greetThinksWithVars(greeting: String, vararg items: Any) {
    for (item in items) {
        println("$greeting $item")
    }
}


fun main() {
    println("-------------- ARRAYS --------------")
    usingArrays()


    greetThinks("Hi!", arrayOf("Python", "Java", "Kotlin"))
    greetThinksWithVars("Hi!", "Python 2", "Java 2", "Kotlin 2")


}
