package main.view;

import javax.swing.*;

import main.controller.MainController;

public class MainView extends JFrame {

	private MainController mainController;
	
	private JButton creaPersona;
	private JButton modificaPersona;
	private JButton eliminaPersona;
	private JPanel pannello;

	private TablePanel tablePanel;

	
	public MainView() {
		
		setTitle("Contacts");
		mainController = new MainController();
		
		tablePanel = new TablePanel();
		

		tablePanel.setPersone(mainController.getListaPersone());

		pannello = new JPanel();
		add(pannello);

		creaPersona = new JButton("Nuovo");
		modificaPersona = new JButton("Modifica");
		eliminaPersona = new JButton("Elimina");

		add(tablePanel);
		pannello.add(creaPersona);
		pannello.add(modificaPersona);
		pannello.add(eliminaPersona);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	
	public void initController(MainController mainController) {
        if(this.mainController != null){
            throw new IllegalStateException("Main controller can only be initialized once.");
        }
        this.mainController = mainController;
    }
}