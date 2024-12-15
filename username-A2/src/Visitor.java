//游客增加会员类型和不同类型的票的实例
public class Visitor extends Person {
    private String membershipType;
    private String ticketType;

    // Default constructor
     //默认构造函数
    public Visitor() {
        super(); // Calls the default constructor of Person
        this.membershipType = "";
        this.ticketType = "";
    }

    // Constructor with parameters
    public Visitor(String name, int age, String phone, String membershipType, String ticketType) {
        super(name, age, phone); // Calls the parameterized constructor of Person//调用Person里面的参数构造化函数
        this.membershipType = membershipType;
        this.ticketType = ticketType;
    }

    // Getters and Setters

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + getName() + "', " +
                "age=" + getAge() + ", " +
                "phone='" + getPhone() + "', " +
                "membershipType='" + membershipType + "', " +
                "ticketType='" + ticketType + "'" +
                '}';
    }
}
