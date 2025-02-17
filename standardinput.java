import java.io.*;
import java.util.Scanner;

public class standardinput {
    public static void main(String[] args) {
        int num;

        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);

        num = s.nextInt();

        System.out.println("Entered integer is: " + num);
        s.close();
    }
    
}
