/*
	需求：
		定义一个员工类,自己分析出几个成员，
		然后给出成员变量，构造方法，getXxx()/setXxx()方法，
		以及一个显示所有成员信息的方法。并测试。

	分析：
		员工
			成员变量：
				员工编号，姓名，年龄
			构造方法：
				无参构造方法
			成员方法：
				getXxx()/setXxx()
				show();
*/
class Employee {
    private String employeeid;
    private String name;
    private int age;

    public Employee() {}
    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
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

    public void show() {
        System.out.println(employeeid + name + age);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeid("zdk654");
        e.setName("李四");
        e.setAge(27);
        e.show();
    }
}
