package shape;

public abstract class Shape implements Comparable<Shape> {
	private double height;
	
	public Shape(double height) {
		this.height = height;
	}

	protected abstract double getBaseArea();
	protected abstract double getVolume();

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
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
