package one.digitalinovation.digitalbanbank.testes

import one.digitalinovation.digitalbanbank.Cliente
import one.digitalinovation.digitalbanbank.ClienteTipo
import one.digitalinovation.digitalbanbank.Pessoa

fun main() {
    val pedro = Cliente(
        nome = "Pedro Rodrigues",
        cpf = "123.456.789-41",
        clienteTipo = ClienteTipo.PF,
        senha = "12345"
    )

    println(pedro)

    TesteAutenticacao().autentica(pedro)
}