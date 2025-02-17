//mport java.io;

public class Swapno {
    public static void main(String[] args) {
        int x = 101, y = 169;
        System.out.println("Before swapping no");
        System.out.println("x = " + x);
        System.out.println("Y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping no");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
