package de.erdtmann.soft.utils.licht;

public enum WsLedModus {

	ALLE_AN(0),
	ALLE_AUS(0),
	AN_AUS(0),
	HIN_HER(0),
	FADE(0),
	COLOR_FADE(0),
	HELLIGKEIT(1),
	V1(1),
	V2(1),
	FARBE(1);
	
	private int werte;
	
	WsLedModus(int werte) {
		this.werte = werte;
	}

	public int getWerte() {
		return werte;
	}
}
