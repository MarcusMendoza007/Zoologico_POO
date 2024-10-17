// Main.kt
package zoologico

fun main() {
    val zoologico = Zoologico()

    // Crear instancias de animales
    val leon = Leon("Simba")
    val elefante = Elefante("Dumbo")

    // Agregar animales al zoológico
    zoologico.agregarAnimal(leon)
    zoologico.agregarAnimal(elefante)

    // Mostrar la cantidad de animales
    zoologico.mostrarCantidadDeAnimales()

    // Alimentar a los animales
    zoologico.alimentarAnimales()

    // Llamar a la acción de comer
    leon.comer()
    elefante.comer()
}
