package jp.massango.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private Pane inner_fight_card1;

    @FXML
    public void initialize() {
        inner_fight_card1.setOnMouseClicked(event -> {
            System.out.println("inner_fight_card1がクリックされました。");
        });
    }
}