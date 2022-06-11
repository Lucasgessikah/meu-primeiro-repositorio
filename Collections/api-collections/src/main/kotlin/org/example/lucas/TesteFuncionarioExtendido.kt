package org.example.lucas

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4500".toBigDecimal()
    )

    println("---------------")
    println(salarios.somatoria())

    println("---------------")
    println(salarios.media())
}