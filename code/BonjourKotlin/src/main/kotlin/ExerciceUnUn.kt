package org.levacher

fun main(args: Array<String>){
    println(unUn(args[0]))
}

fun unUn(source:String):String{
    var previous:Char?=null
    var count:Int=1;
    var newString:String=""
    for (i:Int in source.indices){
        val c:Char=source[i]
        if(previous==null){
            previous=c
        }
        else{
            if(c==previous){
                count++
            }
            else{
                newString+=count.toString()+previous.toString()
                previous=c
                count=1
            }
            if(i==source.length-1){
                newString+=count.toString()+previous.toString()
            }
        }
    }
    return newString
}