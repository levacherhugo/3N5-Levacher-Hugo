package org.levacher

import kotlin.random.Random

fun main(args: Array<String>){
    val resultat=moyenneMinMax(creeTableauAleatoire(5))
    println("Min:"+resultat[0])
    println("Max:"+resultat[1])
    println("Moyenne:"+resultat[2])

}

fun creeTableauAleatoire(n: Int): Array<Int> {
    var tableau: Array<Int> = Array(n) {0}
    for (i in 1..n){
        tableau[i-1]= Random.nextInt(0,100)
    }
    return tableau
}

fun moyenneMinMax(tableau: Array<Int>): Array<String>{
    var min=100
    var max=0
    var total:Double=0.0
    for (nombre in tableau){
        if(nombre<min) min=nombre
        if(nombre>max) max=nombre
        total+=nombre
    }
    return arrayOf(min.toString(),max.toString(), (total/tableau.size).toString())
}