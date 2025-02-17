class Automovil(val tipo: String,
                marca: String,
                modelo: String,
                capacidadCombustible: Int)
    : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun mostrarInformacion() {
        println("Marca: $marca - Modelo: $modelo - Capacidad de combustible: $capacidadCombustible - Tipo: $tipo - Autonomía: ${calcularAutonomia()}")
    }

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }
}