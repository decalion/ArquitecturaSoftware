package com.icaballero.app;

import com.icaballero.app.domain.Square;

public class Main {

	public static void main(String[] args) {
		Integer squareLengthAndWidth = 2;
		Square square = new Square(squareLengthAndWidth);

		Integer newSquareLength = 4;
		square.setLength(newSquareLength);

	}

}
