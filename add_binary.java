public class add_binary {
    static String add(String x, String y) {
        int n1 = Integer.parseInt(x, 2);

        int n2 = Integer.parseInt(y, 2);

        int sum = n1 + n2;

        String result = Integer.toBinaryString(sum);

        return result;

    }

    public static void main(String [] args) {
        String x = "011011" , y = "1010111";

        System.out.print(add(x,y));
    }
}
