import java.util.Arrays;

public class StudentHelper {

    public Student[] higherThanAverageScore(Student[] obj, double averageScore) {
        int count = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getAverageScore() > averageScore) {
                count++;
            }
        }

        Student[] res = new Student[count];
        int j = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getAverageScore() > averageScore) {
                res[j] = obj[i];
                j++;
            }
        }
        return res;
    }

    public Student[] studentsOfThisFaculty(Student[] obj, String nameOfTheFaculty) {
        int count = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].nameOfTheFaculty == nameOfTheFaculty) {
                count++;
            }
        }

        Student[] res = new Student[count];
        int j = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].nameOfTheFaculty == nameOfTheFaculty) {
                res[j] = obj[i];
                j++;
            }
        }
        return res;
    }
}
