// Animal.kt
package zoologico

abstract class Animal(val nombre: String) {
    abstract val sonido: String

    fun hacerSonido() {
        println("$nombre hace el sonido: $sonido")
    }
}
