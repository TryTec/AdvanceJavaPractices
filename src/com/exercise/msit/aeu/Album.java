package com.exercise.msit.aeu;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Try
 *
 */
public class Album {
	private int ID;
	private String Name;
	private Artist artist;
	private List<Tracks> trackList = new ArrayList<>();
	
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
	
	public Artist getArtist() {
		return artist;
	}
	
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public List<Tracks> getTrackList(){
		return trackList;
	}
	
	public String toString() {
		String showTracks = this.getTrackList().stream()
				.map(m -> "\t- " + m.toString() + "\n")
				.collect(Collectors.joining());
		
		return String.format("ID : %1$s, Name : %2$s, Artist : { %3$s }\nTracks : %4$s", 
				this.GetID(), this.GetName(), this.getArtist(), showTracks);
	}
}