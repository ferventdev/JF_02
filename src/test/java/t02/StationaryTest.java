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

        assertEquals(str, notepad.toString());
    }

    @Test
    public void getNameTest() throws Exception {
        Stationary notepad = new Notepad();
        Stationary pencil = new Pencil();
        Stationary pen = new Pen();
        Stationary eraser = new Eraser();
        Stationary stapler = new Stapler();

        assertEquals("notepad", notepad.getName());
        assertEquals("pencil", pencil.getName());
        assertEquals("pen", pen.getName());
        assertEquals("eraser", eraser.getName());
        assertEquals("stapler", stapler.getName());

        assertNotEquals("aaa", notepad.getName());
        assertNotEquals("bbb", pencil.getName());
        assertNotEquals("ccc", pen.getName());
        assertNotEquals("ddd", eraser.getName());
        assertNotEquals("eee", stapler.getName());
    }

    @Test
    public void getPriceTest() throws Exception {
        Stationary notepad = new Notepad();
        Stationary pencil = new Pencil();
        Stationary pen = new Pen();
        Stationary eraser = new Eraser();
        Stationary stapler = new Stapler();

        assertEquals(100, notepad.getPrice());
        assertEquals(20, pencil.getPrice());
        assertEquals(50, pen.getPrice());
        assertEquals(40, eraser.getPrice());
        assertEquals(250, stapler.getPrice());

        assertNotEquals(110, notepad.getPrice());
        assertNotEquals(22, pencil.getPrice());
        assertNotEquals(57, pen.getPrice());
        assertNotEquals(42, eraser.getPrice());
        assertNotEquals(259, stapler.getPrice());
    }
}
