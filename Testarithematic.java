import arithmetic.*;
import java.util.Scanner;
public class Testarithematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double x =sc.nextDouble();
        System.out.println("Enter second number: ");
        double y =sc.nextDouble();
        Addition addObj = new Addition(x, y);
        Subtraction subObj = new Subtraction(x, y);
        System.out.println("Addition: " +addObj.add());
        System.out.println("Subtraction" +subObj.Sub());
    }
}
