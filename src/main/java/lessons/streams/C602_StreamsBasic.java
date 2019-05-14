package lessons.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C602_StreamsBasic {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        IntStream.range(0, 10)
                .forEach(i -> {
                    if (i % 2 == 1) System.out.println(i);
                });

        IntStream.range(0, 10)
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);

        OptionalInt reduced1 =
                IntStream.range(0, 10)
                        .reduce((a, b) -> a + b);
        System.out.println(reduced1.getAsInt());

        int reduced2 =
                IntStream.range(0, 10)
                        .reduce(7, (a, b) -> a + b);
        System.out.println(reduced2);

        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .stream()
                .filter(s -> s.startsWith("c"))

                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


    }
}
