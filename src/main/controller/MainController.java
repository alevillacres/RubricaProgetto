package main.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import main.model.Persona;
import main.model.RubricaModel;
import main.view.mainview.MainView;

public class MainController {
    private RubricaModel rubricaModel;
    private MainView mainView;

    public MainController () {
        rubricaModel = new RubricaModel();
        mainView = new MainView(this);

        this.mainView.getCreaPersona().addActionListener(e -> apriEditorNuovo());
        this.mainView.getModificaPersona().addActionListener(e -> apriEditorModifica());
    }
    
    public Vector<Persona> getListaPersone() {
        return rubricaModel.getListaPersone();
    }

    public void apriEditorNuovo() {

        EditController editController = new EditController(mainView, rubricaModel);    
    }

    public void apriEditorModifica() {
        int index = mainView.getIdLine();
        if(index == -1) {
            JOptionPane.showMessageDialog(mainView, "Per modificare è necessario prima selezionare una persona.", "Errore", JOptionPane.ERROR_MESSAGE);
        } else {
            EditController editController = new EditController(mainView, rubricaModel, index);
            
        }
    }
}