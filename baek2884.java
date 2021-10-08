import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = 45;

        int min = M - time;

        if(min < 0) {
            M = min + 60;
            H = (H-1) < 0 ? 23 : (H-1);
        } else {
            M -= time;
        }

        System.out.println(H + " " + M );
    }
}
