package one.digitallinovation.collections

fun main() {
    val salarios = DoubleArray(5)
    salarios[0] = 10.5
    salarios[1] = 110.5
    salarios[2] = 120.5
    salarios[3] = 180.5
    salarios[4] = 1990.5
    salarios.forEach {
        println(it)
    }
    salarios.forEach {novoSalarios->
        println(novoSalarios)
    }

}