package org.levacher

fun main(args: Array<String>){
    for (hauteur in args){
        pyramide(hauteur.toInt())
    }
}

fun pyramide(hauteur:Int){
    for (i in 1..hauteur){
        println(
            " ".repeat(hauteur-i)+"*".repeat(1+(i-1)*2)
        )
    }
}