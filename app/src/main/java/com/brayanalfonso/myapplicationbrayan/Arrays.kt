package com.brayanalfonso.myapplicationbrayan

class Arrays {

}

fun main() {
    var pets= arrayOf("dog", "cat", "canary")
    println(pets.contentToString())
    //Si no se utiliza el metodo contentToString


    //Imprimir lo que va en la posicion, recuerde!!
    println(pets[1])


    //Cambiar el valor de una posición
    pets[2]="parrot"

    println(pets.contentToString())


    //Imprimir los elementos de un array
    for ((index, element) in pets.withIndex()){
        println("La mascota numero $index es $element")
    }


    //LISTAS

    //Interpreta el tipo de dato
    var instruments= listOf("Trumpet", "Piano", "Violin")
    println(instruments)


    //Se le da el tipo de dato
    var instrumentos: List<String> = listOf("Trumpet", "Piano", "Violin")
    println(instrumentos)

    var instrumentsMutable= mutableListOf("Trumpet", "Piano", "Violin")
    instrumentsMutable[1]="Saxo"
    println(instrumentsMutable)


    //Mostrar el primer y ultimo elemento de la lista
    println(instrumentsMutable.first())
    println(instrumentsMutable.last())


    //Agregar elementos
    instrumentsMutable.add("prueba")
    println(instrumentsMutable)


    //Eliminar elementos
    instrumentsMutable.remove("prueba")
    println(instrumentsMutable)



    //eliminar elementos por su indice
    instrumentsMutable.removeAt(1)
    println(instrumentsMutable)


    /*Muestra error diciendo que el index 4 no se encuentra ya que la longitud de la lista es de 3
    instrumentsMutable.removeAt(4)
    println(instrumentsMutable)*/

    instrumentsMutable.clear()
    println(instrumentsMutable)
}