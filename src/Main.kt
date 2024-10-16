fun main() {
//    dobleYTriple()
//    convertirCelsiusAFahrenheit()
//    calcularLongitudYAreaCircunferencia()
//    convertirVelocidad()
//    pedirNumeros()
//    numerosDeSieteEnSiete()
//    juegoAdivinarNumero()
//    sueldoMaximo()
//    tablasDeMultiplicar()
//    procesarNumeros()
//    mostrarNumerosEnOrden()
//    ordenarPorBurbuja()
//    contadorConSustitucion()
}

fun dobleYTriple() {
    println("Introduce un número entero:")
    val number = readLine()?.toIntOrNull() ?: 0

    val double = number * 2
    val triple = number * 3

    println("Doble: $double")
    println("Triple: $triple")
}
fun convertirCelsiusAFahrenheit() {
    println("Introduce la cantidad de grados centígrados:")
    val celsius = readLine()?.toDoubleOrNull() ?: 0.0

    val fahrenheit = 32 + (9 * celsius / 5)

    println("$celsius grados centígrados son $fahrenheit grados Fahrenheit")
}

fun calcularLongitudYAreaCircunferencia() {
    println("Introduce el valor del radio de la circunferencia:")
    val radio = readLine()?.toDoubleOrNull() ?: 0.0

    val longitud = 2 * Math.PI * radio
    val area = Math.PI * Math.pow(radio, 2.0)

    println("Longitud de la circunferencia: $longitud")
    println("Área de la circunferencia: $area")
}

fun convertirVelocidad() {
    println("Introduce la velocidad en Km/h:")
    val velocidadKmH = readLine()?.toDoubleOrNull() ?: 0.0

    val velocidadMS = velocidadKmH / 3.6

    println("$velocidadKmH Km/h son $velocidadMS m/s")
}

fun pedirNumeros() {
    var contador = 0

    while (true) {
        println("Introduce un número (introduce un número negativo para detener):")
        val numero = readLine()?.toIntOrNull() ?: 0

        if (numero < 0) {
            break
        }

        contador++
    }

    println("Se han introducido $contador números.")
}

fun numerosDeSieteEnSiete() {
    println("Números del 100 al 0 de 7 en 7:")
    for (i in 100 downTo 0 step 7) {
        println(i)
    }
}

fun juegoAdivinarNumero() {
    val numeroAdivinar = (1..100).random()

    while (true) {
        println("Adivina el número (entre 1 y 100):")
        val intento = readLine()?.toIntOrNull() ?: 0

        when {
            intento > numeroAdivinar -> println("Menor")
            intento < numeroAdivinar -> println("Mayor")
            else -> {
                println("¡Has adivinado el número!")
                break
            }
        }
    }
}

fun sueldoMaximo() {
    println("Introduce el número de sueldos a ingresar:")
    val n = readLine()?.toIntOrNull() ?: 0
    var maxSueldo = Double.MIN_VALUE

    for (i in 1..n) {
        println("Introduce el sueldo $i:")
        val sueldo = readLine()?.toDoubleOrNull() ?: 0.0
        if (sueldo > maxSueldo) {
            maxSueldo = sueldo
        }
    }

    println("El sueldo máximo es: $maxSueldo")
}

fun tablasDeMultiplicar() {
    for (i in 1..12) {
        println("Tabla de multiplicar del $i:")
        for (j in 1..12) {
            println("$i x $j = ${i * j}")
        }
        println()
    }
}

fun contadorConSustitucion() {
    for (i in 0..99999) {
        val numeroFormateado = String.format("%05d", i)
        val numeroConSustitucion = numeroFormateado.replace('3', 'E')
        println(numeroConSustitucion.chunked(1).joinToString("-"))
    }
}

fun procesarNumeros() {
    var sumaPositivos = 0.0
    var sumaNegativos = 0.0
    var contadorPositivos = 0
    var contadorNegativos = 0
    var contadorCeros = 0

    for (i in 1..5) {
        println("Introduce el número $i:")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0

        when {
            numero > 0 -> {
                sumaPositivos += numero
                contadorPositivos++
            }
            numero < 0 -> {
                sumaNegativos += numero
                contadorNegativos++
            }
            else -> contadorCeros++
        }
    }

    val mediaPositivos = if (contadorPositivos > 0) sumaPositivos / contadorPositivos else 0.0
    val mediaNegativos = if (contadorNegativos > 0) sumaNegativos / contadorNegativos else 0.0

    println("Media de positivos: $mediaPositivos")
    println("Media de negativos: $mediaNegativos")
    println("Cantidad de ceros: $contadorCeros")
}

fun mostrarNumerosEnOrden() {
    val numeros = mutableListOf<Int>()

    for (i in 1..10) {
        println("Introduce el número $i:")
        val numero = readLine()?.toIntOrNull() ?: 0
        numeros.add(numero)
    }

    println("Números en el orden especificado:")
    for (i in 0..4) {
        println(numeros[i])
        println(numeros[9 - i])
    }
}
fun ordenarPorBurbuja() {
    val numeros = IntArray(5)

    for (i in numeros.indices) {
        println("Introduce el número ${i + 1}:")
        numeros[i] = readlnOrNull()?.toIntOrNull() ?: 0
    }

    for (i in numeros.indices) {
        for (j in 0..<numeros.size - 1) {
            if (numeros[j] > numeros[j + 1]) {
                val temp = numeros[j]
                numeros[j] = numeros[j + 1]
                numeros[j + 1] = temp
            }
        }
    }

    println("Números ordenados por el método burbuja:")
    numeros.forEach { println(it) }
}





