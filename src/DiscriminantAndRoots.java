import java.util.Scanner;

public class DiscriminantAndRoots {
    public static String roots(int a, int b, int c){
        double discriminate = (Math.pow(b, 2) - (4 * a * c));
        String power = "";
        if (discriminate > 0){
            power = "2 real roots.";
        }
        else if (discriminate < 0){
            power = "2 imaginary roots.";
        }
        else{
            power = "1 real root";
        }
        return (a + "x^2 + " + b + "x + " + c + " has " + power);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        System.out.println(roots(a, b, c));
    }
}
