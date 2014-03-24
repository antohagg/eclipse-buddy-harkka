package com.example.eclipse_buddy_harkka;

public class Shield implements Part {
	private String name;
	private int partID;
	private String[] names = {"Gauss Shield", "Phase Shield", "Flux Shield"};
	private int shielding;
	private int energyConsumption;
	
	public Shield(int partID){
		this.partID = partID;
		name = names[partID - 121];
		shielding = partID - 120;
		energyConsumption = partID - 121;
	}

	public String getName() {
		return name;
	}

	public int getPartID() {
		return partID;
	}

	public int getShielding() {
		return shielding;
	}

	public int getEnergyConsumption() {
		return energyConsumption;
	}

}
