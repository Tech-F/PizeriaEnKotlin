import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val listaIngredientes= listOf<Ingredientes>()

    fun menu(){
       var sc= readln().toInt()
        do{
            println("Dime que quieres añadir")

        }while (sc!=0)
    }


}