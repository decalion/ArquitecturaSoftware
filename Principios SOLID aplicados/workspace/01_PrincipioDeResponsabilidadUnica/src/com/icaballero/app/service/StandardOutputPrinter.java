package com.icaballero.app.service;

public class StandardOutputPrinter implements IPrinter {

	@Override
	public void printPage(String page) {
		System.out.println(page);
		
	}

}
