package com.example.ereditaclassi

open class ClasseFiglio:ClassePadre(),InterfacciaMadre,InterfacciaNonno {
    override lateinit var capelli: String

override fun codiceGenetico(){
    super.codiceGenetico()
    println("Codice genetico figlio $variabilePadre")
}

    override fun codiceGeneticoMadre() {

        capelli="Biondi"
        println("Eredito da Madre capelli $capelli")
    }

    override fun codiceGeneticoNonno() {
        super.codiceGeneticoNonno()
        println("Eredito da Nonno")
    }
}