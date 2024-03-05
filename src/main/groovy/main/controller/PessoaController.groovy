package main.controller

import main.bd.Bd
import main.model.pessoa.PessoaFisica
import main.model.pessoa.PessoaJuridica

class PessoaController {
    String tipo

    PessoaController(String tipo){
        this.tipo = tipo
    }

    def action(){
        if (tipo == 'fisica'){
            return listarCandidatos()
        } else if(tipo == 'juridica'){
            return listarEmpresas()
        } else {
            println("Rota não encontrada")
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
