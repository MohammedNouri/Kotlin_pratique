package com.example.my_first_kotline

import java.util.Scanner
fun isoldEnough(age:Int):Boolean{
    return age>5
}
fun describePeople(name:String,age: Int,height:Float){
    val can = when(isoldEnough(age)){
        true -> "peut jouer"
        else -> "ne peut pas jouer"
    }
    println("$name a $age,de $height et $can")
}
fun describePeople(name:String,age: Int,height:Float,details:String ="Pas de details"){
    val can = when(isoldEnough(age)){
        true -> "peut jouer"
        else -> "ne peut pas jouer"
    }
    println("$name a $age,de $height et $can ,($details)")
}
fun main(){
    val age: Int =4
    val nom: String = "Mohammed"
    val height: Float = 1.6f
/*
    println("${nom.uppercase()} a ${age*2} ,${height} m")
    println("Les informations :"+"\nNom: ${nom}"+"\nAge: ${age}"+"\nHeight: ${height}")
    println("""Les informaton :
        |Nom : ${nom}
        |Age ; ${age}
        |Height ${height}
    """.trimMargin())
    var size: Double? = 65.0
    size = null
    println(size)
    val i:Int =14
    val boxI: Int? = i
    val anathoder: Int? = i
    val b:Int = 10000
    val boxB:Int? = b
    val anthodB:Int? =b

    println(boxI===anathoder)
    println(boxB===anthodB)
    if (age<10){
        println("${nom} is a child")
    }
    if (age >10 && height>1.5){
        println("${nom} can play ")
    }else{
        println("${nom} can't play")
    }
    if (nom=="Mohammed"){
        println("${nom} est un garcon")
    }else if(nom == "Sara"){
        println("${nom} est une fille")
    }else{
        println("le candidat ni garcon ni fille")
    }
    var type = if (age>10){
        "can play"
    }else if(age<5){
        "can't play"
    }else{
        "You are the Best "
    }
    println("${nom} ${type}")
    var scn = Scanner(System.`in`)
    println("Saisair votre age")
    var a = scn.nextInt()
    when(a){
        in 1..5 -> println("$nom est trop jeune")
        in 6..10 -> println("$nom peut jouer")
        !in 1..18 -> println("$nom ne peut pas")
        else -> println("non gérer")
    }
    var s = when(a){
        in 1..18 -> true
        else -> false
    }
    when(a){
        is Int -> true
    }
*/

describePeople(nom,age,height)
describePeople("Ayoub",18,1.8f,"Felicitation")
    for(i in 1..9){
        for(j in 1..9){
            println("${i} * ${j} = ${i*j}")
        }
    }
    var cars = arrayOf("Volvo","Ford","Mercedes","Audi")
    for(i in cars){
        println(i)
    }




}