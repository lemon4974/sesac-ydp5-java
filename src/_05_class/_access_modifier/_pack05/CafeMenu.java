package _05_class._access_modifier._pack05;

public class CafeMenu {
    public int price;

    private String name;

    public CafeMenu(String name){
        this.name = name;
    }

    public  CafeMenu(int price){this.price = price; }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
