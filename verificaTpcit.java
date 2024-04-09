package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import java.util.Hashtable;

import javafx.stage.Stage;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.*;

public class verificaTpcit extends Application{
	
	TextField tNumero= new TextField();
	Button bConverti = new Button("CONVERTI");
	Label lNumero = new Label("NUMERO CONVERTITO:");
	
	String vettore[];

	
	public void start(Stage finestra) {
	
	
		GridPane griglia = new GridPane();
		
		griglia.add(tNumero, 0, 0);
		griglia.add(bConverti, 0, 0);
		griglia.add(lNumero, 0, 0);
		
	

		Scene scena = new Scene(griglia);
		

		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		finestra.show();
		
		bConverti.setOnAction(e -> converti());
	
	
	}
	

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
