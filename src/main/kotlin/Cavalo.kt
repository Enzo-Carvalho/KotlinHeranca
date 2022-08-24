class Cavalo(
    nome: String,
    idade: Int): Animal(nome,idade) {

    override fun acao() {
        println("Correndo estilo cavalo")
    }

    override fun som() {
        println("pócótó")
    }

    override fun toString(): String {
        return "Cavalo\n"+
                "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}