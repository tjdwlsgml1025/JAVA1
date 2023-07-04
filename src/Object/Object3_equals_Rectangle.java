package Object;

class Rectangle {
	   private int width;
	   private int height;
	   
	   public int getWidth() {      
	      return width;
	   }
	   public void setWidth(int width) {
	      this.width = width;
	   }
	   public int getHeight() {
	      return height;
	   }
	   public void setHeight(int height) {
	      this.height = height;
	   }
	   
@Override
	   public String toString() {
	      return "가로:" + width + "세로:" + height;
	   }

@Override
public boolean equals(Object obj) {
	Rectangle rec = (Rectangle)obj; //자식데이터타입으로 형변환해주기 때문에 자식=부모 가능함 
	
	if(this.width == rec. width && this.height == rec. height)
		return true;
	
	return false;
}



public class Object3_equals_Rectangle {

	public static void main(String[] args) {
		
		Rectangle r2 = new Rectangle(); //r2안에 미리 Rectangle가 들어있기 때문에 부모데이터타입을 자식으로 강제형변환 가능했음
		
		bloolean bool = r.equals(r2);
		System.out.println(bool);
		
		

}
