//求b值
//赋值运算有=，+=，-+，*=，/=，%=
class OperatorDemo2{
	public static void main(String[] args){
		//3赋值给b1，4赋值给b2
		byte b1=3,b2=4,b;
		//此处加byte，因为（b1+b2）转换为int
		b=(byte)(b1+b2);
		System.out.println(b);//b=7

	}
}