import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());   //카운트
        String testcase[] = new String[count];
        
        //입력받기
        for(int i = 0 ; i < count ; ++i ) {
            testcase[i] = sc.nextLine();
        }

        for(int i = 0; i < count ; ++i) {
            int length = testcase[i].length();
            int sum = 0;    //출력용 합계
            int cntO = 1;   //O 갯수
            boolean preO = false;   //이전값이 O인가?

            for(int j = 0 ; j < length; ++j) {
                char ch = testcase[i].charAt(j);

                if(ch == 'O') {
                    sum += (1 * cntO++);
                    preO = true;
                } else {    //리셋
                    cntO = 1;
                    preO = false;
                }
            }

            System.out.printf("%d ", sum);
        }
    }
}
