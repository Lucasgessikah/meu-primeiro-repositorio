package org.example.lucas

fun main() {
    val lucas = Funcionario("Lucas", 2000.0, "CLT")
    val gessica = Funcionario("Gessica", 1500.0, "PJ")
    val oliver = Funcionario("Oliver", 4500.0, "CLT")

    println("----------List-----------")
    val funcionarios = mutableListOf(lucas, gessica)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.add(oliver)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.remove(lucas)
    funcionarios.forEach { println(it) }

    println("---------Set----------")
    val funcionarioSet = mutableSetOf(lucas)
    funcionarioSet.add(gessica)
    funcionarioSet.add(oliver)
    funcionarioSet.forEach { println(it) }

    println("----------------------------")
    funcionarioSet.remove(oliver)
    funcionarioSet.forEach { println(it) }
}