//������ת���
class BreakDemo {                                
	public static void main(String[] args) {
		for (int x=0;x<10;x++ )
		{if (x==2)
		{break;                               //ֻ����ѭ������Switch��䣬����������
		}
		 System.out.println("Hello World!");  //x=2ʱ��ֹѭ�����������HelloWorld
		}
		System.out.println("over");           //break��Ӱ��ѭ����������

	


		for (int x=0;x<3 ;x++ ){
			for (int y=0;y<4 ;y++ )  //���Ϊ����**
			{          
			if (y==2){
			break ;
			}
			System.out.print("*");
			}
			System.out.println();
			}



		wc:for (int x=0;x<3 ;x++ )    //��ǩ��������������ѭ��
		{for (int y=0;y<4 ;y++ )
		{if (y==2)
		{break wc;                    //���ֻ��ʾһ��**
		}
		System.out.print("*");
		}
		System.out.println();
		}
	}
}

