package view;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewLibrary extends Application {
	
	// PropertyChangeSupport for Controller
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	public PropertyChangeSupport getPcs() {
		return pcs;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
    
    // Pane and Stage
	private Pane rootLayout;
	private static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Connection Page");
        
        this.initRootLayout();
        this.primaryStage.show();
	}
	
	public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ViewLibrary.class.getResource("fxml/connectPage.fxml"));
            rootLayout = loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void changeLayout(String fxmlFile) {
		try {
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(ViewLibrary.class.getResource("fxml/"+fxmlFile));
	        rootLayout = loader.load();
	        Scene scene = new Scene(rootLayout);
	        primaryStage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void startUI(String[] args) {
		launch(args);
	}
	
}
