package com.exercise.msit.aeu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {		
		var artistList = GetAllArtist();
		var trackList = GetAllTrack();
		var albumList = GetAllAlbum();
		var albumTrackList = GetAllAlbumTrack();
		
//		artistList.forEach((v) -> System.out.println(String.format("ID : %1$s, Name: %2$s", v.GetID(), v.GetName())));
//		for (var artist : artistList) {
//			System.out.println(String.format("ID : %1$s, Name: %2$s", artist.GetID(), artist.GetName()));
//		}
	}
	
	private static List<Artist> GetAllArtist() {
//		List<Artist> artists = new ArrayList<>();
//		artists.add(new Artist(1, "Sereymun"));	
		
		Artist artist1 = new Artist();
		artist1.SetID(1);
		artist1.SetName("Sereymun");
		Artist artist2 = new Artist();
		artist2.SetID(2);
		artist2.SetName("Preapsovat");
		Artist artist3 = new Artist();
		artist3.SetID(3);
		artist3.SetName("Khem");
		Artist artist4 = new Artist();
		artist4.SetID(4);
		artist4.SetName("Keosarat");
		Artist artist5 = new Artist();
		artist5.SetID(5);
		artist5.SetName("Sunsisamut");
		Artist artist6 = new Artist();
		artist6.SetID(6);
		artist6.SetName("Jerm");
		Artist artist7 = new Artist();
		artist7.SetID(7);
		artist7.SetName("Bunsak");
		Artist artist8 = new Artist();
		artist8.SetID(8);
		artist8.SetName("Eno");
		Artist artist9 = new Artist();
		artist9.SetID(9);
		artist9.SetName("G-Dewit");
		Artist artist10 = new Artist();
		artist10.SetID(10);
		artist10.SetName("Vannda");
		
		List<Artist> artistList = new ArrayList<Artist>(Arrays.asList(artist1,artist2,artist3,artist4,artist5,artist6,artist7,artist8,artist9,artist10));
		
		return artistList;
	}
	
	private static List<Tracks> GetAllTrack() {
		Tracks track1 = new Tracks();
		track1.SetID(1);
		track1.SetName("Track1");
		Tracks track2 = new Tracks();
		track2.SetID(2);
		track2.SetName("Track2");
		Tracks track3 = new Tracks();
		track3.SetID(3);
		track3.SetName("Track3");
		Tracks track4 = new Tracks();
		track4.SetID(4);
		track4.SetName("Track4");
		Tracks track5 = new Tracks();
		track5.SetID(5);
		track5.SetName("Track5");
		Tracks track6 = new Tracks();
		track6.SetID(6);
		track6.SetName("Track6");
		Tracks track7 = new Tracks();
		track7.SetID(7);
		track7.SetName("Track7");
		Tracks track8 = new Tracks();
		track8.SetID(8);
		track8.SetName("Track8");
		Tracks track9 = new Tracks();
		track9.SetID(9);
		track9.SetName("Track9");
		Tracks track10 = new Tracks();
		track10.SetID(10);
		track10.SetName("Track10");
		Tracks track11 = new Tracks();
		track11.SetID(11);
		track11.SetName("Track11");
		Tracks track12 = new Tracks();
		track12.SetID(12);
		track12.SetName("Track12");
		Tracks track13 = new Tracks();
		track13.SetID(13);
		track13.SetName("Track13");
		Tracks track14 = new Tracks();
		track14.SetID(14);
		track14.SetName("Track14");
		Tracks track15 = new Tracks();
		track15.SetID(15);
		track15.SetName("Track15");
		Tracks track16 = new Tracks();
		track16.SetID(16);
		track16.SetName("Track16");
		Tracks track17 = new Tracks();
		track17.SetID(17);
		track17.SetName("Track17");
		Tracks track18 = new Tracks();
		track18.SetID(18);
		track18.SetName("Track18");
		Tracks track19 = new Tracks();
		track19.SetID(19);
		track19.SetName("Track19");
		Tracks track20 = new Tracks();
		track20.SetID(20);
		track20.SetName("Track20");
		Tracks track21 = new Tracks();
		track21.SetID(21);
		track21.SetName("Track21");
		Tracks track22 = new Tracks();
		track22.SetID(22);
		track22.SetName("Track22");
		Tracks track23 = new Tracks();
		track23.SetID(23);
		track23.SetName("Track23");
		Tracks track24 = new Tracks();
		track24.SetID(24);
		track24.SetName("Track24");
		Tracks track25 = new Tracks();
		track25.SetID(25);
		track25.SetName("Track25");
		Tracks track26 = new Tracks();
		track26.SetID(26);
		track26.SetName("Track26");
		Tracks track27 = new Tracks();
		track27.SetID(27);
		track27.SetName("Track27");
		Tracks track28 = new Tracks();
		track28.SetID(28);
		track28.SetName("Track28");
		Tracks track29 = new Tracks();
		track29.SetID(29);
		track29.SetName("Track29");
		Tracks track30 = new Tracks();
		track30.SetID(30);
		track30.SetName("Track30");
		
		List<Tracks> trackList = new ArrayList<Tracks>(Arrays.asList(track1,track2,track3,track4,track5,track6,track7,track8,track9,track10,track11,track12,track13,track14,track15,track16,track17,track18,track19,track20,track21,track22,track23,track24,track25,track26,track27,track28,track29,track30));
		
		return trackList;
	}
	
	private static List<Album> GetAllAlbum() {
		Album album1 = new Album();
		album1.SetID(1);
		album1.SetName("Album1");
		album1.SetArtistID(1);
		Album album2 = new Album();
		album2.SetID(2);
		album2.SetName("Album2");
		album2.SetArtistID(1);
		Album album3 = new Album();
		album3.SetID(3);
		album3.SetName("Album3");
		album3.SetArtistID(2);
		Album album4 = new Album();
		album4.SetID(4);
		album4.SetName("Album4");
		album4.SetArtistID(2);
		Album album5 = new Album();
		album5.SetID(5);
		album5.SetName("Album5");
		album5.SetArtistID(3);
		Album album6 = new Album();
		album6.SetID(6);
		album6.SetName("Album6");
		album6.SetArtistID(3);
		Album album7 = new Album();
		album7.SetID(7);
		album7.SetName("Album7");
		album7.SetArtistID(4);
		Album album8 = new Album();
		album8.SetID(8);
		album8.SetName("Album8");
		album8.SetArtistID(4);
		Album album9 = new Album();
		album9.SetID(9);
		album9.SetName("Album9");
		album9.SetArtistID(5);
		Album album10 = new Album();
		album10.SetID(10);
		album10.SetName("Album10");
		album10.SetArtistID(5);
		Album album11 = new Album();
		album11.SetID(11);
		album11.SetName("Album11");
		album11.SetArtistID(6);
		Album album12 = new Album();
		album12.SetID(12);
		album12.SetName("Album12");
		album12.SetArtistID(6);
		Album album13 = new Album();
		album13.SetID(13);
		album13.SetName("Album13");
		album13.SetArtistID(7);
		Album album14 = new Album();
		album14.SetID(14);
		album14.SetName("Album14");
		album14.SetArtistID(7);
		Album album15 = new Album();
		album15.SetID(15);
		album15.SetName("Album15");
		album15.SetArtistID(8);
		Album album16 = new Album();
		album16.SetID(16);
		album16.SetName("Album16");
		album16.SetArtistID(8);
		Album album17 = new Album();
		album17.SetID(17);
		album17.SetName("Album17");
		album17.SetArtistID(9);
		Album album18 = new Album();
		album18.SetID(18);
		album18.SetName("Album18");
		album18.SetArtistID(9);
		Album album19 = new Album();
		album19.SetID(19);
		album19.SetName("Album19");
		album19.SetArtistID(10);
		Album album20 = new Album();
		album20.SetID(20);
		album20.SetName("Album20");
		album20.SetArtistID(10);
		
		List<Album> albumList = new ArrayList<Album>(Arrays.asList(album1,album2,album3,album4,album5,album6,album7,album8,album9,album10,album11,album12,album13,album14,album15,album16,album17,album18,album19,album20));
		
		return albumList;
	}
	
	private static List<AlbumTracks> GetAllAlbumTrack() {
		AlbumTracks albumTrack1a = new AlbumTracks();
		albumTrack1a.SetAlbumID(1);
		albumTrack1a.SetTrackID(1);
		AlbumTracks albumTrack1b = new AlbumTracks();
		albumTrack1b.SetAlbumID(1);
		albumTrack1b.SetTrackID(2);
		AlbumTracks albumTrack1c = new AlbumTracks();
		albumTrack1c.SetAlbumID(1);
		albumTrack1c.SetTrackID(3);
		AlbumTracks albumTrack2a = new AlbumTracks();
		albumTrack2a.SetAlbumID(2);
		albumTrack2a.SetTrackID(4);
		AlbumTracks albumTrack2b = new AlbumTracks();
		albumTrack2b.SetAlbumID(2);
		albumTrack2b.SetTrackID(5);
		AlbumTracks albumTrack2c = new AlbumTracks();
		albumTrack2c.SetAlbumID(2);
		albumTrack2c.SetTrackID(6);
		AlbumTracks albumTrack3a = new AlbumTracks();
		albumTrack3a.SetAlbumID(3);
		albumTrack3a.SetTrackID(7);
		AlbumTracks albumTrack3b = new AlbumTracks();
		albumTrack3b.SetAlbumID(3);
		albumTrack3b.SetTrackID(8);
		AlbumTracks albumTrack3c = new AlbumTracks();
		albumTrack3c.SetAlbumID(9);
		albumTrack3c.SetTrackID(9);
		AlbumTracks albumTrack4a = new AlbumTracks();
		albumTrack4a.SetAlbumID(4);
		albumTrack4a.SetTrackID(10);
		AlbumTracks albumTrack4b = new AlbumTracks();
		albumTrack4b.SetAlbumID(4);
		albumTrack4b.SetTrackID(11);
		AlbumTracks albumTrack4c = new AlbumTracks();
		albumTrack4c.SetAlbumID(4);
		albumTrack4c.SetTrackID(12);
		AlbumTracks albumTrack5a = new AlbumTracks();
		albumTrack5a.SetAlbumID(5);
		albumTrack5a.SetTrackID(13);
		AlbumTracks albumTrack5b = new AlbumTracks();
		albumTrack5b.SetAlbumID(5);
		albumTrack5b.SetTrackID(14);
		AlbumTracks albumTrack5c = new AlbumTracks();
		albumTrack5c.SetAlbumID(5);
		albumTrack5c.SetTrackID(15);
		AlbumTracks albumTrack6a = new AlbumTracks();
		albumTrack6a.SetAlbumID(6);
		albumTrack6a.SetTrackID(16);
		AlbumTracks albumTrack6b = new AlbumTracks();
		albumTrack6b.SetAlbumID(6);
		albumTrack6b.SetTrackID(17);
		AlbumTracks albumTrack6c = new AlbumTracks();
		albumTrack6c.SetAlbumID(6);
		albumTrack6c.SetTrackID(18);
		AlbumTracks albumTrack7a = new AlbumTracks();
		albumTrack7a.SetAlbumID(7);
		albumTrack7a.SetTrackID(19);
		AlbumTracks albumTrack7b = new AlbumTracks();
		albumTrack7b.SetAlbumID(7);
		albumTrack7b.SetTrackID(20);
		AlbumTracks albumTrack7c = new AlbumTracks();
		albumTrack7c.SetAlbumID(7);
		albumTrack7c.SetTrackID(21);
		AlbumTracks albumTrack8a = new AlbumTracks();
		albumTrack8a.SetAlbumID(8);
		albumTrack8a.SetTrackID(22);
		AlbumTracks albumTrack8b = new AlbumTracks();
		albumTrack8b.SetAlbumID(8);
		albumTrack8b.SetTrackID(23);
		AlbumTracks albumTrack8c = new AlbumTracks();
		albumTrack8c.SetAlbumID(8);
		albumTrack8c.SetTrackID(24);
		AlbumTracks albumTrack9a = new AlbumTracks();
		albumTrack9a.SetAlbumID(9);
		albumTrack9a.SetTrackID(25);
		AlbumTracks albumTrack9b = new AlbumTracks();
		albumTrack9b.SetAlbumID(9);
		albumTrack9b.SetTrackID(26);
		AlbumTracks albumTrack9c = new AlbumTracks();
		albumTrack9c.SetAlbumID(9);
		albumTrack9c.SetTrackID(27);
		AlbumTracks albumTrack10a = new AlbumTracks();
		albumTrack10a.SetAlbumID(10);
		albumTrack10a.SetTrackID(28);
		AlbumTracks albumTrack10b = new AlbumTracks();
		albumTrack10b.SetAlbumID(10);
		albumTrack10b.SetTrackID(29);
		AlbumTracks albumTrack10c = new AlbumTracks();
		albumTrack10c.SetAlbumID(10);
		albumTrack10c.SetTrackID(30);
		
		List<AlbumTracks> albumTrackList = new ArrayList<AlbumTracks>(Arrays.asList(albumTrack1a,albumTrack1b,albumTrack1c,albumTrack2a,albumTrack2b,albumTrack2c,albumTrack3a,albumTrack3b,albumTrack3c,albumTrack4a,albumTrack4b,albumTrack4c,albumTrack5a,albumTrack5b,albumTrack5c,albumTrack6a,albumTrack6b,albumTrack6c,albumTrack7a,albumTrack7b,albumTrack7c,albumTrack8a,albumTrack8b,albumTrack8c,albumTrack9a,albumTrack9b,albumTrack9c,albumTrack10a,albumTrack10b,albumTrack10c));
		
		return albumTrackList;
	}
}