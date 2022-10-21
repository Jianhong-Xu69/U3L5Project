public class Lottery {
    /* instance variables */
    private int lotteryNumber;
    private int userNumber;
    private String lotteryDisplay;
    private String userDisplay;

    /* constructor */
    public Lottery() // no parameters
    {
        lotteryNumber = 07;//(int) (Math.random() * 100) + 1;
        if (lotteryNumber / 10 == 0)
        {
            lotteryDisplay = "0" + lotteryNumber;
        }
        else
        {
            lotteryDisplay = "" + lotteryNumber;
        }
    }
// initialize the lotteryNumber in the constructor to a random number

    /* Returns 100, 10, 3, or 0, based on whether userNumber won anything */
    public int determineWinnings(int userNumber) {
        this.userNumber = userNumber;
        if (userNumber / 10 == 0)
        {
            userDisplay = "0" + userNumber;
        }
        else
        {
            userDisplay = "" + userNumber;
        }
        int lotteryTens = lotteryNumber / 10;//tens place of the lottery
        int lotteryOnes = lotteryNumber % 10;//ones place of the lottery
        int userTens = userNumber / 10;//tens place of the user number
        int userOnes = userNumber % 10;//ones place of the user number
        if (userNumber == lotteryNumber)//if equal entirely
        {
            return 100;
        }
        if (lotteryOnes == lotteryNumber) ;//for numbers without 2 digits
        {
            if (userOnes == 0 && userTens == lotteryNumber)//both correct order wrong
            {
                return 10;
            } else if (userOnes == lotteryTens || userOnes == lotteryOnes || userTens == lotteryTens || userTens == lotteryOnes)//one correct digit
            {
                return 3;
            }
        }
        if (lotteryOnes == userTens && lotteryTens == userOnes)//both correct wrong order
        {
            return 10;
        }
        if (userOnes == lotteryTens || userOnes == lotteryOnes || userTens == lotteryTens || userTens == lotteryOnes)//one correct digit
        {
            return 3;
        } else//none
        {
            return 0;
        }
    }

    public String toString() {
        int results = determineWinnings(userNumber);
        if (results == 100)
        {
            return "The lottery number was: " + lotteryDisplay + "\nYour guess was: " + userDisplay + "\nYou win $100! Congrations!";
        }
        else if (results == 10)
        {
            return "The lottery number was: " + lotteryDisplay +"\nYour guess was: " + userDisplay + "\nYou win $10! Your numbers were right!";
        }
        else if (results == 3)
        {
            return "The lottery number was: " + lotteryDisplay +"\nYour guess was: " + userDisplay + "\nYou win $3! At least you got one right!";
        }
        else
        {
            if ((Math.random() * 20) + 1 == 20)
            {
                return "The lottery number was: " + lotteryDisplay +"\nYour guess was: " + userDisplay + "\nYou suck at this fr";
            }
            else
            {
                return "The lottery number was: " + lotteryDisplay +"\nYour guess was: " + userDisplay + "\nYou win nothing...";
            }
        }
    }
}
// ADD ANY OTHER METHOD(S) YOU THINK MIGHT BE USEFUL