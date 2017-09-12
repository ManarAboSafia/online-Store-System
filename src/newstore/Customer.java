
package newstore;

public class Customer {
    
    int id ;
    String name;
    Item [] Cart;
    int Last;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.Cart=new Item[10];
        this.Last=0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
        
}

