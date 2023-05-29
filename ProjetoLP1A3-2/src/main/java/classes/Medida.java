public class Medida{
    // TODO: 29/05/2023 criar atributos, metodos e construtores, auto id
    private Long id;
    private String nome;
    private Double tamanho;

    public Medida(String nome, Double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
}