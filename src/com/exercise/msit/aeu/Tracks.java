package com.exercise.msit.aeu;

public class Tracks {
	private int ID;
	private String Name;
	
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
	
	public String toString() {
		return String.format("ID : %1$s, Name: %2$s", this.GetID(), this.GetName());
	}
}