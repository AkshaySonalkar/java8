package ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachMethod {

    public static void main(String[] args) {
        String[] strArr = new String[]{"a","b","c"};
        Stream<String> stream = Arrays.stream(strArr);

        System.out.println(stream);
        System.out.println(stream.count());
        //System.out.println(stream.filter(f->f.startsWith("a")).collect(Collectors.toList()));

        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList("Akshay","Ankita","Amit"));
        lists.add(Arrays.asList("Akshita","Abhimanyu"));

        System.out.println("before flat map");
        System.out.println(lists);

        List<String> lists1 = lists.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("after flat map");
        System.out.println(lists1);

        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(10, (a, b) -> a + b);
        System.out.println("reduced "+reduced);

        lists.stream().flatMap(f->f.stream()).map(String::toUpperCase).parallel().forEach(System.out::println);
    }
}
