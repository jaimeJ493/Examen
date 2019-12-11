package application;

import java.awt.Button;
import java.awt.event.MouseEvent;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.util.Duration;


public class ControlRocket {
	@FXML
	private Pane p1;

	@FXML
	private Button mybutton;
	

	
	
	
	public void initialize() {
		
		
		backgroundAnimation();

	}

	private void backgroundAnimation() {

	

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(4),
				p1);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();

	
				

					
					

				

	}
	       

					
}
