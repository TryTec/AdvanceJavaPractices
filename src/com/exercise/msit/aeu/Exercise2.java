package com.exercise.msit.aeu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Try
 *
 */

public class Exercise2 {

	public static void main(String[] args) {		
		var artistList = getAllArtist();
		var trackList = getAllTrack();
		var albumList = getAllAlbum(artistList, trackList);
		
		System.out.println("//All Artists");
		artistList.forEach((v) -> System.out.println(v.toString()));
		System.out.println("\n//All Tracks");
		trackList.forEach((v) -> System.out.println(v.toString()));
		System.out.println("\n//All Albums");
		albumList.forEach((v) -> System.out.println(v.toString()));
		System.out.println("//Show Longer Track");
		Optional<Album> longerTrack = albumList.stream()
				.reduce((album1, album2) -> album1.getTrackList().size() > album2.getTrackList().size() ? album1 : album2);
		if (longerTrack.isPresent()) {
			System.out.println(longerTrack.get().toString());
		} else {
			System.out.println("nothing to show!");
		}
	}
	
	private static List<Artist> getAllArtist() {
//		List<Artist> artists = new ArrayList<>();
//		artists.add(new Artist(1, "Sereymun"));	
		
		Artist artist1 = new Artist();
		artist1.setId(1);
		artist1.setName("Sereymun");
		Artist artist2 = new Artist();
		artist2.setId(2);
		artist2.setName("Preapsovat");
		Artist artist3 = new Artist();
		artist3.setId(3);
		artist3.setName("Khem");
		Artist artist4 = new Artist();
		artist4.setId(4);
		artist4.setName("Keosarat");
		Artist artist5 = new Artist();
		artist5.setId(5);
		artist5.setName("Sunsisamut");
		Artist artist6 = new Artist();
		artist6.setId(6);
		artist6.setName("Jerm");
		Artist artist7 = new Artist();
		artist7.setId(7);
		artist7.setName("Bunsak");
		Artist artist8 = new Artist();
		artist8.setId(8);
		artist8.setName("Eno");
		Artist artist9 = new Artist();
		artist9.setId(9);
		artist9.setName("G-Dewit");
		Artist artist10 = new Artist();
		artist10.setId(10);
		artist10.setName("Vannda");
		
		List<Artist> artistList = new ArrayList<Artist>(Arrays.asList(artist1,artist2,artist3,artist4,artist5,artist6,artist7,artist8,artist9,artist10));
		
		return artistList;
	}
	
	private static List<Tracks> getAllTrack() {
		Tracks track1 = new Tracks();
		track1.setId(1);
		track1.setName("Track1");
		Tracks track2 = new Tracks();
		track2.setId(2);
		track2.setName("Track2");
		Tracks track3 = new Tracks();
		track3.setId(3);
		track3.setName("Track3");
		Tracks track4 = new Tracks();
		track4.setId(4);
		track4.setName("Track4");
		Tracks track5 = new Tracks();
		track5.setId(5);
		track5.setName("Track5");
		Tracks track6 = new Tracks();
		track6.setId(6);
		track6.setName("Track6");
		Tracks track7 = new Tracks();
		track7.setId(7);
		track7.setName("Track7");
		Tracks track8 = new Tracks();
		track8.setId(8);
		track8.setName("Track8");
		Tracks track9 = new Tracks();
		track9.setId(9);
		track9.setName("Track9");
		Tracks track10 = new Tracks();
		track10.setId(10);
		track10.setName("Track10");
		Tracks track11 = new Tracks();
		track11.setId(11);
		track11.setName("Track11");
		Tracks track12 = new Tracks();
		track12.setId(12);
		track12.setName("Track12");
		Tracks track13 = new Tracks();
		track13.setId(13);
		track13.setName("Track13");
		Tracks track14 = new Tracks();
		track14.setId(14);
		track14.setName("Track14");
		Tracks track15 = new Tracks();
		track15.setId(15);
		track15.setName("Track15");
		Tracks track16 = new Tracks();
		track16.setId(16);
		track16.setName("Track16");
		Tracks track17 = new Tracks();
		track17.setId(17);
		track17.setName("Track17");
		Tracks track18 = new Tracks();
		track18.setId(18);
		track18.setName("Track18");
		Tracks track19 = new Tracks();
		track19.setId(19);
		track19.setName("Track19");
		Tracks track20 = new Tracks();
		track20.setId(20);
		track20.setName("Track20");
		Tracks track21 = new Tracks();
		track21.setId(21);
		track21.setName("Track21");
		Tracks track22 = new Tracks();
		track22.setId(22);
		track22.setName("Track22");
		Tracks track23 = new Tracks();
		track23.setId(23);
		track23.setName("Track23");
		Tracks track24 = new Tracks();
		track24.setId(24);
		track24.setName("Track24");
		Tracks track25 = new Tracks();
		track25.setId(25);
		track25.setName("Track25");
		Tracks track26 = new Tracks();
		track26.setId(26);
		track26.setName("Track26");
		Tracks track27 = new Tracks();
		track27.setId(27);
		track27.setName("Track27");
		Tracks track28 = new Tracks();
		track28.setId(28);
		track28.setName("Track28");
		Tracks track29 = new Tracks();
		track29.setId(29);
		track29.setName("Track29");
		Tracks track30 = new Tracks();
		track30.setId(30);
		track30.setName("Track30");
		
		List<Tracks> trackList = new ArrayList<Tracks>(Arrays.asList(track1,track2,track3,track4,track5,track6,track7,track8,track9,track10,track11,track12,track13,track14,track15,track16,track17,track18,track19,track20,track21,track22,track23,track24,track25,track26,track27,track28,track29,track30));
		
		return trackList;
	}
	
