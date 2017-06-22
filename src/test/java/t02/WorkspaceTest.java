package t02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 19.06.2017.
 */
public class WorkspaceTest {
    @Test
    public void workspaceTest() throws Exception {
        Workspace ws1 = new Workspace(1, "Jane");
        Workspace ws2 = new Workspace(2, "Andrew");
        Stationary[] items = { new Notepad(), new Pencil(), new Pen(), new Eraser(), new Stapler() };

        for (int i = 0; i < 3; i++) ws1.addItem(items[i]);
        for (int i = 3; i < items.length; i++) ws2.addItem(items[i]);

        ws1.setEmployee("Paul");
        ws2.setEmployee("Janet");

        assertEquals("Paul", ws1.getEmployee());
        assertEquals("Janet", ws2.getEmployee());

        for (int i = 0; i < 3; i++) assertTrue(ws1.hasItem(items[i]));
        for (int i = 3; i < items.length; i++) assertFalse(ws1.hasItem(items[i]));
        for (int i = 0; i < 3; i++) assertFalse(ws2.hasItem(items[i]));
        for (int i = 3; i < items.length; i++) assertTrue(ws2.hasItem(items[i]));

        assertEquals(items[0].getPrice() + items[1].getPrice() + items[2].getPrice(), ws1.totalPrice());
        assertEquals( items[3].getPrice() + items[4].getPrice(), ws2.totalPrice());

        System.out.println("Paul has stationary items with total price of " + ws1.totalPrice());
        System.out.println("Janet has stationary items with total price of " + ws2.totalPrice());
    }

}