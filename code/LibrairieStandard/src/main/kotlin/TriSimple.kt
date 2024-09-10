package org.levacher

fun main(){
    val maListe: List<Double> = listOf(0.1, 12.34, -0.1234, 3.1416)
    println(triInverseALaMain(maListe))
    println(triInverse(maListe))
}

fun triInverseALaMain(liste: List<Double>):List<Double> {
    var lst:MutableList<Double> = mutableListOf()
    for(i in liste.size-1 downTo 0){
        lst.add(liste[i])
    }
    return lst
}

fun triInverse(liste: List<Double>):List<Double>{
    return liste.reversed()
}