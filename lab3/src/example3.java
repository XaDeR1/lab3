import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в последовательности");
        long num = scan.nextInt(), a = 1, b = 0;
        //version 1
        /*
        while (num != 0){
            System.out.println(a);
            a+=b;
            b=a-b;
            num--;
        }
        */
        //version 2
        for (long i = num; i != 0; i--) {
            System.out.println(a);
            a += b;
            b = a - b;
            num--;
        }

    }
}
