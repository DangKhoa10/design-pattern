package abstractfactory;

public class Demo {
	public static void main(String[] args) {
		AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
		
		Shape squre = shape.getShape("SQUARE");
		squre.draw();
		
		
		AbstractFactory color = FactoryProducer.getFactory("COLOR");
		Color blue = color.getColor("BLUE");
		blue.fill();
	}
}
