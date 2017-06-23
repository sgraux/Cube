package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

import model.Cube;
import model.Scramble;

public class PanelCube extends JPanel{
	
	private GridLayout layout;
	private Cube myCube;
	private Scramble myScramble;
	private PanelBloc panelBloc;
	
	public PanelCube(){
		super();
		layout = new GridLayout(9,12);
		myCube = new Cube();
		myCube.moveR2();
		myCube.moveF2();
		/*myScramble = new Scramble();
		String scramble = myScramble.scramble(2);
		
		myCube.applyScramble(scramble);
		System.out.println(scramble);*/
		this.setLayout(layout);
		initPanel();
	}
	
	public void initPanel(){
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 12; j++){
				if(myCube.getValue(i, j) != 0){
					panelBloc = new PanelBloc(myCube.getValue(i, j));
					this.add(panelBloc);
				}
				else{
					this.add(new JPanel());
				}
			}
		}
	}

}
