
package com.mycompany.aula1;

public class Aluno {
    
    private int id_aluno;
    private String nome ;
    private String ra;
    private double nota;
    private String telefone;        
    private String senha;

    public Aluno(int id_aluno, String nome, String ra, double nota, String telefone, String senha) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
        this.telefone = telefone;
        this.senha = senha;
    }

    // Construtor sem ID (para novos cadastros, o banco gera o ID automaticamente)
    public Aluno(String nome, String ra, double nota, String telefone, String senha) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Aluno(String ra, String senha) {
        this.ra = ra;
        this.senha = senha;
    }
    
    public int getId_aluno(){
        return this.id_aluno;
    }
    
    public void setId_aluno(int id_aluno){
        this.id_aluno = id_aluno;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRa(){
        return this.ra;
    }
    
    public void setRa(String ra){
        this.ra = ra;
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public void setNota(Double nota){
        this.nota = nota;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getSenha() {
        return senha;
    }   
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
