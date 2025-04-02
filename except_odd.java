import java.util.Scanner;

public class except_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        try {
            checkIfOdd(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    public static void checkIfOdd(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }
}
