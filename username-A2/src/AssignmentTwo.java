public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        
        assignment.partThree();
        
        //assignment.partFourA();
    }
    public void partThree(){
        System.out.println("This is the partThree");
        Employee rideOperator_p_2 = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);
        Visitor visitor_p_2_1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor_p_2_2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor_p_2_3 = new Visitor("Jane Smith", -22, "555-5678", "Silver", "Regular");
        Ride rollerCoaster_p_2 = new Ride("Roller Coaster", 10, true, rideOperator_p_2);
        rollerCoaster_p_2.addVisitorToQueue(visitor_p_2_1);
        rollerCoaster_p_2.addVisitorToQueue(visitor_p_2_2);
        rollerCoaster_p_2.addVisitorToQueue(visitor_p_2_3);
        rollerCoaster_p_2.printQueue();
        rollerCoaster_p_2.removeVisitorFromQueue();
        rollerCoaster_p_2.printQueue();
        System.out.println("-----------------------------------------------------------------");
    }
    public void partFourA(){
        System.out.println("This is the partFourA");
        // Create an Employee (ride operator)
        Employee rideOperator = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);

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
        System.out.println("-----------------------------------------------------------------");
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
