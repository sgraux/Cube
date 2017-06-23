package view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelBloc extends JPanel{
	
	private int color;
	
	public PanelBloc(int parColor){
		color = parColor;
		applyColor();
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
	}
	
	public void applyColor(){
		switch(color){
			case 3: this.setBackground(Color.red);
					break;
			case 2:	this.setBackground(Color.blue);
					break;
			case 5:	this.setBackground(Color.ORANGE);
					break;
			case 4:	this.setBackground(Color.green);
					break;
			case 1:	this.setBackground(Color.yellow);
					break;
			case 6:	this.setBackground(Color.white);
					break;
			default:this.setBackground(Color.black);
					break;
		}
	}

}
