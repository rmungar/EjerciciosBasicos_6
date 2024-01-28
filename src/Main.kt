fun main(){
    val compras = Compra(
        listOf<List<Any>>(
            listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
            listOf("Jorge Russo", 7, 699, "Mirasol 218"),
            listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
            listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
            listOf("Jorge Russo", 15, 958, "Mirasol 218"),
        )
    )
    val datos = compras.separador()
    compras.imprimirDirecciones(datos)
}