import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 0, a = 0;
        System.out.println("Введите кол-во чисел в сумме:");
        //version 1
        while (num != 0) {
            for (i = i; !(i % 5 == 2 && i % 3 == 1); i++) {
            }
            System.out.println(a + "+" + i + "=" + (a = a + i));
            i++;
            num--;
        }
        //version 2
        /*
        while(num!=0){
            if(i % 5 == 2 && i % 3 == 1){
                System.out.println(a+"+"+i+"="+(a=a+i));
                i++;
                num--;
            }else{
                i++;
            }

        }*/
    }
}
