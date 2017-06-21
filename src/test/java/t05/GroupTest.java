package t05;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 21.06.2017.
 */
public class GroupTest {

    Student dima = new Student("Dima Ivanov");
    Student vasya = new Student("Vasya Petrov");
    Student sasha = new Student("Sasha Smirnov");

    @Test
    public void getGradeTest() throws Exception {
        Group.ELECTRONICS.addStudent(dima, 3);
        Group.PHILOSOPHY.addStudent(dima, 80.0);

        assertEquals(Group.ELECTRONICS.getGrade(dima), 3);
        assertEquals(Group.PHILOSOPHY.getGrade(dima), 80.0f);

        assertTrue(Group.ELECTRONICS.getGrade(dima) instanceof Integer);
        assertTrue(Group.PHILOSOPHY.getGrade(dima) instanceof Float);

        try {
            Group.ELECTRONICS.getGrade(vasya);
        } catch (Exception e) {
            assertTrue(e instanceof NoSuchElementException);
        }

        assertNull(Group.PHILOSOPHY.getGradeOrNull(vasya));

        System.out.println("Group.getGrade test passed");

    }

    @Test
    public void setGradeTest() throws Exception {
        Group.HISTORY.addStudent(dima);
        Group.PHYSICS.addStudent(sasha);

        assertEquals(Group.HISTORY.getGrade(dima), 0);
        assertEquals(Group.PHYSICS.getGrade(sasha), 0);

        assertTrue(Group.HISTORY.setGrade(dima, 75.0));
        assertTrue(Group.PHYSICS.setGrade(sasha, 4));

        assertFalse(Group.HISTORY.setGrade(sasha, 60.0));
        assertFalse(Group.PHYSICS.setGrade(dima, 5));

        assertEquals(Group.HISTORY.getGrade(dima), 75.0f);
        assertEquals(Group.PHYSICS.getGrade(sasha), 4);

        System.out.println("Group.setGrade test passed");
    }

    @Test
    public void addStudentTest() throws Exception {
        assertTrue(Group.CALCULUS.addStudent(dima));
        assertFalse(Group.CALCULUS.addStudent(dima, 5));
        assertTrue(Group.ARTS.addStudent(vasya));
        assertFalse(Group.ARTS.addStudent(vasya, 4));
        System.out.println("Group.addStudent test passed");
    }

}