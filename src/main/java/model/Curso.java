package model;

public class Curso {
    private Long id;
    private String nome;
    private String autor;

    public Curso(Long id, String nome, String autor) {
        super();
        this.id = id;
        this.nome = nome;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
