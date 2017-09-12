package newstore;

public class Item {

    int id, quan, price;
    String name;

    public Item() {

    }

    public Item(int id, int quan, int price, String name) {
        this.id = id;
        this.quan = quan;
        this.price = price;
        this.name = name;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public int getId() {
        return id;
    }

    public int getQuan() {
        return quan;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void AddQuan(int Quan) {
        this.quan += Quan;
    }

}
