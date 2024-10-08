package com.fsd2425.restcon.Entity;

import org.springframework.stereotype.Component;

@Component
public class rectangle {  
    private String shape = "rectangle";
    private float length = 0;
    private float breadth = 0;
    private float area = 0;

    public rectangle() {}

    public rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = calc_area(this.length, this.breadth);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
        this.area = calc_area(this.length, this.breadth); 
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
        this.area = calc_area(this.length, this.breadth); 
    }

    public float calc_area(float l, float b) {
        this.area = l * b;  
        return this.area;
    }

    @Override
    public String toString() {
        return "{\"shape\":\"" + shape +
                "\",\n\"length\":\"" + length +
                "\",\n\"breadth\":\"" + breadth +
                "\",\n\"area\":\"" + area +
                "\"}";
    }
}
