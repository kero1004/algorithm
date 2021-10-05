package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strInput = sc.nextLine().toUpperCase();
        sc.close();

        int arr[] = new int[26];  //알파뱃 갯수
        Arrays.fill(arr, -1);   // -1로 초기화

        for(int i = 0 ; i < strInput.length() ; ++i) {
            int index = strInput.charAt(i) - 'A';

            if(arr[index] == -1) {
                arr[index] = i;
            }
        }

       Arrays.stream(arr).forEach(num -> System.out.printf("%d ", num));
    }
}
