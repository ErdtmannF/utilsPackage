package de.erdtmann.soft.utils.pv;

public class PvDaten {

	private float leistung;
	private float battLadung;
	private String battRichtung;
	private float battLeistung;
	private float home;
	private float netz;
	private String netzRichtung;
	
	public PvDaten() {}

	public PvDaten(float leistung, float battLadung, String battRichtung, float battLeistung, float home,
			float netz, String netzRichtung) {
		super();
		this.leistung = leistung;
		this.battLadung = battLadung;
		this.battRichtung = battRichtung;
		this.battLeistung = battLeistung;
		this.home = home;
		this.netz = netz;
		this.netzRichtung = netzRichtung;
	}
	
	public float getLeistung() {
		return leistung;
	}
	public void setLeistung(float leistung) {
		this.leistung = leistung;
	}
	public float getBattLadung() {
		return battLadung;
	}
	public void setBattLadung(float battLadung) {
		this.battLadung = battLadung;
	}
	public float getBattLeistung() {
		return battLeistung;
	}
	public void setBattLeistung(float battLeistung) {
		this.battLeistung = battLeistung;
	}
	public float getHome() {
		return home;
	}
	public void setHome(float home) {
		this.home = home;
	}
	public float getNetz() {
		return netz;
	}
	public void setNetz(float netz) {
		this.netz = netz;
	}
	public String getBattRichtung() {
		return battRichtung;
	}
	public void setBattRichtung(String battRichtung) {
		this.battRichtung = battRichtung;
	}
	public String getNetzRichtung() {
		return netzRichtung;
	}
	public void setNetzRichtung(String netzRichtung) {
		this.netzRichtung = netzRichtung;
	}
}
