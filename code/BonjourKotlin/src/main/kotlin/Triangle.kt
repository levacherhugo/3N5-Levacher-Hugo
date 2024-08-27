fun main(args: Array<String>) {
    if(args.isNotEmpty()){
        for(i in 1..args[0].toInt()){
            println("*".repeat(i))
        }
    }
}