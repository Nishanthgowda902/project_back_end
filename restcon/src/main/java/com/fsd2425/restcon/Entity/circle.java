package com.fsd2425.restcon.Entity;

import org.springframework.stereotype.Component;

@Component
public class circle {
	private String shape = "circle";
	private float radius = 0;
	private float area = 0;
	
	public circle() {}

	public circle( float radius) {
		this.radius = radius;
		this.area = calc_area(this.radius);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
		this.area=calc_area(this.radius);
	}
	public float calc_area(float r) {
		this.area=(float) 3.14*r*r;
		return this.area;
	}

	@Override
	public String toString() {
		return ( "{\"shape\":\""+shape+
				"\",\n\"radius\":\""+radius+
				"\",\n\"area\":\""+area+
				"\"}");
	}
	
	
}
