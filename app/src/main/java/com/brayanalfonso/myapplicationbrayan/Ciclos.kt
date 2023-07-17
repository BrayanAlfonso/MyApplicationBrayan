package com.brayanalfonso.myapplicationbrayan

class Ciclos {

}

fun main() {
    /*for (i in 1..5) print(i)
    println()

    //Itera al reves
    for (i in 5 downTo 1) print(i)
    println()

    //Permite cambiar cada cuantos pasos itera
    for (i in 1..6 step 2) print(i)


    //Pedir 6 numeros al usuario, por cada numero se le dira si el numero es par o impar

    var k:Int=0
    var j:Int=0

    var sum1:Int=0
    var sum2: Int=0

    for (i in 1..6 ) {

        println("Ingresda un numero numero")
        var num: Int = readLine()!!.toInt()
        println()


        if (num % 2 == 0) {
            println("El numero $num es par")
            k += 1
            sum1 += num
        } else {
            println("El numero $num es impar")
            j += 1
            sum2 += num
        }
    }
    println("El total de numeros pares ha sido $k")
    println("El total de numeros impares ha sido $j")

    println("La suma de los pares ha sido $sum1")
    println("La suma de los pares ha sido $sum2")
    for (i in 'a' .. 'z' ) println(i)*/


    var k:Int=0
    var j:Int=0

    var sum1:Int=0
    var sum2: Int=0
    var option: String

 do{
        println("Ingresda un numero numero")
        var num: Int = readLine()!!.toInt()
        println()


        if (num % 2 == 0) {
            println("El numero $num es par")
            k += 1
            sum1 += num
        } else {
            println("El numero $num es impar")
            j += 1
            sum2 += num
        }
        println("Deseas agregar otro numero? Escribe si para continuar")
        option= readLine()!!
    }   while (option== "si")

    println("El total de numeros pares ha sido $k")
    println("El total de numeros impares ha sido $j")

    println("La suma de los pares ha sido $sum1")
    println("La suma de los pares ha sido $sum2")


}