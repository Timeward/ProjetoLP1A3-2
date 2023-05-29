
public class Modelo{
    // TODO: 29/05/2023 criar atributos, metodos e construtores auto id
    private Long id;
    private String nome;
    private List<Peca> pecas;
    private Double multiplicador;

    public Modelo(String nome, List<Peca> pecas, Double multiplicador) {
        this.nome = nome;
        this.pecas = pecas;
        this.multiplicador = multiplicador;
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

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public Double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Double multiplicador) {
        this.multiplicador = multiplicador;
    }
}