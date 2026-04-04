package main;

import main.view.editview.EditorView;
import main.view.mainview.MainView;

public class AppRubrica {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        EditorView editorView = new EditorView(mainView);
    }
}
