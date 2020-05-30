package com.github.aromansson.fainjava.lesson7.tryit;

public class Contractor implements Payable {
	private String name;

	public Contractor(String name) {
		this.name = name;
	}

	@Override
	public boolean increasePay(int percent) {
		if (percent < INCREASE_CAP) {
			System.out.println("Increasing hourly rateby " + percent + "%. ");
			return true;
		} else {
			System.out.println("Sorry, can't increase hourly rate by " + percent + "%.");
			return false;
		}

	}
}
