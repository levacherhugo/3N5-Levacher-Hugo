fun main(args: Array<String>) {
    if(args.isNotEmpty()){
        for(i in 1..5){
            println(triangle(args[0].toInt()))
        }
    }
}

fun triangle(hauteur : Int) : String {
    var s:String=""
    for(i in 1..hauteur){
        s+="*".repeat(i)+"\n"
    }
    return s
}