package com.example.upr3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculateController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onCalculateButtonClick() {
       //welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setText(bmi.bmiCategory(55, 1.20));



    }
}