module KennyBoySim {

    requires javafx.fxml;
    requires javafx.controls;
//    requires javafx.graphics;

    exports Game to javafx.graphics;

    opens Game;
    opens Controller;

}