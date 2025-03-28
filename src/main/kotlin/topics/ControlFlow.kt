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
    println( usingIfAsExpression(-5))
    println( usingIfAsExpression(18))
    println( usingIfAsExpression(30))

    println("---- usingWhenAsExpression ----")
    println( usingWhenAsExpression(-5))
    println( usingWhenAsExpression(18))
    println( usingWhenAsExpression(30))


}