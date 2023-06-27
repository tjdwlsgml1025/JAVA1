package SangSok;
class TV2 {  //큰부모
    private int size;

    public TV2(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

   static class ColorTV extends TV2 { //둘째부모
        private int color;

        public ColorTV(int size, int color) {
            super(size);
            this.color = color;
        }

        public void printProperty() {
            System.out.println(super.getSize() + "인치, " + color + "컬러");
        }
    }

    static class IPTV extends ColorTV { //마지막 자손
        private String ip;

        public IPTV(String ip, int size, int color) {
            super(size, color);
            this.ip = ip;
        }

        public void printProperty() {
            System.out.print("나의 IPTV는 " + ip + " 주소에 "); // 개행 없이 출력
            super.printProperty(); 
        }
    }
}
public class Sangsok3_IPTV {
    public static void main(String[] args) {
        
    	TV2.IPTV iptv = new TV2.IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
