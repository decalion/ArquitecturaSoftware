package com.icaballero.app.domain;

public abstract class Measurable {
	
	protected Double totalLength;
    protected Double sentLength;

	 public Measurable(Double totalLength, Double sentLength) {
		super();
		this.totalLength = totalLength;
		this.sentLength = sentLength;
	}

	public abstract Double getTotalLength();

	 public abstract Double getSentLength();
	 
	 

	public Double getSentLengthPercentage() {
		return getSentLength() * 100 / getTotalLength();
	}

}
