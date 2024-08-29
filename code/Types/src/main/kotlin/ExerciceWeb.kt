package org.levacher

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
fun main(args: Array<String>){
    try {
        val url = args[0]
        val document: Document = Jsoup.connect(url).get()
        val html = document.html()
        print(html)
    } catch (e:Exception){
        println("L'URL fourni n'est pas valide")
    }

}