package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreMere extends JFrame{
	
	public FenetreMere(String parTitre) {
		super(parTitre);
		
		PanelCube panelCube = new PanelCube();
		setContentPane(panelCube);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocation(200, 200);
	}
	
	public static void main(String []args){
		FenetreMere maFenetre = new FenetreMere("OMG RUBIK'S CUBE");
	}

}
