package bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redC = new Circle(new RedCricle(), 10, 10, 100);
		Shape greenC = new Circle(new GreenCricle(), 10, 10, 1000);
		redC.draw();
		greenC.draw();
	}

}
