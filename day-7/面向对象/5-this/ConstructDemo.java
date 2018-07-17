/*
给成员变量赋值有两种方式：
		A:setXxx()
		B:构造方法
*/
class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参数变量");    //无参构造，(此句可省略)
    }

    public Student(String name) {
        System.out.println("String类型构造方法");//(此句可省略)
        this.name = name;
    }

    public Student(int age) {
        System.out.println("int类型构造方法");//(此句可省略)
        this.age = age;
    }

    public Student(String name, int age) {
        System.out.println("无参数变量");//(此句可省略)
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + age);
    }
}

class ConstructDemo {
    public static void main(String[] args) {
        // 对象一
        Student s = new Student();
        s.show();
        System.out.println();
        // 对象二
        Student s1 = new Student("林青霞");
        s1.show();
        System.out.println();
        // 对象三
        Student s2 = new Student(27);
        s2.show();
        System.out.println();
        // 对象四
        Student s3 = new Student("林青霞",27);
        s3.show();
        System.out.println();
    }
}
