package com.qa.day3.objects;

public class SongObject {
	
	public String artist;
	public float duration;
	public boolean vocals;
	public int rating;
	
	public SongObject(String artist, float duration, boolean vocals, int rating) {
		this.artist = artist;
		this.duration = duration;
		this.vocals = vocals;
		this.rating = rating;
	}

}
