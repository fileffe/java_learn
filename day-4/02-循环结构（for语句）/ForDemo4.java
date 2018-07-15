/*1-1000之间满足
	对3整除余2
	对5整除余3
	对7整除余2
	的个数
*/
class ForDemo4 {
	public static void main(String[] args) {

		int count = 0;                
		for (int x=1;x<=1000;x++){
		if ((x%3==2) && (x%5==3) && (x%7==2))
		{count++;
		 System.out.println(x);
		}
		}
		System.out.println(count);//此处不能加入上一个大括号内
	}
}
