
// You have to create a package named com.shape
//this package should have individual classes for Rectangle,Square,
// Circle,Cylinder,Sphere and these classes should use
// inheritance to properly manage the code
//include methods like volume surface area and getters
// and setters for dimension

package com.shape;
  public class Shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return this.dim1;
    }
    public int getDim2() {
        return this.dim2;
    }
    public void setDim1(int dim1) {
        this.dim1=dim1;
    }
    public void setDim2(int dim2) {
        this.dim2=dim2;
    }
}