package one.digitalinovation.digitalbanbank.testes

import one.digitalinovation.digitalbanbank.Analista
import one.digitalinovation.digitalbanbank.Funcionario
import one.digitalinovation.digitalbanbank.Gerente
import java.math.BigDecimal

fun main() {
    val joao = Gerente(nome = "João josé",  cpf = "072.987.758.23", 5000.0)

  imprimeRelatorioFuncionario.imprime(joao)


}
