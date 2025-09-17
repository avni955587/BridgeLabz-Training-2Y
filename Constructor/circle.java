package Constructor;



public class circle {
     double radius;

 
    public circle() {
    	
        radius =1.0; 
    }

    public circle(double radius) {
        this.radius = radius;
    }

 
    public void print() {
        System.out.println("Radius of the circle : " + radius);
    }

 
    public static void main(String[] args) {
    	System.out.println("Defult Constructor-");
        circle default_Circle = new circle();
        default_Circle.print(); 
    	System.out.println();
    	System.out.println("Parameterize Constructor-");

        circle para_Circle = new circle(5.5);
        para_Circle.print();  
    }
}