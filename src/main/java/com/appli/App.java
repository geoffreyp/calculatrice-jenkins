package com.appli;

import com.appli.utils.Log;

public class App {
	public static void main(String[] args) {
		Log log = new Log(true);

		log.info("Lancement de la calculatrice...");

		new Calculatrice();

	}
}
