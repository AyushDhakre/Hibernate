package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="player101")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)

public class Player {
	@Id
private int  playerId;
	@Column(length = 15)
private String playername;
	@Column(length = 15)
private int nummatches;
@Embedded
@Column(name="peraddress",length = 15)
private Address resAddr;
public Player() {
	
	// TODO Auto-generated constructor stub
}
public Player(int playerId, String playername, int nummatches, Address resAddr) {
	
	this.playerId = playerId;
	this.playername = playername;
	this.nummatches = nummatches;
	this.resAddr = resAddr;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public int getNummatches() {
	return nummatches;
}
public void setNummatches(int nummatches) {
	this.nummatches = nummatches;
}
public Address getResAddr() {
	return resAddr;
}
public void setResAddr(Address resAddr) {
	this.resAddr = resAddr;
}
@Override
public String toString() {
	return "Player [playerId=" + playerId + ", playername=" + playername + ", nummatches=" + nummatches + ", resAddr="
			+ resAddr + "]";
}


}
