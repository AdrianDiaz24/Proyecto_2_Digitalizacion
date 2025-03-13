

fun main(){

    val gestorContraseñas = GestorContraseñas()

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

fun menu(){
    println("1. Crear contraseña")
    println("2. Listar contraseñas")
    println("3. Salir")
}