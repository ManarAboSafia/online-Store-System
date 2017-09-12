
package newstore;



public class Sales {

    int idCustomer, idItem, Quan;
    String nameItem;

    public Sales(int idCustomer, int idItem, int Quan, String nameItem) {
        this.idCustomer = idCustomer;
        this.idItem = idItem;
        this.Quan = Quan;
        this.nameItem = nameItem;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuan() {
        return Quan;
    }

    public void setQuan(int Quan) {
        this.Quan = Quan;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

}

