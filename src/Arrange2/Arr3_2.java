package Arrange2;
 // 랜덤알파벳 나오게하기 > 행과 열 숫자받아서!!!
import java.util.Scanner;

public class Arr3_2 {
    public static int getArr() {
        Scanner sc = null;
        int num = 0;

        while (true) {
            sc = new Scanner(System.in);
            num = sc.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
                continue; // 다시 입력시킴
            } else {
            	
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        // 변수 선언
        int row, col;
        int[][] arr;

        System.out.print("행 크기: ");
        row = getArr(); //이함수 호출,위입력값 삽
        System.out.print("열 크기: ");
        col = getArr();

        arr = new int[row][col];

        // 알파벳 입력 및 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 26 + 65); //아스키코드값을 집어넣고

                System.out.print((char) arr[i][j] + " "); // 데이터 타입을 char로 바꾸면 출력할 때 알파벳이 나와
            }
            System.out.println();
        }
    }
}
