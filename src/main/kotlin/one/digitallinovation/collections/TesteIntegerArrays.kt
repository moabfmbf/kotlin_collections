package one.digitallinovation.collections

fun main() {
    val values = IntArray(5)
    values[0]=10
    values[1]=5
    values[2]=3
    values[3]=8
    values[4]=9
/*
    for(valor in values){
        println(valor)
    }

    values.forEach {
        println(it)
    }

    values.forEach { valor->
        println(valor)
    }

    for(index in values.indices){
        println(values[index])
    }
    */

    values.sort()
    for(valor in values){
        println(valor)
    }
}