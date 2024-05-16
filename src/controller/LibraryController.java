package controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

import exceptions.AccountNotFoundExcepetion;
import exceptions.WrongPasswordException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
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
		// Call View Method
		switch(evt.getPropertyName()){
			case "HomeScene" :
				labelHome.setText(accountConnected.getClass().toString()+" - "+accountConnected.getName());
				break;
		}
	}
	
	// Manage View Commands
	
	@FXML
    private Label labelHome;
	
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
    			this.changeView("featuresPage.fxml", "HomeScene");
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
    
    public void changeView(String fxmlFile, String event) {
        try {
    		FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ViewLibrary.class.getResource("fxml/"+fxmlFile));
            loader.setController(this);
			Pane newLayout = loader.load();
			Scene previousScene = window.getPrimaryStage().getScene();
			window.changeLayout(newLayout);
			Scene scene = window.getPrimaryStage().getScene();
	        window.getPcs().firePropertyChange("HomeScene", previousScene, scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		controller.window.startUI(args);
	}
}
