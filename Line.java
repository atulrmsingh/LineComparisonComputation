package com.javabasic;

import java.awt.*;
public class Line {
    Point p1;
    Point p2;

    double getLength(){
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }
}
