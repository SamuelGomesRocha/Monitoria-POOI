package br.edu.ifg.entities;

import br.edu.ifg.iterfaces.BidimensionalInterface;

public class TwoDimensionalShape extends Shape implements BidimensionalInterface {

	private Double axis_X;
	private Double axis_Y;
	
	
	public TwoDimensionalShape() {	
	}
	
	public TwoDimensionalShape(Double x, Double y) {
		super();
		this.axis_X = x;
		this.axis_Y = y;
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

	@Override
	public Double calculoArea(double x, double y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculoPerimetro(double x, double y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculoVolume(double x, double y, double z) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
