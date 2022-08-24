fun main() {

   val cachorro= Cachorro("Goda",4)
   val cavalo = Cavalo("Flash", 9)
   val preguica = Preguica("Soneca",6)

   var zoo = mutableListOf<Animal>()

   zoo.add(cachorro)
   zoo.add(cavalo)
   zoo.add(preguica)

   while(true){
      println("(1) - Listar animais")
      println("(2) - Emitir som")
      println("(3) - Realizar ação")
      println("(0) - Sair")

      println("opção: ")
      val opc = readln().toInt()

      when(opc){
         1 -> {
            for(animais in zoo){
               println(animais.toString())
            }
         }
         2 -> {
            for(animal in zoo){
               animal.som()
            }
         }
         3 -> {
            for(animal in zoo){
               animal.acao()
            }
         }
         0 -> break

         else -> println("Opção inválida")
      }
   }

}