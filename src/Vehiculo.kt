open class Vehiculo(val marca: String,
                    val modelo: String,
                    val capacidadCombustible: Int) {

    open fun mostrarInformacion() {
        println("Marca: $marca - Modelo: $modelo - Capacidad de combustible: $capacidadCombustible - Autonomía: ${calcularAutonomia()}")
    }

    open fun calcularAutonomia(): Int {
        return capacidadCombustible * 10
    }

}