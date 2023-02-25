package com.exercise.msit.aeu;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Try
 *
 */

public class Album {
	private int id;
	private String name;
	private Artist artist;
	private List<Tracks> trackList = new ArrayList<>();
	
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
		
		return String.format("Id : %1$s, Name : %2$s, Artist : { %3$s }\nTracks : %4$s", 
				this.getId(), this.getName(), this.getArtist(), showTracks);
	}
}