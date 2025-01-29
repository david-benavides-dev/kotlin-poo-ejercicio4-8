package classes

/**
 * Representa un libro con su título, autor, número de páginas y calificación.
 * @property titulo El título del libro.
 * @property autor El autor del libro.
 * @property numPaginas El número de páginas que tiene el libro.
 * @property calificacion La calificación del libro.
 */
class Libro(val titulo: String, val autor: String, val numPaginas: Int, calificacion: Int) {
    var calificacion: Int = calificacion
        set(value) {
            if (value in  0..10) {
                field = value
            } else {
                throw IllegalArgumentException("La calificación debe estar entre 0 y 10.")
            }
        }

    init {
        require(calificacion in 0..10) {"La calificación debe estar entre 0 y 10."}
    }

    /**
     * Devuelve una representación del libro.
     *
     * @return Una cadena que contiene el título, autor, número de páginas y calificación del libro.
     */
    override fun toString(): String {
        return "Título: $titulo\nAutor: $autor\nNúmero de páginas: $numPaginas\nCalificación: $calificacion"
    }
}