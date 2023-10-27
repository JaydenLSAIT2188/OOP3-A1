-Shape Sorting Application-

Authors:
Group3

Isaac
Jayden
David

Description:
The Shape Sorting application allows users to sort a list of geometric shapes read from a file.
It provides functionalities like parsing command line arguments to extract the filename and the desired sort type, reading shapes from the provided file, performing the desired sort, and then displaying the results, including the time taken for the sort.

How to Run:

Make sure you have the necessary dependencies and libraries installed.
Open the command prompt (cmd)
Then use the following command to run the program:
java -jar sort.jar -fpolyfor1.txt -Tv -Sb


Command Line Arguments:
-f: Specifies the file name from which shapes will be read.
-s: Specifies the type of sort to be performed on the shapes.

Features:
1. Command Line Argument Parsing:
Parses the provided command line arguments to determine the file name from which shapes will be read and the type of sort to be performed.

2. File Reading:
Reads the shapes from the specified file.
The file should have a header indicating the type of shapes, followed by a line indicating the number of shapes.
Each subsequent line should contain the shape data in the format: shapeType height dimension.

3. Shape Sorting:
Sorts the read shapes based on the specified criteria.
Captures the start time before sorting and the end time after sorting to determine the time taken for the sort.

4. Result Display:
Displays the sorted results, including the time taken for the sort and the first and last shapes in the sorted list.
Package Structure:
app: Contains the main application class MainApplication.java that drives the program.
models: Contains different geometric shape models like Cylinder, Cone, Pyramid, etc.
utils: Contains utility classes and helper methods.

Error Handling:
The application has inbuilt error handling to manage issues like:
Invalid or incomplete command line arguments.
File reading errors.
Errors in the shape data format.

Example:

	java -jar sort.jar -ta -sQ -f"C:\CPRG304\polyfor5.txt"
	
Notes:
Ensure the input file adheres to the expected format.
Supported shapes include: Cylinder, Cone, Pyramid, SquarePrism, TriangularPrism, PentagonalPrism, and OctagonalPrism.
For more detailed code information or if any issues arise, please refer to the inline comments in the MainApplication.java file.