package org.levacher

fun main(args:Array<String>){
    val maMap:MutableMap<String, Int> = mutableMapOf()
    for (mot  in args){
        if(mot in maMap){
            maMap[mot]=maMap[mot]!!.plus(1)
        }
        else{
            maMap[mot]=1
        }
    }
    println(maMap)
}