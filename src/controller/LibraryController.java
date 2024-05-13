package controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import mainClass.Library;
import view.ViewLibrary;

public class LibraryController implements PropertyChangeListener {
	
	private Library modelLibrary;
	private ViewLibrary window;
	
	public LibraryController() {
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
}
