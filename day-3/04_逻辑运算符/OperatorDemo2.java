class OperatorDemo2 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		boolean b1 = ((x++==3)&(y++==4));
		boolean b2 = ((x++==3)&&(y++==4));//此处x已为4;y已为5;
		boolean b3 = ((++x==3)&(y++==4));//此处x已为5;y已为6;
		boolean b4 = ((++x==3)&&(y++==4));//此处x已为6;y已为7;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
