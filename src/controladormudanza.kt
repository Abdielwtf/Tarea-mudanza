fun main() {
    class MovingRequest(
        val customer: Cliente,
        val empleado: Empleado,
        val totalPrice: Double,
        var isCancelled: Boolean = false,
        val dueDate: String
    )
}
