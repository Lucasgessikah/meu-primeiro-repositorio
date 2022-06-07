package one.digitalinovation.digitalbanbank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "056.498.743-36"
    private set

}

fun main() {
    val lucas =Pessoa()

    println(lucas.nome)
    println(lucas.cpf)

}