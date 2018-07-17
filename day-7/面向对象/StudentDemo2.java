class Student {
    String name;
    private int age;                      //private使得s.age不能用，只能用s.setAge();

     public void setAge(int a) {
        if (a<0||age>120) {
           System.out.println("数不合理"); 
        }else{
            age=a;
        }
     }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}

class StudentDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        System.out.println("----------");

        s.name="林青霞";
        // s.age=27;
        s.setAge(27);                         // 带括号
        s.show();
        System.out.println("----------");

        // s.age=-27;
        s.setAge(-27);
        s.show();
    }
}
