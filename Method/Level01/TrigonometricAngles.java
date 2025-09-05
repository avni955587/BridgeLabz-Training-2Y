package Method;

import java.util.*;
public class TrigonometricAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of angle in degree");
        double degree = sc.nextDouble();
        double radian = Math.toRadians(degree);

        System.out.println("The value of angle in radian is " + radian);

        TrigonometricAngles angle = new TrigonometricAngles();
        double ans [] = angle.calculateTrigonometricFunctions(radian);
        System.out.println("Sine: " + ans[0]);
        System.out.println("Cosine: " + ans[1]);
        System.out.println("Tangent: " + ans[2]);
    }

    public double[] calculateTrigonometricFunctions(double angle){
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        double tan  = Math.tan(angle);
        return new double[] {sin ,cos, tan};
    }

}