package bridge;

public class Circle extends Shape{
	private int x,y,radius; 
	protected Circle(DrawAPI drawAPI,int x,int y,int ra) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		radius = ra;
	}
	
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
