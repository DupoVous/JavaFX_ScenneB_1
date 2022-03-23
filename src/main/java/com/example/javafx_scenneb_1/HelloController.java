package com.example.javafx_scenneb_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("TOŠ ZMÁČKNUTÉ TLAČÍTKO");
    }
}