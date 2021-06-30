package one.digitallinovation.collections

fun main() {
    val values = intArrayOf(20, 55, 68, 89, 23, 54, 1, 2, 3, 5, 6, 9, 10)
    println("INICIO Primeiro tratamento ******************")
    for (valor in values) {
        println(valor)
    }
    println("FINAL Primeiro tratamento ******************\n")

    println("INICIO Segundo tratamento ******************")
    values.forEach {
        println(it)
    }
    println("FINAL Segundo tratamento ******************\n")

    println("INICIO Terceiro tratamento ******************")
    values.forEach {novovalor->
        println(novovalor)
    }
    println("FINAL Terceiro tratamento ******************\n")

    println("INICIO Quarto tratamento ******************")
    values.sort()
    for(valor in values){
        println(valor)
    }
    println("FINAL Quarto tratamento ******************\n")

    println("INICIO Quinto tratamento ******************")
    for(index in values.indices)
        println(values[index])
    println("FINAL Quinto tratamento ******************\n")
}