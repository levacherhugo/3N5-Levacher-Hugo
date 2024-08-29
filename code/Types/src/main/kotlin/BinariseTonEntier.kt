package org.levacher

import com.sun.jdi.IntegerType

fun main(args: Array<String>){
    try {
        println(Integer.toBinaryString(args[0].toInt()))
    } catch (e: Exception) {
        println("L'argument entré n'est pas valide")
    }
}