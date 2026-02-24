package bites.examples;

public class Bagel {
    String seeds;
    String filling;
    Integer price;

    public Bagel(String seeds, String filling, Integer price) {
        this.seeds = seeds;
        this.filling = filling;
        this.price = price;
    }

    public String getSeeds() {
        return this.seeds;
    }

    public String getFilling() {
        return this.filling;
    }

    public Integer getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        Bagel bagel = new Bagel("sesame", "tofu paté and kimchi", 5);
        System.out.println(bagel.getSeeds());
        System.out.println(bagel.getFilling());
        System.out.println(bagel.getPrice());
    }
}
