public class AssignmentTwo {
    public static void main(String[] args) {
        // Create an Employee (Ride Operator)
        Employee rideOperator = new Employee("Alice Johnson", 30, "123 Park Lane", "Ride Operator", 40000);

        // Create a Ride and assign the operator
        Ride rollerCoaster = new Ride("Roller Coaster", 10, true, rideOperator);

        // Create a Visitor
        Visitor visitor = new Visitor("Bob Smith", 25, "456 Elm St.", "VIP", "One-Day Pass");

        // Output the created objects
        System.out.println(rideOperator);
        System.out.println(rollerCoaster);
        System.out.println(visitor);
    }
}
