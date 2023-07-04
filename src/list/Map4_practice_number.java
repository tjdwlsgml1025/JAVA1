import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map4_practice_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("양수 입력 바람: ");
            num = sc.nextInt();

            if (num < 0)
                break;
            
            list.add(num);
            if(num>max) {
            	max=num;
            }
        }
            System.out.println("가장 큰 수는: " + max);
        }
    }

