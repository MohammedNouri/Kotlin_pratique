package com.example.my_first_kotline

class Perssone(var nom:String,var age:Int){
    //Constructeur
    init {
        var n:String=""
        var a=age
        when(a){
            in 1..9 -> n="il faut avoir sup"
            !in 1..9 -> n=nom
        }

        println("${n} de l'age  ${a}")
    }
    fun Afficher(){
        println("${nom} de l'age ${age}")
    }
}

fun main() {
    var p1=Perssone("Mohammed",8)
    var  p2=Perssone("Hamza",24)
    p1.Afficher()
}