interface Almacenamiento<T> {

    val elementos: MutableList<T>

    fun agregarElemento(elemento: T){
        elementos.add(elemento)
    }

    fun agregarElemento(elemento: List<T>){
        for (elemento in elemento) {
            elementos.add(elemento)
        }
    }

    fun listarElementos(){
        var i = 0
        println("\n")
        for (elemento in elementos){
            i++
            println("$i. $elemento")
        }
        println("Pulsa Intro para continuar")
        val intro = readln()
    }
}