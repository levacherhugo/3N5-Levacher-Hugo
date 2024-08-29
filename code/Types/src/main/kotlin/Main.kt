package org.levacher

fun main() {
    val a = 1                                   // type est int
    val aa = 1L                                 // type est long
    val aaa = a * 25 + aa * 100                 // type est long
    val b = 1.0                                 // type est float **Non, c'est double
    val c = "1"                                 // type est string
    val d = true                                // type est bool
    val laChose = c + b                         // type est string
    val k = listOf("1", "2", "3")               // type est list **preciser de string: list<String>
    val l = mutableListOf(true, false, true)    // type est mutableList **preciser de bool: mutableList<Boolean>
}