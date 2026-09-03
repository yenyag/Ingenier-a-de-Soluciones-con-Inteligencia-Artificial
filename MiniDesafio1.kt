fun main() {
    val nombreEvento: String = "Kotlin Fest"
    val precioEntrada: Double = 12500.0
    var cantidadEntradas: Int = 3
    val cargoServicio: Double = 1500.0
    val descuento: Double = 5000.0
    val eventoDisponible: Boolean = true
    val categoria: Char = 'A'
    val edadComprador: Int = 20
    val tieneAutorizacion: Boolean = true

    val subtotal = precioEntrada * cantidadEntradas
    val totalCargoServicio = cargoServicio * cantidadEntradas
    val totalAntesDescuento = subtotal + totalCargoServicio
    val totalFinal = totalAntesDescuento - descuento
    
    val esMayorDeEdad = edadComprador >= 18
    val puedeComprar = esMayorDeEdad && tieneAutorizacion && eventoDisponible
    val compraGrande = (cantidadEntradas >= 3) && (totalFinal > 30000.0)

    println("================================")
    println("        RESUMEN DE COMPRA")
    println("================================")
    println("Evento: $nombreEvento")
    println("Categoría: $categoria")
    println("Precio entrada: $$precioEntrada")
    println("Cantidad inicial: $cantidadEntradas")
    println("Subtotal: $$subtotal")
    println("Cargo por servicio: $$totalCargoServicio")
    println("Total antes del descuento: $$totalAntesDescuento")
    println("Descuento: $$descuento")
    println("Total final: $$totalFinal")
    println("Mayor de edad: $esMayorDeEdad")
    println("Evento disponible: $eventoDisponible")
    println("Tiene autorización: $tieneAutorizacion")
    println("Puede comprar: $puedeComprar")
    println("Es compra grande: $compraGrande")

    cantidadEntradas = cantidadEntradas + 1
    println("Cantidad actualizada: ${cantidadEntradas}")
}
