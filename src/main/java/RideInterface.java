import java.util.List;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor); // Add a visitor to the queue
    void removeVisitorFromQueue(); // Remove a visitor from the queue
    void printQueue(); // Print the queue of waiting visitors
    void runOneCycle(); // Run the ride for one cycle
    void addVisitorToHistory(Visitor visitor); // Add a visitor to ride history
    boolean checkVisitorFromHistory(Visitor visitor); // Check if a visitor is in the ride history
    int numberOfVisitors(); // Return the number of visitors in ride history
    void printRideHistory(); // Print the ride history
    void sortRideHistory();
    void exportToCSV(String filename);
    void importFromCSV(String filename);
}
