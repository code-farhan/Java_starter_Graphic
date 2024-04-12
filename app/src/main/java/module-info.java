module JavaGui {
    exports com.xgao;
    opens com.xgao to javafx.graphics;
    requires java.desktop;
    requires java.logging;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.web;
    requires java.json;
}