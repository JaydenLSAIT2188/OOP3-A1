package models;

/**
 * Represents a geometric cylinder shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class Cylinder extends Shape {

    /**
     * The radius of the cylinder's base.
     */
    private double radius;
    
    /**
     * Constructs a cylinder with the given height and radius.
     * 
     * @param height The height of the cylinder.
     * @param radius The radius of the cylinder's base.
     */
    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }
    
    /**
     * Computes the base area of the cylinder.
     * 
     * @return The area of the cylinder's base.
     */
    public double getBaseArea() {
        return Math.PI * (this.radius * this.radius);
    }
    
    /**
     * Computes the volume of the cylinder.
     * 
     * @return The volume of the cylinder.
     */
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
