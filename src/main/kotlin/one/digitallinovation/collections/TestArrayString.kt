package one.digitallinovation.collections

fun main() {
    /*
    val nomes = Array(4) { "" }
    nomes[0] = "Paula"
    nomes[1] = "Maria"
    nomes[2] = "Sandra"
    nomes[3] = "Adriana"

    for (nome in nomes) {
        println("Nomes dos usuarios " + nome)
    }

    nomes.forEach {
        println("Nomes do usuarios usando IT " + it)
    }
    nomes.forEach { nomesUsarios ->
        println("Nomes usuarios usando lambdas " + nomesUsarios)
    }
    nomes.sort()
    for(nome in nomes){
        println(nome)
    }
     */

    val nomes = arrayOf("Gomes","Lucas","Maria","Sandra","Paula","Ricardo")
    nomes.sort()
    for(nome in nomes){
        println(nome)
    }
}