//创建姓名、年龄、电话作为人员信息实例变量,
public class Person {
    private String name;
    private int age;
    private String phone;

    // Default constructor
    //默认构造函数
    public Person() {
        this.name = "";
        this.age = 0;
        this.phone = "";
    }

    // Constructor with parameters
    //使用参数设置的第二个构造函数
    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Getters and Setters
    //获取和设置器
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", phone='" + phone + "'}";
    }
}
