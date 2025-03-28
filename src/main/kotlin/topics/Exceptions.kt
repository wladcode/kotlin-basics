package org.example.topics

fun usingTryAsExpresion():String{
    return try {
        "The value is ${10/0}"
    }catch (eror:ArithmeticException){
        "Error thrown ${eror.printStackTrace()}"
    }
}

fun main(){
    try {
        val message= "The value is ${10/0}"
    }catch (eror:Throwable){
        println("Error thrown")
    }

    println(usingTryAsExpresion())


}