package com.icaballero.app.domain;

public class Song extends Measurable {
	
	public Song(Double totalLength, Double sentLength) {
		super(totalLength, sentLength);
	}


	@Override
	public Double getTotalLength() {
		return totalLength;
	}

	@Override
	public Double getSentLength() {
		return sentLength;
	}



}
