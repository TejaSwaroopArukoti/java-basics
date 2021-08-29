import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {
    public static void test() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(50);
        list1.add(20);
        list1.add(64);
        list1.add(34);
        List<Integer> filteredList = list1.stream().filter( m -> m > 30).collect(Collectors.toList());
        List<Integer> mappedList = list1.stream().map(m -> m * 20).collect(Collectors.toList());
        System.out.println("Original List" + list1);
        System.out.println("Filtered List" + filteredList);
        System.out.println("Mapped List" + mappedList);
    }
}
