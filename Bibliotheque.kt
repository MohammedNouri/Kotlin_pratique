package com.example.my_first_kotline

import java.util.Date

class Livre(var titre:String,var auteur:String,var isbn:Int,var genre:String,var disponible:Boolean){
    constructor(titre: String,auteur: String,genre: String):this(titre,auteur,1,genre,true)
    fun emprunter(){
        disponible=false
    }
    fun retourner(){
        disponible=true
    }
}
class Utilisateur(var nom:String,var numCarte:String){
    constructor():this("Mohammed","HH187215")
}
class Emprunt(var livre: Livre,var utilisateur:Utilisateur,var dateEmprunt: Date,var dateRetour: Date){
    constructor(livre: Livre,dateEmprunt: Date,utilisateur: Utilisateur,dateRetour: Date):this(livre,utilisateur,dateEmprunt,dateRetour)
}
class Bibliotheque(var catalogue:ArrayList<Livre>,var emprunts:ArrayList<Emprunt>) {
    fun ajouterLivre(livre: Livre){
        for (i in catalogue){
            if (i.isbn != livre.isbn){
                catalogue.add(livre)
            }else{
                println("Ce livre est deja existe")
            }
            println(i.titre)
        }
    }
    fun supprimerLivre(livre: Livre){
        for (i in catalogue){
            if (i.isbn == livre.isbn){
                catalogue.remove(livre)
            }else{
                println("Ce livre  n'existe pas")
            }
        }
    }
    fun rechercherLivre(critiére:Int):Int{
        for (i in catalogue){
            if(i.isbn == critiére){
                return catalogue.indexOf(i)
            }
        }
        return -1
    }
    fun afficher(){
        for(i in catalogue){
            println(i.titre)
        }
        println("hello")
    }
    fun emprunterLivre(livre: Livre,utilisateur: Utilisateur,dateEmprunt: Date,dateRetour: Date){
        livre.emprunter()
        var emprunt=Emprunt(livre,utilisateur,dateEmprunt,dateRetour)
        emprunts.add(emprunt)
    }
    fun retournerLivre(livre: Livre,utilisateur: Utilisateur){
        livre.retourner()
        for (i in emprunts){
            if (i.livre.isbn == livre.isbn){
                emprunts.remove(i)
            }
        }
    }
    fun listerLivresEmpruntes(utilisateur: Utilisateur){
        println("L'utilisateur ${utilisateur.nom} et de num ${utilisateur.numCarte} :")
        println("a emprunter les livres suivants :")
        for (i in emprunts){
            if (i.utilisateur.numCarte == utilisateur.numCarte) {
                println(i.livre.titre)
            }
        }
    }
}
fun main(){
    var l1 = Livre("Antigone","Mahmoud",140,"Amoreux",true)
    var l2 = Livre("Dernier","Victor Hugo",120,"Prison",true)
    var l3= Livre("Boite ","Mohammed",90,"Prison",true)
    var l4 = Livre("le vue","Yassine",80,"Bio",true)
    var user1 = Utilisateur()
    var user2 = Utilisateur("Hamza nouri","H98215")
    var dateEmprunt = Date()
    var  dateRetour = Date()
    var b1 = Bibliotheque(catalogue = ArrayList(), emprunts = ArrayList())
    b1.ajouterLivre(l1)
    b1.ajouterLivre(l2)
    b1.ajouterLivre(l3)
    b1.supprimerLivre(l3)
    b1.afficher()
    b1.ajouterLivre(l4)
    b1.emprunterLivre(l1,user1,dateEmprunt,dateRetour)
    b1.emprunterLivre(l2,user1,dateEmprunt,dateRetour)
    b1.emprunterLivre(l3,user1,dateEmprunt,dateRetour)
    b1.emprunterLivre(l3,user2,dateEmprunt,dateRetour)
    b1.emprunterLivre(l4,user2,dateEmprunt,dateRetour)
    b1.listerLivresEmpruntes(user2)




}