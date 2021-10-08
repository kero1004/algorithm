import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        // 1번 풀이법

        Scanner sc = new Scanner(System.in);
        final int cnt = 10;
        final int nam = 42;
        int arr[] = new int[cnt];

        for(int i = 0 ; i < cnt; ++i) {
            arr[i] = sc.nextInt()% nam;
        }

        sc.close();
        
        int result = 0; //서로 다른 나머지

        for(int i = 0 ; i < cnt ; ++i) {
            boolean bEqual = false;

            for(int j = i+1 ; j < cnt ; ++j) {
                if(arr[i] == arr[j]) {
                    bEqual = true;
                    break;
                }
            }

            if(bEqual == false) {
                ++result;
            }
        }

        System.out.println(result);
        // 1번 풀이법 끝


        // 2번 풀이법 - HashSet 이용
        HashSet hs = new HashSet();

        for(int i = 0 ; i < cnt; ++i) {
            hs.add(sc.nextInt() % nam);
        }
        System.out.println(hs.size());
        // 2번 풀이법 끝

    }
}
