//创建游乐设施
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ride {
    private String rideName;
    private int minAge;
    private boolean isOpen;
    private Employee rideOperator; // Employee responsible for operating the ride
    //新加入两个列表
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;
    //part5 新增的
    private int maxRider;
    private int numOfCycles; 

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.minAge = 0;
        this.isOpen = false;
        this.rideOperator = null;
        //新加入两个列表
        this.queue = new LinkedList<>();// 初始化为 LinkedList
        this.rideHistory = new LinkedList<>();
        //part5 新增的
        this.maxRider = 2;
        this.numOfCycles = 0;
    }

    // Constructor with parameters
    public Ride(String rideName, int minAge, boolean isOpen, Employee rideOperator) {
        this.rideName = rideName;
        this.minAge = minAge;
        this.isOpen = isOpen;
        this.rideOperator = rideOperator;
        //新加入两个列表
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 2;
        this.numOfCycles = 0;
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



    //新添加的
  
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
    }

   
    public void removeVisitorFromQueue() {
        if (!queue.isEmpty()) {
            Visitor removedVisitor = queue.poll();  // 移除并返回队列中的第一个访客
            System.out.println(removedVisitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("The queue is empty, no visitor to remove.");
        }
    }

  
    public void printQueue() {
        System.out.println("Queue for ride " + rideName + ":");
        for (Visitor visitor : queue) {
            System.out.println(visitor);
        }
    }


    public void runOneCycle() {
        if (!isOpen) {
            System.out.println("Cannot run the ride. No operator assigned.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("Cannot run the ride. No visitors in the queue.");
            return;
        }

        // Determine how many visitors can take the ride in this cycle
        int ridersInThisCycle = Math.min(maxRider, queue.size());
        System.out.println("Running cycle. " + ridersInThisCycle + " visitors will take the ride.");

        // Move visitors from the queue to the ride history
        for (int i = 0; i < ridersInThisCycle; i++) {
            Visitor visitor = queue.poll(); // Remove the visitor from the queue
            rideHistory.add(visitor);       // Add the visitor to the ride history
            System.out.println(visitor.getName() + " is taking the ride.");
        }

        numOfCycles++; // Increment the cycle count
        System.out.println("Ride cycle " + numOfCycles + " completed.");
    }

   
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }


    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);  // 检查历史记录中是否包含该游客
        if (found) {
            System.out.println(visitor.getName() + " is found in the ride history.");
        } else {
            System.out.println(visitor.getName() + " is not in the ride history.");
        }
        return found;  // 返回查询结果
    }

  
    public int numberOfVisitors() {
        int numberOfVisitors = rideHistory.size();  // 获取游客数量
        System.out.println("Number of visitors: " + numberOfVisitors);  // 输出游客数量
        return numberOfVisitors;  // 返回游客数量
    }

 
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride yet.");
        } else {
            System.out.println("Visitors who have taken the ride:");
            Iterator<Visitor> iterator = rideHistory.iterator();//Iterator方法
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println(visitor.getName());
            }
        }
    }

    public void sortRideHistory() {
            Collections.sort(rideHistory, new VisitorComparator());
            System.out.println("Ride history has been sorted.");
        }


    public interface RideInterface {
        // Add a visitor to the queue
        //将访客添加到队列
        void addVisitorToQueue(Visitor visitor);
    
        // Remove a visitor from the queue
        //从队列中移除一个访客
        void removeVisitorFromQueue();
    
        // Print the list of waiting visitors
        void printQueue();
    
        // Run the ride for one cycle (process one visitor from the queue)
        void runOneCycle();
    
        // Add a visitor to the ride history
        void addVisitorToHistory(Visitor visitor);
    
        // Check if a visitor is in the ride history
        boolean checkVisitorFromHistory(Visitor visitor);
    
        // Get the number of visitors in the ride history
        int numberOfVisitors();
    
        // Print the list of visitors who took the ride
        void printRideHistory();


        void sortRideHistory();
        
    }

    
}

    



