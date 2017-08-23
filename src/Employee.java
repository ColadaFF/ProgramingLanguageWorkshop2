import java.math.BigDecimal;

public class Employee {
    private String identification;
    private String name;
    private Integer hoursQuantity;
    private BigDecimal hourValue;

    public Employee(String identification, String name, Integer hoursQuantity, BigDecimal hourValue) {
        this.identification = identification;
        this.name = name;
        this.hoursQuantity = hoursQuantity;
        this.hourValue = hourValue;
    }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public Integer getHoursQuantity() {
        return hoursQuantity;
    }

    public BigDecimal getHourValue() {
        return hourValue;
    }

    public void showData () {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "identification='" + identification + '\'' +
                ", name='" + name + '\'' +
                ", hoursQuantity=" + hoursQuantity +
                ", hourValue=" + hourValue +
                '}';
    }
}
