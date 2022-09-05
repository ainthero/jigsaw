module com.jigsaw.jigsaw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jigsaw.jigsaw to javafx.fxml;
    exports com.jigsaw.jigsaw;
}