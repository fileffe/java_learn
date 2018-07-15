class  IfDemo{
	public static void main(String[] args) {
		int x =10;

		if(x==10){
		System.out.println("x等于10");

		}
		if(x==20){
		System.out.println("x等于20");

		}

		System.out.println("over");
	}
}
//结果x=10，over（在if大括号外，不受其影响）。x=20不满足则不输出。