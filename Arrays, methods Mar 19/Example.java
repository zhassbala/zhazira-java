import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.println("число в массиве arr под индексом i(" + i + "): " + arr[i]);
        }
    }
}
