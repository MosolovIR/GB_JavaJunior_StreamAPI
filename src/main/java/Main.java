import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    OptionalDouble result = list.stream()
            .filter(num -> num % 2 == 0)
            .mapToInt(Integer::intValue)
            .average();

    if (!result.isEmpty()) {
        System.out.println("Среднее значение четных чисел = " + result.getAsDouble());
    } else {
        System.out.println("В списке нет четных чисел");
    }
}
