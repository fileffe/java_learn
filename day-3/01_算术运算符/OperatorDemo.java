//求出x与y值
//赋值运算有+，-，*，/，%，++，--。
class OperatorDemo{
	public static void main(String[] args){
	//x++先赋值后计算，++x先计算后赋值
	//y=4+6+6*10
	int x = 4;
	int y = (x++)+(++x)+(x*10);
		System.out.println("x:"+x);//x:6
		System.out.println("y:"+y);//y:70
	}
}