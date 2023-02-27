package com.msit.aeu.exercise2;

/**
 * @author Try
 *
 */

public class Tracks {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int value) {
		id = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String value) {
		name = value;
	}
	
	public String toString() {
		return String.format("Id : %1$s, Name: %2$s", this.getId(), this.getName());
	}
}