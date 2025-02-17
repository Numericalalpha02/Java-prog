import java.util.Scanner;

public class userinput {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter want you want: ");

        String username = obj.nextLine();
        System.out.println("User have entered: " + username);
    }
}
