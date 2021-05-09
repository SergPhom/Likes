package ru.netology

fun likes(likesVal: Int): String{
    val likes = likesVal
    val userVal = if(likesVal.toString().reversed()[0] == '1'){
        "человеку"
    }else{
        "людям"
    }
    return "Понравилось $likesVal $userVal"
}

fun main() {
    println(likes(71))
    println(likes(45))
}