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
        // Code for part four (A)
    }

    public void partFourB() {
        // Code for part four (B)
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
