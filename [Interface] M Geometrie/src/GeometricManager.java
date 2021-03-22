
public class GeometricManager {
	
	Geometric [] shapes;
	
	public GeometricManager (Geometric [] shapes) {
		this.shapes = shapes;
	}
	
	//Beginn des zu bearbeitenden Bereiches
	
	// Aufgabe 3
	public double totalArea () {
		double totalArea = 0.0;
		for (Geometric shape : shapes) {
			totalArea += shape.area();
		}
		return totalArea;
	}
	
	// Aufgabe 4
	public int countCircles () {
		int count = 0;
		for (Geometric shape : shapes) {
			if (shape instanceof Circle) {
				count++;
			}
		}
		return count;
	}
	
	// Aufgabe 5
	public void increase () {
		for (Geometric shape : shapes) {
			if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				circle.setRadius(circle.getRadius() + 1);
			} else {
				Rectangle rectangle = (Rectangle) shape;
				rectangle.setHeight(rectangle.getHeight() + 1);
				rectangle.setWidth(rectangle.getWidth() + 1);
			}
		}
	}

}
