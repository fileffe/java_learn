class Student {
    private String name;
    private int age;

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
}

class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(27);
        System.out.println(s.getName() + s.getAge());
    }
}