	private static List<Album> getAllAlbum(List<Artist> artist, List<Tracks> tracks) {		
		Album album1 = new Album();
		album1.setId(1);
		album1.setName("Album1");
		album1.setArtist(artist.get(0));
		album1.getTrackList().add(tracks.get(0));
		album1.getTrackList().add(tracks.get(1));
		Album album2 = new Album();
		album2.setId(2);
		album2.setName("Album2");
		album2.setArtist(artist.get(0));
		album1.getTrackList().add(tracks.get(2));
		album1.getTrackList().add(tracks.get(3));
		Album album3 = new Album();
		album3.setId(3);
		album3.setName("Album3");
		album3.setArtist(artist.get(1));
		album1.getTrackList().add(tracks.get(4));
		album1.getTrackList().add(tracks.get(5));
		Album album4 = new Album();
		album4.setId(4);
		album4.setName("Album4");
		album4.setArtist(artist.get(1));
		album1.getTrackList().add(tracks.get(6));
		album1.getTrackList().add(tracks.get(7));
		Album album5 = new Album();
		album5.setId(5);
		album5.setName("Album5");
		album5.setArtist(artist.get(2));
		album1.getTrackList().add(tracks.get(8));
		album1.getTrackList().add(tracks.get(9));
		Album album6 = new Album();
		album6.setId(6);
		album6.setName("Album6");
		album6.setArtist(artist.get(2));
		album1.getTrackList().add(tracks.get(10));
		album1.getTrackList().add(tracks.get(11));
		Album album7 = new Album();
		album7.setId(7);
		album7.setName("Album7");
		album7.setArtist(artist.get(3));
		album1.getTrackList().add(tracks.get(12));
		album1.getTrackList().add(tracks.get(13));
		Album album8 = new Album();
		album8.setId(8);
		album8.setName("Album8");
		album8.setArtist(artist.get(3));
		album1.getTrackList().add(tracks.get(14));
		album1.getTrackList().add(tracks.get(15));
		album1.getTrackList().add(tracks.get(16));
		album1.getTrackList().add(tracks.get(17));
		Album album9 = new Album();
		album9.setId(9);
		album9.setName("Album9");
		album9.setArtist(artist.get(4));
		album1.getTrackList().add(tracks.get(18));
		album1.getTrackList().add(tracks.get(19));
		Album album10 = new Album();
		album10.setId(10);
		album10.setName("Album10");
		album10.setArtist(artist.get(4));
		album1.getTrackList().add(tracks.get(20));
		album1.getTrackList().add(tracks.get(21));
		album1.getTrackList().add(tracks.get(22));
		Album album11 = new Album();
		album11.setId(11);
		album11.setName("Album11");
		album11.setArtist(artist.get(5));
		album1.getTrackList().add(tracks.get(23));
		album1.getTrackList().add(tracks.get(24));
		Album album12 = new Album();
		album12.setId(12);
		album12.setName("Album12");
		album12.setArtist(artist.get(5));
		album1.getTrackList().add(tracks.get(25));
		album1.getTrackList().add(tracks.get(26));
		Album album13 = new Album();
		album13.setId(13);
		album13.setName("Album13");
		album13.setArtist(artist.get(6));
		album1.getTrackList().add(tracks.get(27));
		album1.getTrackList().add(tracks.get(28));
		Album album14 = new Album();
		album14.setId(14);
		album14.setName("Album14");
		album14.setArtist(artist.get(6));
		album1.getTrackList().add(tracks.get(29));
		Album album15 = new Album();
		album15.setId(15);
		album15.setName("Album15");
		album15.setArtist(artist.get(7));
		album1.getTrackList().add(tracks.get(20));
		album1.getTrackList().add(tracks.get(21));
		album1.getTrackList().add(tracks.get(22));
		Album album16 = new Album();
		album16.setId(16);
		album16.setName("Album16");
		album16.setArtist(artist.get(7));
		album1.getTrackList().add(tracks.get(14));
		album1.getTrackList().add(tracks.get(15));
		album1.getTrackList().add(tracks.get(16));
		Album album17 = new Album();
		album17.setId(17);
		album17.setName("Album17");
		album17.setArtist(artist.get(8));
		album1.getTrackList().add(tracks.get(20));
		album1.getTrackList().add(tracks.get(21));
		Album album18 = new Album();
		album18.setId(18);
		album18.setName("Album18");
		album18.setArtist(artist.get(8));
		album1.getTrackList().add(tracks.get(20));
		album1.getTrackList().add(tracks.get(21));
		Album album19 = new Album();
		album19.setId(19);
		album19.setName("Album19");
		album19.setArtist(artist.get(9));
		album1.getTrackList().add(tracks.get(4));
		album1.getTrackList().add(tracks.get(5));
		Album album20 = new Album();
		album20.setId(20);
		album20.setName("Album20");
		album20.setArtist(artist.get(9));
		album1.getTrackList().add(tracks.get(14));
		album1.getTrackList().add(tracks.get(15));
		
		List<Album> albumList = new ArrayList<Album>(Arrays.asList(album1,album2,album3,album4,album5,album6,album7,album8,album9,album10,album11,album12,album13,album14,album15,album16,album17,album18,album19,album20));
		
		return albumList;
	}	

}
