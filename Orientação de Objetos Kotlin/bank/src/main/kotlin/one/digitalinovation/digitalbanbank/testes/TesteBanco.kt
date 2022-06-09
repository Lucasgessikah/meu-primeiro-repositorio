package one.digitalinovation.digitalbanbank.testes

import one.digitalinovation.digitalbanbank.Banco

fun main() {
    val digiOneBank = Banco(nome ="DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}