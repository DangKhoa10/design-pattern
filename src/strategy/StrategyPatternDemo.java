package strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context add = new Context(new OperationAdd());
		System.out.println(add.executeStrategy(5, 10));
	}

}
