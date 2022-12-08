package factory;

public class FactoryShape {
	public Shape getShape(String type) {
		if(type==null) {
			return null;
		}
		if(type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if(type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		if(type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
