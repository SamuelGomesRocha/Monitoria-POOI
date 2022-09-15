package br.edu.ifg.entities;

public class Shape {

	private String name;
	private Double area;
	
	public Shape() {
		
	}
	
	public Shape(String name, Double area) {
		this.name = name;
		this.area = area;
	}

	//public
	
	protected Double getArea() {
		return this.area;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void setArea(Double area) {
		this.area = area;
	}
	
	
}
