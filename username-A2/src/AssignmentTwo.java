public class AssignmentTwo {
    public static void main(String[] args) {
        // Create an Employee (ride operator)
        Employee rideOperator = new Employee("Alice Johnson", 30, "123 Park Lane", "Ride Operator", 40000);

        // Create a Ride
        Ride rollerCoaster = new Ride("Roller Coaster", 10, true, rideOperator);

        // Create Visitors with additional fields: phone and membershipType
        Visitor visitor1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor3 = new Visitor("Mark Brown", 19, "555-8765", "Bronze", "VIP");
        Visitor visitor4 = new Visitor("Sara Wilson", 28, "555-4321", "Gold", "Regular");
        Visitor visitor5 = new Visitor("David Green", 33, "555-8765", "Silver", "VIP");

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print current queue
        rollerCoaster.printQueue();

        // Run one cycle for the first visitor
        rollerCoaster.runOneCycle();

        // Print the queue and history after the cycle
        rollerCoaster.printQueue();
        rollerCoaster.printRideHistory();

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue();

        // Print the queue and history again after removal
        rollerCoaster.printQueue();
        rollerCoaster.printRideHistory();
    }
    public void partThree(){
    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}
