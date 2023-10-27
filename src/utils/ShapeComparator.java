// Authors: Group3, Isaac, Jayden, David

// Import necessary classes from different packages
package utils;

import models.Shape;
import java.util.Comparator;

/**
 * This class provides functionality to compare two Shape objects based on different criteria.
 * It implements the Comparator interface to provide custom comparison rules.
 */
public class ShapeComparator implements Comparator<Shape> {

    // Enum to define the possible types of comparisons: HEIGHT, VOLUME, and BASE_AREA
    public enum CompareType {
        HEIGHT, VOLUME, BASE_AREA
    }

    // Instance variable to store the selected type of comparison
    private CompareType compareType;

    /**
     * Constructor for ShapeComparator.
     * Initializes the comparator with a specific type of comparison.
     * 
     * @param compareType the type of comparison (height, volume, or base area)
     */
    public ShapeComparator(CompareType compareType) {
        this.compareType = compareType;
    }

    /**
     * Overrides the compare method from the Comparator interface.
     * Provides custom rules to compare two Shape objects based on the selected type of comparison.
     *
     * @param shape1 The first shape to compare
     * @param shape2 The second shape to compare
     * @return a negative integer, zero, or a positive integer if the first shape is less than, equal to, or greater than the second shape, respectively.
     */
    @Override
    public int compare(Shape shape1, Shape shape2) {
        // Switch statement to handle different types of comparisons
        switch (compareType) {
            case HEIGHT:
                // Compare the height of the two shapes
                return Double.compare(shape1.getHeight(), shape2.getHeight());
            case VOLUME:
                // Compare the volume of the two shapes
                return Double.compare(shape1.getVolume(), shape2.getVolume());
            case BASE_AREA:
                // Compare the base area of the two shapes
                return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
            default:
                // If an unknown comparison type is encountered, throw an exception
                throw new IllegalArgumentException("Invalid Compare Type");
        }
    }
}
