import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee operator;
    private Queue<Visitor> queue; // Queue of waiting visitors
    private LinkedList<Visitor> rideHistory; // LinkedList for visitors who took the ride    private int maxRider; // Maximum number of visitors per cycle
    private int numOfCycles; // Number of times the ride has been run

    // Default Constructor
    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized Constructor
    public Ride(String rideName, int capacity, Employee operator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // Implement RideInterface methods

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println(visitor.getName() + " added to the queue for " + rideName);
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!queue.isEmpty()) {
            Visitor visitor = queue.poll();
            System.out.println(visitor.getName() + " removed from the queue for " + rideName);
        } else {
            System.out.println("Queue is empty for " + rideName);
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue for " + rideName + ":");
        for (Visitor visitor : queue) {
            System.out.println("- " + visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        System.out.println("Running one cycle of " + rideName);
        for (int i = 0; i < capacity && !queue.isEmpty(); i++) {
            Visitor visitor = queue.poll();
            System.out.println(visitor.getName() + " is enjoying the ride " + rideName);
            addVisitorToHistory(visitor);
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to the ride history of " + rideName);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        for (Visitor visitor : rideHistory) {
            System.out.println("- " + visitor.getName());
        }
    }

    @Override
    public void sortRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("The ride history is empty. Nothing to sort.");
        } else {
            Collections.sort(rideHistory, new VisitorComparator());
            System.out.println("Ride history sorted successfully.");
        }
    }


}
