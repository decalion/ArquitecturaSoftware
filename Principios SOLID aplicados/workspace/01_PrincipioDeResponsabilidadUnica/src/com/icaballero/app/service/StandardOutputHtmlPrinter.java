package com.icaballero.app.service;

public class StandardOutputHtmlPrinter implements IPrinter {

	@Override
	public void printPage(String page) {
		System.out.println("<div>" + page + "</div>");
		
	}

}
