package models;

/**
 * Represents a geometric square prism shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class SquarePrism extends Prism {

    /**
     * Constructs a square prism with the given height and side length.
     * 
     * @param height The height of the square prism.
     * @param sideLength The length of one side of the square prism's base.
     */
    public SquarePrism(double height, double sideLength) {
        super(height, sideLength);
    }
    
    /**
     * Computes the base area of the square prism.
     * 
     * @return The area of the square prism's base.
     */
    public double getBaseArea() {
        return getSideLength() * getSideLength();
    }
    
    /**
     * Computes the volume of the square prism.
     * 
     * @return The volume of the square prism.
     */
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
