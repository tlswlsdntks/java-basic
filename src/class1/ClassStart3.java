package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        //class
        Student student1 = new Student(); //new 객체 → 참조값(주소) 반환
        student1.name = "학생1"; //. → 객체 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("student1 = " + student1); //class1.Student@2f4d3709
        System.out.println("student2 = " + student2); //class1.Student@7291c18f

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
