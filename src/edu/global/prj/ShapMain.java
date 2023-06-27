package edu.global.prj;
import edu.global.prj.shape.Shape;
import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Rectangle;



//Shape 안에 써클,렉텡글 오버라이딩 돼있음
//메인에서 세개 호출해서 배열로 묶은 다음 호출함
public class ShapMain {

	public static void main(String[] args) {
		Shape[] shape = {new Circle(10),new Rectangle(10,20)};
		//배열이용해서 오버라이딩 된 객체들 한번에 생성가능
	
		double area = 0;
		
		for(Shape s:shape) { //배열에있는거다출력하겠다.s라는 이름으로
			area=area+s.getArea();
		}
	
		System.out.println(area);
	} 

}
