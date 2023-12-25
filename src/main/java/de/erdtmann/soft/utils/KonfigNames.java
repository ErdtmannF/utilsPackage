package de.erdtmann.soft.utils;


public enum KonfigNames {
	POOL_AUTOMATIK("POOL","AUTOMATIK",Constants.TYP_BOOLEAN),
	POOL_WINTER("POOL","WINTER",Constants.TYP_BOOLEAN),
	POOL_ZEIT_ANFANG("POOL","ZEIT_ANFANG",Constants.TYP_ZEIT),
	POOL_ZEIT_ENDE("POOL","ZEIT_ENDE",Constants.TYP_ZEIT),
	POOL_PV_MIN("POOL","PV_MIN",Constants.TYP_ZAHL),
	POOL_PV_MAX("POOL","PV_MAX",Constants.TYP_ZAHL),
	POOL_BATT_MIN("POOL","BATT_MIN",Constants.TYP_ZAHL),
	POOL_BATT_MAX("POOL","BATT_MAX",Constants.TYP_ZAHL);
	
	private String rubrik;
	private String kategorie;
	private String typ;
	
	KonfigNames(String rubrik, String kategorie, String typ) {
		this.rubrik = rubrik;
		this.kategorie = kategorie;
		this.typ = typ;
	}

	public String getRubrik() {
		return rubrik;
	}

	public String getKategorie() {
		return kategorie;
	}

	public String getTyp() {
		return typ;
	}

}
