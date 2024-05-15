package controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import exceptions.AccountNotFoundExcepetion;
import exceptions.WrongPasswordException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import mainClass.Library;
import typeAccount.Account;
import view.ViewLibrary;

public class LibraryController implements PropertyChangeListener {
	
	private Library modelLibrary;
	private ViewLibrary window;
	private Account accountConnected;
	
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
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;
	
    @FXML
    void connect(MouseEvent event) {
    	System.out.println("Clicked");
    	try {
    		Account user = modelLibrary.getUserbyUsername(usernameField.getText());
    		if(user.connect(passwordField.getText())) {
    			accountConnected = user;
    			window.changeLayout("featuresPage.fxml");
    		} else {
    			throw new WrongPasswordException();
    		}
    	} catch(AccountNotFoundExcepetion e) {
    		e.printStackTrace();
    	} catch(WrongPasswordException e) {
    		e.printStackTrace();
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    }
	
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		controller.window.startUI(args);
	}
}
