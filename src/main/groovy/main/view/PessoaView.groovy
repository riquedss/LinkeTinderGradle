package main.view
import main.controller.PessoaController;

class PessoaView {
    static void listarCandidatos() {
        PessoaController controller = new PessoaController('fisica')
        println(controller.tipo)
        def response = controller.action()

        if(!response){
            println("erro")
        }

        headerCandidatos()
        response.each { candidato ->
            println("|nome: ${candidato.nome}")
            println("|email: ${candidato.email}")
            println("|estado: ${candidato.estado}")
            println("|cep: ${candidato.cep}")
            println("|descricao: ${candidato.descricao}")
            println("|cpf: ${candidato.cpf}")
            println("|data nascimento: ${candidato.DataNascimento}")
            println();
        }
    }

    static void listarEmpresas() {
        PessoaController controller = new PessoaController('juridica')
        def response = controller.action()

        if(!response){
            println("erro")
        }

        headerEmpresas()
        response.each { empresa ->
            println("|nome: ${empresa.nome}")
            println("|email: ${empresa.email}")
            println("|estado: ${empresa.estado}")
            println("|cep: ${empresa.cep}")
            println("|descricao: ${empresa.descricao}")
            println("|cnpj: ${empresa.cnpj}")
            println("|pais: ${empresa.pais}")
            println();
        }
    }

    static void headerCandidatos(){
        println(" ___________________________________________________ ");
        println("|                   CANDIDATOS                      |");
        println("|___________________________________________________|");
    }

    static void headerEmpresas(){
        println(" ___________________________________________________ ");
        println("|                    EMPRESAS                       |");
        println("|___________________________________________________|");
    }
}
