package shapes;

public abstract class GeometricShape implements Comparable<GeometricShape> 
{

    @Override
    public int compareTo(GeometricShape otherShape) 
    {
        // Implement comparison by height
        double thisHeight = this.getHeight();
        double otherHeight = otherShape.getHeight();
        return Double.compare(thisHeight, otherHeight);
    }

    
}

