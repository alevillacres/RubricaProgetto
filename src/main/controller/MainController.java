package main.controller;

import java.util.Vector;

import main.model.Persona;
import main.model.RubricaModel;
import main.view.editview.EditorView;
import main.view.mainview.MainView;

public class MainController {
    private RubricaModel rubricaModel;
    private MainView mainView;

    public MainController () {
        rubricaModel = new RubricaModel();
        mainView = new MainView();
        this.mainView.getCreaPersona().addActionListener(e -> apriEditorNuovo());
    }
    
    public Vector<Persona> getListaPersone() {
        return rubricaModel.getListaPersone();
    }

    public void apriEditorNuovo() {
    // Crea la finestra di dialogo passandogli la finestra principale (this.mainView)
    EditorView editor = new EditorView(mainView);
    
    // Mostra la finestra (essendo modale, il codice qui si "ferma" finché non viene chiusa)
    editor.setVisible(true);
    
    // Al termine, se l'utente ha salvato, aggiorniamo il Model e la Tabella
}
}