package model;

import java.io.Serializable;

public class Billboard implements Serializable{

	private static final long serialVersionUID = 1L;
	private double width;
	private double height;
	private	String brand;
	private boolean inUse;
	

	public Billboard(double w, double h, boolean iu, String b) {
		this.width=w;
		this.height=h;
		this.brand=b;
		this.inUse=iu;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double w) {
		this.width = w;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double h) {
		this.height = h;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String b) {
		this.brand = b;
	}


	public boolean isInUse() {
		return inUse;
	}


	public void setInUse(boolean iu) {
		this.inUse = iu;
	}
	
	
}


	