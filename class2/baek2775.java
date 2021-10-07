import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int apt[][] = new int[15][15];
        for(int i = 0 ; i < 15; ++i) {
            apt[i][1] = 1;	// i층 1호
            apt[0][i] = i;	// 0층 i호
        }

        for(int i = 1 ; i < 15 ; ++i) {
            for(int j = 2 ; j < 15 ; ++j) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }

        int tc = sc.nextInt();

        for(int i = 0 ; i < tc ; ++i) {
            int K = sc.nextInt();   // 층
            int N = sc.nextInt();   // 호수
            System.out.println(apt[K][N]);
        }

    }
}
