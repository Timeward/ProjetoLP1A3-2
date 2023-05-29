package com.example.projetolp1a32.classes;

public class Usuario{
    private static Long id = 0L;
    private String nomeUsuario;
    private String senhaUsuario;
    private String emailUsuario;

    public Usuario(String nomeUsuario, String senhaUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
        this.emailUsuario = emailUsuario;
        id = id++;
        // TODO: 29/05/2023 criar ID automaticamente
    }

    public Long getId() {
        return id;
    }

    // Como o id é unico não poderia muda-lo
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
}