package main.view.mainview;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.*;

import main.model.Persona;
public class TablePanel extends JPanel {
    private JTable table;
    private TableModelPersona tableModelPersona;

    public TablePanel(){
        tableModelPersona = new TableModelPersona();
        table = new JTable(tableModelPersona);

        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void setPersone(Vector<Persona> listaPersone) {
        tableModelPersona.setPersone(listaPersone);
    }

    public void aggiorna() {
        tableModelPersona.fireTableDataChanged();
    }
}
