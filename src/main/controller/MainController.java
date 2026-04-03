package main.controller;

import java.util.Vector;

import main.model.Persona;
import main.model.RubricaModel;

public class MainController {
    private RubricaModel rubricaModel;
  
    public MainController () {
        rubricaModel = new RubricaModel();
    }
    
    public Vector<Persona> getListaPersone() {
        return rubricaModel.getListaPersone();
    }
}