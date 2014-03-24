package com.example.eclipse_buddy_harkka;

public class Ship {
	private Part[] parts;
	private int initiative;
	private int energy;
	private int travelDistance;
	private int shipID;
	private int absorption;
	private int accuracy;
	private int shielding;
	private String name;
	private String[] names = {"Interceptor", "Cruiser", "Dreadnought", "Starbase"};
	
	public Ship(int shipID){
		this.shipID = shipID;
		name = names[shipID - 301];
		travelDistance = 0;
		energy = 0;
		absorption = 0;
		accuracy = 0;
		shielding = 0;
		if(shipID == 301){
			parts = new Part[4];
			initiative = 2;
			addPart(101, 0);
			addPart(114, 1);
			addPart(110, 2);
		}else if(shipID == 302){
			parts = new Part[6];
			initiative = 1;
			addPart(101, 0);
			addPart(114, 1);
			addPart(110, 2);
			addPart(118, 3);
			addPart(106, 4);
		}else if(shipID == 303){
			parts = new Part[8];
			initiative = 0;
			addPart(101, 0);
			addPart(101, 1);
			addPart(114, 2);
			addPart(110, 3);
			addPart(118, 4);
			addPart(118, 5);
			addPart(106, 6);
		}else if(shipID == 304){
			parts = new Part[5];
			energy = 3;
			initiative = 4;
			addPart(101, 0);
			addPart(118, 1);
			addPart(118, 2);
			addPart(106, 3);
		}
		
	}
	
	public void addPart(int partID, int partIndex){
		removePart(partIndex);
		if(partID >= 101 && partID <= 105){
			parts[partIndex] = new Cannon(partID);
			energy = energy - ((Cannon)parts[partIndex]).getEnergyConsumption();
		}
		else if(partID >= 106 && partID <= 109){
			parts[partIndex] = new Computer(partID);
			energy = energy - ((Computer)parts[partIndex]).getEnergyConsumption();
			initiative = initiative + ((Computer)parts[partIndex]).getInitiative();
			accuracy = accuracy + ((Computer)parts[partIndex]).getAccuracy();
		}
		else if(partID >= 110 && partID <= 113){
			parts[partIndex] = new Drive(partID);
			energy = energy - ((Drive)parts[partIndex]).getEnergyConsumption();
			initiative = initiative + ((Drive)parts[partIndex]).getInitiative();
			travelDistance = travelDistance + ((Drive)parts[partIndex]).getTravelDistance();
		}
		else if(partID >= 114 && partID <= 117){
			parts[partIndex] = new Source(partID);
			energy = energy + ((Source)parts[partIndex]).getEnergy();
		}
		else if(partID >= 118 && partID <= 120){
			parts[partIndex] = new Hull(partID);
			absorption = absorption + ((Hull)parts[partIndex]).getAbsorption();
		}
		else if(partID >= 121 && partID <= 123){
			parts[partIndex] = new Shield(partID);
			energy = energy - ((Shield)parts[partIndex]).getEnergyConsumption();
			shielding = shielding + ((Shield)parts[partIndex]).getShielding();
		}	
	}
	
	public void removePart(int partIndex){
		if(parts[partIndex] instanceof Cannon){
			energy = energy + ((Cannon)parts[partIndex]).getEnergyConsumption();
		}else if(parts[partIndex] instanceof Computer){
			energy = energy + ((Computer)parts[partIndex]).getEnergyConsumption();
			initiative = initiative - ((Computer)parts[partIndex]).getInitiative();
			accuracy = accuracy - ((Computer)parts[partIndex]).getAccuracy();
		}else if(parts[partIndex] instanceof Hull){
			absorption = absorption - ((Hull)parts[partIndex]).getAbsorption();
		}else if(parts[partIndex] instanceof Shield){
			energy = energy + ((Shield)parts[partIndex]).getEnergyConsumption();
			shielding = shielding - ((Shield)parts[partIndex]).getShielding();
		}else if(parts[partIndex] instanceof Drive){
			energy = energy + ((Drive)parts[partIndex]).getEnergyConsumption();
			initiative = initiative - ((Drive)parts[partIndex]).getInitiative();
			travelDistance = travelDistance - ((Drive)parts[partIndex]).getTravelDistance();
		}else if(parts[partIndex] instanceof Source){
			energy = energy - ((Source)parts[partIndex]).getEnergy();
		}
	}

	public int getInitiative() {
		return initiative;
	}

	public int getEnergy() {
		return energy;
	}

	public int getTravelDistance() {
		return travelDistance;
	}

	public int getShipID() {
		return shipID;
	}

	public String getName() {
		return name;
	}
	
	public int getAbsorption() {
		return absorption;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getShielding() {
		return shielding;
	}

}
