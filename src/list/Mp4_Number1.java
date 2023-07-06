package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mp4_Number1 {

    public static void main(String[] args) {
    	List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수(-1이 입력될 때까지)>>");
        
        while(true) {        
           
           try {
               int num = sc.nextInt(); //7 9 10
               
               if(num == -1)
                  break;
               
               list.add(num);
          } catch (Exception e) {
             System.out.println("잘못된 입력입니다. 다시 넣어 주세요");
              sc = new Scanner(System.in);
             continue;
          }

        }
        
        //큰값 구하기
        
        int max = 0;
        for (int num : list) {
          if(num > max)
             max = num;
       }
        
        System.out.println("가장 큰수는" + max);
        
        System.out.println(list);
    }
}
