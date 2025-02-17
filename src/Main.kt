fun main() {

    val vehiculos: List<Vehiculo> = listOf(
        Automovil("SUV", "Citroen", "C4", 60),
        Motocicleta(125, "Honda", "CBR", 10)
    )

    for ((i, vehiculo) in vehiculos.withIndex()) {
        print("Vehículo #${i + 1}: ")
        vehiculo.mostrarInformacion()
    }
}