package com.example.eclipse_buddy_harkka;

public class Player {
	private String name; //pelihahmon nimi
	private String[] names = {"Terran Directorate", "Terran Federation", "Terran Union", "Terran Republic", "Terran Conglomerate", "Terran Alliance",
			"Eridani Empire", "Hydran Progress", "Planta", "Descendants of Draco", "Mechanema", "Orion Hegemony"};
	private int money;
	private int science;
	private int material;
	private int tradeFactor;
	private int influenceDisksLeft;
	private int economistsLeft;
	private int scientistsLeft;
	private int minersLeft;
	private int colonyShipsLeft;
	//private ArrayList<Buildable> buildables;
	private Tech[] milTechs;
	private Tech[] gridTechs;
	private Tech[] nanoTechs;
	private ReputationTrack reputationTrack;
	private boolean passed;
	
	//TODO: pelihahmokohtaiset alustukset
	public Player(String name){
		milTechs = new Tech[7];
		gridTechs = new Tech[7];
		nanoTechs = new Tech[7];
		reputationTrack = new ReputationTrack(name);
		economistsLeft = 11;
		scientistsLeft = 11;
		minersLeft = 11;
		passed = false;
		
	}
	
	public void explore(){
		influenceDisksLeft--;
	}
	
	public void influence(){
		influenceDisksLeft--;
	}
	
	public void researh(){
		influenceDisksLeft--;
	}
	
	public void upgrade(){
		influenceDisksLeft--;
	}
	
	public void build(){
		influenceDisksLeft--;
	}
	
	public void move(){
		influenceDisksLeft--;
	}
	
	public void pass(){
		passed = true;
	}
	
	public void trade(){
		
	}
	
	public void initDiplomacy(){
		reputationTrack.addDiplomat(name);
	}
	
	public void breakDiplomacy(){
		reputationTrack.removeDiplomat(name);
	}

}
