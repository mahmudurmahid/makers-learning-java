package bites.examples;

public class Discounter {
    Integer discount = 0;

    public void applyTo(Integer amount) {
        this.discount -= amount;
    }

    public Integer getDiscount() {
        return this.discount;
    }

    public static void main(String[] args) {
        Discounter discounter = new Discounter();
        discounter.applyTo(10);
        Integer discount = discounter.getDiscount();
        System.out.println(discount);
    }
}