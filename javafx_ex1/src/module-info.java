module javafx_ex1 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
