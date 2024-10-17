// Zoologico.kt
package zoologico

class Zoologico {
    private val animales = mutableListOf<Animal>()

    fun agregarAnimal(animal: Animal) {
        animales.add(animal)
    }

    fun alimentarAnimales() {
        println("Alimentando a los animales del zoológico...")
        animales.forEach {
            it.hacerSonido()
        }
    }

    fun mostrarCantidadDeAnimales() {
        println("El zoológico tiene ${animales.size} animales.")
    }
}
