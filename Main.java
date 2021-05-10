package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle cir = new Circle();
        Rectangle rec = new Rectangle();
    // Circle
        System.out.println("Diện tích của hình tròn là " + cir.dientich());
        System.out.println("Chu vi của hình tròn là " + cir.chuvi());
    //  Rectangle
        System.out.println("Diện tích của hình chữ nhật là " + rec.dientich());
        System.out.println("Chu vi của hình chữ nhật là " + rec.chuvi());
    }
}
