public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        
        assignment.partThree();
        
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
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
        System.out.println("This is the partFourB");
        // Create an Employee (ride operator)
        Employee rideOperator_p_4B = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);
        // Create a Ride
        Ride rollerCoaster_p_4B = new Ride("Roller Coaster", 10, true, rideOperator_p_4B);
        // Create Visitors with additional fields: phone and membershipType
        Visitor visitor_p_4B_1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor_p_4B_2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor_p_4B_3 = new Visitor("Mark Brown", 19, "555-8765", "Bronze", "VIP");
        Visitor visitor_p_4B_4 = new Visitor("Sara Wilson", 28, "555-4321", "Gold", "Regular");
        Visitor visitor_p_4B_5 = new Visitor("David Green", 33, "555-8765", "Silver", "VIP");
        // Add visitors to the queue
        rollerCoaster_p_4B.addVisitorToHistory(visitor_p_4B_1);
        rollerCoaster_p_4B.addVisitorToHistory(visitor_p_4B_2);
        rollerCoaster_p_4B.addVisitorToHistory(visitor_p_4B_3);
        rollerCoaster_p_4B.addVisitorToHistory(visitor_p_4B_4);
        rollerCoaster_p_4B.addVisitorToHistory(visitor_p_4B_5);
        rollerCoaster_p_4B.printRideHistory();
        rollerCoaster_p_4B.sortRideHistory();
        System.out.println("----------------");
        rollerCoaster_p_4B.printRideHistory();
        System.out.println("-----------------------------------------------------------------");
    }
    public void partFive(){
        System.out.println("This is the partFive");
        // Create an Employee (ride operator)
        Employee rideOperator_p_5 = new Employee("Alice Johnson", 30, "48-7526", "Ride Operator", 40000);
        // Create a Ride
        Ride rollerCoaster_p_5 = new Ride("Roller Coaster", 10, true, rideOperator_p_5);
        // Create Visitors with additional fields: phone and membershipType
        Visitor visitor_p_5_1 = new Visitor("John Doe", 25, "555-1234", "Gold", "VIP");
        Visitor visitor_p_5_2 = new Visitor("Jane Smith", 22, "555-5678", "Silver", "Regular");
        Visitor visitor_p_5_3 = new Visitor("Mark Brown", 19, "555-8765", "Bronze", "VIP");
        Visitor visitor_p_5_4 = new Visitor("Sara Wilson", 28, "555-4321", "Gold", "Regular");
        Visitor visitor_p_5_5 = new Visitor("David Green", 33, "555-8765", "Silver", "VIP");
        Visitor visitor_p_5_6 = new Visitor("Emily Adams", 27, "555-1122", "Platinum", "VIP");
        Visitor visitor_p_5_7 = new Visitor("Chris Johnson", 31, "555-3344", "Gold", "Regular");
        Visitor visitor_p_5_8 = new Visitor("Olivia Martinez", 24, "555-9988", "Silver", "VIP");
        Visitor visitor_p_5_9 = new Visitor("Michael Clark", 29, "555-7766", "Bronze", "Regular");
        Visitor visitor_p_5_10 = new Visitor("Sophia Lee", 26, "555-2233", "Gold", "VIP");
        // Add visitors to the queue
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_1);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_2);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_3);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_4);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_5);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_6);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_7);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_8);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_9);
        rollerCoaster_p_5.addVisitorToQueue(visitor_p_5_10);
        rollerCoaster_p_5.printQueue();
        System.out.println("----------------");
        rollerCoaster_p_5.runOneCycle();
        rollerCoaster_p_5.printQueue();
        System.out.println("----------------");
        rollerCoaster_p_5.printRideHistory();
        System.out.println("-----------------------------------------------------------------");
    }
    public void partSix(){
        System.out.println("This is the partSix");

        System.out.println("-----------------------------------------------------------------");
    }
    public void partSeven(){
        System.out.println("This is the partSeven");

        System.out.println("-----------------------------------------------------------------");
    }
}
