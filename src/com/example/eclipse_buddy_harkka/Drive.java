package com.example.eclipse_buddy_harkka;

public class Drive implements Part {
	private String name;
	private int partID;
	private String[] names = {"Nucler Drive", "Fusion Drive", "Tachyon Drive", "Conformal Drive"};
	private int initiative;
	private int energyConsumption;
	private int travelDistance;
	
	public Drive(int partID){
		this.partID = partID;
		name = names[partID - 110];
		if(partID == 113){
			initiative = 2;
			energyConsumption = 2;
			travelDistance = 4;
		}else{
			initiative = partID - 109;
			energyConsumption = partID - 109;
			travelDistance = partID - 109;
		}
	}

	public String getName() {
		return name;
	}

	public int getPartID() {
		return partID;
	}

	public int getInitiative() {
		return initiative;
	}

	public int getEnergyConsumption() {
		return energyConsumption;
	}

	public int getTravelDistance() {
		return travelDistance;
	}

}
