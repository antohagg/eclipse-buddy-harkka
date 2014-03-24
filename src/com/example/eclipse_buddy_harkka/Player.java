package com.example.eclipse_buddy_harkka;

public class Player {
	//private String name; //pelihahmon nimi
	//private String[] names = {"Terran Directorate", "Terran Federation", "Terran Union", "Terran Republic", "Terran Conglomerate", "Terran Alliance",
	//		"Eridani Empire", "Hydran Progress", "Planta", "Descendants of Draco", "Mechanema", "Orion Hegemony"};
	private int[] resourcesGained = {28, 24, 21, 18, 15, 12, 10, 8, 6, 4, 3, 2};
	private int[] roundCost = {30, 25, 21, 17, 13, 10, 7, 5, 3, 2, 1, 0, 0};
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
	private Ship[] ships;
	private ReputationTrack reputationTrack;
	private boolean passed;
	private int influenceDisksUsed;
	private int interceptors;
	private int cruisers;
	private int dreadnoughts;
	private int starbases;
	private int monoliths;
	private int orbitals;
	private int shipsPerBuild;
	private int diplomatsLeft; //k‰ytet‰‰n initDiplomacy() -metodissa
	
	//TODO: pelihahmokohtaiset alustukset
	public Player(/*String name*/){
		milTechs = new Tech[7];
		gridTechs = new Tech[7];
		nanoTechs = new Tech[7];
		ships = new Ship[18];
		reputationTrack = new ReputationTrack();
		economistsLeft = 11;
		scientistsLeft = 11;
		minersLeft = 11;
		passed = false;
		influenceDisksUsed = 0;
		
		if(1 == 2){ //t‰h‰n kootaan eri hahmokohtaiset alustukset
			
		}else{
			money = 2;
			science = 3;
			material = 3;
			milTechs[0] = new Tech(202);
			ships[0] = new Ship(301);
			interceptors++;
			colonyShipsLeft = 2;
			influenceDisksLeft = 13;
			tradeFactor = 2;
			diplomatsLeft = 4;
			shipsPerBuild = 2;
		}		
	}
	
	public void startGame(){
		economistsLeft--;
		scientistsLeft--;
		minersLeft--;
		influenceDisksLeft--;
	}
	
	//TODO: varmistus ett‰ rahat riitt‰‰ vuorokulujen maksuun
	public void roundOver(){
		money = money + resourcesGained[economistsLeft];
		science = science + resourcesGained[scientistsLeft];
		material = material + resourcesGained[minersLeft];
		money = money - roundCost[influenceDisksLeft];
		influenceDisksLeft = influenceDisksLeft + influenceDisksUsed;
		colonyShipsLeft = 3;
		passed = false;
	}
	
	//TODO: exploraus
	public void explore(){
		influenceDisksLeft--;
		influenceDisksUsed++;
	}
	
	//TODO: influence diskien liikuttaminen
	public void influence(){
		influenceDisksLeft--;
		influenceDisksUsed++;
		if(colonyShipsLeft <= 1){
			colonyShipsLeft = colonyShipsLeft + 2;
		}else{
			colonyShipsLeft = 3;
		}
	}
	
	public void researh(int techID){
		if(techID <= 208){
			if(milTechs.length < 7){
				milTechs[milTechs.length] = new Tech(techID);
				science = science - milTechs[milTechs.length].getCurrentCost(milTechs.length);
				influenceDisksLeft--;
				influenceDisksUsed++;
			}
		}else if(techID <= 216 && techID >= 209){
			if(gridTechs.length < 7){
				gridTechs[gridTechs.length] = new Tech(techID);
				science = science - gridTechs[gridTechs.length].getCurrentCost(gridTechs.length);
				influenceDisksLeft--;
				influenceDisksUsed++;
			}
		}else if(techID >= 217){
			if(nanoTechs.length < 7){
				nanoTechs[nanoTechs.length] = new Tech(techID);
				science = science - nanoTechs[nanoTechs.length].getCurrentCost(nanoTechs.length);
				influenceDisksLeft--;
				influenceDisksUsed++;
			}
		}
	}
	
