package main.view.loginView;

import java.awt.*;

import javax.swing.*;


public class LoginView extends JFrame{
    
    private FormPanelLogin formPanelLogin;
    private JPanel btnPanel;
    private JButton loginButton;

    public LoginView() {

        setTitle("Login - Rubrica");
		setLayout(new BorderLayout());

        formPanelLogin = new FormPanelLogin();
        loginButton = new JButton("Login");
        btnPanel = new JPanel();

        add(formPanelLogin, BorderLayout.CENTER);
        btnPanel.add(loginButton);
        add(btnPanel, BorderLayout.SOUTH);

        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        setVisible(true);  

    }

    
    public JButton getLoginButton() {
        return loginButton;
    }


    public String getUsername() {
        return formPanelLogin.getUsername();
    }


    public String getPassword() {
        return formPanelLogin.getPassword();
    }


    public void setPasswordField(String string) {
        formPanelLogin.setPasswordField(string);
    }
}
