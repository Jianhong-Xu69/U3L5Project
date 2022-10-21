import java.util.Scanner;
public class LotteryRunner {
    public static void main(String[] args) {
        Lottery test = new Lottery();
        Scanner user = new Scanner(System.in);
        System.out.println("Please input your guess and get gambling addiction:");
        int userInput = user.nextInt();
        test.determineWinnings(userInput);
        System.out.println(test);
    }
}