	//partIndex on Ship-luokan Part[] taulukon indeksi
	public void upgrade(int partID, int partIndex, int shipID){
		if(passed){
			influenceDisksLeft--;
			influenceDisksUsed++;
			if(shipID == 301){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 301){
						ships[i].addPart(partID, partIndex);
					}
				}
			}else if(shipID == 302){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 302){
						ships[i].addPart(partID, partIndex);
					}
				}
			}else if(shipID == 303){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 303){
						ships[i].addPart(partID, partIndex);
					}
				}
			}else if(shipID == 304){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 304){
						ships[i].addPart(partID, partIndex);
					}
				}
			}
		}else{
			if(shipID == 301){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 301){
						ships[i].addPart(partID, partIndex);
					}
				}
			}else if(shipID == 302){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 302){
						ships[i].addPart(partID, partIndex);
					}
				}
			}else if(shipID == 303){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 303){
						ships[i].addPart(partID, partIndex);
					}
				}
			}else if(shipID == 304){
				for(int i = 0; i < ships.length; i++){
					if(ships[i].getShipID() == 304){
						ships[i].addPart(partID, partIndex);
					}
				}
			}
		}
	}
	public void upgrade(int partID1, int partIndex1, int shipID1, int partID2, int partIndex2, int shipID2){
		influenceDisksLeft--;
		influenceDisksUsed++;
		upgrade(partID1, partIndex1, shipID1);
		upgrade(partID2, partIndex2, shipID2);
	}
	public void upgrade(int partID1, int partIndex1, int shipID1, int partID2, int partIndex2, int shipID2, int partID3, int partIndex3, int shipID3){
		influenceDisksLeft--;
		influenceDisksUsed++;
		upgrade(partID1, partIndex1, shipID1);
		upgrade(partID2, partIndex2, shipID2);
		upgrade(partID3, partIndex3, shipID3);
	}
	
	public void build(int shipID){
		if(passed){
			influenceDisksLeft--;
			influenceDisksUsed++;
			if(shipID == 305){
				orbitals++;
				material = material - 5;
			}else if(shipID == 306){
				monoliths++;
				material = material - 10;
			}else{
				if(shipID == 301 && interceptors < 8){
					ships[ships.length] = new Ship(shipID);
					interceptors++;
					material = material - 3;
				}else if(shipID == 302 && cruisers < 4){
					ships[ships.length] = new Ship(shipID);
					cruisers++;
					material = material - 5;
				}else if(shipID == 303 && dreadnoughts < 2){
					ships[ships.length] = new Ship(shipID);
					dreadnoughts++;
					material = material - 8;
				}else if(shipID == 304 && starbases < 4){
					ships[ships.length] = new Ship(shipID);
					starbases++;
					material = material - 3;
				}
			}
		}else{
			if(shipID == 305){
				orbitals++;
				material = material - 5;
			}else if(shipID == 306){
				monoliths++;
				material = material - 10;
			}else{
				if(shipID == 301 && interceptors < 8){
					ships[ships.length] = new Ship(shipID);
					interceptors++;
					material = material - 3;
				}else if(shipID == 302 && cruisers < 4){
					ships[ships.length] = new Ship(shipID);
					cruisers++;
					material = material - 5;
				}else if(shipID == 303 && dreadnoughts < 2){
					ships[ships.length] = new Ship(shipID);
					dreadnoughts++;
					material = material - 8;
				}else if(shipID == 304 && starbases < 4){
					ships[ships.length] = new Ship(shipID);
					starbases++;
					material = material - 3;
				}
			}
		}
	}
	
	public void build(int shipID1, int shipID2){
		influenceDisksLeft--;
		influenceDisksUsed++;
		build(shipID1);
		if(shipID2 < 300){
			build(shipID2);
		}
	}
	public void build(int shipID1, int shipID2, int shipID3){
		influenceDisksLeft--;
		influenceDisksUsed++;
		build(shipID1);
		if(shipID2 < 300){
			build(shipID2);
		}
		if(shipID3 < 300){
			build(shipID3);
		}
	}
	public void build(int shipID1, int shipID2, int shipID3, int shipID4){
		influenceDisksLeft--;
		influenceDisksUsed++;
		build(shipID1);
		if(shipID2 < 300){
			build(shipID2);
		}
		if(shipID3 < 300){
			build(shipID3);
		}
		if(shipID4 < 300){
			build(shipID4);
		}
	}
	
	//TODO: alusten liikuttaminen
	public void move(){
		influenceDisksLeft--;
		influenceDisksUsed++;
		if(passed){
			
		}else{
			
		}
	}
	
	public void pass(){
		passed = true;
	}
	
	//traded kappaletta resource1 resurssia vaihdetaan resource2:ksi vaihtosuhteen mukaan
	public void trade(String resource1, String resource2, int traded){
		if(resource1.equals("money")){
			if(resource2.equals("science")){
				money = money - traded;
				science = science + traded/2;
			}else if(resource2.equals("material")){
				money = money - traded;
				material = material + traded/2;
			}
		}else if(resource1.equals("science")){
			if(resource2.equals("money")){
				science = science - traded;
				money = money + traded/2;
			}else if(resource2.equals("material")){
				science = science - traded;
				money = money + traded/2;
			}		
		}else if(resource1.equals("material")){
			if(resource2.equals("science")){
				material = material - traded;
				science = science + traded/2;
			}else if(resource2.equals("money")){
				material = material - traded;
				science = science + traded/2;
			}
		}
	}
	
	public void initDiplomacy(String diplomatName){
		reputationTrack.addDiplomat(diplomatName);
	}
	
	public void breakDiplomacy(String diplomatName){
		reputationTrack.removeDiplomat(diplomatName);
	}

	// GETTERS

	// public String getName() {
	// return name;
	// }

	public int getMoney() {
		return money;
	}

	public int getScience() {
		return science;
	}

	public int getMaterial() {
		return material;
	}

	public int getTradeFactor() {
		return tradeFactor;
	}

	public int getInfluenceDisksLeft() {
		return influenceDisksLeft;
	}

	public int getEconomistsLeft() {
		return economistsLeft;
	}

	public int getScientistsLeft() {
		return scientistsLeft;
	}

	public int getMinersLeft() {
		return minersLeft;
	}

	public int getColonyShipsLeft() {
		return colonyShipsLeft;
	}

	public Tech[] getMilTechs() {
		return milTechs;
	}

	public Tech[] getGridTechs() {
		return gridTechs;
	}

	public Tech[] getNanoTechs() {
		return nanoTechs;
	}

	public ReputationTrack getReputationTrack() {
		return reputationTrack;
	}

	public boolean getPassed() {
		return passed;
	}

}
