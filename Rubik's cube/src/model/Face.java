package model;

public class Face {
	
	public Bloc[][] blocs;
	
	public Face(String parCouleur){
		blocs = new Bloc[3][3];
		this.initialiseCouleurFace(parCouleur);
	}
	
	public void initialiseCouleurFace(String parCouleur){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				blocs[i][j] = new Bloc(parCouleur);
			}
		}
	}
	
	public String toString(){
		String chaine = "-------------------\n";
		for(int i = 0; i < 3; i++){
			chaine += "|";
			for(int j = 0; j < 3; j++){
				chaine += blocs[i][j].getCouleur()+"|";
			}
			chaine += "\n-------------------\n";
		}
		return chaine;
	}

}
