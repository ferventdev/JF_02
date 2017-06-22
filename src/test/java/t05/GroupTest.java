package t05;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
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

        assertEquals(3, Group.ELECTRONICS.getGrade(dima));
        assertEquals(80.0f, Group.PHILOSOPHY.getGrade(dima));

        assertTrue(Group.ELECTRONICS.getGrade(dima) instanceof Integer);
        assertTrue(Group.PHILOSOPHY.getGrade(dima) instanceof Float);

        try {
            Group.ELECTRONICS.getGrade(vasya);
        } catch (Exception e) {
            assertTrue(e instanceof NoSuchElementException);
        }

        assertNull(Group.PHILOSOPHY.getGradeOrNull(vasya));
    }

    @Test
    public void setGradeTest() throws Exception {
        Group.HISTORY.addStudent(dima);
        Group.PHYSICS.addStudent(sasha);

        assertEquals(0, Group.HISTORY.getGrade(dima));
        assertEquals(0, Group.PHYSICS.getGrade(sasha));

        assertTrue(Group.HISTORY.setGrade(dima, 75.0));
        assertTrue(Group.PHYSICS.setGrade(sasha, 4));

        assertFalse(Group.HISTORY.setGrade(sasha, 60.0));
        assertFalse(Group.PHYSICS.setGrade(dima, 5));

        assertEquals(75.0f, Group.HISTORY.getGrade(dima));
        assertEquals(4, Group.PHYSICS.getGrade(sasha));
    }

    @Test
    public void addStudentTest() throws Exception {
        assertTrue(Group.CALCULUS.addStudent(dima));
        assertFalse(Group.CALCULUS.addStudent(dima, 5));
        assertTrue(Group.ARTS.addStudent(vasya));
        assertFalse(Group.ARTS.addStudent(vasya, 4));
    }

    @Test
    public void getStudentProgress() throws Exception {
        Student johnny = new Student("Johnny");
        Map<Group, Number> progressOfJohnny = new HashMap<>();
        int grade = 50;
        Number actual = 0;
        for(Group subject : Group.values()) {
            if (subject.getGradeType() == Group.GradeType.INTEGER) actual = new Integer(grade);
            else actual = new Float(grade);
            progressOfJohnny.put(subject, actual);
            subject.addStudent(johnny, grade);
            grade += 2;
        }
        assertEquals(progressOfJohnny, Group.getStudentProgress(johnny));
    }
}