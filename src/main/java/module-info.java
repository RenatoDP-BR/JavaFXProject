module com.example.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.xml;

    opens com.example.helloworld to javafx.fxml;
    exports com.example.helloworld;
}