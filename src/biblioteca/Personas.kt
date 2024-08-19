package biblioteca

class Usuario(val nombre: String) : AccionBiblioteca {
    override fun gestionar() {
        println("Usuario $nombre está gestionando su cuenta.")
    }
}

class Bibliotecario(val nombre: String) : AccionBiblioteca {
    override fun gestionar() {
        println("Bibliotecario $nombre está gestionando la biblioteca.")
    }
}
