package wd.calc.jxb;

import java.math.BigDecimal;

public class Arm {

	private final double pi = 3.141592653;
	private int id;
	private String name;
	private double length;
	private double x0, y0, x1, y1;
	private double angle;
	
	public Arm() {
		id = 0;
		name = "臂段０";
	}
	
	public Arm(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Arm(int id, String name, double length, double x0, double y0, double angle) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.x0 = x0;
		this.y0 = y0;
		this.angle = angle;
		this.calcCoordinate();
	}
	
	public void changeAngle(double angle) {
		this.angle = angle;
		this.calcCoordinate();
	}
	
	private void calcCoordinate () {
		double _x = x0 + length * Math.cos(angle * pi / 180);
		double _y = y0 + length * Math.sin(angle * pi / 180);
		BigDecimal x = new BigDecimal(_x);
		this.x1 = x.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
		BigDecimal y = new BigDecimal(_y);
		this.y1 = y.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " + this.id + ", name: " + this.name + ", length: " + this.length + ", angle: " + this.angle
				+ ", x0: " + this.x0 + ", y0: " + this.y0 + ", x1: " + this.x1 + ", y1: " + this.y1;
	}

}
