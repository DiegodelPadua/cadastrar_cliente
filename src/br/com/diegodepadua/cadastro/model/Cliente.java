package br.com.diegodepadua.cadastro.model;

import java.time.LocalDate;

public class Cliente {

    public String id;
    public String nome;
    public String email;
    public LocalDate dataNascimento;
    public double salario;

    public void exibirCliente(){
        System.out.println("ID: " + id);
        System.out.println("NOME: " + nome);
        System.out.println("EMAIL: " + email);
        System.out.println("DATA NASCIMENTO: " + dataNascimento);
        System.out.println("SALÁRIO: " + salario);

    }

}
