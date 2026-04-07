package main.controller;

import javax.swing.JOptionPane;

import main.model.Utente;
import main.view.loginView.LoginView;

public class LoginController {
    private LoginView loginView;
    private Utente utente;

    public LoginController() {
        loginView = new LoginView();
        utente = new Utente(null, null);

        this.loginView.getLoginButton().addActionListener(e -> enter());
    }

    private void enter() {
        if(isLoginCorrect()){
            loginView.dispose();
            new MainController();
        }else{
            JOptionPane.showMessageDialog(loginView, "Credenziali non corrette.", "Errore", JOptionPane.ERROR_MESSAGE);
            loginView.setPasswordField("");
        }

    }

    private boolean isLoginCorrect() {
        Utente admin = new Utente("admin", "admin");

        utente.setUsername(loginView.getUsername());
        utente.setPassword(loginView.getPassword());

        return admin.equals(utente);
    }


}
