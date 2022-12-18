public class Student implements Comparable<Student>{
    private int idNumber;
    private int GPA;
    public Student(int idNumber, int GPA) {
        this.idNumber = idNumber;
        this.GPA = GPA;
    }
    public int getID() {return idNumber;}
    public void setID(int idNum) {this.idNumber = idNum;}
    public int getGPA() {return GPA;}
    public void setGPA(int GPA) {this.GPA = GPA;}

    public int compareTo(Student o) {
        return this.getGPA() - o.getGPA();
    }
}