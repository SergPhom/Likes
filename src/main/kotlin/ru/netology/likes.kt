package ru.netology

fun likes(likesCount: Int): String{
    val userCountEndWithOne = "человеку"
    val anotherUserCount = "людям"
    val userCount = if(likesCount%10 == 1){
        userCountEndWithOne
    }else{
        anotherUserCount
    }
    return "Понравилось $likesCount $userCount"
}

fun main() {
    println(likes(71))
    println(likes(45))
}