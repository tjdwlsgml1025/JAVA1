package Arrange2;

public class Arr1_double {

    public static void main(String[] args) {
        int[][] arr = new int[3][4]; //3행 4열
        int num = 1;

        // 배열에 값을 저장
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        // 배열에 저장된 값을 출력
        for (int i = 0; i < 3; i++) { //행출력하는 for문 
            for (int j = 0; j < 4; j++) { //열 출력하는 for문
                System.out.print(arr[i][j] + "\t"); // 줄바꿈 대신 탭으로 구분하여 출력
            }
            System.out.println(); // 한 행의 출력이 끝나면 줄바꿈
        }
    }
}
