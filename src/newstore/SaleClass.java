package newstore;

import javax.swing.JOptionPane;

public class SaleClass {

    static ItemClass item = new ItemClass();
    static customerClass cu = new customerClass();
    String[] args;

    void ADDITEMCART(int id) {
        int indextID = cu.customerId.indexOf(id);
        if (indextID != -1) {

            String CustomerData = "ID Customer : " + id + "       Name Customer: " + cu.customerOP.get(indextID).getName() + "\n\n";
            String ItemExits = "";
            for (int i = 0; i < item.itemOP.size(); i++) {

                ItemExits += "  " + (i + 1) + "-       ID Item -> " + item.itemOP.get(i).getId() + "        Name -> " + item.itemOP.get(i).getName() + "        [" + item.itemOP.get(i).getQuan() + "]\n";
            }

            String ch = JOptionPane.showInputDialog(null, CustomerData + ItemExits + "\nSelect number - Quantity");
            String[] res = ch.split("-");
            int index = Integer.parseInt(res[0]) - 1;
            int qunt = Integer.parseInt(res[1]);
            int old_qunt = item.itemOP.get(index).getQuan();
            int reamin = old_qunt - qunt;
            if (qunt > old_qunt || qunt <= 0) {
                JOptionPane.showMessageDialog(null, "Error your request quantity is more then quantity in store ..", "", 0);
            } else {
                int last = cu.customerOP.get(indextID).Last;
                Item newShopping = new Item(item.itemOP.get(index).getId(), qunt, item.itemOP.get(index).getPrice(), item.itemOP.get(index).getName());

                cu.customerOP.get(indextID).Cart[last] = newShopping;
                item.itemOP.get(index).quan = reamin;
                cu.customerOP.get(indextID).Last++;
                JOptionPane.showMessageDialog(null, "Success");
                NewStore.main(args);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Not Exits");
            NewStore.main(args);

        }

    }

    void REMOVEITEMCART(int id) {
        int indextID = cu.customerId.indexOf(id);
        if (indextID != -1) {
            Item Sh_Cart[] = cu.customerOP.get(indextID).Cart;
            String S = "All items in shopping cart >> " + cu.customerOP.get(indextID).name;
            for (int i = 0; i < cu.customerOP.get(indextID).Last; ++i) {
                S += "\n" + (i + 1) + ".      " + Sh_Cart[i].name + "            " + Sh_Cart[i].quan;
            }
            int item_pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Select an item number >>\n " + S)) - 1;
            Item D_Item = Sh_Cart[item_pos];
            for (int i = item_pos; i < cu.customerOP.get(indextID).Last; ++i) {
                Sh_Cart[i] = Sh_Cart[i + 1];
            }
            JOptionPane.showMessageDialog(null, "Deleted Done ...");
            int item_index = item.itemId.indexOf(D_Item.getId());
            item.itemOP.get(item_index).quan += D_Item.quan;
            cu.customerOP.get(indextID).Cart = Sh_Cart;
            cu.customerOP.get(indextID).Last--;
            NewStore.main(args);

        } else {
            JOptionPane.showMessageDialog(null, "Not Exits");
            NewStore.main(args);

        }
    }

}
