import java.util.Scanner;

class MyMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class MyMathTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据");
        int firstNumber = sc.nextInt();

        System.out.println("请输入第二个数据");
        int secondNumber = sc.nextInt();

        MyMath mm = new MyMath();
        System.out.println(mm.add(firstNumber, secondNumber));
        System.out.println(mm.sub(firstNumber, secondNumber));
        System.out.println(mm.mul(firstNumber, secondNumber));
        System.out.println(mm.div(firstNumber, secondNumber));
    }
}
