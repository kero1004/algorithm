import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine()); //갯수
        String str = sc.nextLine();     //다음줄 입력

        sc.close();

        int sum = 0;    //합계

        for(int i = 0 ; i < count ; ++i) {
            int num = str.charAt(i) - 48;
            sum += num;
        }
        System.out.println(sum);
    }
}
