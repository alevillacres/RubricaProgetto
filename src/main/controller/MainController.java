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
        this.mainView.getEliminaPersona().addActionListener(e -> eliminaPersona());

        this.mainView.setVisible(true);
    }
    
    public Vector<Persona> getListaPersone() {
        return rubricaModel.getListaPersone();
    }

    public void apriEditorNuovo() {

        new EditController(mainView, rubricaModel);    
    }

    public void apriEditorModifica() {
        int index = mainView.getIdLine();
        if(index == -1) {
            JOptionPane.showMessageDialog(mainView, "Per modificare è necessario prima selezionare una persona.", "Errore", JOptionPane.ERROR_MESSAGE);
        } else {
            new EditController(mainView, rubricaModel, index);
            
        }
    }

    public void eliminaPersona(){
        int index = mainView.getIdLine();
    
        if (index == -1) {
            JOptionPane.showMessageDialog(mainView, "Per eliminare è necessario prima selezionare una persona.", "Errore", JOptionPane.ERROR_MESSAGE);
        } else {
            Persona p = rubricaModel.getPersona(index);
            
            String messaggio = "Sei sicuro di voler eliminare " + p.getNome() + " " + p.getCognome() + "?";
            
            int risposta = JOptionPane.showConfirmDialog(mainView, messaggio, "Conferma Eliminazione", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (risposta == JOptionPane.YES_OPTION) {
                this.rubricaModel.eliminaPersona(index);   
                this.mainView.getTablePanel().aggiorna();
            }
        }
    }
}