
package models;

/**
 * Represents an abstract geometric prism shape.
 * This class provides a foundation for various prism shapes.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public abstract class Prism extends Shape {

    /**
     * The length of one side of the prism's base.
     */
    private double sideLength;
    
    /**
     * Constructs a prism with the given height and side length.
     * 
     * @param height The height of the prism.
     * @param sideLength The length of one side of the prism's base.
     */
    public Prism(double height, double sideLength) {
        super(height);
        this.sideLength = sideLength;
    }
    
    /**
     * Computes the volume of the prism.
     * 
     * @return The volume of the prism.
     */
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }

    /**
     * Returns the side length of the prism.
     * 
     * @return The side length.
     */
    public double getSideLength() {
        return this.sideLength;
    }

    /**
     * Sets the side length of the prism.
     * 
     * @param sideLength The new side length.
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
