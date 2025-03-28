package org.example.topics

fun usingIf(value: Int) {
    if (value <= 0) {
        println("It is cold")
    } else if (value < 25) {
        println("It is fresh")
    } else {
        println("SUPER HIGH TEMPERATURE!")
    }
}

fun usingWhen(value: Int) {

    // FIRST FORM
    when {
        value <= 0 -> println("It is cold")
        value < 25 -> println("It is fresh")
        else -> println("SUPER HIGH TEMPERATURE!")
    }
}

fun usingIfAsExpression(value: Int): String {
    return if (value <= 0) {
        "It is cold"
    } else if (value < 25) {
        "It is fresh"
    } else {
        "SUPER HIGH TEMPERATURE!"
    }
}

fun usingWhenAsExpression(value: Int): String {
    return when {
        value <= 0 -> "It is cold"
        value < 25 -> "It is fresh"
        else -> "SUPER HIGH TEMPERATURE!"
    }
}

fun usingWhile() {
    var counter = 0
    while (counter < 10) {
        println("the counter is: $counter")

        if (counter == 3) {
            println("BREAK at: $counter")
            break
        }
        counter++
    }
}

fun usingDoWhile() {
    var counter = 0
    do {
        println("the counter is: $counter")

        if (counter == 3) {
            println("BREAK at: $counter")
            break
        }
        counter++
    } while (counter < 10)
}

fun usingFor(){
    println("right not included")
    for (i in 0 until 10) println("counter $i")

    println("right included")
    for (i in 0 .. 10) println("counter $i")

    println("down to, included")
    for (i in 10 downTo 0) println("counter $i")

    println("down to, included, with step")
    for (i in 10 downTo 0 step 2) println("counter $i")
}


fun main() {

    // USE OF if
    println("---- usingIf ----")
    usingIf(-5)
    usingIf(18)
    usingIf(30)

    // USE OF when
    println("---- usingWhen ----")
    usingWhen(-5)
    usingWhen(18)
    usingWhen(30)

    println("---- usingIfAsExpression ----")
    println(usingIfAsExpression(-5))
    println(usingIfAsExpression(18))
    println(usingIfAsExpression(30))

    println("---- usingWhenAsExpression ----")
    println(usingWhenAsExpression(-5))
    println(usingWhenAsExpression(18))
    println(usingWhenAsExpression(30))

    println("---- usingWhile ----")
    usingWhile()

    println("---- usingDoWhile ----")
    usingDoWhile()

    println("---- usingFor ----")
    usingFor()

}