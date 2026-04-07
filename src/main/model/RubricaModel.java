package main.model;

import java.io.File;
import java.util.Vector;

import main.utils.PersistenceManager;

public class RubricaModel {
    
    private Vector<Persona> listaPersone;
	final private File informazioni = new File("informazioni.txt");

    public RubricaModel() {
        this.listaPersone = PersistenceManager.caricaInformazioni(informazioni);
    }

	public Vector<Persona> getListaPersone() {
		return listaPersone;
	}

	public void aggiungiPersona(Persona persona) {
    	if (persona != null) {
    		listaPersone.add(persona);
			PersistenceManager.salvaInformazioni(informazioni, listaPersone);
    	}
    }
    
 	public void modificaPersona(Persona personaModificata, int index) {
        listaPersone.set(index, personaModificata);
		PersistenceManager.salvaInformazioni(informazioni, listaPersone);
    }

    public void eliminaPersona(int indice) {
    	if (indice >= 0 && indice < listaPersone.size()) {
    		listaPersone.remove(indice);
    	}
		PersistenceManager.salvaInformazioni(informazioni, listaPersone);
    }
    
    public Persona getPersona(int index) {
		return listaPersone.get(index);
	}
   
}
