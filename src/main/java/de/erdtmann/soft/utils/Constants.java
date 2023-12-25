package de.erdtmann.soft.utils;

public final class Constants {
	
	public static final String TYP_BOOLEAN = "Boolean";
	public static final String TYP_ZEIT = "Zeit";
	public static final String TYP_ZAHL = "Zahl";

	private Constants() {}

	public static final String REST_POOL_URL = "http://erdtmann.my-router.de:9898";
	public static final String REST_PV_URL = "http://erdtmann.my-router.de:8080";
	
	public static final String REST_PFAD_TEMP = "/temperatur";
	public static final String REST_PFAD_PUMPE = "/pumpe";
	public static final String REST_PFAD_PUMPE_STATUS = "/status";
	public static final String REST_PFAD_HEIZUNG = "/heizung";
	public static final String REST_PFAD_HEIZUNG_STATUS = "/status";
	
	public static final String REST_PFAD_PV = "/pvService/pv/pvDaten";

}
