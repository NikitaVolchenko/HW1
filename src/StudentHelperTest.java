import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StudentHelperTest {

    @Test
    public void test() {
        StudentHelper studentHelper = new StudentHelper();

        Student[] student = new Student[5];

        student[0] = new Student("Petrov A.A.", 10, "Faculty of Applied Mathematics and Cybernetics", 5);
        student[1] = new Student("Ivanov B.B.", 11, "Faculty of Applied Mathematics and Cybernetics", 4.5);
        student[2] = new Student("Smirnov C.C.", 12, "Faculty of Chemistry", 3.1);
        student[3] = new Student("Volkov D.D.", 13, "Faculty of Physics", 3.9);
        student[4] = new Student("Kuznetsov E.E.", 14, "Faculty of Applied Mathematics and Cybernetics", 4.4);

        Student[] res = new Student[3];
        res = studentHelper.higherThanAverageScore(student, 4);

        Student[] res1 = new Student[3];
        res1 = studentHelper.studentsOfThisFaculty(student, "Faculty of Applied Mathematics and Cybernetics");

        assertArrayEquals(res, res1);

    }

}