import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(10);
        marks.add(20);
        List<Integer> m2 = marks.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(marks);
        System.out.println(m2);
    }
}