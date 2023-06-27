package SangSok;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

   public void printProperty() {
        System.out.println(super.getSize() + "인치, " + color + "컬러");
    }
}

public class Sangsok2_TV {
    public static void main(String[] args) {
        ColorTV myTv = new ColorTV(32, 1024);
        myTv.printProperty();
    }
}
