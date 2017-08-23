import java.math.BigDecimal;

public class Developer extends Employee {
    private Integer developedHours;
    private Double bonusPercent;

    public Developer(String identification, String name, Integer hoursQuantity, BigDecimal hourValue, Integer developedHours, Double bonusPercent) {
        super(identification, name, hoursQuantity, hourValue);
        this.developedHours = developedHours;
        this.bonusPercent = bonusPercent;
    }

    public Integer getDevelopedHours() {
        return developedHours;
    }

    public void setDevelopedHours(Integer developedHours) {
        this.developedHours = developedHours;
    }

    public Double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(Double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "identification='" + this.getIdentification() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", hoursQuantity=" + this.getHoursQuantity() +
                ", hourValue=" + this.getHourValue() +
                ", developedHours=" + developedHours +
                ", bonusPercent=" + bonusPercent +
                '}';
    }

    private BigDecimal calculatePaycheckDeveloper() {

        BigDecimal developedHoursValue = new BigDecimal(developedHours).multiply(new BigDecimal(4)).multiply(this.getHourValue());
        BigDecimal parsedBonus = new BigDecimal(bonusPercent);
        BigDecimal parseHours = new BigDecimal(this.getHoursQuantity());
        return this.getHourValue()
                .multiply(parseHours)
                .add(parsedBonus)
                .add(developedHoursValue);
    }

    @Override
    public void showData() {
        System.out.println(this.toString());
    }
}
