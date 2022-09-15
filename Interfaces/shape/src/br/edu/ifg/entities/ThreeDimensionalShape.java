package br.edu.ifg.entities;

public class ThreeDimensionalShape extends Shape{

	private Double axis_X;
	private Double axis_Y;
	private Double axis_Z;
	
	public ThreeDimensionalShape() {
		
	}
	
	public ThreeDimensionalShape(Double x, Double y, Double z) {
		super();
		this.axis_X = x;
		this.axis_Y = y;
		this.axis_Z = z;
	}

	public Double getX() {
		return axis_X;
	}

	public void setX(Double x) {
		this.axis_X = x;
	}

	public Double getY() {
		return axis_Y;
	}

	public void setY(Double y) {
		this.axis_Y = y;
	}

	public Double getZ() {
		return axis_Z;
	}

	public void setZ(Double z) {
		this.axis_Z = z;
	}
	
	
	
	
	
}
