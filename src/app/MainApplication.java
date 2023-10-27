// Authors: Group3, Isaac, Jayden, David

// Package declaration
package app;

// Imports necessary classes from different packages
import models.*;
import utils.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The main class to run the application which sorts shapes read from a file based on provided criteria.
 */
public class MainApplication {

    /**
     * The main entry point for the application.
     * It parses command line arguments, reads shapes from a file, sorts them and then displays the results.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Parse the provided command line arguments
        CommandLineArgs parsedArgs = parseArguments(args);
        if (parsedArgs == null) {
            displayError();
            return;
        }

        // Read shapes from the provided file
        Shape[] shapes = readShapesFromFile(parsedArgs.fileName);
        if (shapes == null) {
            System.out.println("Error reading shapes from file.");
            return;
        }

        // Capture the start time before sorting
        long startTime = System.currentTimeMillis();
        // Perform the desired sort on the shapes
        performSort(parsedArgs.sortType, shapes);
        // Capture the end time after sorting
        long endTime = System.currentTimeMillis();

        // Display the results including time taken and the first and last shapes
        displayResults(shapes, startTime, endTime);
    }

    /**
     * Parses the command line arguments to extract filename and sort type.
     * 
     * @param args command line arguments
     * @return CommandLineArgs object containing parsed values
     */
    private static CommandLineArgs parseArguments(String[] args) {
        if (args.length < 6) {
            return null;
        }

        CommandLineArgs parsedArgs = new CommandLineArgs();
        
        // Loop through and parse command line arguments
        for (int i = 0; i < args.length; i += 2) {
            String key = args[i].toLowerCase();
            String value = args[i + 1].toLowerCase();

            switch (key) {
                case "-f":
                    parsedArgs.fileName = value;
                    break;
                case "-s":
                    parsedArgs.sortType = value;
                    break;
                default:
                    return null;
            }
        }

        return parsedArgs;
    }

    /**
     * Reads the shapes from the provided file and returns an array of Shape objects.
     * 
     * @param fileName the name of the file to read from
     * @return array of Shape objects
     */
    private static Shape[] readShapesFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String header = reader.readLine();
            // Check if file is empty
            if (header == null) {
                System.out.println("The file appears to be empty.");
                return null;
            }

            // Get the count of shapes from the file
            String shapeCountStr = reader.readLine();
            if (shapeCountStr == null) {
                System.out.println("Expected a line indicating the number of shapes.");
                return null;
            }

            int numberOfShapes = Integer.parseInt(shapeCountStr.trim());
            Shape[] shapes = new Shape[numberOfShapes];
            
            // Read each shape data and instantiate corresponding Shape object
            for (int i = 0; i < numberOfShapes; i++) {
                String line = reader.readLine();
                if (line == null) {
                    System.out.println("Expected more shapes in the file.");
                    return null;
                }

                String[] parts = line.split(" ");
                if (parts.length < 3) {
                    System.out.println("Incomplete data for shape on line " + (i + 2));
                    continue;
                }
                
                // Parse shape data from file
                String shapeType = parts[0];
                double height = Double.parseDouble(parts[1]);
                double dimension = Double.parseDouble(parts[2]);

                // Instantiate appropriate Shape object based on shapeType
                switch (shapeType) {
                    case "Cylinder":
                        shapes[i] = new Cylinder(height, dimension);
                        break;
                    case "Cone":
                        shapes[i] = new Cone(height, dimension);
                        break;
                    case "Pyramid":
                        shapes[i] = new Pyramid(height, dimension);
                        break;
                    case "SquarePrism":
                        shapes[i] = new SquarePrism(height, dimension);
                        break;
                    case "TriangularPrism":
                        shapes[i] = new TriangularPrism(height, dimension);
                        break;
                    case "PentagonalPrism":
                        shapes[i] = new PentagonalPrism(height, dimension);
                        break;
                    case "OctagonalPrism":
                        shapes[i] = new OctagonalPrism(height, dimension);
                        break;
                    default:
                        System.out.println("Unknown shape type: " + shapeType);
                        break;
                }
            }
            return shapes;
        } catch (NumberFormatException e) {
            System.out.println("Error parsing shape data.");
            return null;
        }
    }

    /**
     * Performs the desired sort on the provided array of shapes.
     * 
     * @param sortType the type of sort to be performed
     * @param shapes array of shapes to be sorted
     */
    private static void performSort(String sortType, Shape[] shapes) {
        // Use the appropriate sort method based on sortType
        switch (sortType) {
            case "b":
                SortingUtility.bubbleSort(shapes);
                break;
            case "s":
                SortingUtility.selectionSort(shapes);
                break;
            case "i":
                SortingUtility.insertionSort(shapes);
                break;
            case "m":
                SortingUtility.mergeSort(shapes, 0, shapes.length - 1);
                break;
            case "q":
                SortingUtility.quickSort(shapes, 0, shapes.length - 1);
                break;
            case "z":
                SortingUtility.heapSort(shapes);
                break;
            default:
                displayError();
                return;
        }
    }

    /**
     * Displays the results including time taken for sorting and the first and last shapes.
     * 
     * @param shapes array of sorted shapes
     * @param startTime time when sorting started
     * @param endTime time when sorting finished
     */
    private static void displayResults(Shape[] shapes, long startTime, long endTime) {
        System.out.println("Time taken for sorting: " + (endTime - startTime) + " milliseconds");
        System.out.println("First shape: " + shapes[0]);
        System.out.println("Last shape: " + shapes[shapes.length - 1]);
    }

    /**
     * Displays an error message indicating invalid arguments were provided.
     */
    private static void displayError() {
        System.out.println("Invalid arguments provided.");
    }

    /**
     * Inner class to store parsed command line arguments.
     */
    private static class CommandLineArgs {
        String fileName;
        String sortType;
    }
}
