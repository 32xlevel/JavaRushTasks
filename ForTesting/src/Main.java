import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        long result = 3 * (long) Math.pow(2, n-1);
        System.out.println(result);
    }
}
