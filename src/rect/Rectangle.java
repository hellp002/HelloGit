package rect;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = Math.max(1, width);
		this.height = Math.max(1, height);
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	
	public int getArea() {
		return this.width * this.height;
	}
	
	
}
