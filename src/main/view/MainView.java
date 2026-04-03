package main.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
	
	private JButton creaPersona;
	private JButton modificaPersona;
	private JButton eliminaPersona;
	private JPanel pannello;

	private JTable listaPersone;
	
	public MainView() {
		setTitle("Contacts");

		pannello = new JPanel();
		add(pannello);

		creaPersona = new JButton("Nuovo");
		modificaPersona = new JButton("Modifica");
		eliminaPersona = new JButton("Elimina");

		pannello.add(creaPersona);
		pannello.add(modificaPersona);
		pannello.add(eliminaPersona);

		listaPersone = new JTable();

		pannello.add(listaPersone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}
	
}