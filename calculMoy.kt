package com.example.my_first_kotline

import java.util.Scanner
// Exercice 2
class Animal(var nom:String,var age:Int){
    fun afiicherDetails(){
        println("$nom de l'age $age")
    }
}
// Exercice3
open class CompteBancaire(var titulaire:String,var solde:Double){
    constructor(t:String):this(t,1000.0)
    constructor(s:Double):this("Compte1",s)
    open fun depot(mt:Double){
      if (mt<0){
          println("Motant est negatif")
      }else{
          solde+=mt
          println("Solde de compte est : ${solde}")
      }
    }
    open fun retrait(mt: Double){
        if (mt<0){
            println("Motant est negatif")
        }else if (mt>solde){
            println("le solde soit suffisant")
        }else{
            solde-=mt
            println("le solde de compte est : ${solde}")
        }
    }
    open fun afficherSolde(){
        println("Compte : ${titulaire} Solde : ${solde}")
    }
}
open class Forme(var couleur:String){
    open fun afficherCouleur(){
        println("$couleur")
    }

}
class Cercle(couleur: String,var rayon:Double ):Forme(couleur){
    val pi :Double=3.14
    /*val air:Double //getters
        get() = this.rayon*this.rayon*pi*/
    fun calculAir():Double{
        var air:Double = rayon*rayon*pi
        return  air
    }
    override fun afficherCouleur() {
        super.afficherCouleur()
    }
}
class Rectangle(couleur: String,var largeur:Double,var hauteur:Double):Forme(couleur) {
    fun calculAir(): Double {
        var air: Double = largeur * hauteur
        return air
    }

    override fun afficherCouleur() {
        super.afficherCouleur()
    }
}
fun main(){
    //Exercice 1
 /*   var scn = Scanner(System.`in`)
    println("Saisair un nombre :")
    var n = scn.nextInt()
    var som :Float=0f
    println("Saisair des  nombres :")
    for(i in 1..n){
        var x = scn.nextInt()
        som+=x
    }
    println("La moyenne des nombres est ${som/n}")*/
    //Exercice2
  /*  var a1 =Animal("Cat",4)
    var a2 =Animal("Dog",6)
    a1.afiicherDetails()
    a2.afiicherDetails()*/
    //Exercice3
  /*  var c1 = CompteBancaire(5000.0)
    c1.depot(50.0)
    c1.retrait(100.0)
    c1.afficherSolde()*/
   /* var F1:Forme = Cercle("Red",5.4)
    F1.afficherCouleur()
    println("L'air de cercle :"+(F1 as Cercle).calculAir())
    var F2:Forme = Rectangle("Blue",5.0,6.0)
    F2.afficherCouleur()
    println("L'air de Rectangle :"+(F2 as Rectangle).calculAir())
    if (F1 is Rectangle){
        println("L'air de cercle :"+F1.calculAir())
    }else{
        println("L'air de Rectangle :"+F2.calculAir())
    }
    var  formes = arrayListOf<Forme>()*/
    println(factoriel(5))

}
fun factoriel(n:Int):Int{
   if (n==0 || n==1){
       return 1
    }else{
        return  n* factoriel(n-1)
   }
}