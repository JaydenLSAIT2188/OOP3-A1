package shapes;

public class ShapeComparator implements Comparator<GeometricShape> 
{
    @Override
    public int compare(GeometricShape shape1, GeometricShape shape2) 
    {
        // Compare shapes by base area and volume
        double area1 = shape1.getBaseArea();
        double area2 = shape2.getBaseArea();
        double volume1 = shape1.getVolume();
        double volume2 = shape2.getVolume();

        // Compare by area and volume
        if (area1 != area2) 
        {
            return Double.compare(area1, area2);
        } else 
        {
            return Double.compare(volume1, volume2);
        }
    }
}

