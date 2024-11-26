public class AssignmentTwo {
    public static void main(String[] args) {
        // Entry point for your program
        Employee operator = new Employee("Alice", 30, "123 Park Lane", "E001", "Ride Operator");
        Visitor visitor1 = new Visitor("John", 25, "456 Elm Street", "T001", true);
        Visitor visitor2 = new Visitor("Emma", 22, "789 Pine Road", "T002", false);

        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.printQueue();

        rollerCoaster.runOneCycle();
        rollerCoaster.printRideHistory();
    }

    public void partThree() {
        // Create a ride object
        Employee operator = new Employee("Alice", 30, "123 Park Lane", "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("John", 25, "456 Elm Street", "T001", true);
        Visitor visitor2 = new Visitor("Emma", 22, "789 Pine Road", "T002", false);
        Visitor visitor3 = new Visitor("Liam", 28, "101 Maple Avenue", "T003", true);
        Visitor visitor4 = new Visitor("Olivia", 24, "202 Oak Street", "T004", false);
        Visitor visitor5 = new Visitor("Sophia", 26, "303 Birch Lane", "T005", true);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue();

        // Print the current queue
        rollerCoaster.printQueue();

        /**
         * John added to the queue for Roller Coaster
         * Emma added to the queue for Roller Coaster
         * Liam added to the queue for Roller Coaster
         * Olivia added to the queue for Roller Coaster
         * Sophia added to the queue for Roller Coaster
         * John removed from the queue for Roller Coaster
         * Current queue for Roller Coaster:
         * - Name: Emma, Ticket: T002
         * - Name: Liam, Ticket: T003
         * - Name: Olivia, Ticket: T004
         * - Name: Sophia, Ticket: T005
         */
    }


    public void partFourA() {
        // Create a Ride object
        Employee operator = new Employee("Alice", 30, "123 Park Lane", "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("John", 25, "456 Elm Street", "T001", true);
        Visitor visitor2 = new Visitor("Emma", 22, "789 Pine Road", "T002", false);
        Visitor visitor3 = new Visitor("Liam", 28, "101 Maple Avenue", "T003", true);
        Visitor visitor4 = new Visitor("Olivia", 24, "202 Oak Street", "T004", false);
        Visitor visitor5 = new Visitor("Sophia", 26, "303 Birch Lane", "T005", true);

        // Add visitors to the ride history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Check if a visitor is in the ride history
        rollerCoaster.checkVisitorFromHistory(visitor3); // Should return true
        rollerCoaster.checkVisitorFromHistory(new Visitor("Michael", 30, "404 Elm Lane", "T006", true)); // Should return false

        // Print the number of visitors in the ride history
        System.out.println("Total number of visitors in ride history: " + rollerCoaster.numberOfVisitors());

        // Print all visitors in the ride history
        rollerCoaster.printRideHistory();
        /**
         * John has been added to the ride history of Roller Coaster
         * Emma has been added to the ride history of Roller Coaster
         * Liam has been added to the ride history of Roller Coaster
         * Olivia has been added to the ride history of Roller Coaster
         * Sophia has been added to the ride history of Roller Coaster
         * Liam is in the ride history of Roller Coaster
         * Michael is not in the ride history of Roller Coaster
         * Total number of visitors in ride history: 5
         * Ride history for Roller Coaster:
         * - Name: John, Ticket: T001
         * - Name: Emma, Ticket: T002
         * - Name: Liam, Ticket: T003
         * - Name: Olivia, Ticket: T004
         * - Name: Sophia, Ticket: T005
         */
    }


    public void partFourB() {
        // Create a Ride object
        Employee operator = new Employee("Bob", 35, "321 Theme Park Lane", "E002", "Ride Operator");
        Ride ferrisWheel = new Ride("Ferris Wheel", 5, operator);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Sophia", 26, "123 Elm Street", "T005", true);
        Visitor visitor2 = new Visitor("Emma", 22, "456 Pine Road", "T002", false);
        Visitor visitor3 = new Visitor("John", 25, "789 Maple Avenue", "T003", true);
        Visitor visitor4 = new Visitor("Olivia", 24, "101 Oak Street", "T004", false);
        Visitor visitor5 = new Visitor("Liam", 28, "202 Birch Lane", "T001", true);

        // Add visitors to the ride history
        ferrisWheel.addVisitorToHistory(visitor1);
        ferrisWheel.addVisitorToHistory(visitor2);
        ferrisWheel.addVisitorToHistory(visitor3);
        ferrisWheel.addVisitorToHistory(visitor4);
        ferrisWheel.addVisitorToHistory(visitor5);

        // Print the ride history before sorting
        System.out.println("Ride history before sorting:");
        ferrisWheel.printRideHistory();

        // Sort the ride history
        ferrisWheel.sortRideHistory();

        // Print the ride history after sorting
        System.out.println("Ride history after sorting:");
        ferrisWheel.printRideHistory();
        /**
         * Ride history before sorting:
         * - Name: Sophia, Ticket: T005
         * - Name: Emma, Ticket: T002
         * - Name: John, Ticket: T003
         * - Name: Olivia, Ticket: T004
         * - Name: Liam, Ticket: T001
         * Ride history sorted successfully.
         * Ride history after sorting:
         * - Name: Emma, Ticket: T002
         * - Name: John, Ticket: T003
         * - Name: Liam, Ticket: T001
         * - Name: Olivia, Ticket: T004
         * - Name: Sophia, Ticket: T005
         */
    }

    public void partFive() {
        // Code for part five
    }

    public void partSix() {
        // Code for part six
    }

    public void partSeven() {
        // Code for part seven
    }
}
