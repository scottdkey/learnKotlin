@file:JvmName("DisplayFunctions")
package rsk

fun main(args:Array<String>){
    log("Hello, World")
}

@JvmOverloads
fun log(message: String, logLevel:Int =1){
    println(message + logLevel)
}


