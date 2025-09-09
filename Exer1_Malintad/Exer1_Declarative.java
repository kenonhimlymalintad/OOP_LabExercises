import java.util.Arrays;
import java.util.List;

public class Exer1_Declarative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Declarative style: check if a list contains any even number
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);

        System.out.println("List contains even number? " + hasEven);
    }
}