class Demo {
    public int sum(int a,int b){
        return a+b;
    }
}
class  Student {
    public  void show() {
        System.out.println("我爱学习");
    }
}
class StudentDemo {
    public void method(Student s){
        s.show();
    }
}
class ArgeTest {
    public static void main(String[] args){
        Demo d = new Demo();
        int result = d.sum(10,20);
             System.out.println(result);

        StudentDemo sd = new StudentDemo();
        Student s = new Student();
        sd.method(s);
    }
}