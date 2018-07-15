class SwitchDemo2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		switch (a){
		default :         //先走case，后走default，default结束后有break，结束，b=5
			b++;
			break;
		case 4:
			b++;
		case 5:
			b++;
		}
		System.out.println("b:"+b);//case不满足，走default，走完再走两个b++，结束，b=6
		int x = 2;
		int y = 3;
		switch (x){
		default:
			y++;
		case 4:
			y++;
		case 5:
			y++;
		System.out.println("y:"+y);
		}
	}
}
