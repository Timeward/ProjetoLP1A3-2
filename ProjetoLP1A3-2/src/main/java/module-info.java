module com.example.projetolp1a32 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetolp1a32 to javafx.fxml;
    exports com.example.projetolp1a32;
}