/*
修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
		方法体语句;
		return 返回值;
}
*/
class  FunctionDemo{
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int result = sum(x,y);
		System.out.println(result);
	}
	public static int sum(int a,int b){
		return a + b;
	}
}
