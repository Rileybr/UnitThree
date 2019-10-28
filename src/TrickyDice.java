public class TrickyDice {
    public static int regularRoll(){
        return (int) (Math.random() * 6) + 1;
    }
    public static int trickyRoll(){
        int temp = (int) (Math.random() * 20) + 1;
        int roll = 0;
        if (temp < 3){
            roll = 1;
        }
        else if (temp < 6){
            roll = 2;
        }
        else if (temp < 9){
            roll = 3;
        }
        else if (temp < 12){
            roll = 4;
        }
        else if (temp < 18){
            roll = 5;
        }
        else {
            roll = 6;
        }
        return roll;
    }
    public static void main(String[] args){
        System.out.println(regularRoll());
        System.out.println(trickyRoll());
    }
}
