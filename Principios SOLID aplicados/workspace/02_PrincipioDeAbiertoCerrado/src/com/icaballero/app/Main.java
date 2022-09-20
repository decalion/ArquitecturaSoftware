package com.icaballero.app;

import com.icaballero.app.controller.Progress;
import com.icaballero.app.domain.Song;

public class Main {
	
	public static void main(String[] args) {
		
		Song song = new Song(1.5, 2.5);
		Progress progress = new Progress();
		progress.getSentLengthPercentage(song);
		
	}

}
