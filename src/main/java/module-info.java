module com.mycompany.fitnessfusion {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.fitnessfusion to javafx.fxml;
    exports com.mycompany.fitnessfusion;
}
