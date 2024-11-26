import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First, compare by name alphabetically
        int nameComparison = v1.getName().compareTo(v2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        // If names are the same, compare by ticket number
        return v1.getTicketNumber().compareTo(v2.getTicketNumber());
    }
}
