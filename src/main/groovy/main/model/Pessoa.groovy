package main.model
import main.bd.Bd

class Pessoa {
    String nome, email, estado, cep, descricao
    ArrayList <Competencia> competencias = []

    def addCompetencia(Competencia competencia){
        competencias.push(competencia)
    }

    def save() {
        Bd.pessoas << this
    }
}
