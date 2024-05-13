package view;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewLibrary extends Application{
	
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

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        double centerX = scene.getWidth() / 2;
        double centerY = scene.getHeight() / 2;
        double radius = 100;

        double[] data = {30, 20, 50}; // Données de l'exemple

        double total = 0;
        for (double value : data) {
            total += value;
        }

        double startAngle = 0;
        for (double value : data) {
            double angle = 360 * (value / total);
            Arc arc = new Arc(centerX, centerY, radius, radius, startAngle, angle);
            arc.setType(ArcType.ROUND);
            root.getChildren().add(arc);

            // Calcul des coordonnées du label
            double labelX = centerX + radius * Math.cos(Math.toRadians(startAngle + angle / 2));
            double labelY = centerY + radius * Math.sin(Math.toRadians(startAngle + angle / 2));

            // Création et configuration du texte du label
            Text label = new Text(labelX, labelY, String.valueOf((int)value));

            // Centrer le texte sur l'arc
            label.setTranslateX(-label.getLayoutBounds().getWidth() / 2);
            label.setTranslateY(-label.getLayoutBounds().getHeight() / 2);

            root.getChildren().add(label);

            startAngle += angle;
        }

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pie Chart with Labels");
        primaryStage.show();
	}
	
	public void startUI(String[] args) {
		launch();
	}
	
}
