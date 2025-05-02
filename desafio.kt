// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (var nome: String = "", var email: String = "")

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel = Nivel.BASICO)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val usuario1 = Usuario("Maria", "maria@gmail.com")
    val usuario2 = Usuario("João", "joao@gmail.com")

    val conteudo1 = ConteudoEducacional("Kotlin Básico", 120)
    val conteudo2 = ConteudoEducacional("Kotlin Intermediário", 90, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Kotlin Avançado", 150, Nivel.DIFICIL)

    val formacao1 = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    println("Conteúdos da formação ${formacao1.nome}:")
    formacao1.conteudos.forEach { println(it.nome) }
}
