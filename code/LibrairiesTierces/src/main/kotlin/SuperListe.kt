package org.levacher

import org.magicwerk.brownies.collections.GapList
import java.util.LinkedList
import kotlin.random.Random

fun main(){
    println("LinkedList")
    testeCetteListe(LinkedList<Int>())
    println("ArrayList")
    testeCetteListe(ArrayList<Int>())
    println("GapList")
    testeCetteListe(GapList<Int>())
}

fun testeCetteListe(liste: MutableList<Int>) {
    val random: Random = Random(1234)
    val a = System.currentTimeMillis()

    // ajouter 100 000 elements en dernière position liste.add(nombre);
    for(nombre in  1..100000){
        liste.add(nombre)
    }
    val b = System.currentTimeMillis()

    // ajouter 100 000 elements en première position liste.add(0, nombre);
    for(nombre in  1..100000){
        liste.add(0,nombre)
    }
    val c = System.currentTimeMillis()

    // ajouter 100 000 elements position au hasard liste.add(random.nextInt(liste.size + 1), nombre);
    for(nombre in  1..100000){
        liste.add(random.nextInt(liste.size + 1), nombre);
    }
    val d = System.currentTimeMillis()

    // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
    println("Temps dernière position:${b-a}")
    println("Temps première position:${c-b}")
    println("Temps random position:${d-c}")
}