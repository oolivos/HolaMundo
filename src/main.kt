import java.util.*

fun main(args : Array<String>){
    println("Hola Mundo!!")

    //Tipos de Datos Basicos
    // var -> Variable
    // val -> Constante
    var nombre = "Oscar"
    var apellido : String = "Olivos"
    var edad : Int = 34
    var valor : Double = 23.45
    var cierto : Boolean = true

    println("Bienvenido $nombre $apellido su edad es $edad")


    if (edad < 18){
        println("$nombre es menor de edad")
    }else{
        println("$nombre es mayor de edad")
    }

    val diaSemana = 6
    val diaSemanaLetras = when(diaSemana){
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        else -> "No es un dia de la semana"

    }

    println(diaSemanaLetras)

    val numeroUno = 10
    val numeroDos = 20

    val mayor = if(numeroUno>numeroDos){
        println("El mayor es $numeroUno")
        numeroUno
    }else{
        println("El mayor es $numeroDos")
        numeroDos
    }
    println("El mayor es $mayor")


    for (i in 0 until  10 step 2){
        println(i)
    }

    for ( letra in nombre){
        println(letra)
    }

    var dato : String?

    val scanner = Scanner(System.`in`)
    println("Ingrese numero")
    val numero = scanner.nextInt()

    // Cuantos numeros primos hay desde el 0 hasta el 100
    var cuentosPrimos = 0
    for (i in 1..100){
        var cuenta = 0
        for (j in 1..numero){
            if (numero % j == 0 ){
                cuenta++
            }
        }
        if(cuenta == 2){
            cuentosPrimos++
        }
    }

    println("Cantidad de primos : $cuentosPrimos")


}

