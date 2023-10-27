package models;

/**
 * Represents a geometric octagonal prism shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class OctagonalPrism extends Prism {

    /**
     * Constructs an octagonal prism with the given height and side length.
     * 
     * @param height The height of the octagonal prism.
     * @param sideLength The length of one side of the octagonal base.
     */
    public OctagonalPrism(double height, double sideLength) {
        super(height, sideLength);
    }
    
    /**
     * Computes the base area of the octagonal prism.
     * 
     * @return The area of the octagonal base.
     */
    public double getBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * (getSideLength() * getSideLength());
    }
    
    /**
     * Computes the volume of the octagonal prism.
     * 
     * @return The volume of the octagonal prism.
     */
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
