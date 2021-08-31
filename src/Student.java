public class Student {

    String fullName;
    int groupNumber;
    String nameOfTheFaculty;
    double averageScore;

    Student() {
        fullName = null;
        groupNumber = 0;
        nameOfTheFaculty = null;
        averageScore = 0;
    }

    Student(String fullName, int groupNumber, String nameOfTheFaculty, double averageScore) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.nameOfTheFaculty = nameOfTheFaculty;
        this.averageScore = averageScore;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getNameOfTheFaculty() {
        return nameOfTheFaculty;
    }

    public void setNameOfTheFaculty(String nameOfTheFaculty) {
        this.nameOfTheFaculty = nameOfTheFaculty;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    /*public Student[] higherThanAverageScore(Student[] obj, double averageScore) {
        int count = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].averageScore > averageScore) {
                count++;
            }
        }

        Student[] res = new Student[count];
        int j = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].averageScore > averageScore) {
                res[j] = obj[i];
                j++;
            }
        }
        return res;
    }

    public Student[] StudentsOfThisFaculty(Student[] obj, String nameOfTheFaculty) {
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
    }*/

    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        return "{" +
                "fullName='" + fullName + '\'' +
                ", groupNumber=" + groupNumber +
                ", nameOfTheFaculty='" + nameOfTheFaculty + '\'' +
                ", averageScore=" + averageScore +
                '}' + newLine;
    }
}
