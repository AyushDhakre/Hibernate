package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("Batsman")
public class Batsman extends Player{
	@Column(name="numruns",length = 15)
private int numRuns;

public Batsman(int playerId, String playername, int nummatches, Address resAddr,int numRuns) {
	super(playerId, playername, nummatches, resAddr);
	
	this.numRuns = numRuns;

}
public Batsman() {
	super();
	// TODO Auto-generated constructor stub
}
public int getNumRuns() {
	return numRuns;
}
public void setNumRuns(int numRuns) {
	this.numRuns = numRuns;
}
@Override
public String toString() {
	;
	return super.toString()+"Batsman [numRuns=" + numRuns + "]";
}



}
