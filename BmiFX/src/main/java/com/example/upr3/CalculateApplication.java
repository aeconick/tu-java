package com.example.upr3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

class bmi {

    // method to check bmi category
    public static String bmiCategory(double weight,
                                     double height) {

        // calculate bmi
        double bmi = weight / (height * height);

        // check range
        if (bmi < 18.5)
            return "Thinness";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

}


public class CalculateApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(CalculateApplication.class.getResource("calculate-view.fxml"));
       // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Calculate!");
        //stage.setScene(scene);
       // stage.show();

        /*Label weightInKg=new Label("WeightInKg");
        Label heightInMeters = new Label("HeightInMeters");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        Button b = new Button("Calculate!");
        GridPane root = new GridPane();
        root.addRow(0, weightInKg, tf1);
        root.addRow(1, heightInMeters, tf2);
        root.addRow(2, b);
        Scene scene1=new Scene(root,800,200);
        stage.setScene(scene1);
        stage.setTitle("Text Field Example");
        stage.show();*/
        FXMLLoader fxmlLoader = new FXMLLoader(CalculateApplication.class.getResource("calculate-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Calculate!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}