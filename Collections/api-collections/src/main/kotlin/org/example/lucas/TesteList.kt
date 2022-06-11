package org.example.lucas

fun main() {
    val lucas = Funcionario("Lucas", 2000.0, "CLT")
    val gessica = Funcionario("Gessica", 1500.0, "PJ")
    val oliver = Funcionario("Oliver", 4500.0, "CLT")

    val funcionarios = listOf(lucas, gessica, oliver)

    funcionarios.forEach { println(it) }

    println("------------------")
    println(funcionarios.find { it.nome == "Gessica" })

    println("-------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-------------------")
    funcionarios.groupBy { it.tipoContracacao }.forEach { println(it) }
}