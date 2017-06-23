package test;

import model.Cube;
import model.Scramble;

public class TestCube {
	
	public static void main(String[] args){
		
		Cube monCube = new Cube();
		Scramble myScramble = new Scramble();
		System.out.println(monCube.toString());
		monCube.applyScramble(myScramble.scramble(25));
		System.out.println(monCube.toString());

	}

}
