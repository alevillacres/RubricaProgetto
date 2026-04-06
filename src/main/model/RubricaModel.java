package main.model;

import java.io.File;
import java.util.Vector;

import main.utils.PersistenceManager;

public class RubricaModel {
    
    private Vector<Persona> listaPersone;
	final private File informazioni = new File("src/resources/informazioni.txt");

    public RubricaModel() {
        this.listaPersone = PersistenceManager.caricaInformazioni(informazioni);
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
    
    public Persona getPersona(int index) {
		return listaPersone.get(index);
	}

    public void modificaPersona(Persona personaModificata, int index) {
        listaPersone.set(index, personaModificata);
    }
}
