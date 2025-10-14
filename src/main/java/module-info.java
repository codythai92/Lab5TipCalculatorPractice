module codythai92.lab5tipcalculatorpractice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens codythai92.lab5tipcalculatorpractice to javafx.fxml;
    exports codythai92.lab5tipcalculatorpractice;
}