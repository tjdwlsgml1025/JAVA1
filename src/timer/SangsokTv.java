package timer;

class TV4 {
    private int size;
    
    public TV4(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
}

class ColorTV2 extends TV4 {
    private int color;
    
    public ColorTV2(int size, int color) {
        super(size);
        this.color = color;
    }
    
    public void printProperty() {
        System.out.println("이 TV는 " + super.getSize() + "인치의 " + color + "컬러");
    }
}

public class SangsokTv {
    public static void main(String[] args) {
        ColorTV2 myTV = new ColorTV2(32, 1024);
        myTV.printProperty();
    }
}
