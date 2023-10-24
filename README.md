ShapeSorting Application README
Overview
ShapeSorting is an application developed to read geometric shapes from a file, sort them based on a user-provided criterion, and display the results. The application provides a variety of sorting options tailored to different geometric shapes, ensuring flexibility and scalability.

Authors
Group3
Isaac
Jayden
David
Features
File Input: The application accepts a file containing shape data for processing. Each file is expected to specify the type of shape and its dimensions.
Multiple Shape Support: Supports various shapes including Cylinder, Cone, Pyramid, SquarePrism, TriangularPrism, PentagonalPrism, and OctagonalPrism.
Command Line Arguments: The application uses command-line arguments to get the file name and sorting criteria.
Performance Metrics: After sorting, the application displays the time taken for the sorting process, alongside the first and last shapes in the sorted array.
Error Handling: Appropriate error messages are displayed in cases such as missing file, incorrect command-line arguments, or misformatted shape data in the file.
Usage
Prerequisites
Ensure Java is properly installed on your machine.

Running the Application
Navigate to the directory containing MainApplication.java.
Compile the Java files using the command: javac *.java
Run the application using: java MainApplication [options]
Command Line Options:

-f [filename]: Specifies the file containing shape data.
-s [sortType]: Defines the type of sort to be performed.
For example:

Copy code
java MainApplication -f shapes.txt -s volume
This will sort the shapes in shapes.txt based on their volume.

File Format
The file should start with the type of shape, followed by its dimensions. An example of the file format is:

mathematica
Copy code
Cylinder 10 5
Cone 7 4
...
Feedback & Contributions
If you encounter any bugs or have suggestions for improvements, please feel free to raise an issue or submit a pull request. Your contributions and feedback are valued.

License
This project is open-source and free for all users. Please ensure to provide appropriate attribution if you reuse or
