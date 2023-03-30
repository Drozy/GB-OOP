package homework1;

public class Goods {
    String name;
    Double price;
    double rating;

    public Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return name + " price = " + price + ", rating = " + rating;
    }
}
