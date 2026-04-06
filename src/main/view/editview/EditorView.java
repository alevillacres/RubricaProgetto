package main.view.editview;

import javax.swing.*;

import main.controller.EditController;
import main.controller.MainController;

import java.awt.*;

public class EditorView extends JDialog {

    private JButton btnSalva = new JButton("Salva"); 
    private JButton btnAnnulla = new JButton("Annulla"); 

    private FormPanel formPanel = new FormPanel();
    private JPanel buttonPanel = new JPanel();

    private EditController editController;

    public EditorView(Frame parent, EditController editController) {

        super(parent, "Editor Persona", true);

        setSize(new Dimension(350, 520));
        setLayout(new BorderLayout());
        
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