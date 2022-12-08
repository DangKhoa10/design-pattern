package factory;

public class app {

	public static void main(String[] args) {
		FactoryShape factoryShape = new FactoryShape();
		
		Shape shape1 = factoryShape.getShape("RECTANGLE");
		shape1.draw();

	}

}
