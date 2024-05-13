package controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javafx.application.Application;
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
	
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		controller.window.startUI(args);
	}
}
