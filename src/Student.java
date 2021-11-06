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
