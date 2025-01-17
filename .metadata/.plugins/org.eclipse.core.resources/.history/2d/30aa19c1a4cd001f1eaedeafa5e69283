package com.model;

import javax.persistence.Column;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bowler")
public class Bowler extends Player {
	@Column(name="numWickets",length = 15)
	private  int numWickets;

	public Bowler() {
		super();
	}

	public Bowler(int playerId, String playername, int nummatches, Address resAddr,int numWickets) {
		super(playerId, playername, nummatches, resAddr);
		this.numWickets=numWickets;
	}

	public int getNumWickets() {
		return numWickets;
	}

	public void setNumWickets(int numWickets) {
		this.numWickets = numWickets;
	}

	@Override
	public String toString() {
		
		return  super.toString()+"Bowler [numWickets=" + numWickets + "]";
	}
	

}
