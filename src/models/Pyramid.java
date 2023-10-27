package models;

/**
 * Represents a geometric square-based pyramid shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class Pyramid extends Shape {

    /**
     * The length of one side of the pyramid's base.
     */
    private double sideLength;
    
    /**
     * Constructs a pyramid with the given height and side length.
     * 
     * @param height The height of the pyramid.
     * @param sideLength The length of one side of the pyramid's base.
     */
    public Pyramid(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }
    
    /**
     * Computes the base area of the pyramid.
     * 
     * @return The area of the pyramid's base.
     */
    public double getBaseArea() {
        return this.sideLength * this.sideLength;
    }
    
    /**
     * Computes the volume of the pyramid.
     * 
     * @return The volume of the pyramid.
     */
    public double getVolume() {
        return ((this.sideLength * this.sideLength) * getHeight()) / 3;
    }
    
    /**
     * Returns the side length of the pyramid.
     * 
     * @return The side length.
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Sets the side length of the pyramid.
     * 
     * @param sideLength The new side length.
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
