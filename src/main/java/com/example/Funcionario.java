package com.example;

 //1 - Crie uma classe que representa um funcionário registrando seu nome, salario e data de admissão

public class Funcionario {
    private String nome;
    private Float salario;
    private String admissao;

    public Funcionario (String nome, Float salario, String admissao) {
        this.nome = nome;
        this.salario = salario;
        this.admissao = admissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getSalario() {
        return salario;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public void NovoSalario(){
        float Reajuste = salario * 0.1f;
        this.salario = salario + Reajuste;
    }

    
}
