package models;

/**
 * Represents a geometric cone shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class Cone extends Shape {

    /**
     * The radius of the cone's base.
     */
    private double radius;
    
    /**
     * Constructs a cone with the given height and radius.
     * 
     * @param height The height of the cone.
     * @param radius The radius of the cone's base.
     */
    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }
    
    /**
     * Computes the base area of the cone.
     * 
     * @return The area of the cone's base.
     */
    public double getBaseArea() {
        return Math.PI * this.radius * this.radius;
    }
    
    /**
     * Computes the volume of the cone.
     * 
     * @return The volume of the cone.
     */
    @Override
    public double getVolume() {
        return (getBaseArea() * getHeight()) / 3;
    }
}
