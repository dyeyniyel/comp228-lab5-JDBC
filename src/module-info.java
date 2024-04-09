module JanielMarkJavier_COMP228Lab5 {
	requires javafx.controls;
	requires java.sql;
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens exercise1 to javafx.graphics, javafx.fxml;
}
