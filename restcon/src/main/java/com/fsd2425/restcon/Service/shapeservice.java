package com.fsd2425.restcon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd2425.restcon.Entity.circle;
import com.fsd2425.restcon.Entity.rectangle;

@Service  
public class shapeservice {

    @Autowired
    private circle c;  

    @Autowired
    private rectangle r; 

    public String circle_service(float r) {
        c.setRadius(r);  
        return c.toString();
    }

    public String rectangle_service(float l, float b) {
        r.setLength(l);
        r.setBreadth(b);
        return r.toString();
    }
}
