//******
class Student {
    private String name;
    private int age;

    public String getName() {          //String
        return name;
    }

    public void setName(String n) {     //void
        name = n;
    }

    public int getAge() {                //int
        return age;
    }

    public void setAge(int a) {         //void
        age = a;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(27);
        System.out.println(s.getName() + s.getAge());
    }
}
