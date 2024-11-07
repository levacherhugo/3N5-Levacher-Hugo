package org.levacher

fun main() {
    val array = arrayOf("Camion","Voiture","Moto","Autobus","Avion","Bateau");
    try {
        println(trouveru(array,"Avion"));
    }catch (e:Exception){
        println(e.message);
    }
    try {
        println(trouveru(array,"Erreur"));
    }catch (e:Exception){
        println(e.message);
    }
}

fun trouveru(tab:Array<String>, recherche:String):Int{
    for(i in tab.indices){
        if(tab[i] ==recherche){
            return i
        }
    }
    throw NotFoundException();
}