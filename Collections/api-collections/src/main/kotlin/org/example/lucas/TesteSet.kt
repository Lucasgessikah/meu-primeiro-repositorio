package org.example.lucas

fun main() {
    val lucas = Funcionario("Lucas", 2000.0, "CLT")
    val gessica = Funcionario("Gessica", 1500.0, "PJ")
    val oliver = Funcionario("Oliver", 4500.0, "CLT")

    val funcionario1 = setOf(lucas, gessica)
    val funcionario2 = setOf(oliver)

    val resulUnion = funcionario1.union(funcionario2).forEach { println(it) }

    println("--------------------")
    val funcionario3 = setOf(lucas, gessica, oliver)
    val resulSubtract = funcionario3.subtract(funcionario2).forEach { println(it) }

    println("--------------------")
    val resulIntersect = funcionario3.intersect(funcionario2).forEach { println(it) }
}