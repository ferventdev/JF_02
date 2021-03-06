package t03;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 20.06.2017.
 */
public class StationaryTest {
    @Test
    public void stationaryTest() throws Exception {
        final Set<Stationary> starterKit = new HashSet<>();
        Eraser eraser = new Eraser();
        Notepad notepad = new Notepad();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Stapler stapler = new Stapler();

        starterKit.add(eraser);
        starterKit.add(notepad);
        starterKit.add(pen);
        starterKit.add(pencil);
        starterKit.add(stapler);

        assertTrue(eraser instanceof Stationary);
        assertTrue(notepad instanceof Stationary);
        assertTrue(pen instanceof Stationary);
        assertTrue(pencil instanceof Stationary);
        assertTrue(stapler instanceof Stationary);

        assertEquals(5, starterKit.size());

        assertTrue(starterKit.contains(eraser));
        assertTrue(starterKit.contains(notepad));
        assertTrue(starterKit.contains(pen));
        assertTrue(starterKit.contains(pencil));
        assertTrue(starterKit.contains(stapler));

        starterKit.remove(stapler);
        assertFalse(starterKit.contains(stapler));
        assertEquals(4, starterKit.size());
    }
}