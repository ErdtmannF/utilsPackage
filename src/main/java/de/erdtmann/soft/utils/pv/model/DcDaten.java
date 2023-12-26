package de.erdtmann.soft.utils.pv.model;

import java.io.Serializable;

public class DcDaten implements Serializable {

	private static final long serialVersionUID = -17653726739594852L;

	private float totalDcPower;
	private float dcA1;
	private float dcW1;
	private float dcV1;
	private float dcA2;
	private float dcW2;
	private float dcV2;
	private float sumDcPower;

	public float getTotalDcPower() {
		return totalDcPower;
	}
	public void setTotalDcPower(float totalDcPower) {
		this.totalDcPower = totalDcPower;
	}
	public float getDcA1() {
		return dcA1;
	}
	public void setDcA1(float dcA1) {
		this.dcA1 = dcA1;
	}
	public float getDcW1() {
		return dcW1;
	}
	public void setDcW1(float dcW1) {
		this.dcW1 = dcW1;
	}
	public float getDcV1() {
		return dcV1;
	}
	public void setDcV1(float dcV1) {
		this.dcV1 = dcV1;
	}
	public float getDcA2() {
		return dcA2;
	}
	public void setDcA2(float dcA2) {
		this.dcA2 = dcA2;
	}
	public float getDcW2() {
		return dcW2;
	}
	public void setDcW2(float dcW2) {
		this.dcW2 = dcW2;
	}
	public float getDcV2() {
		return dcV2;
	}
	public void setDcV2(float dcV2) {
		this.dcV2 = dcV2;
	}
	public float getSumDcPower() {
		return sumDcPower;
	}
	public void setSumDcPower(float sumDcPower) {
		this.sumDcPower = sumDcPower;
	}
	
}
