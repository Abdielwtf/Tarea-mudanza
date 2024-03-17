class EmpleadoController : IController {

    override fun registerModel() {


        val addedEmpleadp = Empleado(
            "Ricardo",
            "Hernandez",
            "Zambada",
            9987059385,
            "YRHFDJNNCH382",
            45.000,
            "VENDEDOR"
        )
    }

    override fun showAllModels() {
        TODO("Not yet implemented")
    }

}