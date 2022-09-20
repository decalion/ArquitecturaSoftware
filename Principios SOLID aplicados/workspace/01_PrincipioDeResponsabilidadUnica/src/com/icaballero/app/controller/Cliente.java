package com.icaballero.app.controller;

import com.icaballero.app.domain.Book;
import com.icaballero.app.service.StandardOutputPrinter;

public class Cliente {

	public Cliente() {

		Book book = new Book();
		String currentPage = book.getCurrentPage();
		StandardOutputPrinter printer = new StandardOutputPrinter();
		printer.printPage(currentPage);

	}

}
