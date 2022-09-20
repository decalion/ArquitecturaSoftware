package com.icaballero.app.domain;

public class Square extends Rectangle {

	public Square(Integer lengthAndWidth) {
		super(lengthAndWidth, lengthAndWidth);
	}

	@Override
	public void setLength(Integer length) {
		super.setLength(length);
		super.setWidth(length);
	}

	@Override
	public void setWidth(Integer width) {
		super.setLength(width);
		super.setWidth(width);
	}

}
