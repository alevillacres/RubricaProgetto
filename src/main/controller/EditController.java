package main.controller;

import main.model.Persona;
import main.model.RubricaModel;
import main.view.editview.EditorView;
import main.view.mainview.MainView;

public class EditController{
    private RubricaModel rubricaModel;
    private EditorView editorView;
    private MainView mainView;


    /*Costruttore quando si crea una nuova Persona */
    public EditController(MainView mainView, RubricaModel rubricaModel){
        this.rubricaModel = rubricaModel;
        this.mainView = mainView;

        editorView = new EditorView(mainView, this);

        this.editorView.getBtnSalva().addActionListener(e -> aggiungiPersona());

        editorView.setVisible(true);
    }

    /* Costruttore quando si modifica una persona */
    public EditController(MainView mainView, RubricaModel rubricaModel, int index) {
        this.rubricaModel = rubricaModel;
        this.mainView = mainView;

        editorView = new EditorView(mainView, this);
        
        Persona p = this.rubricaModel.getPersona(index);

        this.editorView.getFormPanel().setTextNome(p.getNome());
        this.editorView.getFormPanel().setTextCognome(p.getCognome());
        this.editorView.getFormPanel().setTextIndirizzo(p.getIndirizzo());
        this.editorView.getFormPanel().setTextTelefono(p.getTelefono());
        this.editorView.getFormPanel().setSpinnerEta(p.getEta());

        this.editorView.getBtnSalva().addActionListener(e -> modificaPersona(index));

        editorView.setVisible(true);
    }

    private void modificaPersona(int index) {

        String nome = editorView.getFormPanel().getTextNome();
        String cognome = editorView.getFormPanel().getTextCognome();
        String indirizzo = editorView.getFormPanel().getTextIndirizzo();
        String telefono = editorView.getFormPanel().getTextTelefono();
        int eta = editorView.getFormPanel().getTextEta();

        Persona personaModificata = new Persona(nome, cognome, indirizzo, telefono, eta);

        this.rubricaModel.modificaPersona(personaModificata, index);

        this.mainView.getTablePanel().aggiorna();

        chiudiEditor();

    }

    private void aggiungiPersona() {
        String nome = editorView.getFormPanel().getTextNome();
        String cognome = editorView.getFormPanel().getTextCognome();
        String indirizzo = editorView.getFormPanel().getTextIndirizzo();
        String telefono = editorView.getFormPanel().getTextTelefono();
        int eta = editorView.getFormPanel().getTextEta();

        Persona p = new Persona(nome, cognome, indirizzo, telefono, eta); 

        this.rubricaModel.aggiungiPersona(p);

        this.mainView.getTablePanel().aggiorna();

        chiudiEditor();
    }

    private void chiudiEditor() {
        editorView.setVisible(false);
        editorView.dispose();
    }
}
