package class_object;


import java.util.*;
public class AreaofCircle {
	int radius;
	public AreaofCircle(int radius) {
		this.radius = radius;
		
	}
	public void display() {
		System.out.println("Area of the circle : "+ (double)(3.14*radius*radius));
		System.out.println("Circumference of the circle : "+ (double)(2*3.14*radius));

		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius = input.nextInt();
		input.close();
		AreaofCircle obj = new AreaofCircle(radius);
		obj.display();
		
		
	}

}