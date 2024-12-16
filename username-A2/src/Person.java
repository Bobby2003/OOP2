//创建姓名、年龄、电话作为人员信息实例变量。
//public class Person {
//将Person抽象化，加入abstract。
public abstract class Person {
    private String name;
    private int age;
    private String phone;

    // Default constructor
    //默认构造函数
    public Person() {
        this.name = "";
        this.age = 0;
        this.phone = "";
        System.out.println("Person object created with default values.");
    }

    // Constructor with parameters
    //使用参数设置的第二个构造函数
    public Person(String name, int age, String phone) {
        this.name = name;
        setAge(age); //显式表达
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
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Failed to set age.Age :"+age+" Age cannot be negative.");
            this.age=0;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && !phone.isEmpty()) {
            this.phone = phone;
        } else {
            System.out.println("Failed to set phone. Phone cannot be null or empty.");
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", phone='" + phone + "'}";
    }
}
