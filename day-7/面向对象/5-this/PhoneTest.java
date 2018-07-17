/*
	作业：请把手机类写成一个标准类，然后创建对象测试功能。

	手机类：
		成员变量：
			品牌：String brand;
			价格：int price;
			颜色：String color;
		成员方法：
			针对每一个成员变量给出对应的getXxx()/setXxx()方法。
		最后定义测试：
			创建一个对象，先通过getXxx()方法输出成员变量的值。这一次的结果是：null---0---null
			然后通过setXxx()方法给成员变量赋值。再次输出结果。这一次的结果是：三星---2999---土豪金
*/
class Phone {
    private String brand;
    private int price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.getBrand() + p.getPrice() + p.getColor());

        p.setBrand("小米");
        p.setPrice(1999);
        p.setColor("白色");
        System.out.println(p.getBrand() + p.getPrice() + p.getColor());
    }
}
