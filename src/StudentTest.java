import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void test() {
        Students students1 = new Students(5);

        students1.pushI("Petrov A.A.", 10, "Faculty of Mathematics", 5, 0);
        students1.pushI("Ivanov B.B.", 11, "Faculty of Applied Mathematics and Cybernetics", 4.5, 1);
        students1.pushI("Smirnov C.C.", 12, "Faculty of Applied Mathematics and Cybernetics", 3.1, 2);
        students1.pushI("Volkov D.D.", 13, "Faculty of Physics", 3.9, 3);
        students1.pushI("Kuznetsov E.E.", 14, "Faculty of Chemistry", 4.4, 4);

        System.out.println(students1);

        students1 = students1.StudentsOfThisFaculty("Faculty of Applied Mathematics and Cybernetics");

        System.out.println(students1);
    }

}