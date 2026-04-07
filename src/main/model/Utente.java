package main.model;

public class Utente {
    private String username;
    private String password;
    
    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object utente) {
        if (this == utente) return true;

        if (utente == null || getClass() != utente.getClass()) return false;

        Utente altroUtente = (Utente) utente;

        return this.username.equals(altroUtente.getUsername()) && this.password.equals(altroUtente.getPassword());
    }

    
}
