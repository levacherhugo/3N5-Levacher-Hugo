package org.levacher

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main(args:Array<String>) {
    val doc:Document =Jsoup.connect(args[0]).get()
    val lstLink:List<Element> = doc.select("a")
    for (link in lstLink){
        println("${link.text()}: ${link.attr("href")}")
    }
}