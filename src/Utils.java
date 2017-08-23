import java.util.Random;

public class Utils {
    public static Integer randomRange(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static Double randomDouble(int min, int max) {
        return min + (max - min) * new Random().nextDouble();
    }
}
