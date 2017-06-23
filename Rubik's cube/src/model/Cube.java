package model;

public class Cube {
	
	//private Face[] faces;
	private int[][] cube;
	
	public Cube(){
		//faces = new Face[6];
		cube = new int[9][12];
		initCube();
	}
	
	//INIT LINE FUNCTION
	public void initCube(){
		initFirst3();
		initSecond3();
		initLast3();
	}
	
	public void initFirst3(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 12; j++){
				switch(j){
					case 3: cube[i][j] = 1;
							break;
					case 4: cube[i][j] = 1;
							break;
					case 5: cube[i][j] = 1;
							break;
					default:cube[i][j] = 0;
							break;
				}
			}
		}
	}
	
	public void initSecond3(){
		for(int i = 3; i < 6; i++){
			for(int j = 0; j < 12; j++){
				switch(j){
					case 0: cube[i][j] = 2;
							break;
					case 1: cube[i][j] = 2;
							break;
					case 2: cube[i][j] = 2;
							break;
					case 3: cube[i][j] = 3;
							break;
					case 4: cube[i][j] = 3;
							break;
					case 5: cube[i][j] = 3;
							break;
					case 6: cube[i][j] = 4;
							break;
					case 7: cube[i][j] = 4;
							break;
					case 8: cube[i][j] = 4;
							break;
					case 9: cube[i][j] = 5;
							break;
					case 10: cube[i][j] = 5;
							break;
					case 11: cube[i][j] = 5;
							break;
					default:cube[i][j] = 0;
							break;
				}
			}
		}
	}
	
	public void initLast3(){

		for(int i = 6; i < 9; i++){
			for(int j = 0; j < 12; j++){
				switch(j){
					case 3: cube[i][j] = 6;
							break;
					case 4: cube[i][j] = 6;
							break;
					case 5: cube[i][j] = 6;
							break;
					default:cube[i][j] = 0;
							break;
				}
			}
		}
	}
	//END OF INIT LINE FUNCTION
	
	//R MOVES --- TEST OK
	public void moveR(){
		
		int upFace1 = cube[0][5];
		int upFace2 = cube[1][5];
		int upFace3 = cube[2][5];
		
		int rotatedFaceL1 = cube[5][6];
		int rotatedFaceL2 = cube[4][6];
		int rotatedFaceL3 = cube[3][6];
		
		//R Move
		for(int i = 0; i < 6; i++){
			cube[i][5] = cube[i+3][5];
		}
		
		cube[6][5] = cube[5][9];
		cube[7][5] = cube[4][9];
		cube[8][5] = cube[3][9];
		
		cube[3][9] = upFace3;
		cube[4][9] = upFace2;
		cube[5][9] = upFace1;
		
		//Face rotation 
		//BESOIN DE FAIRE UNE FCT DE ROTATION
		//PARAM CENTRE DUN 3X3 
		//ET EFFECTUE LA ROTATION	
		cube[3][6] = cube[5][6];
		cube[4][6] = cube[5][7];
		cube[5][6] = cube[5][8];
		
		cube[5][7] = cube[4][8];
		
		
				
	}
	
	public void moveRi(){
		int downFace1 = cube[6][5];
		int downFace2 = cube[7][5];
		int downFace3 = cube[8][5];
		
		for(int i = 8; i > 2; i--){
			cube[i][5] = cube[i-3][5];
		}
		
		cube[0][5] = cube[5][9];
		cube[1][5] = cube[4][9];
		cube[2][5] = cube[3][9];
		
		cube[3][9] = downFace3;
		cube[4][9] = downFace2;
		cube[5][9] = downFace1;
	}
	
	public void moveR2(){
		moveR();
		moveR();
	}
	//END OF R MOVES
	
	
	//L MOVES --- TEST OK
	public void moveL(){
		int downFace1 = cube[6][3];
		int downFace2 = cube[7][3];
		int downFace3 = cube[8][3];
		
		for(int i = 8; i > 2; i--){
			cube[i][3] = cube[i-3][3];
		}
		
		cube[0][3] = cube[5][11];
		cube[1][3] = cube[4][11];
		cube[2][3] = cube[3][11];
		
		cube[3][11] = downFace3;
		cube[4][11] = downFace2;
		cube[5][11] = downFace1;
	}
	
	public void moveLi(){
		int upFace1 = cube[0][3];
		int upFace2 = cube[1][3];
		int upFace3 = cube[2][3];
		
		for(int i = 0; i < 6; i++){
			cube[i][3] = cube[i+3][3];
		}
		
		cube[6][3] = cube[5][11];
		cube[7][3] = cube[4][11];
		cube[8][3] = cube[3][11];
		
		cube[3][11] = upFace3;
		cube[4][11] = upFace2;
		cube[5][11] = upFace1;
	}
	
	public void moveL2(){
		moveL();
		moveL();
	}
	//END OF L MOVES
	
	//UP MOVES --- TEST OK
	public void moveU(){
		int backFace1 = cube[3][9];
		int backFace2 = cube[3][10];
		int backFace3 = cube[3][11];
		
		for(int i = 11; i > 2; i--){
			cube[3][i] = cube[3][i-3];
		}
		
		cube[3][0] = backFace1;
		cube[3][1] = backFace2;
		cube[3][2] = backFace3;
	}
	
	public void moveUi(){
		int leftFace1 = cube[3][0];
		int leftFace2 = cube[3][1];
		int leftFace3 = cube[3][2];
		
		for(int i = 0; i < 9; i++){
			cube[3][i] = cube[3][i+3];
		}
		
		cube[3][9] = leftFace1;
		cube[3][10] = leftFace2;
		cube[3][11] = leftFace3;
	}
	
	public void moveU2(){
		moveU();
		moveU();
	}
	//END OF UP MOVES 
	
	//DOWN MOVES --- TEST OK
	public void moveD(){
		int leftFace1 = cube[5][0];
		int leftFace2 = cube[5][1];
		int leftFace3 = cube[5][2];
		
		for(int i = 0; i < 9; i++){
			cube[5][i] = cube[5][i+3];
		}
		
		cube[5][9] = leftFace1;
		cube[5][10] = leftFace2;
		cube[5][11] = leftFace3;
	}
	
	public void moveDi(){
		int backFace1 = cube[5][9];
		int backFace2 = cube[5][10];
		int backFace3 = cube[5][11];
		
		for(int i = 11; i > 2; i--){
			cube[5][i] = cube[5][i-3];
		}
		
		cube[5][0] = backFace1;
		cube[5][1] = backFace2;
		cube[5][2] = backFace3;
	}
	
	public void moveD2(){
		moveD();
		moveD();
	}
	//END OF DOWN MOVES
	
	//FRONT MOVES --- TEST OK
	public void moveF(){
		int downFace1 = cube[6][3];
		int downFace2 = cube[6][4];
		int downFace3 = cube[6][5];
		
		cube[6][3] = cube[5][6];
		cube[6][4] = cube[4][6];
		cube[6][5] = cube[3][6];
		
		cube[3][6] = cube[2][3];
		cube[4][6] = cube[2][4];
		cube[5][6] = cube[2][5];
		
		cube[2][3] = cube[3][2];
		cube[2][4] = cube[4][2];
		cube[2][5] = cube[5][2];
		
		cube[3][2] = downFace1;
		cube[4][2] = downFace2;
		cube[5][2] = downFace3;
	}
	
	public void moveFi(){
		int downFace1 = cube[6][3];
		int downFace2 = cube[6][4];
		int downFace3 = cube[6][5];
		
		cube[6][3] = cube[3][2];
		cube[6][4] = cube[4][2];
		cube[6][5] = cube[5][2];
		
		cube[3][2] = cube[2][3];
		cube[4][2] = cube[2][4];
		cube[5][2] = cube[2][5];
		
		cube[2][3] = cube[3][6]; 
		cube[2][4] = cube[4][6]; 
		cube[2][5] = cube[5][6];
		
		cube[3][6] = downFace3;
		cube[4][6] = downFace2;
		cube[5][6] = downFace1;
	}
	
	public void moveF2(){
		moveF();
		moveF();
	}
	//END OF FRONT MOVES
	
	//BACK MOVES
	public void moveB(){
		int downFace1 = cube[8][3];
		int downFace2 = cube[8][4];
		int downFace3 = cube[8][5];
		
		cube[8][3] = cube[3][0];
		cube[8][4] = cube[4][0];
		cube[8][5] = cube[5][0];
		
		cube[3][0] = cube[0][3];
		cube[4][0] = cube[0][4];
		cube[5][0] = cube[0][5];
		
		cube[0][3] = cube[3][8]; 
		cube[0][4] = cube[4][8]; 
		cube[0][5] = cube[5][8];
		
		cube[3][8] = downFace3;
		cube[4][8] = downFace2;
		cube[5][8] = downFace1;
	}
	
	public void moveBi(){
		int downFace1 = cube[8][3];
		int downFace2 = cube[8][4];
		int downFace3 = cube[8][5];
		
		cube[8][3] = cube[5][8];
		cube[8][4] = cube[4][8];
		cube[8][5] = cube[3][8];
		
		cube[3][8] = cube[0][3];
		cube[4][8] = cube[0][4];
		cube[5][8] = cube[0][5];
		
		cube[0][3] = cube[3][0];
		cube[0][4] = cube[4][0];
		cube[0][5] = cube[5][0];
		
		cube[3][0] = downFace1;
		cube[4][0] = downFace2;
		cube[5][0] = downFace3;
	}
	
	public void moveB2(){
		moveB();
		moveB();
	}
	//END OF BACK MOVES
	
	public void applyScramble(String parScramble){
		String[] scrambleSplit = parScramble.split(" ");
		for(int i = 0; i < scrambleSplit.length; i++){
			applyMove(scrambleSplit[i]);
		}
	}
	
	public void applyMove(String parMove){
		switch(parMove){
			case "R":	moveR();
					 	break;
			case "R'":	moveRi();
					  	break;
			case "R2":	moveR2();
						break;

			case "L":	moveL();
						break;
			case "L'":	moveLi();
						break;
			case "L2":	moveL2();
						break;
			
			case "U":	moveU();
						break;
			case "U'":	moveUi();
						break;
			case "U2":	moveU2();
						break;
			
			case "D":	moveD();
						break;
			case "D'":	moveDi();
						break;
			case "D2":	moveD2();
						break;
			
			case "F":	moveF();
						break;
			case "F'":	moveFi();
						break;
			case "F2":	moveF2();
						break;
			
			case "B":	moveB();
						break;
			case "B'":	moveBi();
						break;
			case "B2":	moveB2();
						break;
			
			default:	break;
		}
	}
	
	public int getValue(int i, int j){
		return cube[i][j];
	}
	
	public String toString(){
		String chaine = "";
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 12; j++){
					chaine += cube[i][j] + " ";
				}
			chaine += "\n";
			}
		return chaine;
	}
}
