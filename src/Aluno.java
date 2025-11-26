public class Aluno {

    // Atributos de Aluno
    private String nome;

    private String email;

    private int id;

    // Construtores
    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Aluno(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Métodos getters e setters
    public int getId() {
        return id;

    }

    public void setId() {
        this.id = id;

    }

    public String getNome(){
        return nome;

    }

    public void setNome(){
        this.nome = nome;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
