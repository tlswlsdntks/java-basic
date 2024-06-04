package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("student1 = " + student1); //ref.Student@2f4d3709
        initStudent(student1, "학생1", 15, 90); //참조값(주소), String, int, int

        Student student2 = new Student();
        System.out.println("student2 = " + student2); //ref.Student@7291c18f
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    private static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    private static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
