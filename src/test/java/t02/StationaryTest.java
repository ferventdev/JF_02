package t02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Aleksandr Shevkunenko on 19.06.2017.
 */
public class StationaryTest {
    @Test
    public void toStringTest() throws Exception {
        Stationary notepad = new Notepad();
        String name = "notepad";
        int price = 100;
        String str = "Stationary { " + "name = '" + name + '\'' + ", price = " + price + " }";

        assertEquals(notepad.toString(), str);
    }

    @Test
    public void getNameTest() throws Exception {
        Stationary notepad = new Notepad();
        Stationary pencil = new Pencil();
        Stationary pen = new Pen();
        Stationary eraser = new Eraser();
        Stationary stapler = new Stapler();

        assertEquals(notepad.getName(), "notepad");
        assertEquals(pencil.getName(), "pencil");
        assertEquals(pen.getName(), "pen");
        assertEquals(eraser.getName(), "eraser");
        assertEquals(stapler.getName(), "stapler");

        assertNotEquals(notepad.getName(), "aaa");
        assertNotEquals(pencil.getName(), "bbb");
        assertNotEquals(pen.getName(), "ccc");
        assertNotEquals(eraser.getName(), "ddd");
        assertNotEquals(stapler.getName(), "eee");
    }

    @Test
    public void getPriceTest() throws Exception {
        Stationary notepad = new Notepad();
        Stationary pencil = new Pencil();
        Stationary pen = new Pen();
        Stationary eraser = new Eraser();
        Stationary stapler = new Stapler();

        assertEquals(notepad.getPrice(), 100);
        assertEquals(pencil.getPrice(), 20);
        assertEquals(pen.getPrice(), 50);
        assertEquals(eraser.getPrice(), 40);
        assertEquals(stapler.getPrice(), 250);

        assertNotEquals(notepad.getPrice(), 110);
        assertNotEquals(pencil.getPrice(), 22);
        assertNotEquals(pen.getPrice(), 57);
        assertNotEquals(eraser.getPrice(), 42);
        assertNotEquals(stapler.getPrice(), 259);
    }
}
