package org.levacher

fun main(args: Array<String>){
    val maList: List<String> = sequence(args[0],args[1].toInt())
    for (item : String in maList){
        println(item)
    }
}

fun sequence(source: String, longueur: Int): List<String>{
    var maList: MutableList<String> = mutableListOf(source)
    for (i:Int in 1..<longueur){
        maList.add(unUn(maList[maList.size-1]))
    }
    return maList
}