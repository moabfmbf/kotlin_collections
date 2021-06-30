package one.digitallinovation.collections

fun main() {
    val salarios = DoubleArray(5)
    salarios[0] = 10.5
    salarios[1] = 110.5
    salarios[2] = 120.5
    salarios[3] = 180.5
    salarios[4] = 1990.5
    /*
    salarios.forEach {
        println(it)
    }

    salarios.forEach { novoSalarios ->
        println(novoSalarios)
    }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { novoSalarios ->
        println(novoSalarios)
    }
    */
    val salarios2 = doubleArrayOf(12.01,254.000,254.12,6588.0,4525.25)
    salarios2.sortDescending()
    for(salariosUsuarios2 in salarios2){
        println(salariosUsuarios2)
    }
    println("***********")

    println("Maior salario = ${salarios2.maxOrNull()}")
    println("Menor salario = ${salarios2.minOrNull()}")
    println("Media salario = ${salarios2.average()}")

    val pegarMaiorSalario = salarios2.filter { it>4525.00 }
    pegarMaiorSalario.forEach(){
        println(it)
    }

}