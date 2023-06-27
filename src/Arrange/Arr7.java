package Arrange;
//new 객체를 생성하면 초기화를 시킨다=기본값을 가진다는 뜻

public class Arr7 {

    static int sumOfAry(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7}; // 배열 초기화! new int[7]; ar[0]=1 ...이런식으로 알아서 넣음
        int sum = sumOfAry(ar); // 배열의 참조값 전달

        System.out.println(sum);
    }

    static int[] makeNewIntAry(int len) {
        int[] ar = new int[len];
        return ar; // 배열의 참조 값 반환 가능
    }
}
