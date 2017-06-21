package t05;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr Shevkunenko on 21.06.2017.
 */
public class GroupTest {
    @Test
    public void addStudentTest() throws Exception {
        Student dima = new Student("Dima Ivanov");
        Student ivan = new Student("Ivan Smirnov");
        System.out.println(Group.CALCULUS.addStudent(dima, 10));
        System.out.println(Group.CALCULUS.addStudent(dima, 10));
    }

}