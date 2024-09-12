package org.levacher

import org.apache.commons.validator.routines.EmailValidator

fun main(){
    val emaillist:List<String> = listOf("jo@pipo.org","ma_mu@m.ca","a.a@a.ca","a.a@a.aa","ab@ab","a.b@ab","jo")
    for(email in emaillist){
        val validator = EmailValidator.getInstance()
        if (validator.isValid(email)){
            println("Ok: $email")
        }
        else{
            println("Ko: $email")
        }
    }
}