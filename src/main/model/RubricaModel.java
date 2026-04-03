package main.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class RubricaModel {
    
    private Vector<Persona> listaPersone;
	final private File informazioni = new File("src/resources/informazioni.txt");

    public RubricaModel(Vector<Persona> listaPersone) {
        this.listaPersone = listaPersone;
		caricaInformazioni();
    }

    public void caricaInformazioni() {
		
	}
    
    /**
	 * @return the listaPersone
	 */
	public Vector<Persona> getListaPersone() {
		return listaPersone;
	}

	public boolean aggiungiPersona(Persona persona) {
    	if (persona != null) {
    		return listaPersone.add(persona);
    	}
    	return false;
    }
    
    
    public void eliminaPersona(int indice) {
    	if (indice >= 0 && indice < listaPersone.size()) {
    		listaPersone.remove(indice);
    	}
    }
    
    
}
