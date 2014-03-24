package com.example.eclipse_buddy_harkka;

public class ReputationTile implements ReputationTrackTile {
	private int victoryPoints;
	
	public ReputationTile(int victoryPoints){
		this.victoryPoints = victoryPoints;
	}

	public int getVictoryPoints() {
		return victoryPoints;
	}

}
