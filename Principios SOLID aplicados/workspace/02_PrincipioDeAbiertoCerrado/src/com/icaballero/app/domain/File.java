package com.icaballero.app.domain;

public class File extends Measurable {
	
	

	public File(Double totalLength, Double sentLength) {
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
