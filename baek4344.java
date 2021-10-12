import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tc = Integer.valueOf(sc.nextLine());
        int arr[];

        for(int t = 0 ; t < tc ; ++t) {

            int N = sc.nextInt();
            arr = new int[N];

            double total = 0;
            int peopleCnt = 0;

            for (int i = 0; i < N; ++i) {
                int val = sc.nextInt();
                arr[i] = val;
                total += val;
            }

            double avg = total / N;  //평균

            for (int i = 0; i < N; ++i) {
                if (arr[i] > avg) {
                    ++peopleCnt;
                }
            }

            System.out.printf("%.3f%%\n", ((double) peopleCnt / N) * 100);
        }
    }
}
