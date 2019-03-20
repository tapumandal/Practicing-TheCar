package com.tapumandal.basic;

public class Chassis {
	
	private Wheel frontWheelA, frontWheelB, rearWheelA, rearWheelB;

	public Wheel getFrontWheelA() {
		return frontWheelA;
	}

	public void setFrontWheelA(Wheel frontWheelA) {
		this.frontWheelA = frontWheelA;
	}

	public Wheel getFrontWheelB() {
		return frontWheelB;
	}

	public void setFrontWheelB(Wheel frontWheelB) {
		this.frontWheelB = frontWheelB;
	}

	public Wheel getRearWheelA() {
		return rearWheelA;
	}

	public void setRearWheelA(Wheel rearWheelA) {
		this.rearWheelA = rearWheelA;
	}

	public Wheel getRearWheelB() {
		return rearWheelB;
	}

	public void setRearWheelB(Wheel rearWheelB) {
		this.rearWheelB = rearWheelB;
	}
	
	
	
	public void theChassis(){
		
		System.out.println("FA:"+frontWheelA.getRadious()+" FB:"+frontWheelB.getWidth()+" RA:"+rearWheelA.getCompany()+" RB:"+rearWheelB.getCompany());
	}
	

}
