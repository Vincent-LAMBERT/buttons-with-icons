module com.button.icon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.button.icon to javafx.fxml;
    exports com.button.icon;
}
