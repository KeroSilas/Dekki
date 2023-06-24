module com.kerosilas.dekki {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.sun.jna;
    requires com.sun.jna.platform;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.kerosilas.dekki to javafx.fxml;
    exports com.kerosilas.dekki;
}