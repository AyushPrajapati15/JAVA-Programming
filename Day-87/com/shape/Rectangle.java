package com.shape;

public class Rectangle extends Shape {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public int area() {
        return this.dim1 * this.dim2;
    }
    public static void main(String[] args) {
        
    }
    
}
