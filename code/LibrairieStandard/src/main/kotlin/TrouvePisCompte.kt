package org.levacher

fun main(){
    val what: List<List<Int>> = listOf(
        listOf(2,5,7,8,6,2,4),
        listOf(6,6,6,9,9,9),
        listOf(1,2,3,4,5,6,7,8,9,10,1,2,3),
    )

    for (lst:List<Int> in what){
        println(trouveALaMain(2,lst))
        println(trouve(2,lst))
        println(compteALaMain(2,lst))
        println(compte(2,lst))
        println("================================")
    }
}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean{
    for (nombre in liste){
        if(nombre==element){
            return true
        }
    }
    return false
}

fun trouve(element: Int, liste: List<Int>): Boolean{
    return element in liste
}

fun compteALaMain(element: Int, liste: List<Int>): Int{
    var count:Int=0
    for (nombre in liste){
        if(nombre==element){
            count++
        }
    }
    return count
}

fun compte(element: Int, liste: List<Int>): Int{
    return liste.count {it==element}
}