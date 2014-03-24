package com.example.eclipse_buddy_harkka;

public class Tech {
	private String name;
	private int techID;
	private int cost;
	private int minCost;
	private String[] names = {"Neutron Bombs", "Starbase", "Plasma Cannon", "Phase Shield", "Advanced Mining", "Tachyon Source", "Plasma Missile", "Gluon Computer",
			"Gauss Shield", "Improved Hull", "Fusion Source", "Positron Computer", "Advanced Economy", "Tachyon Drive", "Antimatter Cannon", "Quantum Grid",
			"NanoRobots", "Fusion Drive", "Advanced Robotics", "Orbital", "Advanced Labs", "Monolith", "Artifact Key", "Wormhole Generator"};
	private int[][] costs = {{2, 2}, {4, 3}, {6, 4}, {8, 5}, {10, 6}, {12, 6}, {14, 7}, {16, 8}};
	private int[] costReduction = {0, 1, 2, 3, 4, 6, 8};
	
	public Tech(int techID){
		this.techID = techID;
		this.name = names[techID - 201];
		if(techID <= 208){
			cost = costs[techID - 201][0];
			minCost = costs[techID - 201][1];
		}else if(techID <= 216 && techID >= 209){
			cost = costs[techID - 209][0];
			minCost = costs[techID - 209][1];
		}else if(techID >= 217){
			cost = costs[techID - 217][0];
			minCost = costs[techID - 217][1];
		}
	}
	
	public int getCurrentCost(int previousTechs){
		if((cost - costReduction[previousTechs]) > minCost){
			return cost - costReduction[previousTechs];
		}else{
			return minCost;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getTechID(){
		return techID;
	}

	public int getCost() {
		return cost;
	}

	public int getMinCost() {
		return minCost;
	}

}
