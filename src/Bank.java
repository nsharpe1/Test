public class Bank {
    private String number;
    private String amount;
    private String name;

    public Bank(String number, String amount, String name) {
        this.number = number;
        this.amount = amount;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "number='" + number + '\'' +
                ", amount='" + amount + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
