package com.exercise.msit.aeu;

public class Artist {
	private int ID;
	private String Name;
	
//	public Artist(int id, String name) {
//		ID = id;
//		Name = name;
//	}
	
	public int GetID() {
		return ID;
	}
	public void SetID(int value) {
		ID = value;
	}
	
	public String GetName() {
		return Name;
	}
	public void SetName(String value) {
		Name = value;
	}
}