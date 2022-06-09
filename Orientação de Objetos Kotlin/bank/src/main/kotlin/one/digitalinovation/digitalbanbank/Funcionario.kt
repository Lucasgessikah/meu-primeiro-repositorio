package one.digitalinovation.digitalbanbank

import java.math.BigDecimal

abstract class Funcionario(
      nome: String,
      cpf: String,
      val salario: Double
): Pessoa(nome, cpf) {
     protected abstract fun calculoAuxilio(): Double
    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        salário: $salario
        auxilio: ${calculoAuxilio()}
        
    """.trimIndent()

}