import classes.ConjuntoLibros
import classes.Libro

fun main() {
    // * Instancia de dos objetos tipo Libro.
    val libro1 = Libro("El arte de la guerra", "Sun Tzu", 98, 10)
    val libro2 = Libro("El libro de los cinco anillos", "Miyamoto Musashi", 156, 10)

    // * Instancia de un objeto tipo ConjuntoLibros.
    val libreria = ConjuntoLibros(5)

    // * Se añaden los dos libros a la librería.

    println("**********************")

    if (libreria.agregarLibro(libro1)) {
        println("Libro añadido a la librería.")
    } else {
        println("No puede añadirse el libro a la librería.")
    }

    if (libreria.agregarLibro(libro2)) {
        println("Libro añadido a la librería.")
    } else {
        println("No puede añadirse el libro a la librería.")
    }

    println("**********************")

    libreria.mostrarLibros()

    // * Se eliminan libros de la librería, uno por su título y otro por su autor.

    println("**********************")

    if (libreria.eliminarLibroPorTitulo("El arte de la guerra")) {
        print("Libro eliminado con éxito de la librería.")
    } else {
        println("No puede eliminarse ese libro.")
    }

    if (libreria.eliminarLibroPorAutor("Miyamoto Musashi")) {
        print("Libro eliminado con éxito de la librería.")
    } else {
        println("No puede eliminarse ese libro.")
    }

    libreria.mostrarLibros()

    // * Se añade un libro a la librería y se muestra el contenido final.

    println("**********************")

    if (libreria.agregarLibro(libro1)) {
        println("Libro añadido a la librería.")
    } else {
        println("No puede añadirse el libro a la librería.")
    }

    libreria.mostrarLibros()
}