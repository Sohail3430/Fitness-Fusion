package com.mycompany.fitnessfusion;

import java.io.IOException;
import javafx.fxml.FXML;

public class UserLogin {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("registration");
    }
}