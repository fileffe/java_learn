class OperatorDemo2 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		boolean b1 = ((x++==3)&(y++==4));
		boolean b2 = ((x++==3)&&(y++==4));//�˴�x��Ϊ4;y��Ϊ5;
		boolean b3 = ((++x==3)&(y++==4));//�˴�x��Ϊ5;y��Ϊ6;
		boolean b4 = ((++x==3)&&(y++==4));//�˴�x��Ϊ6;y��Ϊ7;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
