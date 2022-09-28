package us.larsennet.school.week3;

public class Sundae extends IceCream{
    private String topping;

    public Sundae(String name, int scoops, double pricePerScoop, String topping) {
        super(name, scoops, pricePerScoop);
        this.setTopping(topping);
    }

    public Sundae() {
        super();
        this.topping = "none";
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        String s = topping.strip().toLowerCase();
        this.topping = (s.equals("") ? "none" : s);
    }
}
