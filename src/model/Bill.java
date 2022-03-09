package model;

public class Bill extends Customer{
    private double totalMoney;

    public Bill() {
    }

    public Bill(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Bill(String customerId, String name, String address, String numberPhone, double totalMoney) {
        super(customerId, name, address, numberPhone);
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "totalMoney=" + totalMoney +
                '}';
    }
}
