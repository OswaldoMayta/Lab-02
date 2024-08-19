package biblioteca

fun gestionarBiblioteca() {
    val biblioteca = Biblioteca()

    val libro1 = Libro("1984", "George Orwell")
    val libro2 = Libro("To Kill a Mockingbird", "Harper Lee")
    val revista1 = Revista("National Geographic", 2024)

    biblioteca.agregarLibro(libro1)
    biblioteca.agregarLibro(libro2)
    biblioteca.agregarRevista(revista1)

    biblioteca.mostrarContenido()
}
fun gestionarPersonas() {
    val usuario = Usuario("Juan Pérez")
    val bibliotecario = Bibliotecario("Ana López")

    usuario.gestionar()
    bibliotecario.gestionar()
}

fun main() {
    gestionarPersonas()
    gestionarBiblioteca()
}
