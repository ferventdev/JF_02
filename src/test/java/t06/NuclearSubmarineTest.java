package t06;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 22.06.2017.
 */
public class NuclearSubmarineTest {
    @Test
    public void startTest() throws Exception {
        assertTrue(new NuclearSubmarine("955 Borei", "Aleksandr Nevsky").start());
    }
}