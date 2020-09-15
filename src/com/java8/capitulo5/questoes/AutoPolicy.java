package com.java8.capitulo5.questoes;

public class AutoPolicy {
	private int accountNumber;
	private String makeAndModel;
	private String state;

	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		if (state == "CT" || state == "MA") {
			this.state = state;
		} else {
			System.out.println("Incorreto");
		}
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public void setState(String state) {

		this.state = state;

	}

	public String getState() {

		return state;
	}

	public boolean isNoFaultState() {
		boolean noFaultState;

		switch (getState()) {
		case "CT":
		case "MA":
		case "ME":
		case "NH":
		case "NJ":
		case "NY":
		case "PA":
		case "VT":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}
		return noFaultState;
	}
}
