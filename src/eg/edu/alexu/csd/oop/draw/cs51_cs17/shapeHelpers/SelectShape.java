package eg.edu.alexu.csd.oop.draw.cs51_cs17.shapeHelpers;

<<<<<<< HEAD
import java.util.Map;

=======
>>>>>>> bbc26d69fb73b83499d7752f70178d7b22f4ce39
import eg.edu.alexu.csd.oop.draw.Shape;

public class SelectShape {

	public Shape selectShape(float x, float y, Shape[] shapes) {
		Shape shape = null;
		for (int i = shapes.length - 1; i >= 0; i--) {
			switch (shapes[i].getClass().getSimpleName()) {
			case "Circle":
<<<<<<< HEAD
				shape = selectCircle(shapes[i], x, y);
				break;
			case "Ellipse":
				shape = selectEllipse(shapes[i], x, y);
				break;
			case "Line":
				shape = selectLine(shapes[i], x, y);
				break;
			case "Triangle":
				shape = selectTriangle(shapes[i], x, y);
				break;
			case "Square":
				shape = selectSquare(shapes[i], x, y);
				break;
			case "Rectangle":
				shape = selectRectangle(shapes[i], x, y);
=======
				shape = selectCircle();
				break;
			case "Ellipse":
				shape = selectEllipse();
				break;
			case "Line":
				shape = selectLine();
				break;
			case "Triangle":
				shape = selectTriangle();
				break;
			case "Square":
				shape = selectSquare();
				break;
			case "Rectangle":
				shape = selectRectangle();
>>>>>>> bbc26d69fb73b83499d7752f70178d7b22f4ce39
				break;
			}
			if (shape != null) {
				break;
			}
		}
		return shape;
	}

<<<<<<< HEAD
	private Shape selectCircle(Shape s, float x, float y) {
		double topX=s.getProperties().get("centerX");
		double topY=s.getProperties().get("centerY");
		double radius=s.getProperties().get("width");
		double centerX=(topX+radius)/2;
		double centerY=(topY+radius)/2;
		double reqx=Math.abs(x-centerX);
		double reqy=Math.abs(y-centerY);
		double lenx=Math.abs(topX-centerX);
		double leny=Math.abs(topY-centerY);
		if(Math.sqrt(reqx*reqx+reqy*reqy)<=Math.sqrt(lenx*lenx+leny*leny)) {
			return s;
		}
		return null;
	}

	private Shape selectEllipse(Shape s, float x, float y) {
		double topX=s.getProperties().get("centerX");
		double topY=s.getProperties().get("centerY");
		double radiusA=s.getProperties().get("width");
		double radiusB=s.getProperties().get("height");
		
		return null;
	}

	private Shape selectLine(Shape s, float x, float y) {
		return null;
	}

	private Shape selectTriangle(Shape s, float x, float y) {
		return null;
	}

	private Shape selectSquare(Shape s, float x, float y) {

		return null;
	}

	private Shape selectRectangle(Shape s, float x, float y) {
=======
	private Shape selectCircle() {
		return null;
	}

	private Shape selectEllipse() {
		return null;
	}

	private Shape selectLine() {
		return null;
	}

	private Shape selectTriangle() {
		return null;
	}

	private Shape selectSquare() {
		return null;
	}

	private Shape selectRectangle() {
>>>>>>> bbc26d69fb73b83499d7752f70178d7b22f4ce39
		return null;
	}

}
