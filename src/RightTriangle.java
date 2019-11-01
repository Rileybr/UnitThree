import java.util.Scanner;

public class RightTriangle {
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && c + b > a;
    }
    public static boolean isRight(int a, int b, int c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle:");
        int side_a = scanner.nextInt();
        int side_b = scanner.nextInt();
        int side_c = scanner.nextInt();

        if (isRight(side_a, side_b, side_c) && isTriangle(side_a, side_b, side_c)){
            System.out.println("The side lengths of " + side_a + ", " + side_b + ", and " + side_c + " form a right triangle");
        }
        else if (!(isRight(side_a, side_b, side_c)) && isTriangle(side_a, side_b, side_c)){
            System.out.println("The side lengths of " + side_a + ", " + side_b + ", and " + side_c + " form a triangle, but it is not a right triangle");
        }
        else if (!(isRight(side_a, side_b, side_c)) && !(isTriangle(side_a, side_b, side_c))){
            System.out.println("The side lengths of " + side_a + ", " + side_b + ", and " + side_c + " do not form a triangle");
        }
    }
}
