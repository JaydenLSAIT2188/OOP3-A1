package models;

/**
 * Represents an abstract geometric shape.
 * This class provides a foundation for various shapes and 
 * includes methods for computing the base area and volume.
 * 
 * @author Group 3: Isaac, David, Jayden
 */
public abstract class Shape implements Comparable<Shape> {

    /**
     * The height of the shape.
     */
    private double height;
    
    /**
     * Constructs a shape with the given height.
     * 
     * @param height The height of the shape.
     */
    public Shape(double height) {
        this.height = height;
    }

    /**
     * Computes the base area of the shape.
     * 
     * @return The area of the shape's base.
     */
    public abstract double getBaseArea();
    
    /**
     * Computes the volume of the shape.
     * 
     * @return The volume of the shape.
     */
    public abstract double getVolume();
    
    /**
     * Returns the height of the shape.
     * 
     * @return The height.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Sets the height of the shape.
     * 
     * @param height The new height.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Compares this shape with another based on height.
     * 
     * @param compared The shape to be compared.
     * @return -1 if this shape is shorter, 1 if taller, and 0 if the same height.
     */
    @Override
    public int compareTo(Shape compared) {
        if (this.height < compared.height) {
            return -1;
        }
        
        if (this.height > compared.height) {
            return 1;
        }
        
        return 0;
    }
}
