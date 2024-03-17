fun main() {

    val customer = Cliente(
        "Jennifer",
        "Garcia",
        "Martinez",
         3647343,
        "SANTA FE"
    )
    printPerson(customer)

    val empleado = Empleado(
        "Manuel",
        "cauich",
        "noh",
        4564567,
        "GCBFHNJDG546",
        78.000,
        "Repartidor"
    )

    printPerson(empleado)

}

fun printPerson(person: customer) {
    println(person.printPersonType())
}