package com.example.my_first_kotline

open class Produit(var code:Int,var prix:Double) {
    open fun prixProduit():Double{
        return prix
    }
    override  fun toString():String{
        return ("le code de produit ${code} et prix ${prix}")
    }

    override fun equals(other: Any?): Boolean {
        var v = when{
            (this.code == (other as Produit).code) -> true
            else -> false
        }
        return v    }

/*    fun equals(obj: Object ): Boolean {
        var v = when{
            (this.code == (obj as Produit).code) -> true
            else -> false
        }
        return v
    }*/
}
class ProduitEnsolde(code: Int,prix: Double,var remise:Double):Produit(code,prix){
    init {
        var r = remise >1 && remise<90
        var v = when(r){
            true -> "remise est validé"
            else -> "remise doit etre entre [1..90]"
        }
        println(v)
    }

    override fun prixProduit(): Double {
        return prix*(1-remise/100)
    }

    override fun toString(): String {
        return super.toString()+" Remise : ${remise}"
    }
}
class Boutique (var produits:ArrayList<Produit>){
    fun indiceDE(code: Int):Int{
        for (i in produits){
            if (i.code == code){
                return produits.indexOf(i)
            }
        }

        return -1
    }
    fun ajouter( p: Produit){
        var f = indiceDE(p.code)
        if(f==-1){
            produits.add(p)
        }else{
            println("Le produit est deja trouver")
        }
    }
    fun supprimer(code:Int){
        var f = indiceDE(code)
        if(f!=-1){
            produits.removeAt(code)
        }else{
            println("Le produit ne trouve pas")
        }
    }
    fun supprimer(p:Produit){
        var f = indiceDE(p.code)
        if(f!=-1){
            produits.remove(p)
        }else{
            println("Le produit ne trouve pas")
        }
    }
    fun NombreProduitEnSolde():Int{
        var cmpt:Int=0
        for(i in produits){
            if (i is ProduitEnsolde){
                cmpt++
            }
        }
        return cmpt
    }
    fun afficher(){
        for (i in produits){
            println(i)
        }
    }
}

fun main() {
    var p1:Produit = ProduitEnsolde(102,895.0,0.1)
    var p2:Produit = ProduitEnsolde(108,789.0,47.0)
    var b1 = Boutique(produits = ArrayList() )
    if (p1.equals(p2)){
        println("p1 eaquals p2")
    }else{
        println("p1 different de p2")
    }
    println( p1.prixProduit())
    println(p1.toString())
    b1.ajouter(p1)
    b1.ajouter(p2)
    b1.afficher()
    println(b1.NombreProduitEnSolde())

}