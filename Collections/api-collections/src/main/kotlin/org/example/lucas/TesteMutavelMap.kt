package org.example.lucas

fun main() {
    val lucas = Funcionario("Lucas", 2000.0, "CLT")
    val gessica = Funcionario("Gessica", 1500.0, "PJ")
    val oliver = Funcionario("Oliver", 4500.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(lucas.nome, lucas)
    repositorio.create(gessica.nome, gessica)
    repositorio.create(oliver.nome, oliver)

    println(repositorio.findById(lucas.nome))

    println("---------------------")
    repositorio.findAll().forEach { println(it) }

    println("---------------------")
    repositorio.remover(lucas.nome)
    repositorio.findAll().forEach { println(it) }
}