class Student {
    //非静态变量
    int num1 = 10;
    //静态变量（共享）
    static int num2 = 20;
}

class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.num1);
        System.out.println(Student.num2);     //能直接调用Student
        System.out.println(s.num2);
    }
}
