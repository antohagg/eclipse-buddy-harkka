package com.example.eclipse_buddy_harkka;

import java.util.ArrayList;

public class ReputationTrack {
	private int maxDiplomats;
	private int maxReputationTiles;
	private int diplomats;
	private int reputationTiles;
	private int maxSize;
	private ArrayList<ReputationTrackTile> reputationTrackTiles;
	
	public ReputationTrack(String name){
		diplomats = 0;
		reputationTiles = 0;
		if(name.equals("Eridani Empire")){
			maxDiplomats = 4;
			maxReputationTiles = 4;
			maxSize = 4;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}else if(name.equals("Hydran Progress")){
			maxDiplomats = 4;
			maxReputationTiles = 3;
			maxSize = 4;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}else if(name.equals("Planta")){
			maxDiplomats = 4;
			maxReputationTiles = 3;
			maxSize = 4;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}else if(name.equals("Descendants of Draco")){
			maxDiplomats = 4;
			maxReputationTiles = 4;
			maxSize = 4;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}else if(name.equals("Mechanema")){
			maxDiplomats = 4;
			maxReputationTiles = 4;
			maxSize = 4;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}else if(name.equals("Orion Hegemony")){
			maxDiplomats = 4;
			maxReputationTiles = 5;
			maxSize = 5;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}else{
			maxDiplomats = 5;
			maxReputationTiles = 4;
			maxSize = 5;
			reputationTrackTiles = new ArrayList<ReputationTrackTile>();
		}
	}
	
	public ReputationTrack(){
		maxDiplomats = 5;
		maxReputationTiles = 4;
		maxSize = 5;
		reputationTrackTiles = new ArrayList<ReputationTrackTile>();
	}
	
	public void addDiplomat(String name){
		if(diplomats < maxDiplomats && reputationTrackTiles.size() < maxSize){
			reputationTrackTiles.add(new Diplomat(name));
			diplomats++;
		}
	}
	
	public void removeDiplomat(String name){
		for(int i = 0; i < reputationTrackTiles.size(); i++){
			if(reputationTrackTiles.get(i) instanceof Diplomat)
				if(name.equals(((Diplomat)reputationTrackTiles.get(i)).getName())){
				reputationTrackTiles.remove(i);
				diplomats--;
				return;
			}
		}
	}
	
	public void addReputationTile(int victoryPoints){
		if(reputationTiles < maxReputationTiles && reputationTrackTiles.size() < maxSize){
			reputationTrackTiles.add(new ReputationTile(victoryPoints));
			reputationTiles++;
		}else if(reputationTiles == maxReputationTiles){
			int minIndex = -1;
			int minVictoryPoints = victoryPoints;
			for(int i = 0; i < reputationTrackTiles.size(); i++){
				if(reputationTrackTiles.get(i) instanceof ReputationTile){
					if(((ReputationTile)reputationTrackTiles.get(i)).getVictoryPoints() < minVictoryPoints){
						minIndex = i;
						minVictoryPoints = ((ReputationTile)reputationTrackTiles.get(i)).getVictoryPoints();
					}
				}
			}
			if(minIndex != -1){
				reputationTrackTiles.set(minIndex, new ReputationTile(victoryPoints));
			}
			
		}
	}
	

}
