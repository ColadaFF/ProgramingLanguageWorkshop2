import java.math.BigDecimal;

public class Admin extends Employee {
    private BigDecimal specialServices;

    public Admin(String identification, String name, Integer hoursQuantity, BigDecimal hourValue, BigDecimal specialServices) {
        super(identification, name, hoursQuantity, hourValue);
        this.specialServices = specialServices;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "identification='" + this.getIdentification() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", hoursQuantity=" + this.getHoursQuantity() +
                ", hourValue=" + this.getHourValue() +
                ", specialServices=" + specialServices +
                '}';
    }

    private BigDecimal calculatePaycheckAdmin() {
        return this.getHourValue()
                .multiply(new BigDecimal(this.getHoursQuantity()))
                .add(specialServices);
    }

    @Override
    public void showData() {
        System.out.println(this.toString());
    }
}
