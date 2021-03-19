import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("sum: " + sum(arr));
        Arrays.sort(arr);
        System.out.println("sorted: " + Arrays.toString(arr));
        System.out.println("max value: " + max(arr));
    }

    public static int sum(int[] arr){
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static int max(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}

/*

n - количество чисел, которые следуют за этим числом

затем следуют n чисел

эти числа нужно сложить и вывести сумму и самое большое число
затем отсортировать эти числа и вывести на экран


15
20
8
4
3
9
4
6
25
123
5

15+20+8+...=?


* */