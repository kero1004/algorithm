import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());	// 테스트 케이스

        for(int i = 0 ; i < tc ; ++i) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();  //몇번째 손님

            int back = 0;
            int front = 0;

            if ((n % h) == 0) {
                front = h * 100;
                back = n / h;
            }
            else {
                front = (n % h) * 100;
                back = (n / h) + 1;
            }

            System.out.println(front+back);
        }
    }
}
