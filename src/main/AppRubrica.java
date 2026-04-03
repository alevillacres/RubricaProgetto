package main;

import main.controller.MainController;
import main.view.MainView;

public class AppRubrica {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        MainController mainController = new MainController();
        mainView.setController(mainController);
    }
}
