package list;

import java.util.Queue;
import java.util.LinkedList;

public class Set7_Queue {

	public static void main(String[] args) {
	 Queue<String>que = new LinkedList<>(); //LinkedList<E>인스턴스생성!
	 que.offer("Box");
	 que.offer("Toy");
	 que.offer("Robot");
	 
	// 무엇이 나올지 확인
	 System.out.println("next:"+ que.peek());
	 
	 //첫번째두번째 인스턴스 꺼내기
	 System.out.println(que.poll());
	 System.out.println(que.poll());
	 
	 //무엇이 다음에 나올지 확인
	 System.out.println("next:"+ que.peek());
	 
	 //마지막 인스턴스 꺼내기
	 System.out.println(que.poll());
	}

}
