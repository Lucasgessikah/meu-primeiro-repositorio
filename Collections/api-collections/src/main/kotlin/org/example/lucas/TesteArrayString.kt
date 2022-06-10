package org.example.lucas

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Lucas"
    nomes[1] = "Gessica"
    nomes[2] = "Oliver"

    for (nome in nomes){
        println(nome)
    }
    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

}