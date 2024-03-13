module com.example.juserinter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.juserinter to javafx.fxml;
    exports com.example.juserinter;
}