package org.levacher

fun main(args: Array<String>){
    println(unUn(args[0]))
}

fun unUn(source:String):String{
    var count:Int=1;
    var newString:String=""
    for (i:Int in 1..source.length-1){
        if(source[i]==source[i-1]){
            count++
        }
        else{
            newString+=count.toString()+source[i-1]
            count=1
        }
    }
    newString+=count.toString()+source.last()
    return newString
}