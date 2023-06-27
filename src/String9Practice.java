import java.util.Scanner;

public class String9Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("영어 단어를 입력하세요:");
        String word = scanner.nextLine();

        int length = word.length();
        System.out.println("총 글자 수는: " + length + "개 입니다.");

        int vowels = countVowels(word);
        System.out.println("모음은: " + vowels + "개 입니다.");

        int consonants = length - vowels;
        System.out.println("자음은: " + consonants + "개 입니다.");

        scanner.close();
    }

    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
//charAt() 함수를 사용하여 문자열을 하나씩 접근하고, isVowel() 함수를 정의하여 모음인지 확인하는 로직을 분리하였습니다.