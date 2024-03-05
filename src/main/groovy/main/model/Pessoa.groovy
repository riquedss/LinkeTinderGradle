package main.model
import main.bd.Bd

class Pessoa {
    String nome, email, estado, cep, descricao
    ArrayList <Competencia> competencias = []

    def addCompetencia(Competencia competencia){
        competencias.push(competencia)
    }

    def save() {
        boolean pessoaValida = this.valida()

        if(pessoaValida){
            Bd.pessoas << this
        }

        return pessoaValida
    }

    private boolean valida(){
        if(!this.nome){
            return false
        }

        return true
    }
}
