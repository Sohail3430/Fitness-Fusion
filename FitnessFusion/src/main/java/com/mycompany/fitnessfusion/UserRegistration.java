package com.mycompany.fitnessfusion;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserRegistration {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }

    @FXML
    private void registerUser() {
        // Get user input from text fields
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        // Validate and save user information (Add your validation and saving logic here)

        // After successful registration, switch to login screen
        try {
            switchToLogin();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
