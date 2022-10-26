import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator num = new Calculator();
        System.out.print("Enter your expression with *, /, +, -, ^, or %.");
        System.out.println(num.Calculate(scan.nextLine()));
    }
}
