import java.util.Scanner;

public class IfElseStatements {
    public static String slope(int x1, int y1, int x2, int y2){
        String answer = "fail";
        if (x1 == x2){
            answer = ("The line defined by the points ("+x1+","+y1+") and ("+x2+","+y2+") is a vertical line and the slope is undefined.");
        }
        else {
            double slope_answer = ((((double) y2)-((double)y1))/(((double)x2)-((double)x1)));

            answer = ("The line defined by the points ("+x1+","+y1+") and ("+x2+","+y2+") has a slope of " +slope_answer);
        }
        return answer;
    }
    public static String ShareDigits(int v1, int v2){
        String answer = " ";
        int one = v1/10;
        int two = v1%10;
        int three = v2/10;
        int four = v2%10;

        if (one == three){
            answer = "true";
        }
        else if (one == four){
            answer = "true";
        }
        else if (two == three){
            answer = "true";
        }
        else if (two == four){
            answer = "true";
        }
        else {
            answer = "false";
        }


        return answer;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value 1: ");
        int value_one = scanner.nextInt();
        System.out.print("Enter value 2: ");
        int value_two = scanner.nextInt();

        System.out.println(ShareDigits(value_one, value_two));


        System.out.print("Enter X 1: ");
        int x_one = scanner.nextInt();
        System.out.print("Enter Y 1: ");
        int y_one = scanner.nextInt();
        System.out.print("Enter X 2: ");
        int x_two = scanner.nextInt();
        System.out.print("Enter y 2: ");
        int y_two = scanner.nextInt();

        System.out.println(slope(x_one, y_one, x_two, y_two));

    }
}
