package t07;

import org.junit.Test;
import t06.NuclearSubmarine;

import java.lang.annotation.Documented;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 22.06.2017.
 */
public class ExtraInfoAnnotationTest {

    @Test
    public void annotationTest() {
        assertTrue(ExtraInfo.class.isAnnotation());
        assertTrue(ExtraInfo.class.isAnnotationPresent(Documented.class));

        assertTrue(SomeClass.class.isAnnotationPresent(ExtraInfo.class));
        assertTrue(NuclearSubmarine.class.isAnnotationPresent(ExtraInfo.class));

        assertEquals("N/A", SomeClass.class.getAnnotation(ExtraInfo.class).value() );
        assertNotEquals("abc", SomeClass.class.getAnnotation(ExtraInfo.class).value() );

        assertEquals("Powered with nuclear reactor.", NuclearSubmarine.class.getAnnotation(ExtraInfo.class).value() );
    }

}