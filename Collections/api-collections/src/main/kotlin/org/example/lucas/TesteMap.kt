package org.example.lucas

fun main() {
    val pair: Pair<String, Double> = Pair("Lucas", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Gessica" to 2000.0,
        "Oliver" to 3500.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}