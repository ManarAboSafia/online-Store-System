package newstore;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewStore {

    static ItemClass item = new ItemClass();
    static customerClass cu = new customerClass();
    static SaleClass sa = new SaleClass();
    static ArrayList<Item> itemOP = new ArrayList<>();
    static ArrayList itemId = new ArrayList();

    public static void main(String[] args) {
        String chooos = JOptionPane.showInputDialog(null, "Store System Menu \n"
                + "1. Add a new Item to Store \n"
                + "2. Add a new Customer to Store \n"
                + "3. Add an item to Customer shopping cart \n"
                + "4. Remove an item from Customer shopping cart \n"
                + "5. View the items in Customer shopping cart \n"
                + "6. End shopping and go to checkout \n"
                + "7. Empty Customer shopping cart \n"
                + "8. Exit the program ");

        switch (chooos) {
            case "1":
                item.ADDNEWITEM();
                break;
            case "2":
                cu.ADDCUSTOMER();
                break;
            case "3":
                String ID = JOptionPane.showInputDialog(null, "Enter Customer Number ?");
                int id = Integer.parseInt(ID);
                sa.ADDITEMCART(id);
                break;
            case "4":
                String IDC = JOptionPane.showInputDialog(null, "Enter Customer Number ");
                int idc = Integer.parseInt(IDC);
                sa.REMOVEITEMCART(idc);
                break;
            case "5":
                String idDis = JOptionPane.showInputDialog(null, "Enter Customer Number ");
                int iDD = Integer.parseInt(idDis);
                cu.DISAPLAY(iDD);
                break;
            case "6":
                String idC = JOptionPane.showInputDialog(null, "Enter Customer Number ");
                int iDc = Integer.parseInt(idC);
                item.ENDSALE(iDc);
                break;
            case "7":
                String iDC = JOptionPane.showInputDialog(null, "Enter Customer Number ");
                int Idc = Integer.parseInt(iDC);
                cu.EMPTYCART(Idc);
                break;
            case "8":
                System.exit(0);

        }
    }

}
