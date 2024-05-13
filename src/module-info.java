/**
 * 
 */
/**
 * 
 */
module LibraryJavaManagement {
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	
	opens view to javafx.graphics, javafx.fxml;
	opens controller to javafx.fxml;
}