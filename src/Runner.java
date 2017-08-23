import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .mapToObj(EmployeeUtils::randomEmployee)
                .forEach(System.out::println);
    }
}
