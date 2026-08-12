fun estaAprobado(nota: Double): Boolean {
    return nota >= 4.0
}

fun calcularPromedio(notas: List<Double>): Double {
    return notas.average()
}

fun main() {
    val notas = listOf(5.5, 3.2, 6.1, 4.0, 2.8, 5.9, 3.9, 6.5)

    println("================================")
    println("       REPORTE ACADÉMICO")
    println("================================")
    
    println("Notas registradas:")
    for (nota in notas) {
        println(nota)
    }

    val notasAprobadas = notas.filter { estaAprobado(it) }
    println("Notas aprobadas: $notasAprobadas")

    val notasReprobadas = notas.filter { !estaAprobado(it) }
    println("Notas reprobadas: $notasReprobadas")

    val promedioGeneral = notas.average()
    println("Promedio general: $promedioGeneral")

    val hayNotaSobresaliente = notas.any { it >= 6.0 }
    println("Existe una nota 6.0 o superior: $hayNotaSobresaliente")

    val todosAprobaron = notas.all { estaAprobado(it) }
    println("Todos aprobaron: $todosAprobaron")

    val primeraReprobada = notas.find { !estaAprobado(it) }
    println("Primera nota reprobada: $primeraReprobada")

    val notasConBonificacion = notas.map { it + 0.5 }
    println("Notas con bonificación: $notasConBonificacion")
    
    val promedioCalculado = calcularPromedio(notas)
    println("Promedio calculado por función: $promedioCalculado")
}
