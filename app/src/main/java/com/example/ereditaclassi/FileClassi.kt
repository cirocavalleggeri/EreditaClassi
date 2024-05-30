package com.example.ereditaclassi

fun main(){
    val obj=ClassePadre()
    val objFiglio=ClasseFiglio()
    val objFratello=ClasseFratello()
    obj.codiceGenetico()
    objFiglio.variabilePadre=1
    objFiglio.codiceGenetico()
    obj.codiceGenetico()
    objFratello.codiceGenetico()
    objFiglio.codiceGeneticoMadre()
    objFiglio.codiceGeneticoNonno()
}