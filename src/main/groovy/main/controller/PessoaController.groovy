package main.controller

import main.bd.Bd
import main.model.pessoa.PessoaFisica
import main.model.pessoa.PessoaJuridica

class PessoaController {
    String action
    Map params
    int status

    PessoaController(String action, Map params = [:]){
        this.action = action
        this.params = params
    }

    def action(){
        if (!action){
            println("Pessoa Controller não tem action")
            return null
        }

        switch (action){
            case 'listarCandidatos':
                return listarCandidatos()
            case 'listarEmpresas':
                return listarEmpresas()
            case 'inserir_candidato':
                return inserirCandidato(params)
            case 'inserir_empresa':
                return inserirEmpresa(params)
            default:
                println("Rota não encontrada")
        }
    }

    Map inserirCandidato(Map params){
        PessoaFisica candidato = new PessoaFisica(params)

        if (candidato.save()){
            return [candidato: candidato, status: 200]
        } else {
            return [status: 422]
        }
    }

    Map inserirEmpresa(Map params){
        PessoaJuridica empresa = new PessoaJuridica(params)

        if (empresa.save()){
            return [empresa: empresa, status: 200]
        } else {
            return [status: 422]
        }
    }

    def listarCandidatos(){
        def cadidatos = []

        Bd.pessoas.each { pessoa ->
            if (pessoa.getClass().is(PessoaFisica)){
                cadidatos << pessoa
            }
        }

        cadidatos
    }

    def listarEmpresas(){
        def empresas = []

        Bd.pessoas.each { pessoa ->
            if (pessoa.getClass().is(PessoaJuridica)){
                empresas << pessoa
            }
        }

        empresas
    }
}
