package org.example.lucas

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContracacao: String
){
    override fun toString(): String = """
        nome: $nome
        salário: $salario
    """.trimIndent()
}