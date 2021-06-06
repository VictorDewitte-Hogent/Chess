package main;

import java.util.Optional;

import domein.DomeinController;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import utility.Language;

public class StartUp extends Application {
	 @Override
	    public void start(Stage primaryStage)
	    {
//	        LoginScherm grid = new LoginScherm();
//	    	HomeScherm grid = new HomeScherm();
	    	//Taal t = new Taal();
	    	//DomeinController dc = new DomeinController(t);
		 	Language t = new Language(1);
	    	//WelcomeScreen grid = new WelcomeScreen(new DomeinController(t));
	        
	// grid is de root node, breedte is 320, hoogte is 300 

	       //// Scene scene = new Scene(grid, 350, 250);
	      //  primaryStage.setScene(scene);
	        primaryStage.setResizable(false);


	        primaryStage.setTitle("Rummikub");

//	        primaryStage.setTitle("welkomRummikub");

	        primaryStage.show();
	        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() 
	        {
	            @Override
	            public void handle(WindowEvent event)
	            {
	               // System.out.println("We sluiten het venster en dus... ook de applicatie");
	              
	                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	                alert.setTitle("Confirm");
	                alert.setContentText("Are you sure you want to close?");
	                Optional<ButtonType> result = alert.showAndWait();
	                if (result.get() == ButtonType.OK)
	                {
	                   // System.out.println("We sluiten het venster en dus... ook de applicatie");
	                 
	                } else 
	                {
	                   event.consume();
	                }
	             
	            }
	        }
	        );
	    }
	    
		public static void main(String[] args) {
			launch(args);
			}
}//ree
