package main.view.editview;

import javax.swing.*;

import main.controller.EditController;

import java.awt.*;

public class EditorView extends JDialog {

    private JButton btnSalva; 
    private JButton btnAnnulla; 

    private FormPanel formPanel;
    private JPanel buttonPanel;

    public EditorView(Frame parent, EditController editController) {

        super(parent, "Editor Persona", true);

        setSize(new Dimension(350, 520));
        setLayout(new BorderLayout());

        btnSalva = new JButton("Salva");
        btnAnnulla = new JButton("Annulla"); 
        formPanel = new FormPanel();
        buttonPanel = new JPanel();

        
        add(formPanel, BorderLayout.CENTER);

        buttonPanel.add(btnSalva);
        buttonPanel.add(btnAnnulla);
        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(parent);
    }

    public FormPanel getFormPanel() {
        return formPanel;
    }

    public JButton getBtnSalva(){ return btnSalva; }
    
}