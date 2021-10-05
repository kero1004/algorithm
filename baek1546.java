import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine()); //갯수
        int grade[] = new int[count];   //점수
        double total = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < count ; ++i) {
            int num = sc.nextInt();
            grade[i] = num;

            // 최고점수
            if(num >= max) {
                max = num;
            }
        }

        for(int i = 0 ; i < count ; ++i) {
            total += (grade[i] / (double)max) * 100;
        }

        System.out.println(total / count);    //평균 구하기

        sc.close();
    }
}
