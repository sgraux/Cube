package model;

import java.util.Random;

public class Scramble {
	
	private String[] moves;
	
	public Scramble(){
		moves = new String[18];
		initMoves();
	}
	
	public void initMoves(){
		moves[0] = "R";
		moves[1] = "R'";
		moves[2] = "R2";
		
		moves[3] = "L";
		moves[4] = "L'";
		moves[5] = "L2";
		
		moves[6] = "U";
		moves[7] = "U'";
		moves[8] = "U2";
		
		moves[9] = "D";
		moves[10] = "D'";
		moves[11] = "D2";
		
		moves[12] = "F";
		moves[13] = "F'";
		moves[14] = "F2";
		
		moves[15] = "B";
		moves[16] = "B'";
		moves[17] = "B2";	
	}

	public String scramble(int parLength){
		
		String string = "";
		String currentSelect;
		String lastSelect = "o";
		Random randomGenerator = new Random();
		
		int i = 0;
		
		while(i < parLength){
			currentSelect = moves[randomGenerator.nextInt(18)];
			if(currentSelect.charAt(0) != lastSelect.charAt(0)){
				string +=  currentSelect + " ";
				lastSelect = currentSelect;
				i++;
			}
			
		}
		
		return string;
	}
}
