import java.util.Scanner;

public class example4 {
    // 1 version
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        if (number1 > number2) {
            for (int i = number2; i <= number1; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = number1; i <= number2; i++) {
                System.out.println(i);
            }
        }
    }
}
// 2 version
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        if (number1 >= number2) {
            while (number1 >= number2) {
                System.out.println(number2);
                number2++;
            }
        } else {
            while (number2 >= number1) {
                System.out.println(number1);
                number1++;

            }
        }
    }
}*/

