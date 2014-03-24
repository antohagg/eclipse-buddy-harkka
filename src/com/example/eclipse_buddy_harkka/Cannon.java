package com.example.eclipse_buddy_harkka;

public class Cannon implements Part {
	private String name;
	private int partID;
	private String[] names = {"Ion Cannon", "Plasma Cannon",  "Antimatter Cannon", "Plasma Missile", "Ion Turret"};
	private int damage;
	private int damageInstances;
	private int energyConsumption;
	
	public Cannon(int partID){
		this.partID = partID;
		name = names[partID - 101];
		if(partID >= 104){
			damageInstances = 2;
			energyConsumption = 0;
		}else{
			damageInstances = 1;
		}
		if(partID == 101 || partID == 105){
			damage = 1;
			energyConsumption = 1;
		}else if(partID == 103){
			damage = 4;
			energyConsumption = 4;
		}else{
			damage = 2;
		}
		if(partID == 102){
			energyConsumption = 2;
		}
	}
	
	public String getName() {
		return name;
	}

	public int getPartID() {
		return partID;
	}

	public int getDamage() {
		return damage;
	}

	public int getDamageInstances() {
		return damageInstances;
	}

	public int getEnergyConsumption() {
		return energyConsumption;
	}

}
