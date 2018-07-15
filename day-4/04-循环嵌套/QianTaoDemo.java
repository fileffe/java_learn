/*输入四行五列的*（外循环控制行数，内循环控制列数）
*****
*****
*****
*****
*/
/*
class QianTaoDemo {
	public static void main(String[] args) {
		for (int y=0;y<4;y++ ){
		for (int x=0;x<5;x++ ){
			System.out.print("*");                        //println与print就是换行与不换行的区别
			}
			System.out.println();                      
		}
	}
}
*/
/*请输入下列形状
*
**
***
****
***** 
*/
/*
class QianTaoDemo {
	public static void main(String[] args) {
		for (int x=0;x<5;x++ ){
		for (int y=0;y<=x;y++ ){
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
//请输入九九乘法表
class QianTaoDemo {
	public static void main(String[] args) {
		for (int x=1;x<=9;x++ ){
		for (int y=1;y<=x;y++ ){
			System.out.print((y+"*"+x+"="+y*x)+"\t");   //此处重点，要求理解,"\t"可用't'表示;相当于tab健
			/*"\x"表示任意，叫转移字符；
			"\r"回车
			"\n"换行
			*/
			}
			System.out.println();
		}
	}
}
