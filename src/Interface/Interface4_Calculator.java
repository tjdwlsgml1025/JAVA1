package Interface;

interface ICalculator {
    public int add(int num1, int num2);
    public int sub(int num1, int num2);
    public int mul(int num1, int num2);
    public int div(int num1, int num2);
}

class Calculator implements ICalculator {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int div(int num1, int num2) {
        if (num2 == 0)
            return 0;
        return num1 / num2;
    }
}

public class Interface4_Calculator {
    public static void main(String[] args) {
        ICalculator cal = new Calculator();

        System.out.println(cal.add(3, 4));
        System.out.println(cal.sub(3, 4));
        System.out.println(cal.mul(3, 4));
        System.out.println(cal.div(3, 4));
    }
}
