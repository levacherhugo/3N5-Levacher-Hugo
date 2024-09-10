package org.levacher

fun main(){
    println(repete(4,2))
    println(repete(3,3))
}

fun repete(n:Int, nombreFois:Int):List<Int>{
    val lst:MutableList<Int> = mutableListOf()
    for(i in 1..n){
        for(j in 1..nombreFois){
            lst.add(i)
        }
    }
    return lst
}