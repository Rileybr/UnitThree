import java.util.Scanner;

public class CookieOrders {
    public static String totalCost(int numBoxes){
        double cost_total;

        if (numBoxes >= 1 && numBoxes <= 4){
            cost_total = numBoxes * 6.95;
            return "You bought " + numBoxes + " boxes of cookies at $6.95 per box. Your total bill is $" + cost_total;
        }
        else if (numBoxes >=5 && numBoxes <= 9){
            cost_total = numBoxes * 5.95;
            return "You bought " + numBoxes + " boxes of cookies at $5.95 per box. Your total bill is $" + cost_total;
        }
        else if (numBoxes >=10 && numBoxes <= 15){
            cost_total = numBoxes * 5.50;
            return "You bought " + numBoxes + " boxes of cookies at $5.50 per box. Your total bill is $" + cost_total;
        }
        else if (numBoxes >=16){
            cost_total = numBoxes * 4.95;
            return "You bought " + numBoxes + " boxes of cookies at $4.95 per box. Your total bill is $" + cost_total;
        }
        else {
            return "Your input is invalid";
        }
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-4 boxes:\t\t\t\t\t\t6.95 per box");
        System.out.println("5-9 boxes:\t\t\t\t\t\t5.95 per box");
        System.out.println("10-15 boxes:\t\t\t\t\t5.50 per box");
        System.out.println("16 or more boxes:\t\t\t\t4.95 per box");
        System.out.println("Enter the number of boxes you wish to purchase:");
        int numBoxes = scanner.nextInt();
        System.out.println(totalCost(numBoxes));
    }
}
