import kotlin.random.Random


class GestorContraseñas() {

    companion object{
        val letras = ('a'..'z')
        val letrasMayus = ('A'..'Z')
    }

    val contraseñas = RepositorioContraseña()

    fun crearContraseña(eleccion: Int, longitud: Int){
        var contraseña = ""
        when (eleccion){
            1 -> for ( i in 1..longitud){
                val posibilidades = Random.nextInt(1,3)
                when (posibilidades){
                    1 -> contraseña += letras.random()
                    2 -> contraseña += letrasMayus.random()
                    3 -> contraseña += Random.nextInt(0,9).toString()
                }
            }
        }
        contraseñas.agregarElemento(Contraseña(contraseña))
    }

}