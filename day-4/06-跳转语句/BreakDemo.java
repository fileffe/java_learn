//控制跳转语句
class BreakDemo {                                
	public static void main(String[] args) {
		for (int x=0;x<10;x++ )
		{if (x==2)
		{break;                               //只用于循环语句和Switch语句，否则无意义
		}
		 System.out.println("Hello World!");  //x=2时终止循环；输出两次HelloWorld
		}
		System.out.println("over");           //break不影响循环大括号外

	


		for (int x=0;x<3 ;x++ ){
			for (int y=0;y<4 ;y++ )  //结果为三行**
			{          
			if (y==2){
			break ;
			}
			System.out.print("*");
			}
			System.out.println();
			}



		wc:for (int x=0;x<3 ;x++ )    //标签名加语句跳出多层循环
		{for (int y=0;y<4 ;y++ )
		{if (y==2)
		{break wc;                    //结果只显示一行**
		}
		System.out.print("*");
		}
		System.out.println();
		}
	}
}

