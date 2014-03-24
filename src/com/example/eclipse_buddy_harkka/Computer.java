package com.example.eclipse_buddy_harkka;

public class Computer implements Part {
	private String name;
	private int partID;
	private String[] names = {"Electron Computer", "Positron Computer", "Gluon Computer", "Axion Computer"};
	private int energyConsumption;
	private int initiative;
	private int accuracy;
	
	public Computer(int partID){
		this.partID = partID;
		name = names[partID - 106];
		if(partID == 106){
			energyConsumption = 0;
			initiative = 0;
			accuracy = 1;
		}else if(partID == 107){
			energyConsumption = 1;
			initiative = 1;
			accuracy = 2;
		}else if(partID == 108){
			energyConsumption = 2;
			initiative = 2;
			accuracy = 3;
		}else if(partID == 109){
			energyConsumption = 0;
			initiative = 0;
			accuracy = 3;
		}
	}

	public String getName() {
		return name;
	}

	public int getPartID() {
		return partID;
	}

	public int getEnergyConsumption() {
		return energyConsumption;
	}

	public int getInitiative() {
		return initiative;
	}

	public int getAccuracy() {
		return accuracy;
	}
	

}
