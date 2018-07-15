//对应识别
class  FunctionTest5{
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
	}
	
	public static int sum(int a,int b){
		return a+b;
		}
	public static int sum(int a,int b,int c){
		return a+b+c;
		}
		public static int sum(int a,int b,int c,int d){
		return a+b+c+d;
		}
}
