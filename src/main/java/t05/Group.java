package t05;

import java.util.*;

/**
 * Created by Aleksandr Shevkunenko on 21.06.2017.
 */
public enum Group {
    CALCULUS(GradeType.INTEGER),
    PHYSICS(GradeType.INTEGER),
    ELECTRONICS(GradeType.INTEGER),
    PHILOSOPHY(GradeType.FLOAT),
    HISTORY(GradeType.FLOAT),
    ARTS(GradeType.FLOAT);

    private Map<Student, Number> grades;
    private GradeType gradeType;

    Group(GradeType gradeType) {
        this.grades = new HashMap<>();
        this.gradeType = gradeType;
    }

    enum GradeType { INTEGER, FLOAT }

    public GradeType getGradeType() {
        return gradeType;
    }

    public boolean addStudent(Student student) {
        return null == grades.putIfAbsent(student, 0);
    }

    public boolean addStudent(Student student, Number grade) {
        if (gradeType == GradeType.INTEGER) {
            grade = grade.intValue();
        } else {
            grade = grade.floatValue();
        }
        return null == grades.putIfAbsent(student, grade);
    }

    public Number getGrade(Student student) throws NoSuchElementException {
        Number grade = grades.get(student);
        if (grade == null) throw new NoSuchElementException("No such student un this group.");
        return grade;
    }

    public Number getGradeOrNull(Student student) {
        return grades.get(student);
    }

    public boolean setGrade(Student student, Number grade) {
        if (!grades.containsKey(student)) return false;
        if (gradeType == GradeType.INTEGER) {
            grade = grade.intValue();
        } else {
            grade = grade.floatValue();
        }
        return null != grades.put(student, grade);
    }

    public static Map<Group, Number> getStudentProgress(Student student) {
        Map<Group, Number> progress = new HashMap<>();
        for(Group subject : Group.values()) {
            if (subject.grades.containsKey(student)) {
                progress.put(subject, subject.getGrade(student));
//                System.out.println(subject + ": " + subject.getGrade(student));
            }
        }
        return progress;
    }
}
