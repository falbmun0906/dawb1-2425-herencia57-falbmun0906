class Motocicleta(val cilindrada: Int,
                  marca: String, modelo: String,
                  capacidadCombustible: Int)
    : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun mostrarInformacion() {
        println("Marca: $marca - Modelo: $modelo - Capacidad de combustible: $capacidadCombustible - Cilindrada: $cilindrada - Autonomía: ${calcularAutonomia()}")
    }

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }


}