class Person {
    String name;
    int age;
    static String country;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void show() {
        System.out.println(name + age + country);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("邓丽君", 18, "中国");
        p1.show();
        Person p2 = new Person("杨幂", 30);
        p2.show();
        Person p3 = new Person("凤姐", 25);
        p3.show();

        p3.country = "美国"; // 国籍更换了
        p1.show();
        p2.show();
        p3.show();
    }
}
