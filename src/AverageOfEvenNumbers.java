import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        // Исходный список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Используем Stream API для обработки списка
        OptionalDouble average = numbers.stream()         // создаем поток данных из списка
                .filter(n -> n % 2 == 0)                 // фильтруем четные числа
                .mapToInt(Integer::intValue)             // преобразуем в числовой поток (int)
                .average();                              // вычисляем среднее значение

        // Печатаем результат
        if (average.isPresent()) {
            System.out.println("Среднее значение четных чисел: " + average.getAsDouble());
        } else {
            System.out.println("Нет четных чисел в списке.");
        }
    }
}
