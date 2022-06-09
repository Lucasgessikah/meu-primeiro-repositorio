package one.digitalinovation.digitalbanbank.testes

import one.digitalinovation.digitalbanbank.Analista
import one.digitalinovation.digitalbanbank.Funcionario
import java.math.BigDecimal

fun main() {
    val santos = Analista(nome = "Santos josé",  cpf = "012.987.758.23", 2000.0)

  imprimeRelatorioFuncionario.imprime(santos)


}
