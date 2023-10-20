package com.example.my_first_kotline

open class Person(var name:String,var age:Int){
    init {
        println("Person created")
    }open fun affichInfos(){
        println("$name de l'age $age")
    }
}
class Student(name: String,age: Int,var moy:Float):Person(name,age){
    init {
        println("Student created")
    }

    override fun affichInfos() {
        println("$name de l'age $age la moyenne $moy ")

    }
}

fun main() {
    var s1 = Student("Mohammed",17,15.96f)
    var s2:Person = Student("Najwa",21,16.23f)
    s1.affichInfos()
    s2.affichInfos()
}