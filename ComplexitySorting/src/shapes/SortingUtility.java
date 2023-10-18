package shapes;

public class SortingUtility 
{
    public static void customSort(List<GeometricShape> shapes) 
    {
        Comparator<GeometricShape> shapeComparator = new ShapeComparator();
        shapes.sort(shapeComparator);
    }

   
}
