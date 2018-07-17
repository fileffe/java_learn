/*
	定义一个长方形类,定义 求周长和面积的方法，
	然后定义一个测试了Test2，进行测试。

	长方形的类：
		成员变量：
			长，宽
		成员方法：
			求周长：(长+宽)*2;
			求面积：长*宽

	注意：
		import必须出现在所有的class前面。
*/
import java.util.Scanner;

class ChangFangXing {
    private int length;
    private int width;

    public ChangFangXing() {};

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getZhouChang() {
        return (length + width) * 2;
    }

    public int getMianJi() {
        return length * width;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入长");
        int length = sc.nextInt();
        System.out.println("请输入宽");
        int width = sc.nextInt();

        ChangFangXing cfx = new ChangFangXing();
        cfx.setLength(length);
        cfx.setWidth(width);

        System.out.println("周长" + cfx.getZhouChang());
        System.out.println("面积" + cfx.getMianJi());
    }
}
