/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kethua;

 
    public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
    public class Cylinder extends Circle {
    private double heigth;
    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }
    public double getHeigth() {
        return heigth;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getVolumer() {
        return super.getArea() * this.heigth;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle cylinder = new Cylinder(2.4, "red", 10);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + ((Cylinder) cylinder).getVolumer());
    }
}
    

