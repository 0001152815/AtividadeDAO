package Modelo;

import java.util.Date;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String senha;
    private Date dataNascimento;
    private String telefone;
    private String endereco;
    private String estado;

    // Construtor completo (ajustado para ordem do Main)
    public Professor(int id, String nome, String cpf, String rg, String email, String senha, Date dataNascimento, String telefone, String endereco, String estado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.estado = estado;
    }

    public Professor() {}

    // ATENÇÃO: É necessário implementar todos os getters e setters aqui.
    // Exemplo:
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    // ... (Implemente os demais métodos get/set para CPF, RG, etc.)
    public String getCpf() { return cpf; }
    public Date getDataNascimento() { return dataNascimento; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getRg() { return rg; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public String getEstado() { return estado; }
}