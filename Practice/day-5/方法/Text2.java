import java.util.Scanner;
class Text2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行");
		int line = sc.nextInt();

		printxx(line);
	}
	public static void printxx(int line) {
		for (int x=1;x<=line ; x++) {
			for (int y=1;y<=x ;y++ ) {
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
}
