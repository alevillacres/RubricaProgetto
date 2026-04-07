package main.view.mainview;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.JTableHeader;

import main.model.Persona;
public class TablePanel extends JPanel {
    private JTable table;
    private TableModelPersona tableModelPersona;

    public TablePanel(){
        tableModelPersona = new TableModelPersona();
        table = new JTable(tableModelPersona);
        
        JTableHeader header = table.getTableHeader();
        header.setFont(header.getFont().deriveFont(Font.BOLD));


        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void setPersone(Vector<Persona> listaPersone) {
        tableModelPersona.setPersone(listaPersone);
    }

    public void aggiorna() {
        tableModelPersona.fireTableDataChanged();
    }

    public TableModelPersona getTableModelPersona() { return tableModelPersona; }

    public int getIdLine() {
        return table.getSelectedRow();
    }

    
}
