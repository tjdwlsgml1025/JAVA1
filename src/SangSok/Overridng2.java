package SangSok;

class Robot {
    public void work() {}
}

class DanceRobot extends Robot {
    public void work() {
        System.out.println("춤추는 로봇입니다.");
    }
}

class DrawRobot extends Robot {
    public void work() {
        System.out.println("그림을 그리는 로봇입니다.");
    }
}

class WashRobot extends Robot {
    public void work() {
        System.out.println("세탁을하는 로봇입니다.");
    }
}

public class Overridng2 {

    public static void main(String[] args) {

        Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()}; // 배열로 객체 생성, 다형성

        for (Robot robot : arrRobot) {
            robot.work();
        }
    }
} //다형성,오버라이딩을 하게 되면 생성자를 하나만 만들어도 되고 출력함수도 하나로 가능
