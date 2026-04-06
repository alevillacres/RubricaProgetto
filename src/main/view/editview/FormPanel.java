package main.view.editview;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

public class FormPanel extends JPanel{

    private JTextField textNome;
    private JTextField textCognome;
    private JTextField textIndirizzo;
    private JTextField textTelefono;

    private SpinnerModel model = new SpinnerNumberModel(18, 0, 120, 1);
    private JSpinner spinnerEta;
    
    private final JLabel[] listJLabels = {new JLabel("Nome:"), new JLabel("Cognome:"), new JLabel("Indirizzo:"), new JLabel("Telefono:"), new JLabel("Eta:")}; 

    
    public FormPanel() {

        setLayout(new GridBagLayout());
        
        textNome = new JTextField(20);
        textCognome = new JTextField(20);
        textIndirizzo = new JTextField(20);
        textTelefono = new JTextField(20);
        spinnerEta = new JSpinner(model);
        
        
        JTextField[] fields = {textNome, textCognome, textIndirizzo, textTelefono};

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 0.01;
        gbc.weighty = 0.01;
        for (int i = 0; i < listJLabels.length - 1; i++) {

            gbc.gridx = 0;
            gbc.gridy = i;
            
            add(listJLabels[i], gbc);

            gbc.gridx = 1;
            add(fields[i], gbc);
        }
            gbc.gridx = 0;
            gbc.gridy = listJLabels.length - 1;

            add(listJLabels[listJLabels.length - 1], gbc);

            gbc.gridx = 1;
            add(spinnerEta, gbc);
    }


    public String getTextNome() {
        return textNome.getText();
    }


    public String getTextCognome() {
        return textCognome.getText();
    }


    public String getTextIndirizzo() {
        return textIndirizzo.getText();
    }


    public String getTextTelefono() {
        return textTelefono.getText();
    }


    public int getTextEta() {
        return (Integer)spinnerEta.getValue();
    }

    public void setTextNome(String textNome) {
        this.textNome.setText(textNome);
    }


    public void setTextCognome(String textCognome) {
        this.textCognome.setText(textCognome);
    }


    public void setTextIndirizzo(String textIndirizzo) {
        this.textIndirizzo.setText(textIndirizzo);
    }


    public void setTextTelefono(String textTelefono) {
        this.textTelefono.setText(textTelefono);
    }

    public void setSpinnerEta(int spinnerEta) {
        this.spinnerEta.setValue(spinnerEta);
    }
    

}
