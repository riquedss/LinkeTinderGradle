package main

import main.model.pessoa.*
import main.view.PrincipalView

class Main {
    static void main(def args){
        new PessoaFisica(nome: "João Silva",
                email: "joao.silva@email.com",
                estado: "São Paulo", cep: "12345678",
                descricao: "João é um estudante universitário interessado em tecnologia.",
                cpf: "12345678901",
                DataNascimento: "05/08/1998").save()

        new PessoaFisica(nome: "Maria Souza",
                email: "maria.souza@email.com",
                estado: "Rio de Janeiro",
                cep: "87654321",
                descricao: "Maria é uma profissional da área de saúde apaixonada por ajudar os outros.",
                cpf: "98765432109",
                DataNascimento: "15/03/1985").save()

        new PessoaFisica(nome: "Pedro Oliveira",
                email: "pedro.oliveira@email.com",
                estado: "Minas Gerais",
                cep: "34567890",
                descricao: "Pedro é um artista plástico que adora viajar e se inspirar em diferentes culturas.",
                cpf: "56789012345",
                DataNascimento: "20/11/1980").save()

        new PessoaFisica(nome: "Ana Santos", email: "ana.santos@email.com",
                estado: "Bahia",
                cep: "98765432",
                descricao: "Ana é uma advogada dedicada aos direitos humanos e à justiça social.",
                cpf: "34567890123",
                DataNascimento: "10/09/1976").save()

        new PessoaFisica(nome: "Carlos Pereira",
                email: "carlos.pereira@email.com",
                estado: "Paraná",
                cep: "23456789",
                descricao: "Carlos é um engenheiro apaixonado por inovação e sustentabilidade.",
                cpf: "67890123456",
                DataNascimento: "25/06/1990").save()

        new PessoaJuridica(nome: "Empresa A",
                email: "contato@empresaA.com",
                estado: "São Paulo",
                cep: "12345678",
                descricao: "Empresa A é uma startup de tecnologia focada em soluções de inteligência artificial.",
                cnpj: "12345678901234",
                pais: "Brasil").save()

        new PessoaJuridica(nome: "Empresa B",
                email: "contato@empresaB.com",
                estado: "Rio de Janeiro",
                cep: "87654321",
                descricao: "Empresa B é uma empresa de consultoria financeira especializada em investimentos sustentáveis.",
                cnpj: "98765432109876",
                pais: "Brasil").save()

        new PessoaJuridica(nome: "Empresa C",
                email: "contato@empresaC.com",
                estado: "Minas Gerais",
                cep: "34567890",
                descricao: "Empresa C é uma fabricante de produtos naturais e orgânicos, comprometida com a sustentabilidade ambiental.",
                cnpj: "56789012345678",
                pais: "Brasil").save()

        new PessoaJuridica(nome: "Empresa D",
                email: "contato@empresaD.com",
                estado: "Bahia",
                cep: "98765432",
                descricao: "Empresa D é uma ONG dedicada à proteção e conservação da vida marinha.",
                cnpj: "34567890123456",
                pais: "Brasil").save()

        new PessoaJuridica(nome: "Empresa E",
                email: "contato@empresaE.com",
                estado: "Paraná",
                cep: "23456789",
                descricao: "Empresa E é uma desenvolvedora de software especializada em soluções empresariais de gestão.",
                cnpj: "67890123456789",
                pais: "Brasil").save()

        PrincipalView.main()
    }
}