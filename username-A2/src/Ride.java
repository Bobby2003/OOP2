//创建游乐设施
public class Ride {
    private String rideName;
    private int minAge;
    private boolean isOpen;
    private Employee rideOperator; // Employee responsible for operating the ride

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.minAge = 0;
        this.isOpen = false;
        this.rideOperator = null;
    }

    // Constructor with parameters
    public Ride(String rideName, int minAge, boolean isOpen, Employee rideOperator) {
        this.rideName = rideName;
        this.minAge = minAge;
        this.isOpen = isOpen;
        this.rideOperator = rideOperator;
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideName='" + rideName + "', " +
                "minAge=" + minAge + ", " +
                "isOpen=" + isOpen + ", " +
                "rideOperator=" + (rideOperator != null ? rideOperator.getName() : "No operator") +
                '}';
    }
}
