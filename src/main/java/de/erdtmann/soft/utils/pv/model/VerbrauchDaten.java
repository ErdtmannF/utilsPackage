package de.erdtmann.soft.utils.pv.model;

import java.io.Serializable;

public class VerbrauchDaten implements Serializable {

	private static final long serialVersionUID = -3944835609974200495L;

	private float totalVonBatt;
	private float totalVonNetz;
	private float totalVonPv;
	private float totalVerbrauch;
	private float totalVerbrauchRate;
	private float worktime;
	private float totalErtrag;
	private float taeglicherErtrag;
	private float jaehrlicherErtrag;
	private float monatlicherErtrag;
	private float dcZuBatt;
	private float dcVonBatt;
	private float acZuBatt;
	private float battZuNetz;
	private float netzZuBatt;
	private float sumPvInputs;
	private float totalDcVonPv1;
	private float totalDcVonPv2;
	private float totalDcVonPv3;
	private float acZuNetz;

	public float getTotalVonBatt() {
		return totalVonBatt;
	}
	public void setTotalVonBatt(float totalVonBatt) {
		this.totalVonBatt = totalVonBatt;
	}
	public float getTotalVonNetz() {
		return totalVonNetz;
	}
	public void setTotalVonNetz(float totalVonNetz) {
		this.totalVonNetz = totalVonNetz;
	}
	public float getTotalVonPv() {
		return totalVonPv;
	}
	public void setTotalVonPv(float totalVonPv) {
		this.totalVonPv = totalVonPv;
	}
	public float getTotalVerbrauch() {
		return totalVerbrauch;
	}
	public void setTotalVerbrauch(float totalVerbrauch) {
		this.totalVerbrauch = totalVerbrauch;
	}
	public float getTotalVerbrauchRate() {
		return totalVerbrauchRate;
	}
	public void setTotalVerbrauchRate(float totalVerbrauchRate) {
		this.totalVerbrauchRate = totalVerbrauchRate;
	}
	public float getWorktime() {
		return worktime;
	}
	public void setWorktime(float worktime) {
		this.worktime = worktime;
	}
	public float getTotalErtrag() {
		return totalErtrag;
	}
	public void setTotalErtrag(float totalErtrag) {
		this.totalErtrag = totalErtrag;
	}
	public float getTaeglicherErtrag() {
		return taeglicherErtrag;
	}
	public void setTaeglicherErtrag(float taeglicherErtrag) {
		this.taeglicherErtrag = taeglicherErtrag;
	}
	public float getJaehrlicherErtrag() {
		return jaehrlicherErtrag;
	}
	public void setJaehrlicherErtrag(float jaehrlicherErtrag) {
		this.jaehrlicherErtrag = jaehrlicherErtrag;
	}
	public float getMonatlicherErtrag() {
		return monatlicherErtrag;
	}
	public void setMonatlicherErtrag(float monatlicherErtrag) {
		this.monatlicherErtrag = monatlicherErtrag;
	}
	public float getDcZuBatt() {
		return dcZuBatt;
	}
	public void setDcZuBatt(float dcZuBatt) {
		this.dcZuBatt = dcZuBatt;
	}
	public float getDcVonBatt() {
		return dcVonBatt;
	}
	public void setDcVonBatt(float dcVonBatt) {
		this.dcVonBatt = dcVonBatt;
	}
	public float getAcZuBatt() {
		return acZuBatt;
	}
	public void setAcZuBatt(float acZuBatt) {
		this.acZuBatt = acZuBatt;
	}
	public float getBattZuNetz() {
		return battZuNetz;
	}
	public void setBattZuNetz(float battZuNetz) {
		this.battZuNetz = battZuNetz;
	}
	public float getNetzZuBatt() {
		return netzZuBatt;
	}
	public void setNetzZuBatt(float netzZuBatt) {
		this.netzZuBatt = netzZuBatt;
	}
	public float getSumPvInputs() {
		return sumPvInputs;
	}
	public void setSumPvInputs(float sumPvInputs) {
		this.sumPvInputs = sumPvInputs;
	}
	public float getTotalDcVonPv1() {
		return totalDcVonPv1;
	}
	public void setTotalDcVonPv1(float totalDcVonPv1) {
		this.totalDcVonPv1 = totalDcVonPv1;
	}
	public float getTotalDcVonPv2() {
		return totalDcVonPv2;
	}
	public void setTotalDcVonPv2(float totalDcVonPv2) {
		this.totalDcVonPv2 = totalDcVonPv2;
	}
	public float getTotalDcVonPv3() {
		return totalDcVonPv3;
	}
	public void setTotalDcVonPv3(float totalDcVonPv3) {
		this.totalDcVonPv3 = totalDcVonPv3;
	}
	public float getAcZuNetz() {
		return acZuNetz;
	}
	public void setAcZuNetz(float acZuNetz) {
		this.acZuNetz = acZuNetz;
	}
	
}
