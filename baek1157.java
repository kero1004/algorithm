import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        char[] ch = str.toUpperCase().toCharArray();
        char[] temp = new char[26];
        int length = ch.length;

        char result = ' ';
        int maxCnt = 0;

        for(int i = 0 ; i < length ; ++i) {
            int index = ch[i] - 65;
            temp[index]++;

            if(temp[index] > maxCnt) {
                maxCnt = temp[index];
                result = ch[i];
            } else if(temp[index] == maxCnt) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
