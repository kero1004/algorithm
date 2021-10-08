import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int arr[] = new int[cnt];

        for(int i = 0 ; i < cnt ; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.printf("%d %d", arr[0], arr[cnt-1]);

    }
}
