class Compra(var compras: List<List<Any>>){
    /**
     * La funcion separador toma el objeto (lista) predefinida en el main() y la recorrerá para añadir a otra lista los
     * domicilios de los clientes sin que estos se repitan.
     *
     * @return datos -> con los domicilios de los clientes.
     */
    fun separador(): List<String> {
        val clientes = this.compras
        val datos = mutableListOf<String>()
        for (cliente in clientes){
            for (domicilio in cliente){
                if (domicilio == cliente[3] && !datos.contains(domicilio)) {
                    datos.add(domicilio.toString())
                }
            }
        }
        return datos
    }

    /**
     * Esta funcion recoge la lista de domicilios y los imprime por separado
     *
     * @param datos -> lista con las direcciones de los clientes
     */
    fun imprimirDirecciones(datos:List<String>){
        for (direccion in datos){
            println(direccion)
        }
    }
}