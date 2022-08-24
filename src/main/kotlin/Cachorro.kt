class Cachorro(
    nome: String,
    idade: Int) : Animal(nome, idade) {

    override fun acao(){
        println("Correndo como um cachorro")
    }

    override fun som() {
        println("auau")
    }

    override fun toString(): String {
        return "Cachorro\n"+
                "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}