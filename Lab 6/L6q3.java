import studentrecords.Student;  

public class L6q3 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Devansh Yadav", "A");
        Student student2 = new Student(102, "Nakul Yadav", "A+");

        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}
