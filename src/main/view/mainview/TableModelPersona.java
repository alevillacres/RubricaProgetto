package main.view.mainview;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import main.model.Persona;

public class TableModelPersona extends AbstractTableModel{

    private Vector<Persona> listaPersone;
    private String[] nomiColonne = {"Nome", "Cognome", "Telefono"};
    
    public TableModelPersona() {
        
    }

    public void setPersone(Vector<Persona> listaPersone) {
        this.listaPersone = listaPersone;
    }

    
    @Override
    public String getColumnName(int column) {
        return nomiColonne[column];
    }

    @Override
    public int getColumnCount() {
        return 3;    
    }

    @Override
    public int getRowCount() {
        return listaPersone.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Persona persona = listaPersone.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return persona.getNome();
            case 1:
                return persona.getCognome();
            case 2:
                return persona.getTelefono();
            default:
                return null;
        }
    }
    
}
