package facade;



import facade.model.MessageBox;
import facade.serivce.MessageBoxService;
import facade.serivce.NpShoppingImpl;

import java.util.HashMap;
import java.util.UUID;

public class ShoppingMain {

    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox();
        messageBox.setType("Phone");
        messageBox.setFrom("Artem");
        messageBox.setTo("Taras");
        messageBox.setId("kasjdbcjb");

        MessageBox messageBox2 = new MessageBox();
        messageBox2.setType("Phone");
        messageBox2.setFrom("Artem");
        messageBox2.setTo("Taras");
        messageBox2.setId("kasjdbcjb");

        MessageBox messageBox3 = new MessageBox();
        messageBox3.setType("Phone");
        messageBox3.setFrom("Artem");
        messageBox3.setTo("Taras");
        messageBox3.setId("kasjdbcjb");

        NpShoppingImpl.send(messageBox);
        NpShoppingImpl.send(messageBox2);
        NpShoppingImpl.send(messageBox3);

        System.out.println();
    }
}
