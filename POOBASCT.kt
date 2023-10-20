package com.example.my_first_kotline

class POOBASCT(var name:String , var age:Int , var heigth:Float) {
    constructor(a: Int,h:Float):this("Mohammed yassine",a,h)
    constructor(a:Int):this("Douirek",a,1.8f)
    constructor(a:String):this(a,14,1.8f)
    init {
        var canPlayer = age>5 && heigth>1.5f
        var msg = when(canPlayer){
            true->"Can play basketball"
            else->"Can't play basketball"

        }
        println("$name de l'age $age , $msg")
       /* if (age<5 || heigth<1.5f){
            println("$name can't play Bascketball")
        }else{
            println("$name can play Bascketball")
        }*/
    }
}

fun main() {
    var p1= POOBASCT("Mohammeed",20,1.8f)
    var p2= POOBASCT("NAjwa",4,1.8f)
    var p3= POOBASCT("Hamza",20,1.4f)
    var p4= POOBASCT("Sara",14,1.6f)
    var p =POOBASCT(16)
}