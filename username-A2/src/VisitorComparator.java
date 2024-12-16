import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor visitor1, Visitor visitor2) {
        // First, compare by name (alphabetically)
        int nameComparison = visitor1.getName().compareTo(visitor2.getName());
        
        // If names are equal, compare by age (ascending order)
        if (nameComparison == 0) {
            return Integer.compare(visitor1.getAge(), visitor2.getAge());
        }
        
        // If names are not equal, return the result of name comparison
        return nameComparison;
    }
}