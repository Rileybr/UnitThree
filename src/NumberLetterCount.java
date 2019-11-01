import java.util.Scanner;

public class NumberLetterCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        System.out.println(tens);
        String hundreds_word = "";
        String tens_word = "";
        String ones_word = "";

        if (hundreds == 1){
            hundreds_word = "One hundred and ";
        }
        else if (hundreds == 2){
            hundreds_word = "Two hundred and ";
        }
        else if (hundreds == 3){
            hundreds_word = "Three hundred and ";
        }
        else if (hundreds == 4){
            hundreds_word = "Four hundred and ";
        }
        else if (hundreds == 5){
            hundreds_word = "Five hundred and ";
        }
        else if (hundreds == 6){
            hundreds_word = "Six hundred and ";
        }
        else if (hundreds == 7){
            hundreds_word = "Seven hundred and ";
        }
        else if (hundreds == 8){
            hundreds_word = "Eight hundred and ";
        }
        else if (hundreds == 9){
            hundreds_word = "Nine hundred and ";
        }


        if (tens == 1){
            if (ones == 1){
                ones_word = "eleven";
            }
            if (ones == 2){
                ones_word = "twelve";
            }
            if (ones == 3){
                ones_word = "thirteen";
            }
            if (ones == 4){
                ones_word = "fourteen";
            }
            if (ones == 5){
                ones_word = "fifteen";
            }
            if (ones == 6){
                ones_word = "sixteen";
            }
            if (ones == 7){
                ones_word = "seventeen";
            }
            if (ones == 8){
                ones_word = "eighteen";
            }
            if (ones == 9){
                ones_word = "nineteen";
            }
        }
        else if (tens == 2){
            tens_word = "twenty";
        }
        else if (tens == 3){
            tens_word = "thirty";
        }
        else if (tens == 4){
            tens_word = "forty";
        }
        else if (tens == 5){
            tens_word = "fifty";
        }
        else if (tens == 6){
            tens_word = "sixty";
        }
        else if (tens == 7){
            tens_word = "seventy";
        }
        else if (tens == 8){
            tens_word = "eighty";
        }
        else if (tens == 9){
            tens_word = "ninety";
        }


        if (ones == 2){
            ones_word = "-two";
        }
        else if (ones == 3){
            ones_word = "-three";
        }
        else if (ones == 4){
            ones_word = "-four";
        }
        else if (ones == 5){
            ones_word = "-five";
        }
        else if (ones == 6){
            ones_word = "-six";
        }
        else if (ones == 7){
            ones_word = "-seven";
        }
        else if (ones == 8){
            ones_word = "-eight";
        }
        else if (ones == 9){
            ones_word = "-nine";
        }

        System.out.println(hundreds_word + tens_word + ones_word);
    }

}
