import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int in[] = new int[2];
        int arr[] = new int[] {100, 10, 1};
        int arrLength = arr.length;

        for(int i = 0 ; i< 2 ; ++i) {
            in[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < in.length ; ++i) {

            int reverse = 0;

            for(int j = 0 ; j < arrLength; ++j) {
                int temp = in[i] / arr[j];
                in[i] %= arr[j];
                reverse += temp * arr[arrLength - 1 - j];
            }

            if(reverse >= max) {
                max = reverse;
            }
        }

        System.out.println(max);
    }
}
