public class Cliente{
    // TODO: 29/05/2023
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private List<Medida> medidas;

    public Cliente(String nome, String telefone, String email, List<Medida> medidas) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.medidas = medidas;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Medida> getMedidas() {
        return medidas;
    }

    public void setMedidas(List<Medida> medidas) {
        this.medidas = medidas;
    }
}