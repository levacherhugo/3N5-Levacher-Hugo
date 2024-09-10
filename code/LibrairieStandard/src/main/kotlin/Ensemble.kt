package org.levacher

fun main(args:Array<String>){
    val mySet:Set<String> = args.toSet()
    for (mot in mySet.toList().sorted()){
        println(mot)
    }
}