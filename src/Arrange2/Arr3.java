package Arrange2;
import java.util.Scanner;

public class Arr3 {
    public static class Word {
        int row, column;

        public Word() {}

        public Word(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Word word2;
        
        int row;
        int column;
        
        //행입력

        do {
            System.out.print("행 크기: ");
            while (!sc.hasNextInt()) {
                System.out.println("반드시 1~10 사이의 정수를 입력하세요.");
                sc.next();
            }
            row = sc.nextInt();
            
            if (row >= 10) {
                System.out.println("행 크기는 10보다 작아야 합니다.");
            }
        } while (row < 1 || row >= 10);
        
      //열입력  

        do {
            System.out.print("열 크기: ");
            while (!sc.hasNextInt()) {
                System.out.println("반드시 1~10 사이의 정수를 입력하세요.");
                sc.next();
            }
            
            column = sc.nextInt();
            if (column >= 10) {
                System.out.println("열 크기는 10보다 작아야 합니다.");
            }
        } while (column < 1 || column >= 10);
        
        
        word2 = new Word(row, column);

        System.out.println("행 크기: " + word2.row + ", 열 크기: " + word2.column);

        
        

        char[][] array = new char[row][column];

        char alphabet = 'A'; //char데이터타입은 아스키 코드에 의해 정수값으로 표

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = alphabet;
                alphabet++;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
