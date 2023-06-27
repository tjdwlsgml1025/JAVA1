package Arrange;

public class Arr9_enhanced_for {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5}; // 배열 초기화! new int[]{1, 2, 3, 4, 5};
ㅁ
        for (int e : ar) {
            System.out.print(e + " ");  
        }
        System.out.println();

        int sum = 0;
        for (int e : ar) {   //읽기만 가능 e=7처럼 배열내용을 다 7로 바꾸는 것은 불가능
            sum += e; 
        }
        System.out.println("sum: " + sum);
    }

}
