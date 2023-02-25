package com.exercise.msit.aeu;

/**
 * @author Try
 *
 */

public class Artist {
	private int id;
	private String name;
	
//	public Artist(int id, String name) {
//		ID = id;
//		Name = name;
//	}
	
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