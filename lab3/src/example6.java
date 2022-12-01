import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[0];
        int i = 0, b = 0, num = 0;
        try {
            nums = new int[scan.nextInt()];
            num = nums.length;
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение");
        }
        while (num != 0) {
            for (i = i; !(i % 5 == 2); i++) {
            }
            nums[b] = i;
            b++;
            i++;
            num--;
        }
        System.out.println(Arrays.toString(nums));
    }

}

