package com.brayanalfonso.myapplicationbrayan

class Funciones {
}



//Funciones
    //Calcular area del circulo
    fun calcularArea(){
        println("Por favor ingresa el radio del circulo")
        var radio:Float= readLine()!!.toFloat()

        var area:Float=3.14159F*(radio*radio)

        println("El area del circulo es $area")
    }

    //Calcular perimetro del circulo
    fun calcularPerimetro(){
        println("Por favor ingresa el diametro del circulo")
        var diametro:Float= readLine()!!.toFloat()

        var perimetro:Float=3.14159F*diametro

        println("El perimetro del circulo es $perimetro")
    }

    //Funcion para calcular el area de un triangulo
    fun calcularAreaTri(base:Float?, altura:Float?){
        var area=(base!! * altura!!)/2
        println("El area del triangulo es $area")
    }

    //Calcular el perimetro de un triangulo
    fun calcularPerimetroTri(lado1:Float?,lado2:Float?,lado3:Float?){
        var perimetro= lado1!! + lado2!! + lado3!!
        println("El perimetro del triangulo es $perimetro")
    }

    //Calcular area del rectangulo
    fun calcularAreaRect(largo:Float, ancho:Float):Float{
        var area=largo!!*ancho!!
        return area
    }

    //Calcular perimetro del rectangulo
    fun calcularPerimetroRect(base:Float, altura:Float):Float{
        var perimetro=(base!!+altura!!)*2
        return perimetro
    }


fun main() {

    /*println("Ingresa tu edad por favor")
    var age: Int= readLine()!!.toInt()

    val bar= if (age<=18) "Pala casa" else "Bienvenido"
    println(bar)


    //Hacemos una fucnion simple para saber su estructura
    fun printHello(){
        println("Hello World")
    }
    //Invocamos-llamamos la funcion
    printHello()*/


    //Programa para calcular el area y perimetro de un circulo
    do {


        println("Bienvenido, por favor selecciona que deseas hacer: \n" +
                "1. Calcular area de un circulo. \n" +
                "2. Calcular perimetro de un circulo.\n" +
                "3. Calcular el area de un triangulo. \n" +
                "4. Calcular el perimetro de un triangulo. \n" +
                "5. Calcular area del rectangulo. \n" +
                "6. Calcular perimetro del rectangulo.")
        var respuesta:Int= readLine()!!.toInt()

        if (respuesta==1){

            calcularArea()

        }else if (respuesta==2){

            calcularPerimetro()

        }else if (respuesta==3){
            println("Ingresa la base del triangulo")
            var base:Float= readLine()!!.toFloat()

            println("Ingresa la altura del triangulo")
            var altura:Float= readLine()!!.toFloat()

            calcularAreaTri(base, altura)
        }else if(respuesta==4){

            println("Ingresa el lado 1 del triangulo")
            var lado1:Float= readLine()!!.toFloat()

            println("Ingresa el lado 2 del triangulo")
            var lado2:Float= readLine()!!.toFloat()

            println("Ingresa el lado 3 triangulo")
            var lado3:Float= readLine()!!.toFloat()
            calcularPerimetroTri(lado1, lado2, lado3)
        }else if (respuesta==5){

            println("Ingresa el largo del rectangulo")
            var largo:Float= readLine()!!.toFloat()

            println("Ingresa el ancho del rectangulo")
            var ancho:Float= readLine()!!.toFloat()

            var area=calcularAreaRect(largo,ancho)

            println("El area del rectangulo es $area")
        }else if (respuesta==6){

            println("Ingresa el base del rectangulo")
            var base:Float= readLine()!!.toFloat()

            println("Ingresa el altura del rectangulo")
            var altura:Float= readLine()!!.toFloat()

            var area= calcularPerimetroRect(base,altura)

            println("El perimetro del rectangulo es $area")
        }else{
            println("Has ingresado un numero invalido")
        }



        println("Deseas continuar?")
        var continuar:String= readLine()!!.lowercase()
    }while (continuar=="si" || continuar=="sí")
}