package main.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import main.model.Persona;

public class PersistenceManager {
    public static Vector<Persona> caricaInformazioni(File informazioni){
        Vector<Persona> listaPersone = new Vector<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(informazioni))){

			String line;

			while((line = br.readLine()) != null){

				if (line.trim().isEmpty()) continue;

				String[] parti = line.split(";");

				if(parti.length != 5) 
					throw new IllegalArgumentException("Formato riga non valido (attesi 5 campi): " + line);

				listaPersone.add(new Persona(parti[0], parti[1], parti[2], parti[3], Integer.parseInt(parti[4].trim())));
			}
			br.close();
            
		} catch (IOException e) {
			System.err.print("File non trovato: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println("Errore nei dati: " + e.getMessage());
		}

        return listaPersone;
    }
}
