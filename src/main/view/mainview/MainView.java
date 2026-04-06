package main.view.mainview;

import java.awt.BorderLayout;

import javax.swing.*;

import main.controller.MainController;

public class MainView extends JFrame {

	private MainController mainController;
	
	private JButton creaPersona;
	private JButton modificaPersona;
	private JButton eliminaPersona;
	private JPanel pannello;

	private TablePanel tablePanel;

	
	
	public MainView(MainController mainController) {
		
		setTitle("Contatti");
		setLayout(new BorderLayout());

		this.mainController = mainController; 

		tablePanel = new TablePanel();
		tablePanel.setPersone(this.mainController.getListaPersone());

		pannello = new JPanel();
		creaPersona = new JButton("Nuovo");
		modificaPersona = new JButton("Modifica");
		eliminaPersona = new JButton("Elimina");

		
		pannello.add(creaPersona);
		pannello.add(modificaPersona);
		pannello.add(eliminaPersona);

		add(tablePanel, BorderLayout.CENTER);
		add(pannello, BorderLayout.SOUTH);

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