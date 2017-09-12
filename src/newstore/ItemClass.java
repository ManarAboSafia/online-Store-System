package newstore;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemClass {

    static ArrayList<Item> itemOP = new ArrayList<>();
    static ArrayList itemId = new ArrayList();
    static customerClass cu = new customerClass();
    String[] args = null;

    public void ADDNEWITEM() {
        boolean nu = true;
        do {
            String Message = JOptionPane.showInputDialog(null, "Enter Id Item - Name Item - quantity - price - Type(B,G,S)");
            String MessageArray[] = Message.split("-");

            int id = Integer.parseInt(MessageArray[0]);
            String BookArry[] = null;
            if (MessageArray[4].toUpperCase().equals("B")) {
                String BOOK = JOptionPane.showInputDialog(null, "Enter Title Book - Authour");
                BookArry = BOOK.split("-");
            }

            if (itemId.indexOf(id) != -1) {
                JOptionPane.showMessageDialog(null, "ID Exits");
                return;
            } else {
                if (MessageArray[4].toUpperCase().equals("B")) {
                    itemId.add(id);
                    itemOP.add(new Book(id, Integer.parseInt(MessageArray[2]), Integer.parseInt(MessageArray[3]), MessageArray[1], BookArry[0], BookArry[1]));
                } else {
                    itemId.add(id);
                    itemOP.add(new Item(id, Integer.parseInt(MessageArray[2]), Integer.parseInt(MessageArray[3]), MessageArray[1]));
                }
                JOptionPane.showMessageDialog(null, "Success");
               
            }
            
            String Re = JOptionPane.showInputDialog(null, "Do you want add another  item \n1-Yes\n2-No?");
            int agrre = Integer.parseInt(Re);
            if (agrre == 1) {
                nu = true;
            } else {
                nu = false;
            }
        } while (nu);

        if (nu == false) {
            NewStore.main(args);
        }
    }

    void ENDSALE(int iDc) {

        int index = cu.customerId.indexOf(iDc);
        if (index != -1) {
            int balance = 0;
            for (int i = 0; i < cu.customerOP.get(index).Last; ++i) {
                balance += (cu.customerOP.get(index).Cart[i].getPrice() * cu.customerOP.get(index).Cart[i].getQuan());
            }
            JOptionPane.showMessageDialog(null, "The total balane for customer " + cu.customerOP.get(index).getName() + " = " + balance);
            cu.customerId.remove(index);
            cu.customerOP.remove(index);
            NewStore.main(args);

        } else {
            JOptionPane.showMessageDialog(null, "ID Not Exits");
            NewStore.main(args);

        }

    }

}
