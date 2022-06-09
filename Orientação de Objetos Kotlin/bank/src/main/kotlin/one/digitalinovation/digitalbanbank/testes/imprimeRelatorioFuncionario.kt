package one.digitalinovation.digitalbanbank.testes

import one.digitalinovation.digitalbanbank.Funcionario

class imprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}