package t05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 21.06.2017.
 */
public class StudentTest {
    @Test
    public void studentTest() throws Exception {
        assertEquals(new Student("Dima Petrov"), new Student("Dima Petrov"));
        assertEquals(new Student("Dima Petrov").hashCode(), new Student("Dima Petrov").hashCode());
        assertNotEquals(new Student("Dima Petrov"), new Student("Dima Ivanov"));
    }
}