package com.alacriti.demo.test;

public class EnumTest {

	enum planet{
		MERCURY, VENUS, EARTH;
	}
	public static void main(String args[]){
		
		System.out.println(planet.MERCURY);
		System.out.println(planet.MERCURY==planet.VENUS);
		System.out.println(planet.MERCURY.equals(planet.MERCURY));
	}
}
