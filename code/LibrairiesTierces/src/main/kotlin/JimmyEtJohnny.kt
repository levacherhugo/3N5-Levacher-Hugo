package org.levacher

import java.io.File
import java.io.FileNotFoundException

fun main(){
    println("Code de jimmy: ")
    lireDesFichiersJimmy()

    println("Code de johnny")
    lireDesFichiersJohnny()
}

fun lireDesFichiersJimmy() {
    for (i in 0 until 10) {
        try {
            lireFichier(i)
            println("fichier $i lu par Jimmy")
        } catch (e: FileNotFoundException) {
            println("fichier $i n'existe pas Jimmy")
        }
    }
}



fun lireDesFichiersJohnny() {
    var cpt = 0
    try {
        for (i in 0 until 10) {
            lireFichier(i)
            cpt = i
            println("fichier $i lu par Johnny")
        }
    } catch (e: FileNotFoundException) {
        println("fichier $cpt n'existe pas Johnny")
    }
}

fun lireFichier(i: Int) {
    val fichier = File(i.toString())
    fichier.readLines()
}