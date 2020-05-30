package com.github.aromansson.fainjava.lesson7.tryit;

public interface Payable {
	boolean increasePay(int percent);
	int INCREASE_CAP = 20;
}
