

class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /*public void show(){
        System.out.println(name+age);
    }*/
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(27);
        System.out.println(s1.getName() + "-----" + s1.getAge());
        //  s1.show();

        Student s2 = new Student("林青霞", 27);
        System.out.println(s2.getName() + "-----" + s2.getAge());
        //  s2.show();
    }
}
