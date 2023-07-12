package com.brayanalfonso.myapplicationbrayan

class Introduccion {
}

fun main() {

    var name: String="Brayan"

    //Tipos enteros
    var numlong: Long=1234567899874563211
    var numint: Int=1234567899
    var numshort: Short=12345
    var numbyte: Byte=123

    //Tipos con punto flotante
    var numdouble: Double=1.123456789987456
    var numfloat: Float=1.9876543F
    var numchar: Char='0'
    var numboolean: Boolean=true

    println(numlong)
    println(numint)
    println(numshort)
    println(numbyte)

    //Para parsear toTipoDeDato
    var num1:Int=2
    var num2:Int=5
    //Para concatenar puede ser con el signo de pesos
    println("La suma entre $num1 y $num2 es ${num1+num2}")

    //deben ir obligatoriamente los corchetes para que se tome como expresion
    println("$name.length is ${name.length}")

    /*var lastName= readLine()
    println(lastName)*/


    println("Ingrese el numero 1")
    var numero1: Int= readLine()!!.toInt()

    println("Ingrese el numero 2")
    var numero2: Int= readLine()!!.toInt() //Los signos de adimiracion fuerzan a la variable a ser nula pero con una promesa ya que Kotlin no puede tener variables nulas

    println("La suma entre el numero $numero1 y el numero $numero2 es ${numero1+numero2}")

    //Seguridad nula con !! y ?
    //Elvis (?)
    var variable2: Int?=null
}
