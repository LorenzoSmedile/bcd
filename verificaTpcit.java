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
	
	TextField tNumeri= new TextField();
	Button bConverti = new Button("CONVERTI");
	Label lNumero = new Label("NUMERO CONVERTITO:");
	
	String vettore[];

	
	public void start(Stage finestra) {
	
	
		GridPane griglia = new GridPane();
		
		griglia.add(tNumeri, 0, 0);
		griglia.add(bConverti, 0, 0);
		griglia.add(lNumero, 0, 0);
		
	

		Scene scena = new Scene(griglia);
		

		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		finestra.show();
		
		bConverti.setOnAction(e -> converti());
	
	
	}

public void converti() {
		String convertito=" ";
		int valore = Integer.parseInt(tNumeri.getText());
		Hashtable<Integer, String> my_dict= new Hashtable<Integer,String>();
		
		
		my_dict.put(0, "0000");
		my_dict.put(1, "0001");
		my_dict.put(2, "0010");
		my_dict.put(3, "0011");
		my_dict.put(4, "0100");
		my_dict.put(5, "0101");
		my_dict.put(6, "0110");
		my_dict.put(7, "0111");
		my_dict.put(8, "1000");
		my_dict.put(9, "1001");
		
		for (int i=0;i<vettore.length;i++) {
			convertito=my_dict.get(vettore[i]);
		}

		lNumero.setText("il numero convertito è "+convertito);
		
	}
	

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
