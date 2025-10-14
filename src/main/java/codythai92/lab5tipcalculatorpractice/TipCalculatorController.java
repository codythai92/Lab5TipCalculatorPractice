package codythai92.lab5tipcalculatorpractice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TipCalculatorPracticeController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}