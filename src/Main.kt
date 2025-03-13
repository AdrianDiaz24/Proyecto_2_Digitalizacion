

fun main(){

    val gestorContraseñas = GestorContraseñas()
    var salida = false

    while (!salida){
        val eleccion = menu()
        when (eleccion){
            3 -> salida = true
            2 -> gestorContraseñas.contraseñas.listarElementos()
            1 -> {
                val eleccion = submenu()
                when (eleccion){
                    3 -> println("Volviendo al menu principal")
                    else -> {
                        println("Introduce la longitud de la contraseña")
                        gestorContraseñas.crearContraseña(eleccion, pedirNum(1,1000))
                    }
                }
            }
        }
    }
}

fun pedirNum(min: Int, max: Int): Int{
    var valorValido = false
    var input = 0
    while (!valorValido) {
        print(">> ")
        try {
            input = readln().toInt()
        } catch (e: IllegalArgumentException) {
            println("**ERROR** Introduce un Nº")
        }
        if (input in min..max){
            valorValido = true
        } else {
            println("**ERROR** Introduce un Nº entre $min y $max")
        }
    }
    return input
}

fun menu(): Int{
    println("1. Crear contraseña")
    println("2. Listar contraseñas")
    println("3. Salir")
    return pedirNum(1,3)
}

fun submenu(): Int{
    println("La contraseña se creara con letras y numeros")
    println("1. Crear con caracteres especiales")
    println("2. Crear sin caracteres especiales")
    println("3. Cancelar")
    return  pedirNum(1,3)
}


