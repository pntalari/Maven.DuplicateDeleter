import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTest {
    public static void main(String[] args) {
        String[] stringArray = {"test4", "Test2", "test1"};
        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test1");
        list.add("Test3");
        list.add("T");
        list.add("TE");

        Stream<String> stringStream1 = Stream.of("The");
        Stream<String> stringStream2 = Stream.of("The", "Quick", "Brown");

       //stringStream2.forEach(s -> System.out.println(s));

        // list.stream().forEach(s-> System.out.println(s));

      //  fromList(list).forEach(System.out::println);

      //  fromList(list).filter(word->word.length()<2).forEach(System.out::println);

     //  fromList(list).map(x->x.length()).collect(Collectors.toList()).forEach(System.out::println);

       // fromList(list).distinct().forEach(System.out::println);

      //  Integer output = Stream.of(1, 2, 4, 5, 6).max(Integer::compare).get();

      //  System.out.println(output);

     //   Arrays.stream(stringArray).sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
     //   Arrays.stream(stringArray).sorted().forEach(System.out::println);

     //   Arrays.stream(stringArray).min(String::compareToIgnoreCase);

      //  Stream.generate(Math::random).forEach(System.out::println);

        //   Stream.iterate(1, x -> x + 2).forEach(s-> System.out.println(s));

        String out = list.stream().min(Comparator.reverseOrder()).get();
        System.out.println(out);

        Integer[] numbers = {1,2,3,4};
        Optional<Integer> sum = Stream.of(numbers).reduce((x, y) -> x + y);
        Integer sum2 = Stream.of(numbers).reduce(20,(x, y) -> x + y);
        System.out.println(sum);
        System.out.println(sum2);

    }

        //    System.out.println(fromVarargs());
        //  System.out.println(fromIterator());


    public static Stream<String> fromVarargs() {
        Stream<String> stringStream1 = Stream.of("The");
        Stream<String> stringStream2 = Stream.of("The", "Quick", "Brown");

        return stringStream2;
    }

    public static Stream<String> fromList(List<String> stringList) {
        Stream<String> stringStream = stringList.stream();

        return stringStream;
    }

    public static void fromIterator() {
        Stream.iterate(1, x -> x + 2);

        Stream.iterate(0, n -> n + 1)
                .filter(x -> x % 2 != 0) //odd
                .limit(10)
                .forEach(x -> System.out.println(x));
    }
}
