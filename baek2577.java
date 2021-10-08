import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String calc = String.valueOf(A * B * C);

        int arr[] = new int[10];    //0~9
        int loop = calc.length();

        for(int i = 0 ; i < loop ; ++i) {
            int index = calc.charAt(i) - 48;

            ++arr[index];
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
