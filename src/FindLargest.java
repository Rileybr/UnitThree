import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num_one = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num_two = scanner.nextInt();

        if(num_one < num_two){
            System.out.println(num_two + " is larger than " + num_one);
        }

        if(num_one > num_two){
            System.out.println(num_one + " is larger than " + num_two);
        }

        if(num_one == num_two){
            System.out.println(num_one + " and " + num_two + " are equal");
        }
    }
}
