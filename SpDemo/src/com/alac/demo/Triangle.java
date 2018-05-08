package com.alac.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}
	
	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}
	@Autowired
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}
	@Autowired
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public String toString() {
		return "pointA.X = " + pointA.getX() + ", pointA.Y= " + pointA.getY()
				+ " pointB.X = " + pointB.getX() + ", pointB.Y= "
				+ pointB.getY() + " pointC.X = " + pointC.getX()
				+ ", pointC.Y= " + pointC.getY();
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertySet() is called.....");
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy() is called.....");
		
	}
	
	public void myInit() throws Exception {
		System.out.println("myInit() is called.....");
		
	}

	public void myDestroy() throws Exception {
		System.out.println("myDestroy() is called.....");
		
	}
	
	@PostConstruct
	public void myInit1() throws Exception {
		System.out.println("myInit1() is called.....");
		
	}

	@PreDestroy
	public void myDestroy1() throws Exception {
		System.out.println("myDestroy1() is called.....");
		
	}

}
