package com.example.eclipse_buddy_harkka;

public class Hull implements Part {
	private String name;
	private int partID;
	private String[] names = {"Hull", "Improved Hull", "Shard Hull"};
	private int absorption;
	
	public Hull(int partID){
		this.partID = partID;
		name = names[partID - 118];
		absorption = partID - 117;
	}

	public String getName() {
		return name;
	}

	public int getPartID() {
		return partID;
	}

	public int getAbsorption() {
		return absorption;
	}

}
