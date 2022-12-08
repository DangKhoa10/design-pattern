package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shap) {
		if (shap == null) {
			return null;
		}
		if (shap.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shap.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shap.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
