package newstore;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class customerClass {

    public static ArrayList<Customer> customerOP = new ArrayList<>();
    public static ArrayList customerId = new ArrayList();
    static ItemClass item = new ItemClass();
    String[] args;

    void ADDCUSTOMER() {
        boolean nu = true;
        do {

            String Message = JOptionPane.showInputDialog(null, "Enter Id Customer - Name Customer");
            String MessageArray[] = Message.split("-");

            int id = Integer.parseInt(MessageArray[0]);

            if (customerId.indexOf(id) != -1) {
                JOptionPane.showMessageDialog(null, "ID Exits");
                return;
            } else {
                customerId.add(id);
                customerOP.add(new Customer(id, MessageArray[1]));
            }
            JOptionPane.showMessageDialog(null, "Success");

            String agrre = JOptionPane.showInputDialog(null, "Do you want add another  item \n1-Yes\n2-No?");

            if (Integer.parseInt(agrre) == 1) {
                nu = true;
            } else {
                nu = false;
            }
        } while (nu);
        if (nu == false) {
            NewStore.main(args);
        }
    }

    void DISAPLAY(int iDD) {
        int index = customerId.indexOf(iDD);
        if (index != -1) {
            int TotalAll = 0;
            String s = "Item no \t Item name\t   Quantity \t Unit price\t Total price \n";
            for (int j = 0; j < customerOP.get(index).Last; j++) {
                int total = customerOP.get(index).Cart[j].price * customerOP.get(index).Cart[j].quan;
                TotalAll += total;
                s += "     " + customerOP.get(index).Cart[j].id + "\t      " + customerOP.get(index).Cart[j].name + "\t        " + customerOP.get(index).Cart[j].quan + "\t        " + customerOP.get(index).Cart[j].price + "\t     " + total + "\n";
            }

            s += "\t \t \t \n Total price : " + TotalAll;

            JTextArea a = new JTextArea();
            a.setText(s);

            JOptionPane.showMessageDialog(null, a);
                        NewStore.main(args);

        } else {
            JOptionPane.showMessageDialog(null, "ID Not Exits");
                        NewStore.main(args);

        }

    }

    void EMPTYCART(int Idc) {

        int index = customerId.indexOf(Idc);
        if (index != -1) {

            Item[] shoppingCart = customerOP.get(index).Cart;

            for (int i = 0; i < customerOP.get(index).Last; ++i) {
                int item_index = item.itemId.indexOf(shoppingCart[i].id);
                item.itemOP.get(item_index).quan += shoppingCart[i].quan;
            }
            customerOP.get(index).Cart = new Item[10];
            customerOP.get(index).Last = 0;
                        NewStore.main(args);

        } else {
            JOptionPane.showMessageDialog(null, "ID Not Exits");
                        NewStore.main(args);

        }

    }
}
