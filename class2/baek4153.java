import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean end = false;

        List<int[]> list = new ArrayList<>();

        while(!end) {
            int arr[] = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                end = true;
            } else {
                list.add(arr);  //push
            }
        }

        int size = list.size();
        for(int i = 0 ; i < size ; ++i) {
            int arr[] = list.get(i);
            
            //1. 선 정렬
            Arrays.sort(arr);

            //2. 후 계산
            if(Math.pow(arr[2], 2) == (Math.pow(arr[0], 2) + Math.pow(arr[1], 2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
