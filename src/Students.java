import java.util.Arrays;

public class Students {

    Student[] students;
    int size;

    Students() {
        size = 0;
        students = null;
    }

    Students(int size) {
        this.size = size;
        students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = new Student();
        }
    }

    public Students higherThanAverageScore(double averageScore) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getAverageScore() > averageScore) {
                count++;
            }
        }

        Students res = new Students(count);
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getAverageScore() > averageScore) {
                res.students[j] = students[i];
                j++;
            }
        }
        return res;
    }

    public Students StudentsOfThisFaculty(String nameOfTheFaculty) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].nameOfTheFaculty == nameOfTheFaculty) {
                count++;
            }
        }

        Students res = new Students(count);
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].nameOfTheFaculty == nameOfTheFaculty) {
                res.students[j] = students[i];
                j++;
            }
        }
        return res;
    }

    void pushI(String fullName, int groupNumber, String nameOfTheFaculty, double averageScore, int i) {
        students[i].setFullName(fullName);
        students[i].setGroupNumber(groupNumber);
        students[i].setNameOfTheFaculty(nameOfTheFaculty);
        students[i].setAverageScore(averageScore);
    }

    @Override
    public String toString() {
        return Arrays.toString(students) +
                ", size=" + size +
                '}';
    }
}
