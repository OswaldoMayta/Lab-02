package biblioteca

interface AccionBiblioteca {
    fun gestionar()
}

class Libro(val titulo: String, val autor: String) {
    fun imprimirDetalles() {
        println("Título: $titulo, Autor: $autor")
    }
}

class Revista(val nombre: String, val numero: Int) {
    fun imprimirDetalles() {
        println("Nombre: $nombre, Número: $numero")
    }
}

class Biblioteca {
    private val libros = mutableListOf<Libro>()
    private val revistas = mutableListOf<Revista>()

    fun agregarLibro(libro: Libro) {
        libros.add(libro)
    }

    fun agregarRevista(revista: Revista) {
        revistas.add(revista)
    }

    fun mostrarContenido() {
        println("Libros en la biblioteca:")
        libros.forEach { it.imprimirDetalles() }
        println("Revistas en la biblioteca:")
        revistas.forEach { it.imprimirDetalles() }
    }
}
