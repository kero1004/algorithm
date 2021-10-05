import java.util.Arrays;
import java.util.Scanner;

enum STATE {
    ascending, descending, mixed
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        int accend[] = {1,2,3,4,5,6,7,8};
        int desc[] = {8,7,6,5,4,3,2,1};
        STATE state = STATE.mixed;

        for(int i = 0 ; i < 8 ; ++i) {
            arr[i] = sc.nextInt();
        }

        if(Arrays.equals(arr, accend)) {
            state = STATE.ascending;
        } else if(Arrays.equals(arr, desc)) {
            state = STATE.descending;
        }
        System.out.println(state);
    }
}
