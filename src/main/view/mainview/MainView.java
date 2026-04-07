package main.view.mainview;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import main.controller.MainController;

public class MainView extends JFrame {

	private MainController mainController;
	
	private JButton creaPersona;
	private JButton modificaPersona;
	private JButton eliminaPersona;
	private TablePanel tablePanel;
	private JToolBar toolBar;

	
	
	public MainView(MainController mainController) {
		
		setTitle("Contatti");
		setLayout(new BorderLayout());

		this.mainController = mainController; 

		tablePanel = new TablePanel();
		tablePanel.setPersone(this.mainController.getListaPersone());
		tablePanel.setBorder(new EmptyBorder(10, 10, 10, 10));


		toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBorder(new EmptyBorder(5, 10, 5, 10));


		creaPersona = new JButton("Nuovo");
		creaPersona.setIcon(new ImageIcon(getClass().getResource("/resources/icons/add.png")));
		creaPersona.setToolTipText("Crea un nuovo contatto");

		modificaPersona = new JButton("Modifica");
		modificaPersona.setIcon(new ImageIcon(getClass().getResource("/resources/icons/edit.png")));
		modificaPersona.setToolTipText("Modifica contatto");


		eliminaPersona = new JButton("Elimina");
		eliminaPersona.setIcon(new ImageIcon(getClass().getResource("/resources/icons/trash.png")));
		eliminaPersona.setToolTipText("Elimina contatto");
		
		toolBar.add(creaPersona);
		toolBar.addSeparator();
		toolBar.add(modificaPersona);
		toolBar.addSeparator();
		toolBar.add(eliminaPersona);

		
		add(toolBar, BorderLayout.NORTH);
		add(tablePanel, BorderLayout.CENTER);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}


	public JButton getCreaPersona() {
		return creaPersona;
	}


	public JButton getModificaPersona() {
		return modificaPersona;
	}


	public JButton getEliminaPersona() {
		return eliminaPersona;
	}

	public TablePanel getTablePanel() {
		return tablePanel;
	}

	public int getIdLine() {
		return tablePanel.getIdLine();
	}
}