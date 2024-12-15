public class Employee extends Person {
    //添加实例变量，工资和职位
    private String position;
    private double salary;

    // Default constructor
    //默认构造函数
    public Employee() {
        super(); // Calls the default constructor of Person
        this.position = "";
        this.salary = 0.0;
    }

    // Constructor with parameters
    //拓展Person里面的内容
    public Employee(String name, int age, String phone, String position, double salary) {
        super(name, age, phone); // Calls the parameterized constructor of Person//调用Person里面的参数构造化函数
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    //获取和设置器
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + "', " +
                "age=" + getAge() + ", " +
                "phone='" + getPhone() + "', " +
                "position='" + position + "', " +
                "salary=" + salary +
                '}';
    }
}
