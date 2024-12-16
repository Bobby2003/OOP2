public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        
        assignment.partThree();
        
        assignment.partFourA();
    }
    public void partThree(){
        System.out.println("This is the partThree");
        Employee rideOperator_p_3 = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);
        Visitor visitor_p_3_1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor_p_3_2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor_p_3_3 = new Visitor("Jane Smith", -22, "555-5678", "Silver", "Regular");//测试报错，年龄为负数
        Visitor visitor_p_3_4 = new Visitor("Sara Wilson", 28, "555-4321", "Gold", "Regular");
        Visitor visitor_p_3_5 = new Visitor("David Green", 33, "555-8765", "Silver", "VIP");
        Ride rollerCoaster_p_3 = new Ride("Roller Coaster", 10, true, rideOperator_p_3);
        rollerCoaster_p_3.addVisitorToQueue(visitor_p_3_1);
        rollerCoaster_p_3.addVisitorToQueue(visitor_p_3_2);
        rollerCoaster_p_3.addVisitorToQueue(visitor_p_3_3);
        rollerCoaster_p_3.addVisitorToQueue(visitor_p_3_4);
        rollerCoaster_p_3.addVisitorToQueue(visitor_p_3_5);
        rollerCoaster_p_3.printQueue();
        rollerCoaster_p_3.removeVisitorFromQueue();
        rollerCoaster_p_3.printQueue();
        System.out.println("-----------------------------------------------------------------");
    }
    public void partFourA(){
        System.out.println("This is the partFourA");
        // Create an Employee (ride operator)
        Employee rideOperator_p_4A = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);
        // Create a Ride
        Ride rollerCoaster_p_4A = new Ride("Roller Coaster", 10, true, rideOperator_p_4A);
        // Create Visitors with additional fields: phone and membershipType
        Visitor visitor_p_4A_1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor_p_4A_2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor_p_4A_3 = new Visitor("Mark Brown", 19, "555-8765", "Bronze", "VIP");
        Visitor visitor_p_4A_4 = new Visitor("Sara Wilson", 28, "555-4321", "Gold", "Regular");
        Visitor visitor_p_4A_5 = new Visitor("David Green", 33, "555-8765", "Silver", "VIP");
        // Add visitors to the queue
        rollerCoaster_p_4A.addVisitorToHistory(visitor_p_4A_1);
        rollerCoaster_p_4A.addVisitorToHistory(visitor_p_4A_2);
        rollerCoaster_p_4A.addVisitorToHistory(visitor_p_4A_3);
        rollerCoaster_p_4A.addVisitorToHistory(visitor_p_4A_4);
        rollerCoaster_p_4A.addVisitorToHistory(visitor_p_4A_5);
        // Print current queue
        rollerCoaster_p_4A.checkVisitorFromHistory(visitor_p_4A_2);
        rollerCoaster_p_4A.numberOfVisitors();
        rollerCoaster_p_4A.printRideHistory();
        System.out.println("-----------------------------------------------------------------");
    }
    public void partFourB(){
        System.out.println("This is the partFourA");
        // Create an Employee (ride operator)
        Employee rideOperator_p_4A = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);
        // Create a Ride
        Ride rollerCoaster_p_4A = new Ride("Roller Coaster", 10, true, rideOperator_p_4A);
        // Create Visitors with additional fields: phone and membershipType
        Visitor visitor_p_4A_1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor_p_4A_2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor_p_4A_3 = new Visitor("Mark Brown", 19, "555-8765", "Bronze", "VIP");
        Visitor visitor_p_4A_4 = new Visitor("Sara Wilson", 28, "555-4321", "Gold", "Regular");
        Visitor visitor_p_4A_5 = new Visitor("David Green", 33, "555-8765", "Silver", "VIP");
        // Add visitors to the queue
        rollerCoaster_p_4A.addVisitorToQueue(visitor_p_4A_1);
        rollerCoaster_p_4A.addVisitorToQueue(visitor_p_4A_2);
        rollerCoaster_p_4A.addVisitorToQueue(visitor_p_4A_3);
        rollerCoaster_p_4A.addVisitorToQueue(visitor_p_4A_4);
        rollerCoaster_p_4A.addVisitorToQueue(visitor_p_4A_5);
        // Print current queue
        rollerCoaster_p_4A.printQueue();
        // Run one cycle for the first visitor
        rollerCoaster_p_4A.runOneCycle();
        // Print the queue and history after the cycle
        rollerCoaster_p_4A.printQueue();
        rollerCoaster_p_4A.printRideHistory();
        rollerCoaster_p_4A.checkVisitorFromHistory(visitor_p_4A_2);
        rollerCoaster_p_4A.numberOfVisitors();
        // Remove a visitor from the queue
        rollerCoaster_p_4A.removeVisitorFromQueue();
        // Print the queue and history again after removal
        rollerCoaster_p_4A.printQueue();
        rollerCoaster_p_4A.printRideHistory();
        System.out.println("-----------------------------------------------------------------");
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}
