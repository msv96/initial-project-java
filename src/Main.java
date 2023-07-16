import java.util.Scanner;

public class Main {
    public static int old_main() {
        int variable = 8;
        char character = 'q';
        String str = "Hello and welcome!";
        System.out.println("i = " + variable + str + character);

        System.out.println(56 % 5);

        Scanner sc = new Scanner(System.in);

        String scanned = sc.next();

        System.out.println(scanned);

        return sc.nextInt();
    }

    public static void main(String[] args) {
        int variable = old_main();
        System.out.println(variable);
    }
}