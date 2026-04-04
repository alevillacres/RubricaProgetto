package main.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import main.model.Persona;

public class PersistenceManager {

    public static Vector<Persona> caricaInformazioni(File informazioni){
        Vector<Persona> listaPersone = new Vector<>();
        
		if(!informazioni.exists()) {
			return listaPersone;
		}

        try (Scanner scanner = new Scanner(informazioni)){

			while(scanner.hasNextLine()){

				String line = scanner.nextLine();

				if (line.trim().isEmpty()) continue;

				String[] parti = line.split(";");

				if(parti.length != 5) 
					throw new IllegalArgumentException("Formato riga non valido (attesi 5 campi): " + line);
				
				String nome = parti[0].trim();
				String cognome = parti[1].trim();
				String indirizzo = parti[2].trim();
				String telefono = parti[3].trim();
				int eta = Integer.parseInt(parti[4].trim());
				listaPersone.add(new Persona(nome, cognome, indirizzo, telefono, eta));
			}
            
		} catch (FileNotFoundException e) {
			System.err.print("File non trovato: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println("Errore nei dati: " + e.getMessage());
		}

        return listaPersone;
    }
}
