package org.levacher

fun main() {
    println("Veuillez entrer un nombre :")
    while (true) {
        try {
            val nb: Int = readln().toInt()
            println("Merci, votre nombre est $nb.")
            return
        } catch (e: Exception) {
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }
    }

}