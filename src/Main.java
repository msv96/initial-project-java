import java.util.Arrays;
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
//        int variable = old_main();
//        System.out.println(variable);

        String[] newArr = new String[2];
        newArr[0] = "3";
        newArr[1] = "5";
        System.out.println(Arrays.toString(newArr));

        int[] newArrOfInt = {1, 32, 23, 3, 55, 900};
        for (int element:newArrOfInt) {
            System.out.println(element);
        }
    }
}