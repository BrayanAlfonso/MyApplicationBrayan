package com.brayanalfonso.myapplicationbrayan

class Conditionals {
}

fun main() {/*
    //Condicional if
    println("Por favor ingrese el numero 1")
    var num1:Int= readLine()!!.toInt()
    println("Por favor ingrese l numero 2")
    var num2:Int= readLine()!!.toInt()

    if (num1>num2){
        //Instrucciones si condicion se cumple
        println("El numero $num1 es el mayor")
    }else if(num1<num2){
        //Instrucciones si condicion no se cumple
        println("El numero $num2 es el mayor ")
    }else{
        println("Los numeros son iguales")
    }

    println("Ingresa un numero del 1 al 20")
    var number:Int= readLine()!!.toInt()

    if (number in 1..20){
        println("¡Perfecto, el número esta en el rango!")
    }else{
        println("¡Te dije un numero entre 1 y 20! >:c")
    }*/


    var resultRandom: Int= (1..50).random()//Genera numeros aleatorios
    println("El numero es $resultRandom")

    when(resultRandom){
        0-> println("No hay resultados. :(")
        1,2,3,4,5 -> println("Hay menos de 6 resultados")
        in 6..50 -> println("El numero esta entre 6 y 50")
        else -> println("Esos son bastantes resultados")
    }
}