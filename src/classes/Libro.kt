package classes


// título, el autor, el número de páginas y la calificación que le damos entre 0 y 10.
class Libro(val titulo: String, val autor: String, val numPaginas: Int, calificacion: Int) {

    var calificacion: Int = 0
        set(value) {
            if (value in  0..10) {
                field = value
            } else {
                throw IllegalArgumentException("La calificación debe estar entre 0 y 10")
            }

        }

    init {
        require(calificacion in 0..10) {"La c alificación dbe esta rentre 0 y 10"}
    }

    fun test() {
        println("")
    }
}