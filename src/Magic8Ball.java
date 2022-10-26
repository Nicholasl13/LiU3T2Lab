import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";  // update this variable with the response

        // Write code here to generate a random number from 1 to 6
        int rand = (int) (Math.random() * 6) + 1;

        // Write code here to use
        // appropriate selection statements (if, if else, else)
        // to choose from 1 of 6 responses and set response to it.
        // for example, if the number is 1, set response to "Outlook good"
        // if it’s 2, set response to "Without a doubt!"
        // etc.

        if (rand == 1) {
            response = "Yes! You are right.";
        }
        if (rand == 2) {
            response = "Yes, without a doubt!";
        }
        if (rand == 3) {
            response = "Maybe, I am unsure.";
        }
        if (rand == 4) {
            response = "Try again...";
        }
        if (rand == 5) {
            response = "No, you are wrong.";
        }
        if (rand == 6){
            response = "Not quite, I say no.";
        }

        System.out.println(response);  // print response
    }
}
