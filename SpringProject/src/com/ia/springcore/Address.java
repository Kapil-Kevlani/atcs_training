package com.ia.springcore;

public class Address {
	
	private int honum;
	private String colony;
	private String dstrc;
	private String state;
	//Getter and setters for address class
	public int getHonum() {
		return honum;
	}
	public void setHonum(int honum) {
		this.honum = honum;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getDstrc() {
		return dstrc;
	}
	public void setDstrc(String dstrc) {
		this.dstrc = dstrc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int honum, String colony, String dstrc, String state) {
		super();
		this.honum = honum;
		this.colony = colony;
		this.dstrc = dstrc;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [honum=" + honum + ", colony=" + colony + ", dstrc=" + dstrc + ", state=" + state + "]";
	}
	

}