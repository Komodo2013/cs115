package us.larsennet.school.week3;

public class Sundae extends IceCream{
    private String topping;

    public Sundae(String name, int scoops, double pricePerScoop, String topping) {
        super(name, scoops, pricePerScoop);
        this.topping = topping;
    }

    public Sundae() {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = (topping.strip().toLowerCase());
    }
}
