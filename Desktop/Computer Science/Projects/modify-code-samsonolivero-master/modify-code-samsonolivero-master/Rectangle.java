
public class Rectangle {
	private Point leftUpper;
	private Point leftLower;
	private Point rightUpper;
	private Point rightLower;
	


	public Rectangle(Point leftUpper, Point leftLower, Point rightUpper, Point rightLower) {
		
		this.leftUpper = leftUpper;
		this.leftLower = leftLower;
		this.rightUpper = rightUpper;
		this.rightLower = rightLower;
	}



	public Point getLeftUpper() {
		return leftUpper;
	}



	public void setLeftUpper(Point leftUpper) {
		this.leftUpper = leftUpper;
	}



	public Point getLeftLower() {
		return leftLower;
	}



	public void setLeftLower(Point leftLower) {
		this.leftLower = leftLower;
	}



	public Point getRightUpper() {
		return rightUpper;
	}



	public void setRightUpper(Point rightUpper) {
		this.rightUpper = rightUpper;
	}



	public Point getRightLower() {
		return rightLower;
	}



	public void setRightLower(Point rightLower) {
		this.rightLower = rightLower;
	}



	@Override
	public String toString() {
		return "Rectangle [leftUpper=" + leftUpper + ",\n leftLower=" + leftLower + ",\n rightUpper=" + rightUpper
				+ ",\n rightLower=" + rightLower + "]";
	}



	public static void main(String[] args) {
		Rectangle rec = new Rectangle(new Point(0, 1), new Point(0,0), 
				new Point(2, 1), new Point(2,0));
		System.out.println(rec);
		Point pointRef = rec.getLeftLower();
		pointRef.setX(100);
		pointRef.setY(100);
		
		System.out.println(rec);

	}

}
