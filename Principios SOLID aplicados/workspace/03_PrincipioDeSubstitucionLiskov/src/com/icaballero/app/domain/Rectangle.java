package com.icaballero.app.domain;

public class Rectangle {

	private Integer length;
	private Integer width;

	public Rectangle(Integer length, Integer width) {
		this.length = length;
		this.width = width;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getArea() {
		return this.length * this.width;
	}

}
