package com.icaballero.app.controller;

import com.icaballero.app.domain.Measurable;

public class Progress {
	
	 public Double getSentLengthPercentage(Measurable measurable) {
	        return measurable.getSentLength() * 100 / measurable.getTotalLength();
	    }

}
