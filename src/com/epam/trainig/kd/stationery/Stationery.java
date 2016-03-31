package com.epam.trainig.kd.stationery;

public abstract class Stationery {
	protected int count;
	protected double priceOfOne;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;

	}

	public double getPrice() {

		return (priceOfOne * count);
	}

	public void setPrice(int priceOfOne) {
		this.priceOfOne = priceOfOne;

	}

	protected abstract String Quality();
}
