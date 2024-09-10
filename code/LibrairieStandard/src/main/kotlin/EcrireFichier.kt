package org.levacher

import java.io.File

fun main(){
    val fichierVide: File =File("vide.txt")
    fichierVide.createNewFile()

    val fichierNom:File=File("../nom.txt")
    fichierNom.writeText("Hugo Levacher")
}