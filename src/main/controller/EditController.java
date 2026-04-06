package main.controller;

import main.model.Persona;
import main.model.RubricaModel;
import main.view.editview.EditorView;
import main.view.mainview.MainView;

public class EditController{
    private RubricaModel rubricaModel;
    private EditorView editorView;


    /*Costruttore quando si crea una nuova Persona */
    public EditController(MainView mainView, RubricaModel rubricaModel){
        this.rubricaModel = rubricaModel;

        editorView = new EditorView(mainView, this);
        editorView.setVisible(true);
    }

    /* Costruttore quando si modifica una persona */
    public EditController(MainView mainView, RubricaModel rubricaModel, int index) {
        this.rubricaModel = rubricaModel;
        editorView = new EditorView(mainView, this);

        Persona personaDaCambiare = this.rubricaModel.getPersona(index);

        modificaPersona(personaDaCambiare);
    }

    private void modificaPersona(Persona personaDaCambiare) {
        String nome = editorView.getFormPanel().getTextNome();
        String cognome = editorView.getFormPanel().getTextCognome();
        String indirizzo = editorView.getFormPanel().getTextIndirizzo();
        String telefono = editorView.getFormPanel().getTextTelefono();
        String etaString = editorView.getFormPanel().getTextEta();
        
        int eta =Integer.valueOf(etaString);


    }
}
