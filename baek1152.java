import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        sc.close();

        String str[] = line.split(" ");
        int count = 0;

        if(!line.isBlank()) {
            count = str.length;
        }
        System.out.println(count);
    }
}
