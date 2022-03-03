package com.ecommerce;

public class Products {
	private int pid;
	private String pName;
	private int price;
	
	public Products() {}

	public Products(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
}

