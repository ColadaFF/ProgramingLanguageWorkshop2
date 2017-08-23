import java.math.BigDecimal;
import java.util.Random;

public class EmployeeUtils {

    public static Developer createRandomDev() {
        return new Developer(
                Utils.randomRange(100, 999).toString(),
                "Dev#" + Utils.randomRange(1, 10).toString(),
                Utils.randomRange(20, 50),
                new BigDecimal(Utils.randomRange(50, 100)),
                Utils.randomRange(10, 40),
                Utils.randomDouble(5, 20)
        );
    }

    public static Admin createRandomAdmin() {
        Random random = new Random();
        return new Admin(
                Utils.randomRange(100, 999).toString(),
                "Admin#" + Utils.randomRange(1, 10).toString(),
                Utils.randomRange(20, 50),
                new BigDecimal(Utils.randomRange(50, 100)),
                new BigDecimal(Utils.randomRange(1000, 2000))
        );
    }

    public static Employee randomEmployee(int seed) {
        return new Random().nextDouble() > 0.5 ? createRandomDev() : createRandomAdmin();
    }

}
