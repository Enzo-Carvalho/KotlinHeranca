class Preguica(
    nome:String,
    idade: Int): Animal(nome, idade) {

    override fun som() {
        println("aaaaaaaw")
    }

    override fun acao() {
        println("Subir em arvores")
    }

    override fun toString(): String {
        return "Preguiça\n"+
                "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}