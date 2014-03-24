package com.example.eclipse_buddy_harkka;

public class Source implements Part {
	private String name;
	private int partID;
	private String[] names = {"Nuclear Source", "Fusion Source", "Tachyon Source", "Hypergrid Source"};
	private int energy;
	
	public Source(int partID){
		this.partID = partID;
		name = names[partID - 114];
		if(partID == 117){
			energy = 11;
		}else{
			energy = 3 * (partID - 113);
		}
	}

	public String getName() {
		return name;
	}

	public int getPartID() {
		return partID;
	}

	public int getEnergy() {
		return energy;
	}

}
