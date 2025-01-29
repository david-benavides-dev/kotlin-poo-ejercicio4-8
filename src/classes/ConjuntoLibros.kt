package classes

/**
 * Clase que representa un conjunto de libros en una librería.
 *
 * @property tamanioLibreria Tamaño máximo de la librería.
 */
class ConjuntoLibros(private val tamanioLibreria: Int) {
    private var librosGuardados = Array<Libro?>(tamanioLibreria) { null }

    /**
     * Agrega un libro a la librería si no está ya presente.
     *
     * @param libro El libro a agregar.
     * @return true si el libro fue agregado exitosamente, false si ya existe o no hay espacio.
     */
    fun agregarLibro(libro: Libro): Boolean {

        var libroSize = 0

        if (libro !in librosGuardados) {
            for (libroB in librosGuardados) {
                if (libroB == null) {
                    librosGuardados[libroSize] = libro
                    return true
                }
            libroSize ++
            }
        }
        return false
    }


    /**
     * Elimina un libro del conjunto por su título.
     *
     * @param titulo El título del libro a eliminar.
     * @return true si el libro fue eliminado, false en caso contrario.
     */
    fun eliminarLibroPorTitulo(titulo: String): Boolean {
        for (i in librosGuardados.indices) {
            if (librosGuardados[i]?.titulo == titulo) {
                librosGuardados[i] = null
                return true
            }
        }
        return false
    }


    /**
     * Elimina un libro del conjunto por su autor.
     *
     * @param autor El autor del libro a eliminar.
     * @return true si el libro fue eliminado, false en caso contrario.
     */
    fun eliminarLibroPorAutor(autor: String): Boolean {
        for (i in librosGuardados.indices) {
            if (librosGuardados[i]?.autor == autor) {
                librosGuardados[i] = null
                return true
            }
        }
        return false
    }


    /**
     * Muestra el libro con la mayor calificación de la librería.
     * Si no hay libros, mostrará que no hay libros en la librería.
     */
    fun mostrarLibroMayorCalificacion(){
        val libroMayor = librosGuardados.filterNotNull().maxByOrNull { it.calificacion }
        println("Libro con mayor calificacion: \n${libroMayor ?: "No hay libros en la librería"}")
    }


    /**
     * Muestra el libro con la menor calificación de la librería.
     * Si no hay libros, mostrará que no hay libros en la librería.
     */
    fun mostrarLibroMenorCalificacion(){
        val libroMayor = librosGuardados.filterNotNull().maxByOrNull { it.calificacion }
        println("Libro con menor calificacion: \n${libroMayor ?: "No hay libros en la librería."}")
    }


    /**
     * Muestra todos los libros guardados en la librería.
     * Si no hay libros, mostrará que no hay libros en la librería
     */
    fun mostrarLibros() {
        if (librosGuardados.all { it == null })
            println("No hay libros en la librería")

        for (libro in librosGuardados) {
            if (libro != null) {
                println(libro)
            }
        }
    }

}