package main.controller

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class PessoaControllerTest {
    @Test
    void inserirCandidatoBdValido(){
        Map candidato = [nome: "João Silva",
         email: "joao.silva@email.com",
         estado: "São Paulo", cep: "12345678",
         descricao: "João é um estudante universitário interessado em tecnologia.",
         cpf: "12345678901",
         DataNascimento: "05/08/1998"]

        PessoaController controller = new PessoaController("inserir_candidato", candidato)

       Map resultado = controller.action()
       assertEquals(resultado.status, 200)
    }

    @Test
    void inserirCandidatoBdInvalido(){
        Map candidato = [email: "joao.silva@email.com",
                         estado: "São Paulo", cep: "12345678",
                         descricao: "João é um estudante universitário interessado em tecnologia.",
                         cpf: "12345678901",
                         DataNascimento: "05/08/1998"]

        PessoaController controller = new PessoaController("inserir_candidato", candidato)

        Map resultado = controller.action()
        assertEquals(resultado.status, 422)
    }

    @Test
    void inserirEmpresasBdValido(){
        Map empresa = [nome: "Empresa B",
                       email: "contato@empresaB.com",
                       estado: "Rio de Janeiro",
                       cep: "87654321",
                       descricao: "Empresa B é uma empresa de consultoria financeira.",
                       cnpj: "98765432109876",
                       pais: "Brasil"]

        PessoaController controller = new PessoaController("inserir_empresa", empresa)

        Map resultado = controller.action()
        println(resultado)
        assertEquals(resultado.status, 200)
    }

    @Test
    void inserirEmpresasBdInvalido(){
        Map empresa = [email: "contato@empresaB.com",
                       estado: "Rio de Janeiro",
                       cep: "87654321",
                       descricao: "Empresa B é uma empresa de consultoria financeira.",
                       cnpj: "98765432109876",
                       pais: "Brasil"]

        PessoaController controller = new PessoaController("inserir_empresa", empresa)

        Map resultado = controller.action()
        println(resultado)
        assertEquals(resultado.status, 422)
    }
}
