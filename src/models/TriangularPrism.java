package models;

/**
 * Represents a geometric equilateral triangular prism shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class TriangularPrism extends Prism {

    /**
     * Constructs a triangular prism with the given height and side length.
     * 
     * @param height The height of the triangular prism.
     * @param sideLength The length of one side of the triangular prism's base.
     */
    public TriangularPrism(double height, double sideLength) {
        super(height, sideLength);
    }
    
    /**
     * Computes the base area of the triangular prism.
     * 
     * @return The area of the triangular prism's base.
     */
    public double getBaseArea() {
        return ((getSideLength() * getSideLength()) * Math.sqrt(3)) / 4;
    }
    
    /**
     * Computes the volume of the triangular prism.
     * 
     * @return The volume of the triangular prism.
     */
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
