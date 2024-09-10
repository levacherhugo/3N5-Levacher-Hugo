package org.levacher

import java.io.File

fun main(args:Array<String>){
    var s:String=""
    for (fichier in args){
        try{
            val fichier: File =File(fichier)
            s+=fichier.readText()+"\n-------------------\n"
        }catch (e:Exception){
            s+="Impossible de lire $fichier\n-------------------\n"
        }
    }
    println(s)
}