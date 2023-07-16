import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int variable = 8;
        char character = 'q';
        String str = "Hello and welcome!";
        System.out.println("i = " + variable + str + character);

        System.out.println(56 % 5);

        Scanner sc = new Scanner(System.in);

        String scanned = sc.next();

        System.out.println(scanned);

        int scanned1 = sc.nextInt();

        System.out.println(scanned1);
    }
}