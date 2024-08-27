fun main(args: Array<String>) {
    if(args.isNotEmpty()){
        for(i in 1..args[0].toInt()){
            var s:String="";
            for(j in 1..i){
                s+="*";
            }
            println(s);
        }
    }
}