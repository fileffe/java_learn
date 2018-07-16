class Student {
		//姓名
		String name;
		//年龄
		int age;
		//地址
		String address;
		//学习
		public void study() {
			System.out.println("学生爱学习");
		}
		//吃饭
		public void eat() {
			System.out.println("学习饿了要吃饭");
		}
		//睡觉
		public void sleep() {
			System.out.println("学习累了要睡觉");
		}	
}
class StudentDemo {
	public static void main (String[] args) {
		Student s = new Student();
		s.name="林青霞";
		s.age=27;
		s.address="北京";
		System.out.println(s.name+"------"+s.age+"-------"+s.address);
		s.study();
		s.eat();
		s.sleep();
	}

}
