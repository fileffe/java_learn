class Student {
		String name;
		int age;
		String address;
		public void study(){
			System.out.println("学生爱学习");
		}
		public void eat(){
			System.out.println("吃饭");
		}
		public void sleep(){
			System.out.println("睡觉");
		}
	
}
class StudentDemo {
	public static void main (String[] args) {
		Student s = new Student();                //此处记得加括号
		s.name="林青霞";
		s.age=27;
		s.address="北京";
		System.out.println(s.name+s.age+s.address);
		s.study();
		s.eat();
		s.sleep();
	}
}

