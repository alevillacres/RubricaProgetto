package main.view.editview;

import javax.swing.*;
import java.awt.*;

public class EditorView extends JDialog {

    private JTextField txtNome = new JTextField(10);
    private JTextField txtCognome = new JTextField(10);
    private JTextField txtIndirizzo = new JTextField(10);
    private JTextField txtTelefono = new JTextField(10);
    private JTextField txtEta = new JTextField(10);
    
    private JButton btnSalva = new JButton("Salva"); 
    private JButton btnAnnulla = new JButton("Annulla"); 

    public EditorView(Frame parent) {
        super(parent, "Editor Persona"); 
        setLayout(new BorderLayout());

        
        JPanel p = new JPanel(new GridLayout(5, 2, 5, 5));
        
        p.add(new JLabel("Nome:")); 
        p.add(txtNome);
        p.add(new JLabel("Cognome:")); 
        p.add(txtCognome);
        p.add(new JLabel("Indirizzo:"));
        p.add(txtIndirizzo);
        p.add(new JLabel("Telefono:"));
        p.add(txtTelefono);
        p.add(new JLabel("Età:")); 
        p.add(txtEta);

        add(p, BorderLayout.CENTER);

        JPanel bp = new JPanel();
        bp.add(btnSalva);
        bp.add(btnAnnulla);
        add(bp, BorderLayout.SOUTH);

        setLocationRelativeTo(parent);
    }
}