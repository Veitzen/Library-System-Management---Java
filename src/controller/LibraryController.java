package controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import mainClass.Library;
import view.ViewLibrary;

public class LibraryController implements PropertyChangeListener {
	
	private Library modelLibrary;
	private ViewLibrary window;
	
	public LibraryController() {
		modelLibrary = new Library("Test");
		modelLibrary.addPropertyChangeListener(this);
		window = new ViewLibrary();
		window.addPropertyChangeListener(this);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	
	// Manage View Commands
	
    @FXML
    void connect(MouseEvent event) {
    	System.out.println("Clicked");
    }
	
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		controller.window.startUI(args);
	}
}
