package main.view.editview;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import main.controller.EditController;

import java.awt.*;

public class EditorView extends JDialog {

    private JToolBar toolBar;
    private JButton btnSalva; 
    private JButton btnAnnulla; 

    private FormPanel formPanel;

    public EditorView(Frame parent, EditController editController) {

        super(parent, "Editor Persona", true);

        setSize(new Dimension(350, 520));
        setLayout(new BorderLayout());

        toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBorder(new EmptyBorder(5, 10, 5, 10));

        btnSalva = new JButton("Salva");
        btnAnnulla = new JButton("Annulla"); 

        formPanel = new FormPanel();

        
        add(formPanel, BorderLayout.CENTER);

        toolBar.add(btnSalva);
		toolBar.addSeparator();
		toolBar.add(btnAnnulla);

        add(toolBar, BorderLayout.NORTH);

        setLocationRelativeTo(parent);
    }

    public FormPanel getFormPanel() {
        return formPanel;
    }

    public JButton getBtnSalva(){ return btnSalva; }
    public JButton getBtnAnnulla() { return btnAnnulla; }
    
}