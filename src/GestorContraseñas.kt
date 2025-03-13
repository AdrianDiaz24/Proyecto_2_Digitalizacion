import kotlin.random.Random


class GestorContraseñas() {

    companion object{
        val letras = ('a'..'z')
        val letrasMayus = ('A'..'Z')
        val caracteresEspeciales = arrayOf('/', '&', '%', '$', '|', '@', '#', '*', '!', '?', '+', '=', '-', '_', '^', '~', '<', '>')
    }

    val contraseñas = RepositorioContraseña()

    fun crearContraseña(eleccion: Int, longitud: Int){
        var contraseña = ""
        when (eleccion){
            2 -> for ( i in 1..longitud){
                val posibilidades = Random.nextInt(1,4)
                when (posibilidades){
                    1 -> contraseña += letras.random()
                    2 -> contraseña += letrasMayus.random()
                    3 -> contraseña += Random.nextInt(0,9).toString()
                }
            }
            1 -> for ( i in 1..longitud){
                val posibilidades = Random.nextInt(1,5)
                when (posibilidades){
                    1 -> contraseña += letras.random()
                    2 -> contraseña += letrasMayus.random()
                    3 -> contraseña += Random.nextInt(0,9).toString()
                    4 -> contraseña += caracteresEspeciales.random()
                }
            }
        }
        contraseñas.agregarElemento(Contraseña(contraseña))
        println("Contraseña creada: $contraseña")
        println("Presiona ENTER para continuar")
        val nada = readln()
    }

}