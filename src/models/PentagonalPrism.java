package models;

/**
 * Represents a geometric pentagonal prism shape.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public class PentagonalPrism extends Prism {

    /**
     * A constant value representing an angle in radian for pentagon calculations.
     */
    private static final double ANGLE_RADIAN = Math.PI / 5;
    
    /**
     * Constructs a pentagonal prism with the given height and side length.
     * 
     * @param height The height of the pentagonal prism.
     * @param sideLength The length of one side of the pentagonal base.
     */
    public PentagonalPrism(double height, double sideLength) {
        super(height, sideLength);
    }
    
    /**
     * Computes the base area of the pentagonal prism.
     * 
     * @return The area of the pentagonal base.
     */
    public double getBaseArea() {
        return (5 * (getSideLength() * getSideLength()) * Math.tan(PentagonalPrism.ANGLE_RADIAN)) / 4;
    }
    
    /**
     * Computes the volume of the pentagonal prism.
     * 
     * @return The volume of the pentagonal prism.
     */
    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
